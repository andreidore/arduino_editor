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

		

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				
				mxGraph graph = new mxGraph();
				Object parent = graph.getDefaultParent();

				graph.getModel().beginUpdate();
				try {
					Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80, 30);
					Object v2 = graph.insertVertex(parent, null, "World!", 240, 150, 80, 30);
					graph.insertEdge(parent, null, "Edge", v1, v2);
				} finally {
					graph.getModel().endUpdate();
				}
				
				mxGraphComponent graphComponent = new mxGraphComponent(graph);
				swingNode.setContent(graphComponent);
			}
		});

	}

	public void handleExitAction(ActionEvent event) {
		Platform.exit();
	}

	private void addTextToConsole(String text) {

	}

}