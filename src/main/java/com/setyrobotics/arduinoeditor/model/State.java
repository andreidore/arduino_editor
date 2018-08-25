package com.setyrobotics.arduinoeditor.model;

import java.util.ArrayList;
import java.util.List;

public class State {

	private List<Node> nodes;

	public State() {
		nodes = new ArrayList<>();
	}

	public List<Node> getNodes() {
		return nodes;
	}

}
