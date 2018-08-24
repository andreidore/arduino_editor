package com.setyrobotics.arduinoeditor.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;

//https://vaadin.com/forum/thread/17053442
//https://vaadin.com/docs/v10/flow/polymer-templates/tutorial-template-basic.html
@Tag("div")
@JavaScript("/scripts/mxClient.min.js")
public class GraphEditor extends Component implements HasSize, HasStyle {

	public GraphEditor() {
		setId("graph-editor");

		getStyle().set("background", "url('/images/grid.gif')");

		String initScript = "$0.dataset.graph = new mxGraph($0); " + "new mxRubberband($0.dataset.graph);"
				+ "$0.dataset.parent = $0.dataset.graph.getDefaultParent();"

				+ "$0.dataset.graph.getModel().beginUpdate();" + "try{"
				+ "var v1 = $0.dataset.graph.insertVertex($0.dataset.graph , null, 'Hello,', 20, 20, 80, 30);"
				+ "}finally{ $0.dataset.graph.getModel().endUpdate();}";

		UI.getCurrent().getPage().executeJavaScript(initScript, getElement());
		disableContextMenu();
	}

	public void disableContextMenu() {

		UI.getCurrent().getPage().executeJavaScript("mxEvent.disableContextMenu($0);", getElement());

	}

	public void addNode() {

		String script = "graph.getModel().beginUpdate();" + "try{"
				+ "var v1 = graph.insertVertex(parent, null, 'Hello,', 20, 20, 80, 30);"
				+ "}finally{ graph.getModel().endUpdate();}";

		UI.getCurrent().getPage().executeJavaScript(script, getElement());

	}

}
