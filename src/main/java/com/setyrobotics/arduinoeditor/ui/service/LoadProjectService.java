package com.setyrobotics.arduinoeditor.ui.service;

import java.nio.file.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.service.ProjectService;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoadProjectService extends Service<Project> {

  @Autowired
  private ProjectService projectService;
  private Path path;

  public LoadProjectService(Path path) {
    this.path = path;
  }

  @Override
  protected Task<Project> createTask() {
    return new Task<Project>() {

      @Override
      protected Project call() throws Exception {

        Project project = projectService.loadProject(path);

        return project;
      }

    };
  }

}
