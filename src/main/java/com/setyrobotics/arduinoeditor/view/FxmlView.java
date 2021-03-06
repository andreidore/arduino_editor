package com.setyrobotics.arduinoeditor.view;

import java.util.ResourceBundle;

public enum FxmlView {

  MAIN {
    @Override
    public String getTitle() {
      return getStringFromResourceBundle("title");
    }

    @Override
    public String getFxmlFile() {
      return "/fxml/Main.fxml";
    }
  },
  JOB {
    @Override
    public String getTitle() {
      return getStringFromResourceBundle("user.title");
    }

    @Override
    public String getFxmlFile() {
      return "/fxml/Job.fxml";
    }
  };
  ;

  public abstract String getTitle();

  public abstract String getFxmlFile();

  String getStringFromResourceBundle(String key) {
    return ResourceBundle.getBundle("Bundle").getString(key);
  }

}
