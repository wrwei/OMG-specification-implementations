/**
 */
package action_artifact;

import action_base.Update;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Artifact Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.UpdateArtifactVersion#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getUpdateArtifactVersion()
 * @model
 * @generated
 */
public interface UpdateArtifactVersion extends Update {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see action_artifact.Action_artifactPackage#getUpdateArtifactVersion_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link action_artifact.UpdateArtifactVersion#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // UpdateArtifactVersion
