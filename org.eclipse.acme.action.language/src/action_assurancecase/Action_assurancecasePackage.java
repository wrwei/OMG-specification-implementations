/**
 */
package action_assurancecase;

import action_base.Action_basePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see action_assurancecase.Action_assurancecaseFactory
 * @model kind="package"
 * @generated
 */
public interface Action_assurancecasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action_assurancecase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme.action/1.0/assurancecase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action_assurance_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_assurancecasePackage eINSTANCE = action_assurancecase.impl.Action_assurancecasePackageImpl.init();

	/**
	 * The meta object id for the '{@link action_assurancecase.impl.AssuranceCaseActionPackageImpl <em>Assurance Case Action Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_assurancecase.impl.AssuranceCaseActionPackageImpl
	 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getAssuranceCaseActionPackage()
	 * @generated
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__NAME = Action_basePackage.ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__DESCRIPTION = Action_basePackage.ACTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__GID = Action_basePackage.ACTION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assurance Case Action Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argumentation Action Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Terminology Action Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact Action Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Assurance Case Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE_FEATURE_COUNT = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Assurance Case Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_ACTION_PACKAGE_OPERATION_COUNT = Action_basePackage.ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_assurancecase.impl.CreateAssuranceCasePackageImpl <em>Create Assurance Case Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_assurancecase.impl.CreateAssuranceCasePackageImpl
	 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getCreateAssuranceCasePackage()
	 * @generated
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Assurance Case Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Assurance Case Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_assurancecase.impl.CreateAssuranceCasePackageInterfaceImpl <em>Create Assurance Case Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_assurancecase.impl.CreateAssuranceCasePackageInterfaceImpl
	 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getCreateAssuranceCasePackageInterface()
	 * @generated
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Assurance Case Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Assurance Case Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_assurancecase.impl.CreateAssuranceCasePackageBindingImpl <em>Create Assurance Case Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_assurancecase.impl.CreateAssuranceCasePackageBindingImpl
	 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getCreateAssuranceCasePackageBinding()
	 * @generated
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Assurance Case Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Assurance Case Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSURANCE_CASE_PACKAGE_BINDING_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_assurancecase.impl.UpdateAssuranceCaseElementImpl <em>Update Assurance Case Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_assurancecase.impl.UpdateAssuranceCaseElementImpl
	 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getUpdateAssuranceCaseElement()
	 * @generated
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Assurance Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Assurance Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSURANCE_CASE_ELEMENT_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_assurancecase.impl.DeleteAssuranceCaseElementImpl <em>Delete Assurance Case Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_assurancecase.impl.DeleteAssuranceCaseElementImpl
	 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getDeleteAssuranceCaseElement()
	 * @generated
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT__NAME = Action_basePackage.DELETE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT__DESCRIPTION = Action_basePackage.DELETE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT__GID = Action_basePackage.DELETE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT__SUB_ACTIONS = Action_basePackage.DELETE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT__REFERENCED_ELEMENT = Action_basePackage.DELETE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT__INDEX = Action_basePackage.DELETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT = Action_basePackage.DELETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Assurance Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT_FEATURE_COUNT = Action_basePackage.DELETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delete Assurance Case Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ASSURANCE_CASE_ELEMENT_OPERATION_COUNT = Action_basePackage.DELETE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link action_assurancecase.AssuranceCaseActionPackage <em>Assurance Case Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case Action Package</em>'.
	 * @see action_assurancecase.AssuranceCaseActionPackage
	 * @generated
	 */
	EClass getAssuranceCaseActionPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link action_assurancecase.AssuranceCaseActionPackage#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see action_assurancecase.AssuranceCaseActionPackage#getActions()
	 * @see #getAssuranceCaseActionPackage()
	 * @generated
	 */
	EReference getAssuranceCaseActionPackage_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link action_assurancecase.AssuranceCaseActionPackage#getAssuranceCaseActionPackages <em>Assurance Case Action Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assurance Case Action Packages</em>'.
	 * @see action_assurancecase.AssuranceCaseActionPackage#getAssuranceCaseActionPackages()
	 * @see #getAssuranceCaseActionPackage()
	 * @generated
	 */
	EReference getAssuranceCaseActionPackage_AssuranceCaseActionPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link action_assurancecase.AssuranceCaseActionPackage#getArgumentationActionPackages <em>Argumentation Action Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argumentation Action Packages</em>'.
	 * @see action_assurancecase.AssuranceCaseActionPackage#getArgumentationActionPackages()
	 * @see #getAssuranceCaseActionPackage()
	 * @generated
	 */
	EReference getAssuranceCaseActionPackage_ArgumentationActionPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link action_assurancecase.AssuranceCaseActionPackage#getTerminologyActionPackages <em>Terminology Action Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Action Packages</em>'.
	 * @see action_assurancecase.AssuranceCaseActionPackage#getTerminologyActionPackages()
	 * @see #getAssuranceCaseActionPackage()
	 * @generated
	 */
	EReference getAssuranceCaseActionPackage_TerminologyActionPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link action_assurancecase.AssuranceCaseActionPackage#getArtifactActionPackages <em>Artifact Action Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Action Packages</em>'.
	 * @see action_assurancecase.AssuranceCaseActionPackage#getArtifactActionPackages()
	 * @see #getAssuranceCaseActionPackage()
	 * @generated
	 */
	EReference getAssuranceCaseActionPackage_ArtifactActionPackages();

	/**
	 * Returns the meta object for class '{@link action_assurancecase.CreateAssuranceCasePackage <em>Create Assurance Case Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Assurance Case Package</em>'.
	 * @see action_assurancecase.CreateAssuranceCasePackage
	 * @generated
	 */
	EClass getCreateAssuranceCasePackage();

	/**
	 * Returns the meta object for class '{@link action_assurancecase.CreateAssuranceCasePackageInterface <em>Create Assurance Case Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Assurance Case Package Interface</em>'.
	 * @see action_assurancecase.CreateAssuranceCasePackageInterface
	 * @generated
	 */
	EClass getCreateAssuranceCasePackageInterface();

	/**
	 * Returns the meta object for class '{@link action_assurancecase.CreateAssuranceCasePackageBinding <em>Create Assurance Case Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Assurance Case Package Binding</em>'.
	 * @see action_assurancecase.CreateAssuranceCasePackageBinding
	 * @generated
	 */
	EClass getCreateAssuranceCasePackageBinding();

	/**
	 * Returns the meta object for class '{@link action_assurancecase.UpdateAssuranceCaseElement <em>Update Assurance Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Assurance Case Element</em>'.
	 * @see action_assurancecase.UpdateAssuranceCaseElement
	 * @generated
	 */
	EClass getUpdateAssuranceCaseElement();

	/**
	 * Returns the meta object for the reference '{@link action_assurancecase.UpdateAssuranceCaseElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_assurancecase.UpdateAssuranceCaseElement#getArgumentationElement()
	 * @see #getUpdateAssuranceCaseElement()
	 * @generated
	 */
	EReference getUpdateAssuranceCaseElement_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link action_assurancecase.DeleteAssuranceCaseElement <em>Delete Assurance Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Assurance Case Element</em>'.
	 * @see action_assurancecase.DeleteAssuranceCaseElement
	 * @generated
	 */
	EClass getDeleteAssuranceCaseElement();

	/**
	 * Returns the meta object for the attribute '{@link action_assurancecase.DeleteAssuranceCaseElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_assurancecase.DeleteAssuranceCaseElement#getIndex()
	 * @see #getDeleteAssuranceCaseElement()
	 * @generated
	 */
	EAttribute getDeleteAssuranceCaseElement_Index();

	/**
	 * Returns the meta object for the reference '{@link action_assurancecase.DeleteAssuranceCaseElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_assurancecase.DeleteAssuranceCaseElement#getArgumentationElement()
	 * @see #getDeleteAssuranceCaseElement()
	 * @generated
	 */
	EReference getDeleteAssuranceCaseElement_ArgumentationElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Action_assurancecaseFactory getAction_assurancecaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link action_assurancecase.impl.AssuranceCaseActionPackageImpl <em>Assurance Case Action Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_assurancecase.impl.AssuranceCaseActionPackageImpl
		 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getAssuranceCaseActionPackage()
		 * @generated
		 */
		EClass ASSURANCE_CASE_ACTION_PACKAGE = eINSTANCE.getAssuranceCaseActionPackage();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS = eINSTANCE.getAssuranceCaseActionPackage_Actions();

		/**
		 * The meta object literal for the '<em><b>Assurance Case Action Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES = eINSTANCE.getAssuranceCaseActionPackage_AssuranceCaseActionPackages();

		/**
		 * The meta object literal for the '<em><b>Argumentation Action Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES = eINSTANCE.getAssuranceCaseActionPackage_ArgumentationActionPackages();

		/**
		 * The meta object literal for the '<em><b>Terminology Action Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES = eINSTANCE.getAssuranceCaseActionPackage_TerminologyActionPackages();

		/**
		 * The meta object literal for the '<em><b>Artifact Action Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES = eINSTANCE.getAssuranceCaseActionPackage_ArtifactActionPackages();

		/**
		 * The meta object literal for the '{@link action_assurancecase.impl.CreateAssuranceCasePackageImpl <em>Create Assurance Case Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_assurancecase.impl.CreateAssuranceCasePackageImpl
		 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getCreateAssuranceCasePackage()
		 * @generated
		 */
		EClass CREATE_ASSURANCE_CASE_PACKAGE = eINSTANCE.getCreateAssuranceCasePackage();

		/**
		 * The meta object literal for the '{@link action_assurancecase.impl.CreateAssuranceCasePackageInterfaceImpl <em>Create Assurance Case Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_assurancecase.impl.CreateAssuranceCasePackageInterfaceImpl
		 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getCreateAssuranceCasePackageInterface()
		 * @generated
		 */
		EClass CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE = eINSTANCE.getCreateAssuranceCasePackageInterface();

		/**
		 * The meta object literal for the '{@link action_assurancecase.impl.CreateAssuranceCasePackageBindingImpl <em>Create Assurance Case Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_assurancecase.impl.CreateAssuranceCasePackageBindingImpl
		 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getCreateAssuranceCasePackageBinding()
		 * @generated
		 */
		EClass CREATE_ASSURANCE_CASE_PACKAGE_BINDING = eINSTANCE.getCreateAssuranceCasePackageBinding();

		/**
		 * The meta object literal for the '{@link action_assurancecase.impl.UpdateAssuranceCaseElementImpl <em>Update Assurance Case Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_assurancecase.impl.UpdateAssuranceCaseElementImpl
		 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getUpdateAssuranceCaseElement()
		 * @generated
		 */
		EClass UPDATE_ASSURANCE_CASE_ELEMENT = eINSTANCE.getUpdateAssuranceCaseElement();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT = eINSTANCE.getUpdateAssuranceCaseElement_ArgumentationElement();

		/**
		 * The meta object literal for the '{@link action_assurancecase.impl.DeleteAssuranceCaseElementImpl <em>Delete Assurance Case Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_assurancecase.impl.DeleteAssuranceCaseElementImpl
		 * @see action_assurancecase.impl.Action_assurancecasePackageImpl#getDeleteAssuranceCaseElement()
		 * @generated
		 */
		EClass DELETE_ASSURANCE_CASE_ELEMENT = eINSTANCE.getDeleteAssuranceCaseElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ASSURANCE_CASE_ELEMENT__INDEX = eINSTANCE.getDeleteAssuranceCaseElement_Index();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT = eINSTANCE.getDeleteAssuranceCaseElement_ArgumentationElement();

	}

} //Action_assurancecasePackage
