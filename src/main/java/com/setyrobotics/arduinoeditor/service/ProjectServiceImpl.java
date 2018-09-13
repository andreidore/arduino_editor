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
import com.google.gson.GsonBuilder;
import com.setyrobotics.arduinoeditor.gson.RuntimeTypeAdapterFactory;
import com.setyrobotics.arduinoeditor.model.Node;
import com.setyrobotics.arduinoeditor.model.Project;
import com.setyrobotics.arduinoeditor.model.State;
import com.setyrobotics.arduinoeditor.model.component.Button;
import com.setyrobotics.arduinoeditor.model.component.Led;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

  private static final Logger LOGGER = LoggerFactory.getLogger(ProjectServiceImpl.class);



  private Gson fxGson;

  @PostConstruct
  public void init() {
    newProject();


    RuntimeTypeAdapterFactory<Node> runtimeTypeAdapterFactory =
        RuntimeTypeAdapterFactory.of(Node.class, "type").registerSubtype(Button.class, "button")
            .registerSubtype(Led.class, "led");

    GsonBuilder builder = new GsonBuilder().registerTypeAdapterFactory(runtimeTypeAdapterFactory);

    fxGson = FxGson.addFxSupport(builder).setPrettyPrinting().create();
  }


  @Override
  public Project loadProject(final Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException {

    LOGGER.info(String.format("load project %s", path));

    try (Reader reader = new InputStreamReader(new FileInputStream(path.toFile()), "utf-8")) {
      return fxGson.fromJson(reader, Project.class);
    }

  }

  @Override
  public void saveProject(final Project project, final Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException {

    try (Writer writer = new OutputStreamWriter(new FileOutputStream(path.toFile()), "utf-8")) {
      fxGson.toJson(project, writer);
    }

  }

  @Override
  public Project newProject() {

    LOGGER.info("New project.");

    Project project = new Project();
    State mainState = new State();
    mainState.getName().set("Main");

    project.getStates().add(mainState);

    return project;

  }

}
