package com.setyrobotics.arduinoeditor.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.model.State;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

  private Project project;

  @PostConstruct
  public void init() {
    this.project = new Project();
    State mainState = new State();
    mainState.getName().set("Main");
    project.getStates().add(mainState);

  }

  @Override
  public Project getProject() {
    return project;
  }

}
