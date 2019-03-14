/**
 */
package action_terminology;

import action_base.Update;

import terminology.Category;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Expression Element Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.UpdateExpressionElementCategory#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see action_terminology.Action_terminologyPackage#getUpdateExpressionElementCategory()
 * @model
 * @generated
 */
public interface UpdateExpressionElementCategory extends Update {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see action_terminology.Action_terminologyPackage#getUpdateExpressionElementCategory_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link action_terminology.UpdateExpressionElementCategory#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // UpdateExpressionElementCategory
