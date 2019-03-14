/**
 */
package action_assurancecase;

import action_argumentation.ArgumentationActionPackage;

import action_artifact.ArtifactActionPackage;

import action_base.Action;
import action_base.ActionElement;

import action_terminology.TerminologyActionPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Case Action Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_assurancecase.AssuranceCaseActionPackage#getActions <em>Actions</em>}</li>
 *   <li>{@link action_assurancecase.AssuranceCaseActionPackage#getAssuranceCaseActionPackages <em>Assurance Case Action Packages</em>}</li>
 *   <li>{@link action_assurancecase.AssuranceCaseActionPackage#getArgumentationActionPackages <em>Argumentation Action Packages</em>}</li>
 *   <li>{@link action_assurancecase.AssuranceCaseActionPackage#getTerminologyActionPackages <em>Terminology Action Packages</em>}</li>
 *   <li>{@link action_assurancecase.AssuranceCaseActionPackage#getArtifactActionPackages <em>Artifact Action Packages</em>}</li>
 * </ul>
 *
 * @see action_assurancecase.Action_assurancecasePackage#getAssuranceCaseActionPackage()
 * @model
 * @generated
 */
public interface AssuranceCaseActionPackage extends ActionElement {
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
	 * @see action_assurancecase.Action_assurancecasePackage#getAssuranceCaseActionPackage_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Assurance Case Action Packages</b></em>' containment reference list.
	 * The list contents are of type {@link action_assurancecase.AssuranceCaseActionPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance Case Action Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance Case Action Packages</em>' containment reference list.
	 * @see action_assurancecase.Action_assurancecasePackage#getAssuranceCaseActionPackage_AssuranceCaseActionPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssuranceCaseActionPackage> getAssuranceCaseActionPackages();

	/**
	 * Returns the value of the '<em><b>Argumentation Action Packages</b></em>' containment reference list.
	 * The list contents are of type {@link action_argumentation.ArgumentationActionPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentation Action Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentation Action Packages</em>' containment reference list.
	 * @see action_assurancecase.Action_assurancecasePackage#getAssuranceCaseActionPackage_ArgumentationActionPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentationActionPackage> getArgumentationActionPackages();

	/**
	 * Returns the value of the '<em><b>Terminology Action Packages</b></em>' containment reference list.
	 * The list contents are of type {@link action_terminology.TerminologyActionPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminology Action Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminology Action Packages</em>' containment reference list.
	 * @see action_assurancecase.Action_assurancecasePackage#getAssuranceCaseActionPackage_TerminologyActionPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyActionPackage> getTerminologyActionPackages();

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
	 * @see action_assurancecase.Action_assurancecasePackage#getAssuranceCaseActionPackage_ArtifactActionPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArtifactActionPackage> getArtifactActionPackages();

} // AssuranceCaseActionPackage
