package com.github.graphfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Graph {

	private ObservableList<Node> nodes;

	public Graph() {
		nodes = FXCollections.observableArrayList();
	}

	public ObservableList<Node> getNodes() {
		return nodes;
	}

	
	
}
