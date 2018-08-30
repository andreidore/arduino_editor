package com.setyrobotics.arduinoeditor;

import eu.mihosoft.vrl.workflow.Connector;
import eu.mihosoft.vrl.workflow.FlowFactory;
import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VNode;
import eu.mihosoft.vrl.workflow.fx.FXSkinFactory;
import eu.mihosoft.vrl.workflow.fx.VCanvas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Test extends Application {

  @Override
  public void start(Stage primaryStage) {
    final BorderPane root = new BorderPane();

    // create a flow object
    VFlow flow = FlowFactory.newFlow();

    // add two nodes to the flow
    VNode n1 = flow.newNode();
    VNode n2 = flow.newNode();

    // create input and output connectors of type "default-type"
    Connector inN1 = n1.addInput("default-type");
    Connector outN1 = n1.addOutput("default-type");
    Connector inN2 = n2.addInput("default-type");
    Connector outN2 = n2.addOutput("default-type");

    // create a connections
    flow.connect(outN1, inN2);

    flow.setVisible(true);

    // create a zoomable canvas
    VCanvas canvas = new VCanvas();
    Pane root1 = (Pane) canvas.getContent();

    // creating a skin factory and attach it to the flow
    FXSkinFactory skinFactory = new FXSkinFactory(root1);
    flow.setSkinFactories(skinFactory);

    root.setCenter(canvas);

    final Scene scene = new Scene(root, 1024, 768);
    scene.getStylesheets().add(getClass().getResource("/css/application.css").toExternalForm());

    primaryStage.setScene(scene);
    primaryStage.show();

  }

  public static void main(String[] args) {
    launch(args);
  }

}
