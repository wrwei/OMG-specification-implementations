/**
 */
package action_artifact;

import action_base.Update;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Artifact Asset Relationship Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.UpdateArtifactAssetRelationshipTarget#getIndex <em>Index</em>}</li>
 *   <li>{@link action_artifact.UpdateArtifactAssetRelationshipTarget#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getUpdateArtifactAssetRelationshipTarget()
 * @model
 * @generated
 */
public interface UpdateArtifactAssetRelationshipTarget extends Update {
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
	 * @see action_artifact.Action_artifactPackage#getUpdateArtifactAssetRelationshipTarget_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link action_artifact.UpdateArtifactAssetRelationshipTarget#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ModelElement)
	 * @see action_artifact.Action_artifactPackage#getUpdateArtifactAssetRelationshipTarget_Target()
	 * @model
	 * @generated
	 */
	ModelElement getTarget();

	/**
	 * Sets the value of the '{@link action_artifact.UpdateArtifactAssetRelationshipTarget#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ModelElement value);

} // UpdateArtifactAssetRelationshipTarget
