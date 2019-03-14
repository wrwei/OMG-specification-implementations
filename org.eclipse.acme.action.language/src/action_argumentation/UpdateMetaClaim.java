/**
 */
package action_argumentation;

import action_base.Update;

import argumentation.Claim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Meta Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.UpdateMetaClaim#getMetaClaim <em>Meta Claim</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getUpdateMetaClaim()
 * @model
 * @generated
 */
public interface UpdateMetaClaim extends Update {
	/**
	 * Returns the value of the '<em><b>Meta Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Claim</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Claim</em>' reference.
	 * @see #setMetaClaim(Claim)
	 * @see action_argumentation.Action_argumentationPackage#getUpdateMetaClaim_MetaClaim()
	 * @model
	 * @generated
	 */
	Claim getMetaClaim();

	/**
	 * Sets the value of the '{@link action_argumentation.UpdateMetaClaim#getMetaClaim <em>Meta Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Claim</em>' reference.
	 * @see #getMetaClaim()
	 * @generated
	 */
	void setMetaClaim(Claim value);

} // UpdateMetaClaim
