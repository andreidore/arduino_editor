package com.setyrobotics.arduinoeditor.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.context.Context;
import com.setyrobotics.arduinoeditor.model.Node;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.service.ProjectService;
import eu.mihosoft.scaledfx.ScaleBehavior;
import eu.mihosoft.vrl.workflow.Connector;
import eu.mihosoft.vrl.workflow.FlowFactory;
import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VNode;
import eu.mihosoft.vrl.workflow.VisualizationRequest;
import eu.mihosoft.vrl.workflow.fx.FXSkinFactory;
import eu.mihosoft.vrl.workflow.fx.VCanvas;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;

@Controller
public class MainController implements Initializable {

  @FXML
  private AnchorPane root;

  @FXML
  private TextArea console;

  @FXML
  private StackPane rightPane;

  @FXML
  private TabPane tabPane;

  @FXML
  private Tab statePage;

  @FXML
  private ListView<Node> componentList;

  @Lazy
  @Autowired
  private StageManager stageManager;

  @Autowired
  private Context context;

  @Autowired
  private ProjectService projectService;

  private VFlow stateFlow;

  private Project project;

  @Override
  public void initialize(URL location, ResourceBundle resources) {


    Project project = projectService.getProject();

    // create a flow object
    VFlow flow = FlowFactory.newFlow();

    // add two nodes to the flow
    VNode n1 = flow.newNode();
    n1.setTitle("Button");
    n1.selectedProperty().addListener(event -> {

      System.out.println(event);

    });

    VNode n11 = flow.newNode();
    n11.setTitle("Button 1");

    VNode n2 = flow.newNode();

    n1.setHeight(100);
    n1.setWidth(100);

    n2.setHeight(100);
    n2.setWidth(100);

    // create input and output connectors of type "default-type"
    Connector outN1 = n1.addOutput("digital");
    outN1.addConnectionEventListener(event -> {

      System.out.println(event);

    });

    outN1.addClickEventListener(event -> {
      System.out.println(event);
    });

    outN1.getVisualizationRequest().set(VisualizationRequest.KEY_CONNECTOR_AUTO_LAYOUT, true);

    Connector outN11 = n11.addOutput("digital");
    outN11.getVisualizationRequest().set(VisualizationRequest.KEY_CONNECTOR_AUTO_LAYOUT, true);

    Connector inN2 = n2.addInput("digital");
    inN2.getVisualizationRequest().set(VisualizationRequest.KEY_CONNECTOR_AUTO_LAYOUT, true);
    Connector in1N2 = n2.addInput("digital");
    in1N2.getVisualizationRequest().set(VisualizationRequest.KEY_CONNECTOR_AUTO_LAYOUT, true);

    // create a connections
    flow.connect(outN1, inN2);

    flow.setVisible(true);

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

    flow.setSkinFactories(skinFactory);

    // rightPane.getChildren().add(canvas);


    initMainPane();

  }

  private void initMainPane() {

    this.project = projectService.getProject();

    tabPane.getTabs().clear();



    initStatePane();
  }

  private void initStatePane() {


    // create a flow object
    stateFlow = FlowFactory.newFlow();

    project.getStates().stream().forEach(s -> {

      VNode stateNodeFlow = stateFlow.newNode();

      stateNodeFlow.titleProperty().bind(s.getName());
      stateNodeFlow.xProperty().bindBidirectional(s.getX());
      stateNodeFlow.yProperty().bindBidirectional(s.getY());
      stateNodeFlow.widthProperty().bindBidirectional(s.getWidth());
      stateNodeFlow.heightProperty().bindBidirectional(s.getHeight());


    });



    stateFlow.setVisible(true);

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

    stateFlow.setSkinFactories(skinFactory);

    Tab stateTab = new Tab("State", canvas);

    tabPane.getTabs().add(stateTab);


  }

  public void handleExitAction(ActionEvent event) {
    Platform.exit();
  }

  public void handleNewAction(ActionEvent event) {

    projectService.newProject();

    this.project = projectService.getProject();

    initMainPane();

  }

  public void handleLoadAction(ActionEvent event) {

    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Load");
    File file = fileChooser.showOpenDialog(root.getScene().getWindow());

    if (file != null) {
      try {
        projectService.loadProject(file.toPath());
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      this.project = projectService.getProject();
      initMainPane();
    }


  }

  public void handleSaveAction(ActionEvent event) {


    FileChooser fileChooser = new FileChooser();
    fileChooser.setTitle("Save");
    File file = fileChooser.showSaveDialog(root.getScene().getWindow());

    if (file != null) {
      try {
        projectService.saveProject(file.toPath());
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }


    }

  }

  private void addTextToConsole(String text) {

  }

}
