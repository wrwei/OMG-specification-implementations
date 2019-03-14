/**
 */
package action_assurancecase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see action_assurancecase.Action_assurancecasePackage
 * @generated
 */
public interface Action_assurancecaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_assurancecaseFactory eINSTANCE = action_assurancecase.impl.Action_assurancecaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Assurance Case Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assurance Case Action Package</em>'.
	 * @generated
	 */
	AssuranceCaseActionPackage createAssuranceCaseActionPackage();

	/**
	 * Returns a new object of class '<em>Create Assurance Case Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Assurance Case Package</em>'.
	 * @generated
	 */
	CreateAssuranceCasePackage createCreateAssuranceCasePackage();

	/**
	 * Returns a new object of class '<em>Create Assurance Case Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Assurance Case Package Interface</em>'.
	 * @generated
	 */
	CreateAssuranceCasePackageInterface createCreateAssuranceCasePackageInterface();

	/**
	 * Returns a new object of class '<em>Create Assurance Case Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Assurance Case Package Binding</em>'.
	 * @generated
	 */
	CreateAssuranceCasePackageBinding createCreateAssuranceCasePackageBinding();

	/**
	 * Returns a new object of class '<em>Update Assurance Case Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Assurance Case Element</em>'.
	 * @generated
	 */
	UpdateAssuranceCaseElement createUpdateAssuranceCaseElement();

	/**
	 * Returns a new object of class '<em>Delete Assurance Case Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Assurance Case Element</em>'.
	 * @generated
	 */
	DeleteAssuranceCaseElement createDeleteAssuranceCaseElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Action_assurancecasePackage getAction_assurancecasePackage();

} //Action_assurancecaseFactory
