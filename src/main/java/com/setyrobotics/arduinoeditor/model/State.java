package com.setyrobotics.arduinoeditor.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class State {

  private final ObservableList<Node> nodes;

  private final ObservableList<Connection> connections;

  private final StringProperty name;

  private final DoubleProperty width;

  private final DoubleProperty height;

  private final DoubleProperty x;

  private final DoubleProperty y;

  public State() {
    nodes = FXCollections.observableArrayList();
    connections = FXCollections.observableArrayList();
    name = new SimpleStringProperty("Main");
    width = new SimpleDoubleProperty(200);
    height = new SimpleDoubleProperty(200);
    x = new SimpleDoubleProperty(200);
    y = new SimpleDoubleProperty(200);

  }

  public ObservableList<Node> getNodes() {
    return nodes;
  }

  public StringProperty getName() {
    return name;
  }

  public DoubleProperty getWidth() {
    return width;
  }

  public DoubleProperty getHeight() {
    return height;
  }

  public DoubleProperty getX() {
    return x;
  }

  public DoubleProperty getY() {
    return y;
  }

  @Override
  public String toString() {
    return "State [nodes=" + nodes + ", connections=" + connections + ", name=" + name + ", width="
        + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
  }

 



}
