/**
 */
package action_argumentation;

import action_base.Update;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Asserted Relationship Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.UpdateAssertedRelationshipSource#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getUpdateAssertedRelationshipSource()
 * @model
 * @generated
 */
public interface UpdateAssertedRelationshipSource extends Update {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ModelElement)
	 * @see action_argumentation.Action_argumentationPackage#getUpdateAssertedRelationshipSource_Source()
	 * @model
	 * @generated
	 */
	ModelElement getSource();

	/**
	 * Sets the value of the '{@link action_argumentation.UpdateAssertedRelationshipSource#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModelElement value);

} // UpdateAssertedRelationshipSource
