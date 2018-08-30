package com.setyrobotics.arduinoeditor;

import javax.swing.SwingUtilities;

import com.github.graphfx.Graph;
import com.github.graphfx.view.GraphView;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.setyrobotics.arduinoeditor.model.button.Button;
import com.setyrobotics.arduinoeditor.skin.button.ButtonSkin;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public class Test extends Application {

	private SwingNode swingNode;

	@Override
	public void start(Stage primaryStage) {
		final BorderPane root = new BorderPane();
  
		 swingNode = new SwingNode();

		root.setCenter(swingNode);

		final Scene scene = new Scene(root, 1024, 768);
		scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();

		
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

	public static void main(String[] args) {
		launch(args);
	}

}