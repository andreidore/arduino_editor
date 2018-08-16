package com.setyrobotics.arduinoeditor.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class AbstractNode implements Node {

	private SimpleStringProperty name;

	public AbstractNode() {
		this.name = new SimpleStringProperty();
	}

	@Override
	public StringProperty getName() {
		return name;
	}

}
