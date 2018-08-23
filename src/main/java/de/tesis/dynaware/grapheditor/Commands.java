/*
 * Copyright (C) 2005 - 2014 by TESIS DYNAware GmbH
 */
package de.tesis.dynaware.grapheditor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GConnector;
import de.tesis.dynaware.grapheditor.model.GJoint;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import javafx.scene.layout.Region;

/**
 * Provides utility methods for editing a {@link GModel} via EMF commands.
 *
 * <p>
 * Example:
 *
 * <pre>
 * <code>GModel model = GraphFactory.eINSTANCE.createGModel();
 * GNode node = GraphFactory.eINSTANCE.createGNode();
 * 
 * node.setX(100);
 * node.setY(50);
 * node.setWidth(150);
 * node.setHeight(200);
 * 
 * Commands.addNode(model, node);
 * Commands.undo(model);
 * Commands.redo(model);</code>
 * </pre>
 */
public class Commands {

	private static final Logger LOGGER = LoggerFactory.getLogger(Commands.class);

	/**
	 * Static class, not to be instantiated.
	 */
	private Commands() {
	}

	/**
	 * Adds a node to the model.
	 *
	 * <p>
	 * The node's x, y, width, and height values should be set before calling this
	 * method.
	 * </p>
	 *
	 * @param model the {@link GModel} to which the node should be added
	 * @param node  the {@link GNode} to add to the model
	 */
	public static void addNode(final GModel model, final GNode node) {

		model.getNodes().add(node);

	}

	/**
	 * Removes a node from the model.
	 * 
	 * <p>
	 * Also removes any connections that were attached to the node.
	 * </p>
	 *
	 * @param model the {@link GModel} from which the node should be removed
	 * @param node  the {@link GNode} to remove from the model
	 */
	public static void removeNode(final GModel model, final GNode node) {

		model.getNodes().remove(node);

		final List<GConnection> connectionsToDelete = new ArrayList<>();

		for (final GConnector connector : node.getConnectors()) {
			for (final GConnection connection : connector.getConnections()) {

				if (connection != null && !connectionsToDelete.contains(connection)) {
					connectionsToDelete.add(connection);
				}
			}
		}

		for (final GConnection connection : connectionsToDelete) {
			model.getConnections().remove(connection);

			final GConnector source = connection.getSource().get();
			final GConnector target = connection.getTarget().get();

			if (!node.equals(source.getParent().get())) {

				source.getConnections().remove(connection);

				// command.append(RemoveCommand.create(editingDomain, source,
				// CONNECTOR_CONNECTIONS, connection));
			}

			if (!node.equals(target.getParent().get())) {
				// command.append(RemoveCommand.create(editingDomain, target,
				// CONNECTOR_CONNECTIONS, connection));

				target.getConnections().remove(connection);
			}
		}

	}

	/**
	 * Clears everything in the given model.
	 *
	 * @param model the {@link GModel} to be cleared
	 */
	public static void clear(final GModel model) {

		model.getConnections().clear();

		model.getNodes().clear();

	}

	/**
	 * Removes all connectors from the given nodes, and all connections attached to
	 * them.
	 * 
	 * @param model the {@link GModel} being edited
	 * @param nodes a list of {@link GNode} instances whose connectors should be
	 *              removed
	 */
	public static void clearConnectors(final GModel model, final List<GNode> nodes) {

		final Set<GConnection> connectionsToRemove = new HashSet<>();
		final Set<GConnector> connectorsToRemove = new HashSet<>();

		for (final GNode node : nodes) {

			connectorsToRemove.addAll(node.getConnectors());

			for (final GConnector connector : node.getConnectors()) {
				connectionsToRemove.addAll(connector.getConnections());
			}
		}

		for (final GConnection connection : connectionsToRemove) {

			final GConnector source = connection.getSource().get();
			final GConnector target = connection.getTarget().get();

			if (!connectorsToRemove.contains(source)) {
				// command.append(RemoveCommand.create(editingDomain, source,
				// CONNECTOR_CONNECTIONS, connection));

			}

			if (!connectorsToRemove.contains(target)) {
				// command.append(RemoveCommand.create(editingDomain, target,
				// CONNECTOR_CONNECTIONS, connection));

			}
		}

	}

	/**
	 * Updates the model's layout values to match those in the skin instances.
	 *
	 * <p>
	 * This method adds set operations to the given compound command but does
	 * <b>not</b> execute it.
	 * </p>
	 *
	 * @param command    a {@link CompoundCommand} to which the set commands will be
	 *                   added
	 * @param model      the {@link GModel} whose layout values should be updated
	 * @param skinLookup the {@link SkinLookup} in use for this graph editor
	 *                   instance
	 */
	public static void updateLayoutValues(final GModel model, final SkinLookup skinLookup) {

		for (final GNode node : model.getNodes()) {

			final Region nodeRegion = skinLookup.lookupNode(node).getRoot();

			node.getX().set(nodeRegion.getLayoutX());
			node.getY().set(nodeRegion.getLayoutY());
			node.getWidth().set(nodeRegion.getWidth());
			node.getHeight().set(nodeRegion.getHeight());

			/*
			 * command.append(SetCommand.create(editingDomain, node, NODE_X,
			 * nodeRegion.getLayoutX())); command.append(SetCommand.create(editingDomain,
			 * node, NODE_Y, nodeRegion.getLayoutY()));
			 * command.append(SetCommand.create(editingDomain, node, NODE_WIDTH,
			 * nodeRegion.getWidth())); command.append(SetCommand.create(editingDomain,
			 * node, NODE_HEIGHT, nodeRegion.getHeight()));
			 */
		}

		for (final GConnection connection : model.getConnections()) {

			for (final GJoint joint : connection.getJoints()) {

				final GJointSkin jointSkin = skinLookup.lookupJoint(joint);
				final Region jointRegion = jointSkin.getRoot();

				final double x = jointRegion.getLayoutX() + jointSkin.getWidth() / 2;
				final double y = jointRegion.getLayoutY() + jointSkin.getHeight() / 2;

				joint.getX().set(x);
				joint.getY().set(y);

				// command.append(SetCommand.create(editingDomain, joint, JOINT_X, x));
				// command.append(SetCommand.create(editingDomain, joint, JOINT_Y, y));
			}
		}
	}

	/**
	 * Attempts to undo the given model to its previous state.
	 *
	 * @param model the {@link GModel} to undo
	 */
	public static void undo(final GModel model) {

	}

	/**
	 * Attempts to redo the given model to its next state.
	 *
	 * @param model the {@link GModel} to redo
	 */
	public static void redo(final GModel model) {

	}

}
