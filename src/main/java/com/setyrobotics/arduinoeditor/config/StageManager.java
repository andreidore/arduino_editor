package com.setyrobotics.arduinoeditor.config;

import static org.slf4j.LoggerFactory.getLogger;

import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.setyrobotics.arduinoeditor.view.FxmlView;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;

/**
 * Manages switching Scenes on the Primary Stage
 */
@Component
public class StageManager {

	private static final Logger LOGGER = getLogger(StageManager.class);

	private Stage primaryStage;

	private SpringFXMLLoader springFXMLLoader;

	@Autowired
	public StageManager(SpringFXMLLoader springFXMLLoader) {
		this.springFXMLLoader = springFXMLLoader;
	}

	public Scene switchScene(final FxmlView view) {
		Parent viewRootNodeHierarchy = loadViewNodeHierarchy(view.getFxmlFile());
		return show(viewRootNodeHierarchy, view.getTitle());
	}

	public void setStage(Stage stage) {
		this.primaryStage = stage;
	}

	private Scene show(final Parent rootnode, String title) {
		Scene scene = prepareScene(rootnode);
		// scene.getStylesheets().add("/styles/Styles.css");

		// primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.setTitle(title);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.centerOnScreen();

		try {
			primaryStage.show();
		} catch (Exception exception) {
			logAndExit("Unable to show scene for title" + title, exception);
		}

		return scene;
	}

	private Scene prepareScene(Parent rootnode) {
		Scene scene = primaryStage.getScene();

		if (scene == null) {
			scene = new Scene(rootnode);
		}
		scene.setRoot(rootnode);
		return scene;
	}

	/**
	 * Loads the object hierarchy from a FXML document and returns to root node of
	 * that hierarchy.
	 *
	 * @return Parent root node of the FXML document hierarchy
	 */
	private Parent loadViewNodeHierarchy(String fxmlFilePath) {
		Parent rootNode = null;
		try {
			rootNode = springFXMLLoader.load(fxmlFilePath);
			Objects.requireNonNull(rootNode, "A Root FXML node must not be null");
		} catch (Exception exception) {
			logAndExit("Unable to load FXML view" + fxmlFilePath, exception);
			exception.printStackTrace();
		}
		return rootNode;
	}

	public <T> Optional<T> showDialog(String fxmlFilePath, T entity) {
		Dialog<T> dialog = null;
		try {
			dialog = springFXMLLoader.load(fxmlFilePath, entity);
			Objects.requireNonNull(dialog, "A dialog FXML node must not be null");
		} catch (Exception exception) {
			logAndExit("Unable to load FXML dialog" + fxmlFilePath, exception);
			exception.printStackTrace();
		}

		dialog.initOwner(primaryStage);

		return dialog.showAndWait();

	}

	private void logAndExit(String errorMsg, Exception exception) {
		LOGGER.error(errorMsg, exception, exception.getCause());
		Platform.exit();
	}

}