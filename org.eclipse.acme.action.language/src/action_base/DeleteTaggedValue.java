/**
 */
package action_base;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Tagged Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_base.DeleteTaggedValue#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see action_base.Action_basePackage#getDeleteTaggedValue()
 * @model
 * @generated
 */
public interface DeleteTaggedValue extends Update {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see action_base.Action_basePackage#getDeleteTaggedValue_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link action_base.DeleteTaggedValue#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // DeleteTaggedValue
