/**
 */
package action_terminology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see action_terminology.Action_terminologyPackage
 * @generated
 */
public interface Action_terminologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_terminologyFactory eINSTANCE = action_terminology.impl.Action_terminologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Terminology Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminology Action Package</em>'.
	 * @generated
	 */
	TerminologyActionPackage createTerminologyActionPackage();

	/**
	 * Returns a new object of class '<em>Create Terminology Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Terminology Package</em>'.
	 * @generated
	 */
	CreateTerminologyPackage createCreateTerminologyPackage();

	/**
	 * Returns a new object of class '<em>Create Terminology Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Terminology Package Interface</em>'.
	 * @generated
	 */
	CreateTerminologyPackageInterface createCreateTerminologyPackageInterface();

	/**
	 * Returns a new object of class '<em>Create Terminology Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Terminology Package Binding</em>'.
	 * @generated
	 */
	CreateTerminologyPackageBinding createCreateTerminologyPackageBinding();

	/**
	 * Returns a new object of class '<em>Create Terminology Package Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Terminology Package Group</em>'.
	 * @generated
	 */
	CreateTerminologyPackageGroup createCreateTerminologyPackageGroup();

	/**
	 * Returns a new object of class '<em>Update Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Artifact Element</em>'.
	 * @generated
	 */
	UpdateArtifactElement createUpdateArtifactElement();

	/**
	 * Returns a new object of class '<em>Delete Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Artifact Element</em>'.
	 * @generated
	 */
	DeleteArtifactElement createDeleteArtifactElement();

	/**
	 * Returns a new object of class '<em>Create Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Category</em>'.
	 * @generated
	 */
	CreateCategory createCreateCategory();

	/**
	 * Returns a new object of class '<em>Create Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Expression</em>'.
	 * @generated
	 */
	CreateExpression createCreateExpression();

	/**
	 * Returns a new object of class '<em>Create Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Term</em>'.
	 * @generated
	 */
	CreateTerm createCreateTerm();

	/**
	 * Returns a new object of class '<em>Update Expression Element Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Expression Element Category</em>'.
	 * @generated
	 */
	UpdateExpressionElementCategory createUpdateExpressionElementCategory();

	/**
	 * Returns a new object of class '<em>Update Expression Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Expression Element Value</em>'.
	 * @generated
	 */
	UpdateExpressionElementValue createUpdateExpressionElementValue();

	/**
	 * Returns a new object of class '<em>Update Expression Element Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Expression Element Expression</em>'.
	 * @generated
	 */
	UpdateExpressionElementExpression createUpdateExpressionElementExpression();

	/**
	 * Returns a new object of class '<em>update Term External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>update Term External Reference</em>'.
	 * @generated
	 */
	updateTermExternalReference createupdateTermExternalReference();

	/**
	 * Returns a new object of class '<em>Update Term Origin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Term Origin</em>'.
	 * @generated
	 */
	UpdateTermOrigin createUpdateTermOrigin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Action_terminologyPackage getAction_terminologyPackage();

} //Action_terminologyFactory
