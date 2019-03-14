/**
 */
package action_argumentation;

import action_base.Delete;

import argumentation.ArgumentationElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Argumentation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.DeleteArgumentationElement#getIndex <em>Index</em>}</li>
 *   <li>{@link action_argumentation.DeleteArgumentationElement#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @see action_argumentation.Action_argumentationPackage#getDeleteArgumentationElement()
 * @model
 * @generated
 */
public interface DeleteArgumentationElement extends Delete {
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
	 * @see action_argumentation.Action_argumentationPackage#getDeleteArgumentationElement_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link action_argumentation.DeleteArgumentationElement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentation Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentation Element</em>' reference.
	 * @see #setArgumentationElement(ArgumentationElement)
	 * @see action_argumentation.Action_argumentationPackage#getDeleteArgumentationElement_ArgumentationElement()
	 * @model
	 * @generated
	 */
	ArgumentationElement getArgumentationElement();

	/**
	 * Sets the value of the '{@link action_argumentation.DeleteArgumentationElement#getArgumentationElement <em>Argumentation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argumentation Element</em>' reference.
	 * @see #getArgumentationElement()
	 * @generated
	 */
	void setArgumentationElement(ArgumentationElement value);

} // DeleteArgumentationElement
