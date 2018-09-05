package com.setyrobotics.arduinoeditor.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Node {

  private SimpleStringProperty name;
  private SimpleIntegerProperty id;

  public Node() {
    this.name = new SimpleStringProperty();
    this.id = new SimpleIntegerProperty();
  }


  public StringProperty getName() {
    return name;
  }

  public SimpleIntegerProperty getId() {
    return id;
  }



}
