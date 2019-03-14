/**
 */
package action_artifact;

import action_base.Update;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Property Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.UpdatePropertyPurpose#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getUpdatePropertyPurpose()
 * @model
 * @generated
 */
public interface UpdatePropertyPurpose extends Update {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see action_artifact.Action_artifactPackage#getUpdatePropertyPurpose_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link action_artifact.UpdatePropertyPurpose#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // UpdatePropertyPurpose
