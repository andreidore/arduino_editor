package com.setyrobotics.arduinoeditor.config;

import java.io.IOException;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import com.setyrobotics.arduinoeditor.controller.EntityController;
import javafx.fxml.FXMLLoader;

/**
 * Will load the FXML hierarchy as specified in the load method and register Spring as the FXML
 * Controller Factory. Allows Spring and Java FX to coexist once the Spring Application context has
 * been bootstrapped.
 */
@Component
public class SpringFXMLLoader {
  private final ResourceBundle resourceBundle;
  private final ApplicationContext context;

  @Autowired
  public SpringFXMLLoader(ApplicationContext context, ResourceBundle resourceBundle) {
    this.resourceBundle = resourceBundle;
    this.context = context;
  }

  public <T> T load(String fxmlPath) throws IOException {
    FXMLLoader loader = new FXMLLoader();
    loader.setControllerFactory(context::getBean); // Spring now FXML Controller Factory
    loader.setResources(resourceBundle);
    loader.setLocation(getClass().getResource(fxmlPath));
    T root = loader.load();

    return root;
  }

  public <T, R> T load(String fxmlPath, R r) throws IOException {
    FXMLLoader loader = new FXMLLoader();
    loader.setControllerFactory(context::getBean); // Spring now FXML Controller Factory
    loader.setResources(resourceBundle);
    loader.setLocation(getClass().getResource(fxmlPath));
    T root = loader.load();

    EntityController<R> controller = loader.getController();
    controller.setEntity(r);

    return root;
  }
}
