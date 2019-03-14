/**
 */
package action_terminology;

import action_base.Action;
import action_base.ActionElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Action Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.TerminologyActionPackage#getActions <em>Actions</em>}</li>
 *   <li>{@link action_terminology.TerminologyActionPackage#getTerminologyActionPackages <em>Terminology Action Packages</em>}</li>
 * </ul>
 *
 * @see action_terminology.Action_terminologyPackage#getTerminologyActionPackage()
 * @model
 * @generated
 */
public interface TerminologyActionPackage extends ActionElement {
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
	 * @see action_terminology.Action_terminologyPackage#getTerminologyActionPackage_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

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
	 * @see action_terminology.Action_terminologyPackage#getTerminologyActionPackage_TerminologyActionPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyActionPackage> getTerminologyActionPackages();

} // TerminologyActionPackage
