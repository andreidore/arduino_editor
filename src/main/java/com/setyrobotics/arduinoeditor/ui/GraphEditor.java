package com.setyrobotics.arduinoeditor.ui;

import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.Div;

//https://vaadin.com/forum/thread/17053442
@JavaScript("/scripts/mxClient.min.js")
public class GraphEditor extends Div {

	public GraphEditor() {
		setId("graph-editor");

	}

}
