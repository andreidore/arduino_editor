package de.tesis.dynaware.grapheditor.core.connections;

import java.util.function.Consumer;

import de.tesis.dynaware.grapheditor.model.GConnection;

/**
 * Stores any connection created / removed handlers that are set.
 */
public class ConnectionEventManager {

	private Consumer<GConnection> connectionCreatedHandler;
	private Consumer<GConnection> connectionRemovedHandler;

	/**
	 * Sets the handler to be called when connections are created.
	 * 
	 * @param connectionCreatedHandler the handler to be called when connections are
	 *                                 created
	 */
	public void setOnConnectionCreated(final Consumer<GConnection> connectionCreatedHandler) {
		this.connectionCreatedHandler = connectionCreatedHandler;
	}

	/**
	 * Sets the handler to be called when connections are removed.
	 * 
	 * @param connectionRemovedHandler the handler to be called when connections are
	 *                                 removed
	 */
	public void setOnConnectionRemoved(final Consumer<GConnection> connectionRemovedHandler) {
		this.connectionRemovedHandler = connectionRemovedHandler;
	}

	/**
	 * Calls the connection-created handler (if it exists) after a connection was
	 * created.
	 * 
	 * @param connection the connection that was created
	 * @param command    the compound command that created it
	 */
	public void notifyConnectionAdded(final GConnection connection) {

		if (connectionCreatedHandler != null) {
			connectionCreatedHandler.accept(connection);
		}
	}

	/**
	 * Calls the connection-removed handler (if it exists) after a connection was
	 * removed.
	 * 
	 * @param connection the connection that was removed
	 * @param command    the compound command that removed it
	 */
	public void notifyConnectionRemoved(final GConnection connection) {

		if (connectionRemovedHandler != null) {
			connectionRemovedHandler.accept(connection);
		}
	}
}
