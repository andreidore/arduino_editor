package com.github.graphfx;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Connection {

	private ObjectProperty<Node> source;

	private ObjectProperty<Node> target;

	public Connection() {
		source = new SimpleObjectProperty<>();
		target = new SimpleObjectProperty<>();
	}

	public ObjectProperty<Node> getSource() {
		return source;
	}

	public ObjectProperty<Node> getTarget() {
		return target;
	}

}
