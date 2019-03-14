/**
 */
package action_artifact;

import action_base.Action;
import action_base.ActionElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Action Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.ArtifactActionPackage#getActions <em>Actions</em>}</li>
 *   <li>{@link action_artifact.ArtifactActionPackage#getArtifactActionPackages <em>Artifact Action Packages</em>}</li>
 * </ul>
 *
 * @see action_artifact.Action_artifactPackage#getArtifactActionPackage()
 * @model
 * @generated
 */
public interface ArtifactActionPackage extends ActionElement {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link action_base.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see action_artifact.Action_artifactPackage#getArtifactActionPackage_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Artifact Action Packages</b></em>' containment reference list.
	 * The list contents are of type {@link action_artifact.ArtifactActionPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Action Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Action Packages</em>' containment reference list.
	 * @see action_artifact.Action_artifactPackage#getArtifactActionPackage_ArtifactActionPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactActionPackage> getArtifactActionPackages();

} // ArtifactActionPackage
