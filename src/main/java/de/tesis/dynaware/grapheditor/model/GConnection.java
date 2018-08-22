/**
 */
package de.tesis.dynaware.grapheditor.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>GConnection</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GConnection#getId
 * <em>Id</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GConnection#getType
 * <em>Type</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GConnection#getSource
 * <em>Source</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GConnection#getTarget
 * <em>Target</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GConnection#getJoints
 * <em>Joints</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGConnection()
 * @model
 * @generated
 */
public interface GConnection extends GConnectable {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGConnection_Id()
	 * @model id="true"
	 * @generated
	 */
	StringProperty getId();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGConnection_Type()
	 * @model
	 * @generated
	 */
	StringProperty getType();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(GConnector)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGConnection_Source()
	 * @model required="true"
	 * @generated
	 */
	ObjectProperty<GConnector> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GConnector)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGConnection_Target()
	 * @model required="true"
	 * @generated
	 */
	ObjectProperty<GConnector> getTarget();



	/**
	 * Returns the value of the '<em><b>Joints</b></em>' containment reference list.
	 * The list contents are of type
	 * {@link de.tesis.dynaware.grapheditor.model.GJoint}. It is bidirectional and
	 * its opposite is
	 * '{@link de.tesis.dynaware.grapheditor.model.GJoint#getConnection
	 * <em>Connection</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joints</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Joints</em>' containment reference list.
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGConnection_Joints()
	 * @see de.tesis.dynaware.grapheditor.model.GJoint#getConnection
	 * @model opposite="connection" containment="true"
	 * @generated
	 */
	ObservableList<GJoint> getJoints();

} // GConnection