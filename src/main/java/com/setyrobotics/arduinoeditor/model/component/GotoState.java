package com.setyrobotics.arduinoeditor.model.component;

public class GotoState extends ComponentNode {

  public GotoState() {
    getName().set("Goto State");
  }

  @Override
  public String toString() {
    return "GotoState [getName()=" + getName() + "]";
  }



}
