package com.setyrobotics.arduinoeditor.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class State {

  private ObservableList<Node> nodes;

  private StringProperty name;

  private DoubleProperty width;

  private DoubleProperty height;

  private DoubleProperty x;

  private DoubleProperty y;

  public State() {
    nodes = FXCollections.observableArrayList();
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



}
