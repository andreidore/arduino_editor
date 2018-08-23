/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>GNode</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getId
 * <em>Id</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getX
 * <em>X</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getY
 * <em>Y</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getWidth
 * <em>Width</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getHeight
 * <em>Height</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl#getSubgraph
 * <em>Subgraph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GNodeImpl extends GConnectableImpl implements GNode {
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

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 151.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleProperty width = new SimpleDoubleProperty();

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 101.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleProperty height = new SimpleDoubleProperty();

	/**
	 * The cached value of the '{@link #getSubgraph() <em>Subgraph</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSubgraph()
	 * @generated
	 * @ordered
	 */
	protected ObjectProperty<GModel> subgraph;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GNodeImpl() {
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

	public StringProperty getType() {
		return type;
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
	public DoubleProperty getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleProperty getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectProperty<GModel> getSubgraph() {
		return subgraph;
	}

} // GNodeImpl
