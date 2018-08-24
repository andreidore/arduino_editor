package com.setyrobotics.arduinoeditor.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;

//https://vaadin.com/forum/thread/17053442
//https://vaadin.com/docs/v10/flow/polymer-templates/tutorial-template-basic.html
@Tag("div")
@JavaScript("/scripts/mxClient.min.js")
public class GraphEditor extends Component implements HasSize {

	public GraphEditor() {
		setId("graph-editor");
	}

}
