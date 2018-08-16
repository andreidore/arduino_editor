package com.setyrobotics.arduinoeditor.skin.button;

import com.setyrobotics.arduinoeditor.model.Node;
import com.setyrobotics.arduinoeditor.model.button.Button;
import com.setyrobotics.arduinoeditor.skin.NodeSkin;

import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ButtonSkin implements NodeSkin {

	@Override
	public Region getGraphic(Node node) {

		Button button = (Button) node;

		final Rectangle view = new Rectangle(50, 50);

		view.setStroke(Color.DODGERBLUE);
		view.setFill(Color.DODGERBLUE);
		return new Pane(view);
	}

}