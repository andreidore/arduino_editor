package com.setyrobotics.arduinoeditor.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class State {

  private ObservableList<Node> nodes;

  public State() {
    nodes = FXCollections.observableArrayList();
  }

  public ObservableList<Node> getNodes() {
    return nodes;
  }

}
