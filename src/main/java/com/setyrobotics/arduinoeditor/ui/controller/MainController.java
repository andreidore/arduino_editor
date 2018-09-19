package com.setyrobotics.arduinoeditor.ui.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.setyrobotics.arduinoeditor.config.ApplicationConfig;
import com.setyrobotics.arduinoeditor.config.ApplicationConfig.HolderKey;
import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.model.Node;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.model.State;
import com.setyrobotics.arduinoeditor.service.ProjectService;
import com.setyrobotics.arduinoeditor.ui.SpringFXMLLoader;
import com.setyrobotics.arduinoeditor.ui.service.LoadProjectService;
import com.setyrobotics.arduinoeditor.ui.service.SaveProjectService;
import eu.mihosoft.scaledfx.ScaleBehavior;
import eu.mihosoft.vrl.workflow.FlowFactory;
import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VNode;
import eu.mihosoft.vrl.workflow.fx.FXSkinFactory;
import eu.mihosoft.vrl.workflow.fx.VCanvas;
import javafx.animation.Transition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;

@Controller
public class MainController implements Initializable {

  @FXML
  private StackPane root;

  @FXML
  private TextArea console;

  @FXML
  private StackPane rightPane;

  @FXML
  private TabPane tabPane;

  @FXML
  private Tab statePage;

  @FXML
  private StackPane titleBurgerContainer;

  @FXML
  private JFXHamburger titleBurger;


  @FXML
  private ListView<Node> componentList;

  @Lazy
  @Autowired
  private StageManager stageManager;

  @Autowired
  private Map<HolderKey, Object> holder;

  @FXML
  private JFXDrawer drawer;

  @Autowired
  private SpringFXMLLoader loader;

  @Autowired
  private ProjectService projectService;

  @Autowired
  private ApplicationContext applicationContext;

  private VFlow statesFlow;

  private Project project;

  @Override
  public void initialize(URL location, ResourceBundle resources) {


    StackPane sidePane = null;
    try {
      sidePane = loader.load("/fxml/SideMenu.fxml");
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }


    if (sidePane != null)

    {
      drawer.setSidePane(sidePane);
    }

    drawer.setOnDrawerOpening(e -> {
      final Transition animation = titleBurger.getAnimation();
      animation.setRate(1);
      animation.play();
    });
    drawer.setOnDrawerClosing(e -> {
      final Transition animation = titleBurger.getAnimation();
      animation.setRate(-1);
      animation.play();
    });
    titleBurgerContainer.setOnMouseClicked(e -> {
      drawer.toggle();
    });



    initMainPane();

  }

  private void initMainPane() {

    this.project = (Project) holder.get(ApplicationConfig.HolderKey.PROJECT);

    tabPane.getTabs().clear();

    for (State state : this.project.getStates()) {

      initStatePane(state);

    }



    initStatesPane();
  }

  private void initStatePane(State state) {


    // create a flow object
    VFlow stateFlow = FlowFactory.newFlow();

    state.getNodes().stream().forEach(s -> {

      VNode node = statesFlow.newNode();



    });


    stateFlow.setVisible(true);

    // create a zoomable canvas
    VCanvas canvas = new VCanvas();
    canvas.setScaleBehavior(ScaleBehavior.IF_NECESSARY);
    canvas.setTranslateToMinNodePos(false);

    Pane root = (Pane) canvas.getContent();
    FXSkinFactory skinFactory = new FXSkinFactory(root);

    stateFlow.setSkinFactories(skinFactory);

    Tab stateTab = new Tab("Tab", canvas);
    stateTab.textProperty().bind(state.getName());

    tabPane.getTabs().add(stateTab);


  }


  private void initStatesPane() {


    // create a flow object
    statesFlow = FlowFactory.newFlow();

    project.getStates().stream().forEach(s -> {

      VNode stateNodeFlow = statesFlow.newNode();

      stateNodeFlow.titleProperty().bind(s.getName());
      stateNodeFlow.xProperty().bindBidirectional(s.getX());
      stateNodeFlow.yProperty().bindBidirectional(s.getY());
      stateNodeFlow.widthProperty().bindBidirectional(s.getWidth());
      stateNodeFlow.heightProperty().bindBidirectional(s.getHeight());


    });



    statesFlow.setVisible(true);

    // create a zoomable canvas
    VCanvas canvas = new VCanvas();
    // canvas.setAutoRescale(false);
    canvas.setScaleBehavior(ScaleBehavior.IF_NECESSARY);
    // canvas.setAspectScale(false);
    canvas.setTranslateToMinNodePos(false);

    Pane root = (Pane) canvas.getContent();
    // root.setStyle("-fx-background-color: red");

    // creating a skin factory and attach it to the flow
    FXSkinFactory skinFactory = new FXSkinFactory(root);

    statesFlow.setSkinFactories(skinFactory);

    Tab stateTab = new Tab("State", canvas);

    tabPane.getTabs().add(stateTab);


  }

  public void handleExitAction(ActionEvent event) {
    Platform.exit();
  }

  public void handleNewAction(ActionEvent event) {

    this.project = projectService.newProject();

    holder.put(HolderKey.PROJECT, this.project);

    initMainPane();

  }

  public void handleLoadAction() {

    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Load");
    File file = fileChooser.showOpenDialog(root.getScene().getWindow());

    if (file != null) {

      LoadProjectService loadService =
          applicationContext.getBean(LoadProjectService.class, file.toPath());
      loadService.start();

      loadService.setOnSucceeded(e -> {

        holder.put(HolderKey.PROJECT, loadService.getValue());

        initMainPane();

      });



    }


  }

  public void handleSaveAction() {


    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Save");
    File file = fileChooser.showSaveDialog(root.getScene().getWindow());

    if (file != null) {

      SaveProjectService saveService = applicationContext.getBean(SaveProjectService.class,
          holder.get(HolderKey.PROJECT), file.toPath());
      saveService.start();

      /*
       * try { projectService.saveProject(); } catch (IOException e) { // TODO Auto-generated catch
       * block e.printStackTrace(); }
       */


    }

  }

  private void addTextToConsole(String text) {

  }

}
