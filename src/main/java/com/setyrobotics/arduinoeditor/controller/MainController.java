package com.setyrobotics.arduinoeditor.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.SwingUtilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.context.Context;

import javafx.application.Platform;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

@Controller
public class MainController implements Initializable {

	@FXML
	private TextArea console;

	@FXML
	private SwingNode swingNode;

	@Lazy
	@Autowired
	private StageManager stageManager;

	@Autowired
	private Context context;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		SwingUtilities.invokeLater(this::createMxGraph);

	}

	private void createMxGraph() {
		mxGraph grafo = new mxGraph();
		Object parent = grafo.getDefaultParent();

		Object v1 = grafo.insertVertex(parent, null, "Brazil", 100, 100, 50, 40);
		Object v2 = grafo.insertVertex(parent, null, "Soccer", 240, 150, 50, 40);
		Object a1 = grafo.insertEdge(parent, null, "loves", v1, v2);

		mxGraphComponent graphComponent = new mxGraphComponent(grafo);

		swingNode.setContent(graphComponent);
	}

	public void handleExitAction(ActionEvent event) {
		Platform.exit();
	}

	private void addTextToConsole(String text) {

	}

}