package com.github.graphfx.skin;

import com.github.graphfx.Node;

import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectangleNodeSkin implements NodeSkin {

	@Override
	public Region getGraphic(Node node) {
		final Rectangle view = new Rectangle(50, 50);

		view.setStroke(Color.DODGERBLUE);
		view.setFill(Color.DODGERBLUE);
		return new Pane(view);
	}

}
