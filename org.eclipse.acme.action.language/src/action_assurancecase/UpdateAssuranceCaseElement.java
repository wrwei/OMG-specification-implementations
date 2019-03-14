/**
 */
package action_assurancecase;

import action_base.Update;

import base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Assurance Case Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_assurancecase.UpdateAssuranceCaseElement#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @see action_assurancecase.Action_assurancecasePackage#getUpdateAssuranceCaseElement()
 * @model
 * @generated
 */
public interface UpdateAssuranceCaseElement extends Update {
	/**
	 * Returns the value of the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentation Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentation Element</em>' reference.
	 * @see #setArgumentationElement(ArtifactElement)
	 * @see action_assurancecase.Action_assurancecasePackage#getUpdateAssuranceCaseElement_ArgumentationElement()
	 * @model
	 * @generated
	 */
	ArtifactElement getArgumentationElement();

	/**
	 * Sets the value of the '{@link action_assurancecase.UpdateAssuranceCaseElement#getArgumentationElement <em>Argumentation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argumentation Element</em>' reference.
	 * @see #getArgumentationElement()
	 * @generated
	 */
	void setArgumentationElement(ArtifactElement value);

} // UpdateAssuranceCaseElement
