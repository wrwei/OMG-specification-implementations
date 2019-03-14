/**
 */
package action_argumentation;

import action_base.Action;
import action_base.ActionElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumentation Action Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.ArgumentationActionPackage#getActions <em>Actions</em>}</li>
 *   <li>{@link action_argumentation.ArgumentationActionPackage#getArgumentationActionPackages <em>Argumentation Action Packages</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getArgumentationActionPackage()
 * @model
 * @generated
 */
public interface ArgumentationActionPackage extends ActionElement {
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
	 * @see action_argumentation.Action_argumentationPackage#getArgumentationActionPackage_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

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
	 * @see action_argumentation.Action_argumentationPackage#getArgumentationActionPackage_ArgumentationActionPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentationActionPackage> getArgumentationActionPackages();

} // ArgumentationActionPackage
