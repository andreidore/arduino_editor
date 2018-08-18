package com.github.graphfx.view;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class NodeGestures {

	final DragContext dragContext = new DragContext();
	final GraphView graphView;

	public NodeGestures(GraphView graphView) {
		this.graphView = graphView;
	}

	public void makeDraggable(final Node node) {
		node.setOnMousePressed(onMousePressedEventHandler);
		node.setOnMouseDragged(onMouseDraggedEventHandler);
		node.setOnMouseReleased(onMouseReleasedEventHandler);
	}

	final EventHandler<MouseEvent> onMousePressedEventHandler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			final Node node = (Node) event.getSource();

			final double scale = graphView.getScale();

			dragContext.x = node.getBoundsInParent().getMinX() * scale - event.getScreenX();
			dragContext.y = node.getBoundsInParent().getMinY() * scale - event.getScreenY();
		}
	};

	final EventHandler<MouseEvent> onMouseDraggedEventHandler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {
			final Node node = (Node) event.getSource();

			double offsetX = event.getScreenX() + dragContext.x;
			double offsetY = event.getScreenY() + dragContext.y;

			// adjust the offset in case we are zoomed
			final double scale = graphView.getScale();

			offsetX /= scale;
			offsetY /= scale;

			node.relocate(offsetX, offsetY);
		}
	};

	final EventHandler<MouseEvent> onMouseReleasedEventHandler = new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent event) {

		}
	};

	public static class DragContext {
		double x;
		double y;
	}
}