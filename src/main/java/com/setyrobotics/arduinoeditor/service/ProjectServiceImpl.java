package com.setyrobotics.arduinoeditor.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.file.Path;
import javax.annotation.PostConstruct;
import org.hildan.fxgson.FxGson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.model.State;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ProjectServiceImpl.class);

  private Project project;

  @PostConstruct
  public void init() {
    newProject();
  }

  @Override
  public Project getProject() {
    return project;
  }

  @Override
  public void loadProject(final Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException {


    Gson fxGson = FxGson.create();

    try (Reader reader = new InputStreamReader(new FileInputStream(path.toFile()), "utf-8")) {
      project = fxGson.fromJson(reader, Project.class);
    }

  }

  @Override
  public void saveProject(Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException {
    Gson fxGson = FxGson.fullBuilder().setPrettyPrinting().create();

    try (Writer writer = new OutputStreamWriter(new FileOutputStream(path.toFile()), "utf-8")) {
      fxGson.toJson(project, writer);
    }

  }

  @Override
  public void newProject() {

    LOGGER.info("New project.");

    this.project = new Project();
    State mainState = new State();
    mainState.getName().set("Main");

    project.getStates().add(mainState);

  }

}
