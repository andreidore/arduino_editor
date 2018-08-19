package com.github.graphfx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Node {

	private StringProperty name;

	private ObservableList<InputConnector> inputConnectors;

	public Node() {
		name = new SimpleStringProperty("Node");
		inputConnectors = FXCollections.observableArrayList();
	}

	public StringProperty getName() {
		return name;
	}

	public ObservableList<InputConnector> getInputConnectors() {
		return inputConnectors;
	}

}
