package com.setyrobotics.arduinoeditor.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.context.Context;

import eu.mihosoft.vrl.workflow.Connector;
import eu.mihosoft.vrl.workflow.FlowFactory;
import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VNode;
import eu.mihosoft.vrl.workflow.fx.FXSkinFactory;
import eu.mihosoft.vrl.workflow.fx.VCanvas;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

@Controller
public class MainController implements Initializable {

	@FXML
	private TextArea console;

	@FXML
	private VCanvas canvas;

	@Lazy
	@Autowired
	private StageManager stageManager;

	@Autowired
	private Context context;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

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

		Pane root = (Pane) canvas.getContent();

		// creating a skin factory and attach it to the flow
		FXSkinFactory skinFactory = new FXSkinFactory(root);
		flow.setSkinFactories(skinFactory);

	}

	public void handleExitAction(ActionEvent event) {
		Platform.exit();
	}

	private void addTextToConsole(String text) {

	}

}