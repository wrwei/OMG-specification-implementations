/**
 */
package action_base;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_base.Cite#getCited <em>Cited</em>}</li>
 * </ul>
 *
 * @see action_base.Action_basePackage#getCite()
 * @model
 * @generated
 */
public interface Cite extends Update {
	/**
	 * Returns the value of the '<em><b>Cited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cited</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited</em>' reference.
	 * @see #setCited(ModelElement)
	 * @see action_base.Action_basePackage#getCite_Cited()
	 * @model
	 * @generated
	 */
	ModelElement getCited();

	/**
	 * Sets the value of the '{@link action_base.Cite#getCited <em>Cited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited</em>' reference.
	 * @see #getCited()
	 * @generated
	 */
	void setCited(ModelElement value);

} // Cite
