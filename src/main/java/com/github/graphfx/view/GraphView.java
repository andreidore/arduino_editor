package com.github.graphfx.view;

import java.util.HashMap;
import java.util.Map;

import com.github.graphfx.Graph;
import com.github.graphfx.Node;
import com.github.graphfx.layout.Layout;
import com.github.graphfx.skin.NodeSkin;

import javafx.collections.ListChangeListener;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Region;

public class GraphView {

	private final PannableCanvas pannableCanvas;
	private final Map<Class<? extends Node>, NodeSkin> graphics;
	private final NodeGestures nodeGestures;
	private Graph graph;

	public GraphView() {

		nodeGestures = new NodeGestures(this);

		pannableCanvas = new PannableCanvas();
		final ViewportGestures sceneGestures = new ViewportGestures(pannableCanvas);
		pannableCanvas.parentProperty().addListener((obs, oldVal, newVal) -> {
			if (oldVal != null) {
				oldVal.removeEventFilter(MouseEvent.MOUSE_PRESSED, sceneGestures.getOnMousePressedEventHandler());
				oldVal.removeEventFilter(MouseEvent.MOUSE_DRAGGED, sceneGestures.getOnMouseDraggedEventHandler());
				oldVal.removeEventFilter(ScrollEvent.ANY, sceneGestures.getOnScrollEventHandler());
			}
			if (newVal != null) {
				newVal.addEventFilter(MouseEvent.MOUSE_PRESSED, sceneGestures.getOnMousePressedEventHandler());
				newVal.addEventFilter(MouseEvent.MOUSE_DRAGGED, sceneGestures.getOnMouseDraggedEventHandler());
				newVal.addEventFilter(ScrollEvent.ANY, sceneGestures.getOnScrollEventHandler());
			}
		});

		graphics = new HashMap<>();

	}

	public PannableCanvas getCanvas() {
		return pannableCanvas;
	}

	public Graph getModel() {
		return graph;
	}

	public void setModel(Graph graph) {
		this.graph = graph;

		graph.getNodes().addListener((ListChangeListener.Change<? extends Node> c) -> {

			while (c.next()) {
				if (c.wasAdded()) {

					for (Node n : c.getAddedSubList()) {

						NodeSkin skin = graphics.get(n.getClass());

						Region nodeGraphic = skin.getGraphic(n);

						nodeGestures.makeDraggable(nodeGraphic);

						getCanvas().getChildren().add(nodeGraphic);

					}

					System.out.println(c.getList());
					System.out.println("- wasAdded");
				}

				if (c.wasRemoved()) {
					System.out.println(c.getList());
					System.out.println("- wasRemoved");
				}

			}

		});

	}

	public double getScale() {
		return getCanvas().getScale();
	}

	public void layout(Layout layout) {
		// layout.execute(this);
	}

	public void addSkin(Class<? extends Node> clazz, NodeSkin skin) {

		graphics.put(clazz, skin);
	}

}
