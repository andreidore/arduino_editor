package com.setyrobotics.arduinoeditor.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import com.setyrobotics.arduinoeditor.model.Project;

public interface ProjectService {

  Project loadProject(final Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException;


  void saveProject(final Project project, final Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException;


  Project newProject();

}
