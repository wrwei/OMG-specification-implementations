/**
 */
package action_terminology;

import action_base.Update;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>update Term External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.updateTermExternalReference#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 *
 * @see action_terminology.Action_terminologyPackage#getupdateTermExternalReference()
 * @model
 * @generated
 */
public interface updateTermExternalReference extends Update {
	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Reference</em>' attribute.
	 * @see #setExternalReference(String)
	 * @see action_terminology.Action_terminologyPackage#getupdateTermExternalReference_ExternalReference()
	 * @model
	 * @generated
	 */
	String getExternalReference();

	/**
	 * Sets the value of the '{@link action_terminology.updateTermExternalReference#getExternalReference <em>External Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Reference</em>' attribute.
	 * @see #getExternalReference()
	 * @generated
	 */
	void setExternalReference(String value);

} // updateTermExternalReference
