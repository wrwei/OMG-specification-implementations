/**
 */
package action_terminology;

import action_base.Update;

import terminology.ExpressionElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Expression Element Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.UpdateExpressionElementExpression#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see action_terminology.Action_terminologyPackage#getUpdateExpressionElementExpression()
 * @model
 * @generated
 */
public interface UpdateExpressionElementExpression extends Update {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ExpressionElement)
	 * @see action_terminology.Action_terminologyPackage#getUpdateExpressionElementExpression_Element()
	 * @model
	 * @generated
	 */
	ExpressionElement getElement();

	/**
	 * Sets the value of the '{@link action_terminology.UpdateExpressionElementExpression#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ExpressionElement value);

} // UpdateExpressionElementExpression
