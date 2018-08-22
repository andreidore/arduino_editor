/**
 */
package de.tesis.dynaware.grapheditor.model;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see de.tesis.dynaware.grapheditor.model.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://de.tesis.dynaware.grapheditor.model/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	GraphPackage eINSTANCE = de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the
	 * '{@link de.tesis.dynaware.grapheditor.model.impl.GModelImpl <em>GModel</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.tesis.dynaware.grapheditor.model.impl.GModelImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGModel()
	 * @generated
	 */
	int GMODEL = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL__NODES = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL__CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Content Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL__CONTENT_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Content Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL__CONTENT_HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Supergraph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL__SUPERGRAPH = 5;

	/**
	 * The number of structural features of the '<em>GModel</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GModel</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectableImpl
	 * <em>GConnectable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectableImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnectable()
	 * @generated
	 */
	int GCONNECTABLE = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTABLE__CONNECTORS = 0;

	/**
	 * The number of structural features of the '<em>GConnectable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GConnectable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link de.tesis.dynaware.grapheditor.model.impl.GNodeImpl <em>GNode</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.tesis.dynaware.grapheditor.model.impl.GNodeImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGNode()
	 * @generated
	 */
	int GNODE = 2;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__CONNECTORS = GCONNECTABLE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__ID = GCONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__TYPE = GCONNECTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__X = GCONNECTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__Y = GCONNECTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__WIDTH = GCONNECTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__HEIGHT = GCONNECTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subgraph</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE__SUBGRAPH = GCONNECTABLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>GNode</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE_FEATURE_COUNT = GCONNECTABLE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>GNode</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GNODE_OPERATION_COUNT = GCONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl
	 * <em>GConnector</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectorImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnector()
	 * @generated
	 */
	int GCONNECTOR = 4;

	/**
	 * The meta object id for the
	 * '{@link de.tesis.dynaware.grapheditor.model.impl.GConnectionImpl
	 * <em>GConnection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.tesis.dynaware.grapheditor.model.impl.GConnectionImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGConnection()
	 * @generated
	 */
	int GCONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__CONNECTORS = GCONNECTABLE__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__ID = GCONNECTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__TYPE = GCONNECTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__SOURCE = GCONNECTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__TARGET = GCONNECTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Joints</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION__JOINTS = GCONNECTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>GConnection</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION_FEATURE_COUNT = GCONNECTABLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>GConnection</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTION_OPERATION_COUNT = GCONNECTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__CONNECTIONS = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__X = 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__Y = 5;

	/**
	 * The feature id for the '<em><b>Connection Detached On Drag</b></em>'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR__CONNECTION_DETACHED_ON_DRAG = 6;

	/**
	 * The number of structural features of the '<em>GConnector</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GConnector</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GCONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link de.tesis.dynaware.grapheditor.model.impl.GJointImpl <em>GJoint</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see de.tesis.dynaware.grapheditor.model.impl.GJointImpl
	 * @see de.tesis.dynaware.grapheditor.model.impl.GraphPackageImpl#getGJoint()
	 * @generated
	 */
	int GJOINT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GJOINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GJOINT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GJOINT__CONNECTION = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GJOINT__X = 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GJOINT__Y = 4;

	/**
	 * The number of structural features of the '<em>GJoint</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GJOINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GJoint</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GJOINT_OPERATION_COUNT = 0;

} // GraphPackage
