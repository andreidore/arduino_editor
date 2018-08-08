package com.setyrobotics.arduinoeditor.controller;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.context.Context;
import com.setyrobotics.arduinoeditor.skin.DefaultSkinController;
import com.setyrobotics.arduinoeditor.skin.SkinController;

import de.tesis.dynaware.grapheditor.GraphEditor;
import de.tesis.dynaware.grapheditor.GraphEditorContainer;
import de.tesis.dynaware.grapheditor.core.DefaultGraphEditor;
import de.tesis.dynaware.grapheditor.core.skins.defaults.connection.SimpleConnectionSkin;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.model.GraphFactory;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.transform.Scale;

@Controller
public class MainController implements Initializable {

	@FXML
	private TextArea console;

	@FXML
	private GraphEditorContainer graphEditorContainer;

	private final GraphEditor graphEditor = new DefaultGraphEditor();

	private DefaultSkinController defaultSkinController;

	private final ObjectProperty<SkinController> activeSkinController = new SimpleObjectProperty<>();

	private Scale scaleTransform;
	private double currentZoomFactor = 1;

	@Lazy
	@Autowired
	private StageManager stageManager;

	@Autowired
	private Context context;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		final GModel model = GraphFactory.eINSTANCE.createGModel();

		graphEditor.setModel(model);

		graphEditor.getSelectionManager().getSelectedNodes().addListener(new ListChangeListener<GNode>() {

			@Override
			public void onChanged(Change<? extends GNode> c) {

				while (c.next()) {
					System.out.println(c.getAddedSize());
				}

			}
		});

		graphEditorContainer.setGraphEditor(graphEditor);

		setDetouredStyle();

		defaultSkinController = new DefaultSkinController(graphEditor, graphEditorContainer);

		activeSkinController.set(defaultSkinController);

		initializeMenuBar();

	}

	@FXML
	public void setDetouredStyle() {

		final Map<String, String> customProperties = graphEditor.getProperties().getCustomProperties();
		customProperties.put(SimpleConnectionSkin.SHOW_DETOURS_KEY, Boolean.toString(true));
		graphEditor.reload();
	}

	@FXML
	public void addNode() {
		activeSkinController.get().addNode(currentZoomFactor);
	}

	/**
	 * Initializes the menu bar.
	 */
	private void initializeMenuBar() {

		scaleTransform = new Scale(currentZoomFactor, currentZoomFactor, 0, 0);
		scaleTransform.yProperty().bind(scaleTransform.xProperty());

		graphEditor.getView().getTransforms().add(scaleTransform);

	}

	public void handleExitAction(ActionEvent event) {
		Platform.exit();
	}

	private void addTextToConsole(String text) {

	}

}