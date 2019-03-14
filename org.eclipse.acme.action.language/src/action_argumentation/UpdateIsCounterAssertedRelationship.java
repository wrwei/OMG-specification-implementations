/**
 */
package action_argumentation;

import action_base.Update;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Is Counter Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.UpdateIsCounterAssertedRelationship#isIsCounter <em>Is Counter</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getUpdateIsCounterAssertedRelationship()
 * @model
 * @generated
 */
public interface UpdateIsCounterAssertedRelationship extends Update {
	/**
	 * Returns the value of the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Counter</em>' attribute.
	 * @see #setIsCounter(boolean)
	 * @see action_argumentation.Action_argumentationPackage#getUpdateIsCounterAssertedRelationship_IsCounter()
	 * @model
	 * @generated
	 */
	boolean isIsCounter();

	/**
	 * Sets the value of the '{@link action_argumentation.UpdateIsCounterAssertedRelationship#isIsCounter <em>Is Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Counter</em>' attribute.
	 * @see #isIsCounter()
	 * @generated
	 */
	void setIsCounter(boolean value);

} // UpdateIsCounterAssertedRelationship
