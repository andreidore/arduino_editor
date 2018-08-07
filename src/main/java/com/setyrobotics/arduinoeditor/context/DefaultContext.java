package com.setyrobotics.arduinoeditor.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultContext implements Context {

	private Map<String, Object> properties;

	public DefaultContext() {
		properties = new ConcurrentHashMap<>();

	}

	public Object get(String key) {
		return properties.get(key);
	}

	public void put(String key, Object value) {
		properties.put(key, value);
	}

}