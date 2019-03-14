/**
 */
package action_terminology;

import action_base.Update;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Term Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.UpdateTermOrigin#getOrigin <em>Origin</em>}</li>
 * </ul>
 *
 * @see action_terminology.Action_terminologyPackage#getUpdateTermOrigin()
 * @model
 * @generated
 */
public interface UpdateTermOrigin extends Update {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(ModelElement)
	 * @see action_terminology.Action_terminologyPackage#getUpdateTermOrigin_Origin()
	 * @model
	 * @generated
	 */
	ModelElement getOrigin();

	/**
	 * Sets the value of the '{@link action_terminology.UpdateTermOrigin#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(ModelElement value);

} // UpdateTermOrigin
