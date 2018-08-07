package com.setyrobotics.arduinoeditor.config;

import java.util.ResourceBundle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.setyrobotics.arduinoeditor.context.Context;
import com.setyrobotics.arduinoeditor.context.DefaultContext;

@Configuration
public class ApplicationConfig {

	@Bean
	public Context context() {
		return new DefaultContext();
	}

	@Bean
	public ResourceBundle resourceBundle() {
		return ResourceBundle.getBundle("Bundle");
	}

}