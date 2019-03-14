/**
 */
package action_base;

import base.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Artifact Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link action_base.CreateArtifactElement#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see action_base.Action_basePackage#getCreateArtifactElement()
 * @model abstract="true"
 * @generated
 */
public interface CreateArtifactElement extends Create {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(ModelElement)
	 * @see action_base.Action_basePackage#getCreateArtifactElement_Container()
	 * @model
	 * @generated
	 */
	ModelElement getContainer();

	/**
	 * Sets the value of the '{@link action_base.CreateArtifactElement#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(ModelElement value);

} // CreateArtifactElement
