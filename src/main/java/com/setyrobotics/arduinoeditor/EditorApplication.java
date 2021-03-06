package com.setyrobotics.arduinoeditor;

import java.util.Map;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import com.setyrobotics.arduinoeditor.config.ApplicationConfig.HolderKey;
import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.ui.SpringFXMLLoader;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class EditorApplication extends Application {

  private static final String FONT_AWESOME = "fontawesome.ttf";

  private static final String STYLESHEET = "css/application.css";

  protected ConfigurableApplicationContext springContext;
  protected StageManager stageManager;

  public static void main(final String[] args) {
    Application.launch(args);
  }

  @Override
  public void init() throws Exception {
    springContext = springBootApplicationContext();

    Map<HolderKey, Object> holder = (Map<HolderKey, Object>) springContext.getBean("holder");

    Project project = new Project();
    holder.put(HolderKey.PROJECT, project);
  }

  @Override
  public void start(Stage stage) throws Exception {


    try {
      stageManager = springContext.getBean(StageManager.class);
      stageManager.setStage(stage);

      // scene.getStylesheets().add(getClass().getResource(TREE_SKIN_STYLESHEET).toExternalForm());
      // scene.getStylesheets().add(getClass().getResource(TITLED_SKIN_STYLESHEET).toExternalForm());

      SpringFXMLLoader loader = springContext.getBean(SpringFXMLLoader.class);
      Parent root = loader.load("/fxml/Main.fxml");
      // Font.loadFont(getClass().getClassLoader().getResource(FONT_AWESOME).toExternalForm(),
      // 12);

      Scene scene = new Scene(root);
      final ObservableList<String> stylesheets = scene.getStylesheets();
      stylesheets
          .addAll(EditorApplication.class.getResource("/css/application.css").toExternalForm());

      stage.setScene(scene);
      stage.setWidth(1000);
      stage.setHeight(1000);
      stage.setTitle("State Editor");
      stage.show();

    } catch (Exception e) {

      System.out.println(e.getMessage() + "------");

      e.printStackTrace();

    }


  }

  @Override
  public void stop() throws Exception {
    springContext.close();
    System.exit(0);
  }

  private ConfigurableApplicationContext springBootApplicationContext() {
    SpringApplicationBuilder builder = new SpringApplicationBuilder(EditorApplication.class);
    String[] args = getParameters().getRaw().stream().toArray(String[]::new);
    return builder.run(args);
  }

}
