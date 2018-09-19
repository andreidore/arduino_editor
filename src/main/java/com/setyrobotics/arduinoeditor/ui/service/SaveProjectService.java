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
public class SaveProjectService extends Service<Void> {

  @Autowired
  private ProjectService projectService;
  private Path path;
  private Project project;

  public SaveProjectService(Project project, Path path) {
    this.path = path;
    this.project = project;
  }

  @Override
  protected Task<Void> createTask() {
    return new Task<Void>() {

      @Override
      protected Void call() throws Exception {

        projectService.saveProject(project, path);
        
        return null;

      }

    };
  }

}
