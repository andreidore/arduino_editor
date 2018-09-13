package com.setyrobotics.arduinoeditor.config;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

  public enum HolderKey {
    PROJECT
  }

  @Bean
  public Map<HolderKey, Object> holder() {
    return new HashMap<>();
  }

  @Bean
  public ResourceBundle resourceBundle() {
    return ResourceBundle.getBundle("Bundle");
  }

}
