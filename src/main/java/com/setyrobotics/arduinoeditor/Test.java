package com.setyrobotics.arduinoeditor;

import com.github.graphfx.Graph;
import com.github.graphfx.view.GraphView;
import com.setyrobotics.arduinoeditor.model.button.Button;
import com.setyrobotics.arduinoeditor.skin.button.ButtonSkin;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public class Test extends Application {

	@Override
	public void start(Stage primaryStage) {
		final BorderPane root = new BorderPane();

		GraphView graphView = new GraphView();
		graphView.addSkin(Button.class, new ButtonSkin());

		root.setCenter(graphView.getCanvas());

		final Scene scene = new Scene(root, 1024, 768);
		scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());

		primaryStage.setScene(scene);
		primaryStage.show();

		Graph graph = new Graph();

		graphView.setModel(graph);

		Button node1 = new Button();
		graph.getNodes().add(node1);

		Button node2 = new Button();
		graph.getNodes().add(node2);

	}

	public static void main(String[] args) {
		launch(args);
	}

}