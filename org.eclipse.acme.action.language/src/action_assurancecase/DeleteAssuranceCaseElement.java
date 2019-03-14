/**
 */
package action_assurancecase;

import action_base.Delete;

import base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Assurance Case Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_assurancecase.DeleteAssuranceCaseElement#getIndex <em>Index</em>}</li>
 *   <li>{@link action_assurancecase.DeleteAssuranceCaseElement#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @see action_assurancecase.Action_assurancecasePackage#getDeleteAssuranceCaseElement()
 * @model
 * @generated
 */
public interface DeleteAssuranceCaseElement extends Delete {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see action_assurancecase.Action_assurancecasePackage#getDeleteAssuranceCaseElement_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link action_assurancecase.DeleteAssuranceCaseElement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

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
	 * @see action_assurancecase.Action_assurancecasePackage#getDeleteAssuranceCaseElement_ArgumentationElement()
	 * @model
	 * @generated
	 */
	ArtifactElement getArgumentationElement();

	/**
	 * Sets the value of the '{@link action_assurancecase.DeleteAssuranceCaseElement#getArgumentationElement <em>Argumentation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argumentation Element</em>' reference.
	 * @see #getArgumentationElement()
	 * @generated
	 */
	void setArgumentationElement(ArtifactElement value);

} // DeleteAssuranceCaseElement
