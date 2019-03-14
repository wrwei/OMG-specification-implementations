/**
 */
package action_base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_base.Action#getSubActions <em>Sub Actions</em>}</li>
 * </ul>
 *
 * @see action_base.Action_basePackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends ActionElement {
	/**
	 * Returns the value of the '<em><b>Sub Actions</b></em>' containment reference list.
	 * The list contents are of type {@link action_base.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Actions</em>' containment reference list.
	 * @see action_base.Action_basePackage#getAction_SubActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getSubActions();

} // Action
