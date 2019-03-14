/**
 */
package action_artifact;

import action_base.Update;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Resource Occurence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.UpdateResourceOccurence#getOccurence <em>Occurence</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getUpdateResourceOccurence()
 * @model
 * @generated
 */
public interface UpdateResourceOccurence extends Update {
	/**
	 * Returns the value of the '<em><b>Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurence</em>' attribute.
	 * @see #setOccurence(Date)
	 * @see action_artifact.Action_artifactPackage#getUpdateResourceOccurence_Occurence()
	 * @model
	 * @generated
	 */
	Date getOccurence();

	/**
	 * Sets the value of the '{@link action_artifact.UpdateResourceOccurence#getOccurence <em>Occurence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurence</em>' attribute.
	 * @see #getOccurence()
	 * @generated
	 */
	void setOccurence(Date value);

} // UpdateResourceOccurence
