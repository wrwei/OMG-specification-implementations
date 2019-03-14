/**
 */
package action_argumentation;

import action_base.Update;

import argumentation.ArgumentReasoning;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Reasoning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.UpdateReasoning#getReasoning <em>Reasoning</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getUpdateReasoning()
 * @model
 * @generated
 */
public interface UpdateReasoning extends Update {
	/**
	 * Returns the value of the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reasoning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reasoning</em>' reference.
	 * @see #setReasoning(ArgumentReasoning)
	 * @see action_argumentation.Action_argumentationPackage#getUpdateReasoning_Reasoning()
	 * @model
	 * @generated
	 */
	ArgumentReasoning getReasoning();

	/**
	 * Sets the value of the '{@link action_argumentation.UpdateReasoning#getReasoning <em>Reasoning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reasoning</em>' reference.
	 * @see #getReasoning()
	 * @generated
	 */
	void setReasoning(ArgumentReasoning value);

} // UpdateReasoning
