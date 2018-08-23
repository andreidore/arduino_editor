/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>GModel</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl#getNodes
 * <em>Nodes</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl#getConnections
 * <em>Connections</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl#getContentWidth
 * <em>Content Width</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl#getContentHeight
 * <em>Content Height</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl#getSupergraph
 * <em>Supergraph</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GModelImpl implements GModel {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected ObservableList<GNode> nodes;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected ObservableList<GConnection> connections;

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
	 * The default value of the '{@link #getContentWidth() <em>Content Width</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContentWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double CONTENT_WIDTH_EDEFAULT = 3000.0;

	/**
	 * The cached value of the '{@link #getContentWidth() <em>Content Width</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContentWidth()
	 * @generated
	 * @ordered
	 */
	protected DoubleProperty contentWidth = new SimpleDoubleProperty(3000);

	/**
	 * The default value of the '{@link #getContentHeight() <em>Content
	 * Height</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContentHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double CONTENT_HEIGHT_EDEFAULT = 2250.0;

	/**
	 * The cached value of the '{@link #getContentHeight() <em>Content Height</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContentHeight()
	 * @generated
	 * @ordered
	 */
	protected DoubleProperty contentHeight = new SimpleDoubleProperty(2250);

	private ObjectProperty<GNode> supergraph;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObservableList<GNode> getNodes() {
		return nodes;
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
	public StringProperty getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleProperty getContentHeight() {
		return contentHeight;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObjectProperty<GNode> getSupergraph() {
		return supergraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DoubleProperty getContentWidth() {
		return contentWidth;
	}

} // GModelImpl
