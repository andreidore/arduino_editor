package com.setyrobotics.arduinoeditor.ui.controller;



import org.springframework.stereotype.Component;
import com.jfoenix.controls.JFXListView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

@Component
public class SideMenuController {

  @FXML
  private JFXListView<Label> sideMenuList;



  @FXML
  public void initialize() {

    sideMenuList.propagateMouseEventsToParent();

    sideMenuList.getSelectionModel().selectedItemProperty().addListener((o, oldVal, newVal) -> {

      if (newVal == null) {
        return;
      }

      if (newVal.getText().equals("New")) {

        new Thread(() -> {

          Platform.runLater(() -> {
            if (newVal != null) {
              // ((MainController) context.get(Context.ROOT_CONTROLLER_KEY)).clear();
              sideMenuList.getSelectionModel().clearSelection();
            }

          });

        }).start();

      }
      if (newVal.getText().equals("Export")) {

        new Thread(() -> {

          Platform.runLater(() -> {
            if (newVal != null) {
              // ((MainController) context.get(Context.ROOT_CONTROLLER_KEY)).showExport();
              sideMenuList.getSelectionModel().clearSelection();
            }
          });

        }).start();

      } else if (newVal.getText().equals("Settings")) {

        new Thread(() -> {

          Platform.runLater(() -> {
            if (newVal != null) {
              // ((MainController) context.get(Context.ROOT_CONTROLLER_KEY)).showSettings();
            }
          });

        }).start();

      } else if (newVal.getText().equals("Exit")) {

        // ((MainController) context.get(Context.ROOT_CONTROLLER_KEY)).exit();

      }

    });

  }

}
