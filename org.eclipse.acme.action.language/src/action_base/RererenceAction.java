/**
 */
package action_base;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rererence Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_base.RererenceAction#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see action_base.Action_basePackage#getRererenceAction()
 * @model abstract="true"
 * @generated
 */
public interface RererenceAction extends Action {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(ModelElement)
	 * @see action_base.Action_basePackage#getRererenceAction_ReferencedElement()
	 * @model
	 * @generated
	 */
	ModelElement getReferencedElement();

	/**
	 * Sets the value of the '{@link action_base.RererenceAction#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(ModelElement value);

} // RererenceAction
