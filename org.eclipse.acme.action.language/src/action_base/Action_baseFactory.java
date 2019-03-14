/**
 */
package action_base;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see action_base.Action_basePackage
 * @generated
 */
public interface Action_baseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_baseFactory eINSTANCE = action_base.impl.Action_baseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read</em>'.
	 * @generated
	 */
	Read createRead();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns a new object of class '<em>Update GID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update GID</em>'.
	 * @generated
	 */
	UpdateGID createUpdateGID();

	/**
	 * Returns a new object of class '<em>Update Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Name</em>'.
	 * @generated
	 */
	UpdateName createUpdateName();

	/**
	 * Returns a new object of class '<em>Update Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Description</em>'.
	 * @generated
	 */
	UpdateDescription createUpdateDescription();

	/**
	 * Returns a new object of class '<em>Update Implementation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Implementation Constraint</em>'.
	 * @generated
	 */
	UpdateImplementationConstraint createUpdateImplementationConstraint();

	/**
	 * Returns a new object of class '<em>Delete Implementation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Implementation Constraint</em>'.
	 * @generated
	 */
	DeleteImplementationConstraint createDeleteImplementationConstraint();

	/**
	 * Returns a new object of class '<em>Attach Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attach Note</em>'.
	 * @generated
	 */
	AttachNote createAttachNote();

	/**
	 * Returns a new object of class '<em>Delete Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Note</em>'.
	 * @generated
	 */
	DeleteNote createDeleteNote();

	/**
	 * Returns a new object of class '<em>Add Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Tagged Value</em>'.
	 * @generated
	 */
	AddTaggedValue createAddTaggedValue();

	/**
	 * Returns a new object of class '<em>Update Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Tagged Value</em>'.
	 * @generated
	 */
	UpdateTaggedValue createUpdateTaggedValue();

	/**
	 * Returns a new object of class '<em>Delete Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Tagged Value</em>'.
	 * @generated
	 */
	DeleteTaggedValue createDeleteTaggedValue();

	/**
	 * Returns a new object of class '<em>Make Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Make Abstract</em>'.
	 * @generated
	 */
	MakeAbstract createMakeAbstract();

	/**
	 * Returns a new object of class '<em>Make Citation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Make Citation</em>'.
	 * @generated
	 */
	MakeCitation createMakeCitation();

	/**
	 * Returns a new object of class '<em>Cite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cite</em>'.
	 * @generated
	 */
	Cite createCite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Action_basePackage getAction_basePackage();

} //Action_baseFactory
