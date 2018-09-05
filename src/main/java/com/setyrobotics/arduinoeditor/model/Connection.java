package com.setyrobotics.arduinoeditor.model;

import javafx.beans.property.SimpleIntegerProperty;

public class Connection {

  private SimpleIntegerProperty source;
  private SimpleIntegerProperty target;

  public Connection() {
    this.source = new SimpleIntegerProperty();
    this.target = new SimpleIntegerProperty();
  }

  public SimpleIntegerProperty getSource() {
    return source;
  }

  public SimpleIntegerProperty getTarget() {
    return target;
  }



}
