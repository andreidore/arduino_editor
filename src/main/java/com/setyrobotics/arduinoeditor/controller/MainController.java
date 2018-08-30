package com.setyrobotics.arduinoeditor.controller;

import java.net.URL;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import com.setyrobotics.arduinoeditor.config.StageManager;
import com.setyrobotics.arduinoeditor.context.Context;
import javafx.application.Platform;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

@Controller
public class MainController implements Initializable {

  @FXML
  private TextArea console;

  @FXML
  private SwingNode swingNode;

  @Lazy
  @Autowired
  private StageManager stageManager;

  @Autowired
  private Context context;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

  public void handleExitAction(ActionEvent event) {
    Platform.exit();
  }

  private void addTextToConsole(String text) {

  }

}
