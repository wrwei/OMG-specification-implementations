/**
 */
package action_base;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_base.Create#getCreatedElement <em>Created Element</em>}</li>
 * </ul>
 *
 * @see action_base.Action_basePackage#getCreate()
 * @model abstract="true"
 * @generated
 */
public interface Create extends Action {
	/**
	 * Returns the value of the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Element</em>' containment reference.
	 * @see #setCreatedElement(ModelElement)
	 * @see action_base.Action_basePackage#getCreate_CreatedElement()
	 * @model containment="true"
	 * @generated
	 */
	ModelElement getCreatedElement();

	/**
	 * Sets the value of the '{@link action_base.Create#getCreatedElement <em>Created Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Element</em>' containment reference.
	 * @see #getCreatedElement()
	 * @generated
	 */
	void setCreatedElement(ModelElement value);

} // Create
