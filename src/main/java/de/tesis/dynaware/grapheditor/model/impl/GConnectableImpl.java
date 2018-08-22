/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GConnectable;
import de.tesis.dynaware.grapheditor.model.GConnector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>GConnectable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectableImpl#getConnectors
 * <em>Connectors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GConnectableImpl implements GConnectable {
	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected ObservableList<GConnector> connectors = FXCollections.observableArrayList();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GConnectableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObservableList<GConnector> getConnectors() {

		return connectors;
	}

} // GConnectableImpl
