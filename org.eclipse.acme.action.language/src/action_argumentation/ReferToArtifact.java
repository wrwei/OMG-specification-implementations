/**
 */
package action_argumentation;

import action_base.Update;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refer To Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.ReferToArtifact#getReferredArtifact <em>Referred Artifact</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getReferToArtifact()
 * @model
 * @generated
 */
public interface ReferToArtifact extends Update {
	/**
	 * Returns the value of the '<em><b>Referred Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Artifact</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Artifact</em>' reference.
	 * @see #setReferredArtifact(ModelElement)
	 * @see action_argumentation.Action_argumentationPackage#getReferToArtifact_ReferredArtifact()
	 * @model
	 * @generated
	 */
	ModelElement getReferredArtifact();

	/**
	 * Sets the value of the '{@link action_argumentation.ReferToArtifact#getReferredArtifact <em>Referred Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Artifact</em>' reference.
	 * @see #getReferredArtifact()
	 * @generated
	 */
	void setReferredArtifact(ModelElement value);

} // ReferToArtifact
