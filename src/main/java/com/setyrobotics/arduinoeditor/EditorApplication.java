package com.setyrobotics.arduinoeditor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.context.Context;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.view.FxmlView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
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

    Context context = springContext.getBean(Context.class);

    Project project = new Project();
    context.put(Context.PROJECT, project);
  }

  @Override
  public void start(Stage stage) throws Exception {

    try {
      stageManager = springContext.getBean(StageManager.class);
      stageManager.setStage(stage);

      // scene.getStylesheets().add(getClass().getResource(TREE_SKIN_STYLESHEET).toExternalForm());
      // scene.getStylesheets().add(getClass().getResource(TITLED_SKIN_STYLESHEET).toExternalForm());



      Font.loadFont(getClass().getClassLoader().getResource(FONT_AWESOME).toExternalForm(), 12);

      Scene scene;

      scene = stageManager.switchScene(FxmlView.MAIN);

      scene.getStylesheets()
          .add(getClass().getClassLoader().getResource(STYLESHEET).toExternalForm());

    } catch (Exception e) {

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
