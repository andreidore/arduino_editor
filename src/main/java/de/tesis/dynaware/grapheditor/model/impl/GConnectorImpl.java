/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GConnectable;
import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GConnector;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>GConnector</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl#getParent
 * <em>Parent</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl#getConnections
 * <em>Connections</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl#getX
 * <em>X</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl#getY
 * <em>Y</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl#isConnectionDetachedOnDrag
 * <em>Connection Detached On Drag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GConnectorImpl implements GConnector {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected StringProperty id = new SimpleStringProperty();

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StringProperty type = new SimpleStringProperty();

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected ObservableList<GConnection> connections = FXCollections.observableArrayList();

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final double X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected DoubleProperty x = new SimpleDoubleProperty();

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final double Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected DoubleProperty y = new SimpleDoubleProperty();

	/**
	 * The default value of the '{@link #isConnectionDetachedOnDrag() <em>Connection
	 * Detached On Drag</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isConnectionDetachedOnDrag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTION_DETACHED_ON_DRAG_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isConnectionDetachedOnDrag() <em>Connection
	 * Detached On Drag</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #isConnectionDetachedOnDrag()
	 * @generated
	 * @ordered
	 */
	protected boolean connectionDetachedOnDrag = CONNECTION_DETACHED_ON_DRAG_EDEFAULT;

	private ObjectProperty<GConnectable> parent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StringProperty getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StringProperty getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObservableList<GConnection> getConnections() {

		return connections;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleProperty getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleProperty getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isConnectionDetachedOnDrag() {
		return connectionDetachedOnDrag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConnectionDetachedOnDrag(boolean newConnectionDetachedOnDrag) {
		boolean oldConnectionDetachedOnDrag = connectionDetachedOnDrag;
		connectionDetachedOnDrag = newConnectionDetachedOnDrag;

	}

	@Override
	public ObjectProperty<GConnectable> getParent() {
		return parent;
	}

} // GConnectorImpl
