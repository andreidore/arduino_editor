package com.setyrobotics.arduinoeditor.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import com.setyrobotics.arduinoeditor.model.Project;

public interface ProjectService {

  Project getProject();

  void newProject();

  void loadProject(final Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException;


  void saveProject(final Path path)
      throws UnsupportedEncodingException, FileNotFoundException, IOException;

}
