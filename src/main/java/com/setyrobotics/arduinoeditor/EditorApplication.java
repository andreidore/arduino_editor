package com.setyrobotics.arduinoeditor;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.setyrobotics.arduinoeditor.context.Context;
import com.setyrobotics.arduinoeditor.model.Project;

import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class EditorApplication {

	protected ConfigurableApplicationContext springContext;
	protected StageManager stageManager;

	public static void main(final String[] args) {
		Application.launch(args);
	}

	@Override
	public void init() throws Exception {
		springContext = springBootApplicationContext();

		Context context = springContext.getBean(Context.class);

		Project project = new Project();
		context.put(Context.PROJECT, project);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stageManager = springContext.getBean(StageManager.class);
		stageManager.setStage(stage);

		stageManager.switchScene(FxmlView.MAIN);
	}

	@Override
	public void stop() throws Exception {
		springContext.close();
		System.exit(0);
	}

	private ConfigurableApplicationContext springBootApplicationContext() {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Main.class);
		String[] args = getParameters().getRaw().stream().toArray(String[]::new);
		return builder.run(args);
	}

}
