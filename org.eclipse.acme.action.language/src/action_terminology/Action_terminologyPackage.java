/**
 */
package action_terminology;

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
 * @see action_terminology.Action_terminologyFactory
 * @model kind="package"
 * @generated
 */
public interface Action_terminologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action_terminology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme.action/1.0/terminology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action_terminology_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_terminologyPackage eINSTANCE = action_terminology.impl.Action_terminologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link action_terminology.impl.TerminologyActionPackageImpl <em>Terminology Action Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.TerminologyActionPackageImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getTerminologyActionPackage()
	 * @generated
	 */
	int TERMINOLOGY_ACTION_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ACTION_PACKAGE__NAME = Action_basePackage.ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ACTION_PACKAGE__DESCRIPTION = Action_basePackage.ACTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ACTION_PACKAGE__GID = Action_basePackage.ACTION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ACTION_PACKAGE__ACTIONS = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminology Action Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminology Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ACTION_PACKAGE_FEATURE_COUNT = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Terminology Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ACTION_PACKAGE_OPERATION_COUNT = Action_basePackage.ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateTerminologyPackageImpl <em>Create Terminology Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateTerminologyPackageImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackage()
	 * @generated
	 */
	int CREATE_TERMINOLOGY_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Terminology Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Terminology Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateTerminologyPackageInterfaceImpl <em>Create Terminology Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateTerminologyPackageInterfaceImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackageInterface()
	 * @generated
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Terminology Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Terminology Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_INTERFACE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateTerminologyPackageBindingImpl <em>Create Terminology Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateTerminologyPackageBindingImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackageBinding()
	 * @generated
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Terminology Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Terminology Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_BINDING_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateTerminologyPackageGroupImpl <em>Create Terminology Package Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateTerminologyPackageGroupImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackageGroup()
	 * @generated
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Terminology Package Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Terminology Package Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_PACKAGE_GROUP_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.UpdateArtifactElementImpl <em>Update Artifact Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.UpdateArtifactElementImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateArtifactElement()
	 * @generated
	 */
	int UPDATE_ARTIFACT_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ELEMENT_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.DeleteArtifactElementImpl <em>Delete Artifact Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.DeleteArtifactElementImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getDeleteArtifactElement()
	 * @generated
	 */
	int DELETE_ARTIFACT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT__NAME = Action_basePackage.DELETE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT__DESCRIPTION = Action_basePackage.DELETE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT__GID = Action_basePackage.DELETE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT__SUB_ACTIONS = Action_basePackage.DELETE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT__REFERENCED_ELEMENT = Action_basePackage.DELETE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT__INDEX = Action_basePackage.DELETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT = Action_basePackage.DELETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT_FEATURE_COUNT = Action_basePackage.DELETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delete Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARTIFACT_ELEMENT_OPERATION_COUNT = Action_basePackage.DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateTerminologyAssetImpl <em>Create Terminology Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateTerminologyAssetImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyAsset()
	 * @generated
	 */
	int CREATE_TERMINOLOGY_ASSET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_ASSET__NAME = Action_basePackage.CREATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_ASSET__DESCRIPTION = Action_basePackage.CREATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_ASSET__GID = Action_basePackage.CREATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_ASSET__SUB_ACTIONS = Action_basePackage.CREATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_ASSET__CREATED_ELEMENT = Action_basePackage.CREATE__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Terminology Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_ASSET_FEATURE_COUNT = Action_basePackage.CREATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Terminology Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERMINOLOGY_ASSET_OPERATION_COUNT = Action_basePackage.CREATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateCategoryImpl <em>Create Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateCategoryImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateCategory()
	 * @generated
	 */
	int CREATE_CATEGORY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CATEGORY__NAME = CREATE_TERMINOLOGY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CATEGORY__DESCRIPTION = CREATE_TERMINOLOGY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CATEGORY__GID = CREATE_TERMINOLOGY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CATEGORY__SUB_ACTIONS = CREATE_TERMINOLOGY_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CATEGORY__CREATED_ELEMENT = CREATE_TERMINOLOGY_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CATEGORY_FEATURE_COUNT = CREATE_TERMINOLOGY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_CATEGORY_OPERATION_COUNT = CREATE_TERMINOLOGY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateExpressionElementImpl <em>Create Expression Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateExpressionElementImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateExpressionElement()
	 * @generated
	 */
	int CREATE_EXPRESSION_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT__NAME = Action_basePackage.CREATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT__DESCRIPTION = Action_basePackage.CREATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT__GID = Action_basePackage.CREATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT__SUB_ACTIONS = Action_basePackage.CREATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT__CREATED_ELEMENT = Action_basePackage.CREATE__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT__VALUE = Action_basePackage.CREATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT_FEATURE_COUNT = Action_basePackage.CREATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Expression Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_ELEMENT_OPERATION_COUNT = Action_basePackage.CREATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateExpressionImpl <em>Create Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateExpressionImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateExpression()
	 * @generated
	 */
	int CREATE_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION__NAME = CREATE_TERMINOLOGY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION__DESCRIPTION = CREATE_TERMINOLOGY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION__GID = CREATE_TERMINOLOGY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION__SUB_ACTIONS = CREATE_TERMINOLOGY_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION__CREATED_ELEMENT = CREATE_TERMINOLOGY_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_FEATURE_COUNT = CREATE_TERMINOLOGY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXPRESSION_OPERATION_COUNT = CREATE_TERMINOLOGY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.CreateTermImpl <em>Create Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.CreateTermImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerm()
	 * @generated
	 */
	int CREATE_TERM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERM__NAME = CREATE_TERMINOLOGY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERM__DESCRIPTION = CREATE_TERMINOLOGY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERM__GID = CREATE_TERMINOLOGY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERM__SUB_ACTIONS = CREATE_TERMINOLOGY_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERM__CREATED_ELEMENT = CREATE_TERMINOLOGY_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERM_FEATURE_COUNT = CREATE_TERMINOLOGY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TERM_OPERATION_COUNT = CREATE_TERMINOLOGY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.UpdateExpressionElementCategoryImpl <em>Update Expression Element Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.UpdateExpressionElementCategoryImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateExpressionElementCategory()
	 * @generated
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY__CATEGORY = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Expression Element Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Expression Element Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_CATEGORY_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.UpdateExpressionElementValueImpl <em>Update Expression Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.UpdateExpressionElementValueImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateExpressionElementValue()
	 * @generated
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE__VALUE = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Expression Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Expression Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_VALUE_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.UpdateExpressionElementExpressionImpl <em>Update Expression Element Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.UpdateExpressionElementExpressionImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateExpressionElementExpression()
	 * @generated
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Expression Element Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Expression Element Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_EXPRESSION_ELEMENT_EXPRESSION_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.updateTermExternalReferenceImpl <em>update Term External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.updateTermExternalReferenceImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getupdateTermExternalReference()
	 * @generated
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE__EXTERNAL_REFERENCE = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>update Term External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>update Term External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_EXTERNAL_REFERENCE_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_terminology.impl.UpdateTermOriginImpl <em>Update Term Origin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_terminology.impl.UpdateTermOriginImpl
	 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateTermOrigin()
	 * @generated
	 */
	int UPDATE_TERM_ORIGIN = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN__ORIGIN = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Term Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Term Origin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TERM_ORIGIN_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link action_terminology.TerminologyActionPackage <em>Terminology Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Action Package</em>'.
	 * @see action_terminology.TerminologyActionPackage
	 * @generated
	 */
	EClass getTerminologyActionPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link action_terminology.TerminologyActionPackage#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see action_terminology.TerminologyActionPackage#getActions()
	 * @see #getTerminologyActionPackage()
	 * @generated
	 */
	EReference getTerminologyActionPackage_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link action_terminology.TerminologyActionPackage#getTerminologyActionPackages <em>Terminology Action Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Action Packages</em>'.
	 * @see action_terminology.TerminologyActionPackage#getTerminologyActionPackages()
	 * @see #getTerminologyActionPackage()
	 * @generated
	 */
	EReference getTerminologyActionPackage_TerminologyActionPackages();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateTerminologyPackage <em>Create Terminology Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Terminology Package</em>'.
	 * @see action_terminology.CreateTerminologyPackage
	 * @generated
	 */
	EClass getCreateTerminologyPackage();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateTerminologyPackageInterface <em>Create Terminology Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Terminology Package Interface</em>'.
	 * @see action_terminology.CreateTerminologyPackageInterface
	 * @generated
	 */
	EClass getCreateTerminologyPackageInterface();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateTerminologyPackageBinding <em>Create Terminology Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Terminology Package Binding</em>'.
	 * @see action_terminology.CreateTerminologyPackageBinding
	 * @generated
	 */
	EClass getCreateTerminologyPackageBinding();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateTerminologyPackageGroup <em>Create Terminology Package Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Terminology Package Group</em>'.
	 * @see action_terminology.CreateTerminologyPackageGroup
	 * @generated
	 */
	EClass getCreateTerminologyPackageGroup();

	/**
	 * Returns the meta object for class '{@link action_terminology.UpdateArtifactElement <em>Update Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Artifact Element</em>'.
	 * @see action_terminology.UpdateArtifactElement
	 * @generated
	 */
	EClass getUpdateArtifactElement();

	/**
	 * Returns the meta object for the reference '{@link action_terminology.UpdateArtifactElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_terminology.UpdateArtifactElement#getArgumentationElement()
	 * @see #getUpdateArtifactElement()
	 * @generated
	 */
	EReference getUpdateArtifactElement_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link action_terminology.DeleteArtifactElement <em>Delete Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Artifact Element</em>'.
	 * @see action_terminology.DeleteArtifactElement
	 * @generated
	 */
	EClass getDeleteArtifactElement();

	/**
	 * Returns the meta object for the attribute '{@link action_terminology.DeleteArtifactElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_terminology.DeleteArtifactElement#getIndex()
	 * @see #getDeleteArtifactElement()
	 * @generated
	 */
	EAttribute getDeleteArtifactElement_Index();

	/**
	 * Returns the meta object for the reference '{@link action_terminology.DeleteArtifactElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_terminology.DeleteArtifactElement#getArgumentationElement()
	 * @see #getDeleteArtifactElement()
	 * @generated
	 */
	EReference getDeleteArtifactElement_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateTerminologyAsset <em>Create Terminology Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Terminology Asset</em>'.
	 * @see action_terminology.CreateTerminologyAsset
	 * @generated
	 */
	EClass getCreateTerminologyAsset();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateCategory <em>Create Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Category</em>'.
	 * @see action_terminology.CreateCategory
	 * @generated
	 */
	EClass getCreateCategory();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateExpressionElement <em>Create Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Expression Element</em>'.
	 * @see action_terminology.CreateExpressionElement
	 * @generated
	 */
	EClass getCreateExpressionElement();

	/**
	 * Returns the meta object for the attribute '{@link action_terminology.CreateExpressionElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_terminology.CreateExpressionElement#getValue()
	 * @see #getCreateExpressionElement()
	 * @generated
	 */
	EAttribute getCreateExpressionElement_Value();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateExpression <em>Create Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Expression</em>'.
	 * @see action_terminology.CreateExpression
	 * @generated
	 */
	EClass getCreateExpression();

	/**
	 * Returns the meta object for class '{@link action_terminology.CreateTerm <em>Create Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Term</em>'.
	 * @see action_terminology.CreateTerm
	 * @generated
	 */
	EClass getCreateTerm();

	/**
	 * Returns the meta object for class '{@link action_terminology.UpdateExpressionElementCategory <em>Update Expression Element Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Expression Element Category</em>'.
	 * @see action_terminology.UpdateExpressionElementCategory
	 * @generated
	 */
	EClass getUpdateExpressionElementCategory();

	/**
	 * Returns the meta object for the reference '{@link action_terminology.UpdateExpressionElementCategory#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see action_terminology.UpdateExpressionElementCategory#getCategory()
	 * @see #getUpdateExpressionElementCategory()
	 * @generated
	 */
	EReference getUpdateExpressionElementCategory_Category();

	/**
	 * Returns the meta object for class '{@link action_terminology.UpdateExpressionElementValue <em>Update Expression Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Expression Element Value</em>'.
	 * @see action_terminology.UpdateExpressionElementValue
	 * @generated
	 */
	EClass getUpdateExpressionElementValue();

	/**
	 * Returns the meta object for the attribute '{@link action_terminology.UpdateExpressionElementValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_terminology.UpdateExpressionElementValue#getValue()
	 * @see #getUpdateExpressionElementValue()
	 * @generated
	 */
	EAttribute getUpdateExpressionElementValue_Value();

	/**
	 * Returns the meta object for class '{@link action_terminology.UpdateExpressionElementExpression <em>Update Expression Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Expression Element Expression</em>'.
	 * @see action_terminology.UpdateExpressionElementExpression
	 * @generated
	 */
	EClass getUpdateExpressionElementExpression();

	/**
	 * Returns the meta object for the reference '{@link action_terminology.UpdateExpressionElementExpression#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see action_terminology.UpdateExpressionElementExpression#getElement()
	 * @see #getUpdateExpressionElementExpression()
	 * @generated
	 */
	EReference getUpdateExpressionElementExpression_Element();

	/**
	 * Returns the meta object for class '{@link action_terminology.updateTermExternalReference <em>update Term External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>update Term External Reference</em>'.
	 * @see action_terminology.updateTermExternalReference
	 * @generated
	 */
	EClass getupdateTermExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link action_terminology.updateTermExternalReference#getExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Reference</em>'.
	 * @see action_terminology.updateTermExternalReference#getExternalReference()
	 * @see #getupdateTermExternalReference()
	 * @generated
	 */
	EAttribute getupdateTermExternalReference_ExternalReference();

	/**
	 * Returns the meta object for class '{@link action_terminology.UpdateTermOrigin <em>Update Term Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Term Origin</em>'.
	 * @see action_terminology.UpdateTermOrigin
	 * @generated
	 */
	EClass getUpdateTermOrigin();

	/**
	 * Returns the meta object for the reference '{@link action_terminology.UpdateTermOrigin#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see action_terminology.UpdateTermOrigin#getOrigin()
	 * @see #getUpdateTermOrigin()
	 * @generated
	 */
	EReference getUpdateTermOrigin_Origin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Action_terminologyFactory getAction_terminologyFactory();

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
		 * The meta object literal for the '{@link action_terminology.impl.TerminologyActionPackageImpl <em>Terminology Action Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.TerminologyActionPackageImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getTerminologyActionPackage()
		 * @generated
		 */
		EClass TERMINOLOGY_ACTION_PACKAGE = eINSTANCE.getTerminologyActionPackage();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_ACTION_PACKAGE__ACTIONS = eINSTANCE.getTerminologyActionPackage_Actions();

		/**
		 * The meta object literal for the '<em><b>Terminology Action Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES = eINSTANCE.getTerminologyActionPackage_TerminologyActionPackages();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateTerminologyPackageImpl <em>Create Terminology Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateTerminologyPackageImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackage()
		 * @generated
		 */
		EClass CREATE_TERMINOLOGY_PACKAGE = eINSTANCE.getCreateTerminologyPackage();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateTerminologyPackageInterfaceImpl <em>Create Terminology Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateTerminologyPackageInterfaceImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackageInterface()
		 * @generated
		 */
		EClass CREATE_TERMINOLOGY_PACKAGE_INTERFACE = eINSTANCE.getCreateTerminologyPackageInterface();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateTerminologyPackageBindingImpl <em>Create Terminology Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateTerminologyPackageBindingImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackageBinding()
		 * @generated
		 */
		EClass CREATE_TERMINOLOGY_PACKAGE_BINDING = eINSTANCE.getCreateTerminologyPackageBinding();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateTerminologyPackageGroupImpl <em>Create Terminology Package Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateTerminologyPackageGroupImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyPackageGroup()
		 * @generated
		 */
		EClass CREATE_TERMINOLOGY_PACKAGE_GROUP = eINSTANCE.getCreateTerminologyPackageGroup();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.UpdateArtifactElementImpl <em>Update Artifact Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.UpdateArtifactElementImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateArtifactElement()
		 * @generated
		 */
		EClass UPDATE_ARTIFACT_ELEMENT = eINSTANCE.getUpdateArtifactElement();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT = eINSTANCE.getUpdateArtifactElement_ArgumentationElement();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.DeleteArtifactElementImpl <em>Delete Artifact Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.DeleteArtifactElementImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getDeleteArtifactElement()
		 * @generated
		 */
		EClass DELETE_ARTIFACT_ELEMENT = eINSTANCE.getDeleteArtifactElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ARTIFACT_ELEMENT__INDEX = eINSTANCE.getDeleteArtifactElement_Index();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT = eINSTANCE.getDeleteArtifactElement_ArgumentationElement();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateTerminologyAssetImpl <em>Create Terminology Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateTerminologyAssetImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerminologyAsset()
		 * @generated
		 */
		EClass CREATE_TERMINOLOGY_ASSET = eINSTANCE.getCreateTerminologyAsset();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateCategoryImpl <em>Create Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateCategoryImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateCategory()
		 * @generated
		 */
		EClass CREATE_CATEGORY = eINSTANCE.getCreateCategory();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateExpressionElementImpl <em>Create Expression Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateExpressionElementImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateExpressionElement()
		 * @generated
		 */
		EClass CREATE_EXPRESSION_ELEMENT = eINSTANCE.getCreateExpressionElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_EXPRESSION_ELEMENT__VALUE = eINSTANCE.getCreateExpressionElement_Value();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateExpressionImpl <em>Create Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateExpressionImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateExpression()
		 * @generated
		 */
		EClass CREATE_EXPRESSION = eINSTANCE.getCreateExpression();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.CreateTermImpl <em>Create Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.CreateTermImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getCreateTerm()
		 * @generated
		 */
		EClass CREATE_TERM = eINSTANCE.getCreateTerm();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.UpdateExpressionElementCategoryImpl <em>Update Expression Element Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.UpdateExpressionElementCategoryImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateExpressionElementCategory()
		 * @generated
		 */
		EClass UPDATE_EXPRESSION_ELEMENT_CATEGORY = eINSTANCE.getUpdateExpressionElementCategory();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_EXPRESSION_ELEMENT_CATEGORY__CATEGORY = eINSTANCE.getUpdateExpressionElementCategory_Category();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.UpdateExpressionElementValueImpl <em>Update Expression Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.UpdateExpressionElementValueImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateExpressionElementValue()
		 * @generated
		 */
		EClass UPDATE_EXPRESSION_ELEMENT_VALUE = eINSTANCE.getUpdateExpressionElementValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_EXPRESSION_ELEMENT_VALUE__VALUE = eINSTANCE.getUpdateExpressionElementValue_Value();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.UpdateExpressionElementExpressionImpl <em>Update Expression Element Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.UpdateExpressionElementExpressionImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateExpressionElementExpression()
		 * @generated
		 */
		EClass UPDATE_EXPRESSION_ELEMENT_EXPRESSION = eINSTANCE.getUpdateExpressionElementExpression();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT = eINSTANCE.getUpdateExpressionElementExpression_Element();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.updateTermExternalReferenceImpl <em>update Term External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.updateTermExternalReferenceImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getupdateTermExternalReference()
		 * @generated
		 */
		EClass UPDATE_TERM_EXTERNAL_REFERENCE = eINSTANCE.getupdateTermExternalReference();

		/**
		 * The meta object literal for the '<em><b>External Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TERM_EXTERNAL_REFERENCE__EXTERNAL_REFERENCE = eINSTANCE.getupdateTermExternalReference_ExternalReference();

		/**
		 * The meta object literal for the '{@link action_terminology.impl.UpdateTermOriginImpl <em>Update Term Origin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_terminology.impl.UpdateTermOriginImpl
		 * @see action_terminology.impl.Action_terminologyPackageImpl#getUpdateTermOrigin()
		 * @generated
		 */
		EClass UPDATE_TERM_ORIGIN = eINSTANCE.getUpdateTermOrigin();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TERM_ORIGIN__ORIGIN = eINSTANCE.getUpdateTermOrigin_Origin();

	}

} //Action_terminologyPackage
