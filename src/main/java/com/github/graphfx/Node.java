package com.github.graphfx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Node {

	private StringProperty name;

	public Node() {
		name = new SimpleStringProperty("Node");
	}

	public StringProperty getName() {
		return name;
	}

}
