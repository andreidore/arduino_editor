package com.setyrobotics.arduinoeditor.model.component;

public class Button extends ComponentNode {

  public Button() {
    getName().set("Button");
  }

  @Override
  public String toString() {
    return "Button [getName()=" + getName() + "]";
  }



}
