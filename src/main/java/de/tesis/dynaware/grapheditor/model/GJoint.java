/**
 */
package de.tesis.dynaware.grapheditor.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>GJoint</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GJoint#getId <em>Id</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GJoint#getType
 * <em>Type</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GJoint#getConnection
 * <em>Connection</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GJoint#getX <em>X</em>}</li>
 * <li>{@link de.tesis.dynaware.grapheditor.model.GJoint#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGJoint()
 * @model
 * @generated
 */
public interface GJoint {
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
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGJoint_Id()
	 * @model id="true"
	 * @generated
	 */
	StringProperty getId();

	StringProperty getType();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' container reference. It
	 * is bidirectional and its opposite is
	 * '{@link de.tesis.dynaware.grapheditor.model.GConnection#getJoints
	 * <em>Joints</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Connection</em>' container reference.
	 * @see #setConnection(GConnection)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGJoint_Connection()
	 * @see de.tesis.dynaware.grapheditor.model.GConnection#getJoints
	 * @model opposite="joints" required="true" transient="false"
	 * @generated
	 */
	ObjectProperty<GConnection> getConnection();

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute. The default value is
	 * <code>"0"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear, there really should
	 * be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see de.tesis.dynaware.grapheditor.model.GraphPackage#getGJoint_X()
	 * @model default="0" required="true"
	 * @generated
	 */
	DoubleProperty getX();

	DoubleProperty getY();

} // GJoint
