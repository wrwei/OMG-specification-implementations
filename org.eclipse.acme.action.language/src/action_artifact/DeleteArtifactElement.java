/**
 */
package action_artifact;

import action_base.Delete;

import base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Artifact Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.DeleteArtifactElement#getIndex <em>Index</em>}</li>
 *   <li>{@link action_artifact.DeleteArtifactElement#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getDeleteArtifactElement()
 * @model
 * @generated
 */
public interface DeleteArtifactElement extends Delete {
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
	 * @see action_artifact.Action_artifactPackage#getDeleteArtifactElement_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link action_artifact.DeleteArtifactElement#getIndex <em>Index</em>}' attribute.
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
	 * @see action_artifact.Action_artifactPackage#getDeleteArtifactElement_ArgumentationElement()
	 * @model
	 * @generated
	 */
	ArtifactElement getArgumentationElement();

	/**
	 * Sets the value of the '{@link action_artifact.DeleteArtifactElement#getArgumentationElement <em>Argumentation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argumentation Element</em>' reference.
	 * @see #getArgumentationElement()
	 * @generated
	 */
	void setArgumentationElement(ArtifactElement value);

} // DeleteArtifactElement
