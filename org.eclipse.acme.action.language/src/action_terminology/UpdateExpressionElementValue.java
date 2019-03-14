/**
 */
package action_terminology;

import action_base.Update;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Expression Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.UpdateExpressionElementValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see action_terminology.Action_terminologyPackage#getUpdateExpressionElementValue()
 * @model
 * @generated
 */
public interface UpdateExpressionElementValue extends Update {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see action_terminology.Action_terminologyPackage#getUpdateExpressionElementValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link action_terminology.UpdateExpressionElementValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // UpdateExpressionElementValue
