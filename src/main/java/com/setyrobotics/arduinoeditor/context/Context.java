package com.setyrobotics.arduinoeditor.context;

import java.io.IOException;

public interface Context {

	String PROJECT = "project";

	Object get(String key);

	void put(String key, Object value);

}