/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GJoint;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>GJoint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl#getConnection
 * <em>Connection</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl#getX
 * <em>X</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl#getY
 * <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GJointImpl implements GJoint {
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

	private ObjectProperty<GConnection> connection;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GJointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public StringProperty getId() {
		return id;
	}

	/**
	 * 
	 * 
	 * /** <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public ObjectProperty<GConnection> getConnection() {
		return connection;
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

} // GJointImpl
