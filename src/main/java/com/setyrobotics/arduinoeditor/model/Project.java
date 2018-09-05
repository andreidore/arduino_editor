package com.setyrobotics.arduinoeditor.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Project {

  private StringProperty name;

  private ObservableList<State> states;

  public Project() {
    name = new SimpleStringProperty("No name");
    states = FXCollections.observableArrayList();
  }

  public StringProperty getName() {
    return name;
  }

  public ObservableList<State> getStates() {
    return states;
  }

  @Override
  public String toString() {
    return "Project [name=" + name + ", states=" + states + "]";
  }



}
