package com.setyrobotics.arduinoeditor.ui;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.io.IOUtils;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JavaScript;

//https://vaadin.com/forum/thread/17053442
//https://vaadin.com/docs/v10/flow/polymer-templates/tutorial-template-basic.html
@Tag("div")
@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.js")
@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/lodash.js/3.10.1/lodash.js")
@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/backbone.js/1.3.3/backbone.js")
@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/jointjs/2.1.0/joint.js")
public class GraphEditor extends Component implements HasSize, HasStyle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GraphEditor() {
		setId("graph-editor");

		getStyle().set("background", "url('/images/grid.gif')");

		String initScript = null;
		try (Reader in = new InputStreamReader(getClass().getResourceAsStream("/scripts/graph.js"))) {

			initScript = IOUtils.toString(in);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UI.getCurrent().getPage().executeJavaScript(initScript, getElement());

	}

	

	public void addNode() {
		String initScript = null;
		try (Reader in = new InputStreamReader(getClass().getResourceAsStream("/scripts/button.js"))) {

			initScript = IOUtils.toString(in);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		UI.getCurrent().getPage().executeJavaScript(initScript, getElement());

	}

	@ClientCallable
	public void selectNode(int id) {
		System.out.println("Select node" + id);
	}

}
