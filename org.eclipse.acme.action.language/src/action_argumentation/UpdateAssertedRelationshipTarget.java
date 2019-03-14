/**
 */
package action_argumentation;

import action_base.Update;

import base.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Asserted Relationship Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.UpdateAssertedRelationshipTarget#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getUpdateAssertedRelationshipTarget()
 * @model
 * @generated
 */
public interface UpdateAssertedRelationshipTarget extends Update {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link base.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see action_argumentation.Action_argumentationPackage#getUpdateAssertedRelationshipTarget_Target()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getTarget();

} // UpdateAssertedRelationshipTarget
