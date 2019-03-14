/**
 */
package action_artifact;

import action_base.Update;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Artifact Asset Relationship Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.UpdateArtifactAssetRelationshipSource#getIndex <em>Index</em>}</li>
 *   <li>{@link action_artifact.UpdateArtifactAssetRelationshipSource#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getUpdateArtifactAssetRelationshipSource()
 * @model
 * @generated
 */
public interface UpdateArtifactAssetRelationshipSource extends Update {
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
	 * @see action_artifact.Action_artifactPackage#getUpdateArtifactAssetRelationshipSource_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link action_artifact.UpdateArtifactAssetRelationshipSource#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ModelElement)
	 * @see action_artifact.Action_artifactPackage#getUpdateArtifactAssetRelationshipSource_Source()
	 * @model
	 * @generated
	 */
	ModelElement getSource();

	/**
	 * Sets the value of the '{@link action_artifact.UpdateArtifactAssetRelationshipSource#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModelElement value);

} // UpdateArtifactAssetRelationshipSource
