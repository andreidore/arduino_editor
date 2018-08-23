/**
 */
package de.tesis.dynaware.grapheditor.model.impl;

import de.tesis.dynaware.grapheditor.model.GConnection;
import de.tesis.dynaware.grapheditor.model.GConnector;
import de.tesis.dynaware.grapheditor.model.GJoint;
import de.tesis.dynaware.grapheditor.model.GModel;
import de.tesis.dynaware.grapheditor.model.GNode;
import de.tesis.dynaware.grapheditor.model.GraphFactory;
import de.tesis.dynaware.grapheditor.model.GraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class GraphFactoryImpl implements GraphFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static GraphFactory init() {

		return new GraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	public GraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GModel createGModel() {
		GModelImpl gModel = new GModelImpl();
		return gModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GNode createGNode() {
		GNodeImpl gNode = new GNodeImpl();
		return gNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GConnector createGConnector() {
		GConnectorImpl gConnector = new GConnectorImpl();
		return gConnector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GConnection createGConnection() {
		GConnectionImpl gConnection = new GConnectionImpl();
		return gConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GJoint createGJoint() {
		GJointImpl gJoint = new GJointImpl();
		return gJoint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphPackage getGraphPackage() {
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphPackage getPackage() {
		return GraphPackage.eINSTANCE;
	}

} // GraphFactoryImpl
