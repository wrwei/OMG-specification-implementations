/**
 */
package action_argumentation;

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
 * @see action_argumentation.Action_argumentationFactory
 * @model kind="package"
 * @generated
 */
public interface Action_argumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action_argumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme.action/1.0/argumentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action_argumentation_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_argumentationPackage eINSTANCE = action_argumentation.impl.Action_argumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link action_argumentation.impl.ArgumentationActionPackageImpl <em>Argumentation Action Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.ArgumentationActionPackageImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getArgumentationActionPackage()
	 * @generated
	 */
	int ARGUMENTATION_ACTION_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ACTION_PACKAGE__NAME = Action_basePackage.ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ACTION_PACKAGE__DESCRIPTION = Action_basePackage.ACTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ACTION_PACKAGE__GID = Action_basePackage.ACTION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ACTION_PACKAGE__ACTIONS = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argumentation Action Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Argumentation Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ACTION_PACKAGE_FEATURE_COUNT = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Argumentation Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ACTION_PACKAGE_OPERATION_COUNT = Action_basePackage.ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateArgumentPackageImpl <em>Create Argument Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateArgumentPackageImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackage()
	 * @generated
	 */
	int CREATE_ARGUMENT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Argument Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Argument Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateArgumentPackageInterfaceImpl <em>Create Argument Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateArgumentPackageInterfaceImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackageInterface()
	 * @generated
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Argument Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Argument Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_INTERFACE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateArgumentPackageBindingImpl <em>Create Argument Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateArgumentPackageBindingImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackageBinding()
	 * @generated
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Argument Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Argument Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_BINDING_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateArgumentPackageGroupImpl <em>Create Argument Package Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateArgumentPackageGroupImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackageGroup()
	 * @generated
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Argument Package Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Argument Package Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_PACKAGE_GROUP_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.UpdateArgumentationElementImpl <em>Update Argumentation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.UpdateArgumentationElementImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateArgumentationElement()
	 * @generated
	 */
	int UPDATE_ARGUMENTATION_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Argumentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Argumentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARGUMENTATION_ELEMENT_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.DeleteArgumentationElementImpl <em>Delete Argumentation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.DeleteArgumentationElementImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeleteArgumentationElement()
	 * @generated
	 */
	int DELETE_ARGUMENTATION_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT__NAME = Action_basePackage.DELETE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT__DESCRIPTION = Action_basePackage.DELETE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT__GID = Action_basePackage.DELETE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT__SUB_ACTIONS = Action_basePackage.DELETE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT__REFERENCED_ELEMENT = Action_basePackage.DELETE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT__INDEX = Action_basePackage.DELETE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argumentation Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT = Action_basePackage.DELETE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Delete Argumentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT_FEATURE_COUNT = Action_basePackage.DELETE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Delete Argumentation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ARGUMENTATION_ELEMENT_OPERATION_COUNT = Action_basePackage.DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateArgumentAssetImpl <em>Create Argument Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateArgumentAssetImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentAsset()
	 * @generated
	 */
	int CREATE_ARGUMENT_ASSET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_ASSET__NAME = Action_basePackage.CREATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_ASSET__DESCRIPTION = Action_basePackage.CREATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_ASSET__GID = Action_basePackage.CREATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_ASSET__SUB_ACTIONS = Action_basePackage.CREATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_ASSET__CREATED_ELEMENT = Action_basePackage.CREATE__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Argument Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_ASSET_FEATURE_COUNT = Action_basePackage.CREATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Argument Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_ASSET_OPERATION_COUNT = Action_basePackage.CREATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateArtifactReferenceImpl <em>Create Artifact Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateArtifactReferenceImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArtifactReference()
	 * @generated
	 */
	int CREATE_ARTIFACT_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_REFERENCE__NAME = CREATE_ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_REFERENCE__DESCRIPTION = CREATE_ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_REFERENCE__GID = CREATE_ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_REFERENCE__SUB_ACTIONS = CREATE_ARGUMENT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_REFERENCE__CREATED_ELEMENT = CREATE_ARGUMENT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Artifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_REFERENCE_FEATURE_COUNT = CREATE_ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_REFERENCE_OPERATION_COUNT = CREATE_ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.ReferToArtifactImpl <em>Refer To Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.ReferToArtifactImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getReferToArtifact()
	 * @generated
	 */
	int REFER_TO_ARTIFACT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Referred Artifact</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT__REFERRED_ARTIFACT = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refer To Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Refer To Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFER_TO_ARTIFACT_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateAssertionImpl <em>Create Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateAssertionImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertion()
	 * @generated
	 */
	int CREATE_ASSERTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTION__NAME = CREATE_ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTION__DESCRIPTION = CREATE_ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTION__GID = CREATE_ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTION__SUB_ACTIONS = CREATE_ARGUMENT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTION__CREATED_ELEMENT = CREATE_ARGUMENT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTION_FEATURE_COUNT = CREATE_ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTION_OPERATION_COUNT = CREATE_ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.UpdateAssertionDeclarationImpl <em>Update Assertion Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.UpdateAssertionDeclarationImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateAssertionDeclaration()
	 * @generated
	 */
	int UPDATE_ASSERTION_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTION_DECLARATION__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTION_DECLARATION__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTION_DECLARATION__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTION_DECLARATION__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTION_DECLARATION__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Update Assertion Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTION_DECLARATION_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update Assertion Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTION_DECLARATION_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.DeclareAssertedImpl <em>Declare Asserted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.DeclareAssertedImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAsserted()
	 * @generated
	 */
	int DECLARE_ASSERTED = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSERTED__NAME = UPDATE_ASSERTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSERTED__DESCRIPTION = UPDATE_ASSERTION_DECLARATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSERTED__GID = UPDATE_ASSERTION_DECLARATION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSERTED__SUB_ACTIONS = UPDATE_ASSERTION_DECLARATION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSERTED__REFERENCED_ELEMENT = UPDATE_ASSERTION_DECLARATION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Declare Asserted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSERTED_FEATURE_COUNT = UPDATE_ASSERTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declare Asserted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSERTED_OPERATION_COUNT = UPDATE_ASSERTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.DeclareNeedsSupportImpl <em>Declare Needs Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.DeclareNeedsSupportImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareNeedsSupport()
	 * @generated
	 */
	int DECLARE_NEEDS_SUPPORT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_NEEDS_SUPPORT__NAME = UPDATE_ASSERTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_NEEDS_SUPPORT__DESCRIPTION = UPDATE_ASSERTION_DECLARATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_NEEDS_SUPPORT__GID = UPDATE_ASSERTION_DECLARATION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_NEEDS_SUPPORT__SUB_ACTIONS = UPDATE_ASSERTION_DECLARATION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_NEEDS_SUPPORT__REFERENCED_ELEMENT = UPDATE_ASSERTION_DECLARATION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Declare Needs Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_NEEDS_SUPPORT_FEATURE_COUNT = UPDATE_ASSERTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declare Needs Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_NEEDS_SUPPORT_OPERATION_COUNT = UPDATE_ASSERTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.DeclareAssumedImpl <em>Declare Assumed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.DeclareAssumedImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAssumed()
	 * @generated
	 */
	int DECLARE_ASSUMED = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSUMED__NAME = UPDATE_ASSERTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSUMED__DESCRIPTION = UPDATE_ASSERTION_DECLARATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSUMED__GID = UPDATE_ASSERTION_DECLARATION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSUMED__SUB_ACTIONS = UPDATE_ASSERTION_DECLARATION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSUMED__REFERENCED_ELEMENT = UPDATE_ASSERTION_DECLARATION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Declare Assumed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSUMED_FEATURE_COUNT = UPDATE_ASSERTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declare Assumed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_ASSUMED_OPERATION_COUNT = UPDATE_ASSERTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.DeclareAxiomaticImpl <em>Declare Axiomatic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.DeclareAxiomaticImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAxiomatic()
	 * @generated
	 */
	int DECLARE_AXIOMATIC = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AXIOMATIC__NAME = UPDATE_ASSERTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AXIOMATIC__DESCRIPTION = UPDATE_ASSERTION_DECLARATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AXIOMATIC__GID = UPDATE_ASSERTION_DECLARATION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AXIOMATIC__SUB_ACTIONS = UPDATE_ASSERTION_DECLARATION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AXIOMATIC__REFERENCED_ELEMENT = UPDATE_ASSERTION_DECLARATION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Declare Axiomatic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AXIOMATIC_FEATURE_COUNT = UPDATE_ASSERTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declare Axiomatic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AXIOMATIC_OPERATION_COUNT = UPDATE_ASSERTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.DeclareDefeatedImpl <em>Declare Defeated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.DeclareDefeatedImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareDefeated()
	 * @generated
	 */
	int DECLARE_DEFEATED = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_DEFEATED__NAME = UPDATE_ASSERTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_DEFEATED__DESCRIPTION = UPDATE_ASSERTION_DECLARATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_DEFEATED__GID = UPDATE_ASSERTION_DECLARATION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_DEFEATED__SUB_ACTIONS = UPDATE_ASSERTION_DECLARATION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_DEFEATED__REFERENCED_ELEMENT = UPDATE_ASSERTION_DECLARATION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Declare Defeated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_DEFEATED_FEATURE_COUNT = UPDATE_ASSERTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declare Defeated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_DEFEATED_OPERATION_COUNT = UPDATE_ASSERTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.DeclareAsCitedImpl <em>Declare As Cited</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.DeclareAsCitedImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAsCited()
	 * @generated
	 */
	int DECLARE_AS_CITED = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AS_CITED__NAME = UPDATE_ASSERTION_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AS_CITED__DESCRIPTION = UPDATE_ASSERTION_DECLARATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AS_CITED__GID = UPDATE_ASSERTION_DECLARATION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AS_CITED__SUB_ACTIONS = UPDATE_ASSERTION_DECLARATION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AS_CITED__REFERENCED_ELEMENT = UPDATE_ASSERTION_DECLARATION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Declare As Cited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AS_CITED_FEATURE_COUNT = UPDATE_ASSERTION_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Declare As Cited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARE_AS_CITED_OPERATION_COUNT = UPDATE_ASSERTION_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.MakeClaimImpl <em>Make Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.MakeClaimImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getMakeClaim()
	 * @generated
	 */
	int MAKE_CLAIM = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CLAIM__NAME = CREATE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CLAIM__DESCRIPTION = CREATE_ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CLAIM__GID = CREATE_ASSERTION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CLAIM__SUB_ACTIONS = CREATE_ASSERTION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CLAIM__CREATED_ELEMENT = CREATE_ASSERTION__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Make Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CLAIM_FEATURE_COUNT = CREATE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Make Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CLAIM_OPERATION_COUNT = CREATE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateArgumentReasoningImpl <em>Create Argument Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateArgumentReasoningImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentReasoning()
	 * @generated
	 */
	int CREATE_ARGUMENT_REASONING = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_REASONING__NAME = CREATE_ARGUMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_REASONING__DESCRIPTION = CREATE_ARGUMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_REASONING__GID = CREATE_ARGUMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_REASONING__SUB_ACTIONS = CREATE_ARGUMENT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_REASONING__CREATED_ELEMENT = CREATE_ARGUMENT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Argument Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_REASONING_FEATURE_COUNT = CREATE_ARGUMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Argument Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARGUMENT_REASONING_OPERATION_COUNT = CREATE_ARGUMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateAssertedRelationshipImpl <em>Create Asserted Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateAssertedRelationshipImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedRelationship()
	 * @generated
	 */
	int CREATE_ASSERTED_RELATIONSHIP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_RELATIONSHIP__NAME = CREATE_ASSERTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_RELATIONSHIP__DESCRIPTION = CREATE_ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_RELATIONSHIP__GID = CREATE_ASSERTION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_RELATIONSHIP__SUB_ACTIONS = CREATE_ASSERTION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_RELATIONSHIP__CREATED_ELEMENT = CREATE_ASSERTION__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_RELATIONSHIP_FEATURE_COUNT = CREATE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_RELATIONSHIP_OPERATION_COUNT = CREATE_ASSERTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateAssertedContextImpl <em>Create Asserted Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateAssertedContextImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedContext()
	 * @generated
	 */
	int CREATE_ASSERTED_CONTEXT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_CONTEXT__NAME = CREATE_ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_CONTEXT__DESCRIPTION = CREATE_ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_CONTEXT__GID = CREATE_ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_CONTEXT__SUB_ACTIONS = CREATE_ASSERTED_RELATIONSHIP__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_CONTEXT__CREATED_ELEMENT = CREATE_ASSERTED_RELATIONSHIP__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Asserted Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_CONTEXT_FEATURE_COUNT = CREATE_ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Asserted Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_CONTEXT_OPERATION_COUNT = CREATE_ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateAssertedEvidenceImpl <em>Create Asserted Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateAssertedEvidenceImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedEvidence()
	 * @generated
	 */
	int CREATE_ASSERTED_EVIDENCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_EVIDENCE__NAME = CREATE_ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_EVIDENCE__DESCRIPTION = CREATE_ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_EVIDENCE__GID = CREATE_ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_EVIDENCE__SUB_ACTIONS = CREATE_ASSERTED_RELATIONSHIP__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_EVIDENCE__CREATED_ELEMENT = CREATE_ASSERTED_RELATIONSHIP__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Asserted Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_EVIDENCE_FEATURE_COUNT = CREATE_ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Asserted Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_EVIDENCE_OPERATION_COUNT = CREATE_ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateAssertedInferenceImpl <em>Create Asserted Inference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateAssertedInferenceImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedInference()
	 * @generated
	 */
	int CREATE_ASSERTED_INFERENCE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_INFERENCE__NAME = CREATE_ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_INFERENCE__DESCRIPTION = CREATE_ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_INFERENCE__GID = CREATE_ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_INFERENCE__SUB_ACTIONS = CREATE_ASSERTED_RELATIONSHIP__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_INFERENCE__CREATED_ELEMENT = CREATE_ASSERTED_RELATIONSHIP__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Asserted Inference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_INFERENCE_FEATURE_COUNT = CREATE_ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Asserted Inference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_INFERENCE_OPERATION_COUNT = CREATE_ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateAssertedArtifactContextImpl <em>Create Asserted Artifact Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateAssertedArtifactContextImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedArtifactContext()
	 * @generated
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT__NAME = CREATE_ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT__DESCRIPTION = CREATE_ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT__GID = CREATE_ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT__SUB_ACTIONS = CREATE_ASSERTED_RELATIONSHIP__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT__CREATED_ELEMENT = CREATE_ASSERTED_RELATIONSHIP__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Asserted Artifact Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT_FEATURE_COUNT = CREATE_ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Asserted Artifact Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_CONTEXT_OPERATION_COUNT = CREATE_ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.CreateAssertedArtifactSupportImpl <em>Create Asserted Artifact Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.CreateAssertedArtifactSupportImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedArtifactSupport()
	 * @generated
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT__NAME = CREATE_ASSERTED_RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT__DESCRIPTION = CREATE_ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT__GID = CREATE_ASSERTED_RELATIONSHIP__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT__SUB_ACTIONS = CREATE_ASSERTED_RELATIONSHIP__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT__CREATED_ELEMENT = CREATE_ASSERTED_RELATIONSHIP__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Asserted Artifact Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT_FEATURE_COUNT = CREATE_ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Asserted Artifact Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASSERTED_ARTIFACT_SUPPORT_OPERATION_COUNT = CREATE_ASSERTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.UpdateReasoningImpl <em>Update Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.UpdateReasoningImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateReasoning()
	 * @generated
	 */
	int UPDATE_REASONING = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Reasoning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING__REASONING = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_REASONING_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.UpdateMetaClaimImpl <em>Update Meta Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.UpdateMetaClaimImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateMetaClaim()
	 * @generated
	 */
	int UPDATE_META_CLAIM = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Meta Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM__META_CLAIM = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Meta Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Meta Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_META_CLAIM_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.UpdateAssertedRelationshipSourceImpl <em>Update Asserted Relationship Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.UpdateAssertedRelationshipSourceImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateAssertedRelationshipSource()
	 * @generated
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE__SOURCE = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Asserted Relationship Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Asserted Relationship Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_SOURCE_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.UpdateAssertedRelationshipTargetImpl <em>Update Asserted Relationship Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.UpdateAssertedRelationshipTargetImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateAssertedRelationshipTarget()
	 * @generated
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Asserted Relationship Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Asserted Relationship Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ASSERTED_RELATIONSHIP_TARGET_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_argumentation.impl.UpdateIsCounterAssertedRelationshipImpl <em>Update Is Counter Asserted Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_argumentation.impl.UpdateIsCounterAssertedRelationshipImpl
	 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateIsCounterAssertedRelationship()
	 * @generated
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Is Counter Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Is Counter Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link action_argumentation.ArgumentationActionPackage <em>Argumentation Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argumentation Action Package</em>'.
	 * @see action_argumentation.ArgumentationActionPackage
	 * @generated
	 */
	EClass getArgumentationActionPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link action_argumentation.ArgumentationActionPackage#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see action_argumentation.ArgumentationActionPackage#getActions()
	 * @see #getArgumentationActionPackage()
	 * @generated
	 */
	EReference getArgumentationActionPackage_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link action_argumentation.ArgumentationActionPackage#getArgumentationActionPackages <em>Argumentation Action Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argumentation Action Packages</em>'.
	 * @see action_argumentation.ArgumentationActionPackage#getArgumentationActionPackages()
	 * @see #getArgumentationActionPackage()
	 * @generated
	 */
	EReference getArgumentationActionPackage_ArgumentationActionPackages();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateArgumentPackage <em>Create Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Argument Package</em>'.
	 * @see action_argumentation.CreateArgumentPackage
	 * @generated
	 */
	EClass getCreateArgumentPackage();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateArgumentPackageInterface <em>Create Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Argument Package Interface</em>'.
	 * @see action_argumentation.CreateArgumentPackageInterface
	 * @generated
	 */
	EClass getCreateArgumentPackageInterface();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateArgumentPackageBinding <em>Create Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Argument Package Binding</em>'.
	 * @see action_argumentation.CreateArgumentPackageBinding
	 * @generated
	 */
	EClass getCreateArgumentPackageBinding();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateArgumentPackageGroup <em>Create Argument Package Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Argument Package Group</em>'.
	 * @see action_argumentation.CreateArgumentPackageGroup
	 * @generated
	 */
	EClass getCreateArgumentPackageGroup();

	/**
	 * Returns the meta object for class '{@link action_argumentation.UpdateArgumentationElement <em>Update Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Argumentation Element</em>'.
	 * @see action_argumentation.UpdateArgumentationElement
	 * @generated
	 */
	EClass getUpdateArgumentationElement();

	/**
	 * Returns the meta object for the reference '{@link action_argumentation.UpdateArgumentationElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_argumentation.UpdateArgumentationElement#getArgumentationElement()
	 * @see #getUpdateArgumentationElement()
	 * @generated
	 */
	EReference getUpdateArgumentationElement_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link action_argumentation.DeleteArgumentationElement <em>Delete Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Argumentation Element</em>'.
	 * @see action_argumentation.DeleteArgumentationElement
	 * @generated
	 */
	EClass getDeleteArgumentationElement();

	/**
	 * Returns the meta object for the attribute '{@link action_argumentation.DeleteArgumentationElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_argumentation.DeleteArgumentationElement#getIndex()
	 * @see #getDeleteArgumentationElement()
	 * @generated
	 */
	EAttribute getDeleteArgumentationElement_Index();

	/**
	 * Returns the meta object for the reference '{@link action_argumentation.DeleteArgumentationElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_argumentation.DeleteArgumentationElement#getArgumentationElement()
	 * @see #getDeleteArgumentationElement()
	 * @generated
	 */
	EReference getDeleteArgumentationElement_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateArgumentAsset <em>Create Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Argument Asset</em>'.
	 * @see action_argumentation.CreateArgumentAsset
	 * @generated
	 */
	EClass getCreateArgumentAsset();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateArtifactReference <em>Create Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Reference</em>'.
	 * @see action_argumentation.CreateArtifactReference
	 * @generated
	 */
	EClass getCreateArtifactReference();

	/**
	 * Returns the meta object for class '{@link action_argumentation.ReferToArtifact <em>Refer To Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refer To Artifact</em>'.
	 * @see action_argumentation.ReferToArtifact
	 * @generated
	 */
	EClass getReferToArtifact();

	/**
	 * Returns the meta object for the reference '{@link action_argumentation.ReferToArtifact#getReferredArtifact <em>Referred Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Artifact</em>'.
	 * @see action_argumentation.ReferToArtifact#getReferredArtifact()
	 * @see #getReferToArtifact()
	 * @generated
	 */
	EReference getReferToArtifact_ReferredArtifact();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateAssertion <em>Create Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Assertion</em>'.
	 * @see action_argumentation.CreateAssertion
	 * @generated
	 */
	EClass getCreateAssertion();

	/**
	 * Returns the meta object for class '{@link action_argumentation.UpdateAssertionDeclaration <em>Update Assertion Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Assertion Declaration</em>'.
	 * @see action_argumentation.UpdateAssertionDeclaration
	 * @generated
	 */
	EClass getUpdateAssertionDeclaration();

	/**
	 * Returns the meta object for class '{@link action_argumentation.DeclareAsserted <em>Declare Asserted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Asserted</em>'.
	 * @see action_argumentation.DeclareAsserted
	 * @generated
	 */
	EClass getDeclareAsserted();

	/**
	 * Returns the meta object for class '{@link action_argumentation.DeclareNeedsSupport <em>Declare Needs Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Needs Support</em>'.
	 * @see action_argumentation.DeclareNeedsSupport
	 * @generated
	 */
	EClass getDeclareNeedsSupport();

	/**
	 * Returns the meta object for class '{@link action_argumentation.DeclareAssumed <em>Declare Assumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Assumed</em>'.
	 * @see action_argumentation.DeclareAssumed
	 * @generated
	 */
	EClass getDeclareAssumed();

	/**
	 * Returns the meta object for class '{@link action_argumentation.DeclareAxiomatic <em>Declare Axiomatic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Axiomatic</em>'.
	 * @see action_argumentation.DeclareAxiomatic
	 * @generated
	 */
	EClass getDeclareAxiomatic();

	/**
	 * Returns the meta object for class '{@link action_argumentation.DeclareDefeated <em>Declare Defeated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare Defeated</em>'.
	 * @see action_argumentation.DeclareDefeated
	 * @generated
	 */
	EClass getDeclareDefeated();

	/**
	 * Returns the meta object for class '{@link action_argumentation.DeclareAsCited <em>Declare As Cited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declare As Cited</em>'.
	 * @see action_argumentation.DeclareAsCited
	 * @generated
	 */
	EClass getDeclareAsCited();

	/**
	 * Returns the meta object for class '{@link action_argumentation.MakeClaim <em>Make Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make Claim</em>'.
	 * @see action_argumentation.MakeClaim
	 * @generated
	 */
	EClass getMakeClaim();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateArgumentReasoning <em>Create Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Argument Reasoning</em>'.
	 * @see action_argumentation.CreateArgumentReasoning
	 * @generated
	 */
	EClass getCreateArgumentReasoning();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateAssertedRelationship <em>Create Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Asserted Relationship</em>'.
	 * @see action_argumentation.CreateAssertedRelationship
	 * @generated
	 */
	EClass getCreateAssertedRelationship();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateAssertedContext <em>Create Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Asserted Context</em>'.
	 * @see action_argumentation.CreateAssertedContext
	 * @generated
	 */
	EClass getCreateAssertedContext();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateAssertedEvidence <em>Create Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Asserted Evidence</em>'.
	 * @see action_argumentation.CreateAssertedEvidence
	 * @generated
	 */
	EClass getCreateAssertedEvidence();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateAssertedInference <em>Create Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Asserted Inference</em>'.
	 * @see action_argumentation.CreateAssertedInference
	 * @generated
	 */
	EClass getCreateAssertedInference();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateAssertedArtifactContext <em>Create Asserted Artifact Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Asserted Artifact Context</em>'.
	 * @see action_argumentation.CreateAssertedArtifactContext
	 * @generated
	 */
	EClass getCreateAssertedArtifactContext();

	/**
	 * Returns the meta object for class '{@link action_argumentation.CreateAssertedArtifactSupport <em>Create Asserted Artifact Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Asserted Artifact Support</em>'.
	 * @see action_argumentation.CreateAssertedArtifactSupport
	 * @generated
	 */
	EClass getCreateAssertedArtifactSupport();

	/**
	 * Returns the meta object for class '{@link action_argumentation.UpdateReasoning <em>Update Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Reasoning</em>'.
	 * @see action_argumentation.UpdateReasoning
	 * @generated
	 */
	EClass getUpdateReasoning();

	/**
	 * Returns the meta object for the reference '{@link action_argumentation.UpdateReasoning#getReasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reasoning</em>'.
	 * @see action_argumentation.UpdateReasoning#getReasoning()
	 * @see #getUpdateReasoning()
	 * @generated
	 */
	EReference getUpdateReasoning_Reasoning();

	/**
	 * Returns the meta object for class '{@link action_argumentation.UpdateMetaClaim <em>Update Meta Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Meta Claim</em>'.
	 * @see action_argumentation.UpdateMetaClaim
	 * @generated
	 */
	EClass getUpdateMetaClaim();

	/**
	 * Returns the meta object for the reference '{@link action_argumentation.UpdateMetaClaim#getMetaClaim <em>Meta Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meta Claim</em>'.
	 * @see action_argumentation.UpdateMetaClaim#getMetaClaim()
	 * @see #getUpdateMetaClaim()
	 * @generated
	 */
	EReference getUpdateMetaClaim_MetaClaim();

	/**
	 * Returns the meta object for class '{@link action_argumentation.UpdateAssertedRelationshipSource <em>Update Asserted Relationship Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Asserted Relationship Source</em>'.
	 * @see action_argumentation.UpdateAssertedRelationshipSource
	 * @generated
	 */
	EClass getUpdateAssertedRelationshipSource();

	/**
	 * Returns the meta object for the reference '{@link action_argumentation.UpdateAssertedRelationshipSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see action_argumentation.UpdateAssertedRelationshipSource#getSource()
	 * @see #getUpdateAssertedRelationshipSource()
	 * @generated
	 */
	EReference getUpdateAssertedRelationshipSource_Source();

	/**
	 * Returns the meta object for class '{@link action_argumentation.UpdateAssertedRelationshipTarget <em>Update Asserted Relationship Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Asserted Relationship Target</em>'.
	 * @see action_argumentation.UpdateAssertedRelationshipTarget
	 * @generated
	 */
	EClass getUpdateAssertedRelationshipTarget();

	/**
	 * Returns the meta object for the reference list '{@link action_argumentation.UpdateAssertedRelationshipTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see action_argumentation.UpdateAssertedRelationshipTarget#getTarget()
	 * @see #getUpdateAssertedRelationshipTarget()
	 * @generated
	 */
	EReference getUpdateAssertedRelationshipTarget_Target();

	/**
	 * Returns the meta object for class '{@link action_argumentation.UpdateIsCounterAssertedRelationship <em>Update Is Counter Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Is Counter Asserted Relationship</em>'.
	 * @see action_argumentation.UpdateIsCounterAssertedRelationship
	 * @generated
	 */
	EClass getUpdateIsCounterAssertedRelationship();

	/**
	 * Returns the meta object for the attribute '{@link action_argumentation.UpdateIsCounterAssertedRelationship#isIsCounter <em>Is Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Counter</em>'.
	 * @see action_argumentation.UpdateIsCounterAssertedRelationship#isIsCounter()
	 * @see #getUpdateIsCounterAssertedRelationship()
	 * @generated
	 */
	EAttribute getUpdateIsCounterAssertedRelationship_IsCounter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Action_argumentationFactory getAction_argumentationFactory();

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
		 * The meta object literal for the '{@link action_argumentation.impl.ArgumentationActionPackageImpl <em>Argumentation Action Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.ArgumentationActionPackageImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getArgumentationActionPackage()
		 * @generated
		 */
		EClass ARGUMENTATION_ACTION_PACKAGE = eINSTANCE.getArgumentationActionPackage();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION_ACTION_PACKAGE__ACTIONS = eINSTANCE.getArgumentationActionPackage_Actions();

		/**
		 * The meta object literal for the '<em><b>Argumentation Action Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES = eINSTANCE.getArgumentationActionPackage_ArgumentationActionPackages();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateArgumentPackageImpl <em>Create Argument Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateArgumentPackageImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackage()
		 * @generated
		 */
		EClass CREATE_ARGUMENT_PACKAGE = eINSTANCE.getCreateArgumentPackage();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateArgumentPackageInterfaceImpl <em>Create Argument Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateArgumentPackageInterfaceImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackageInterface()
		 * @generated
		 */
		EClass CREATE_ARGUMENT_PACKAGE_INTERFACE = eINSTANCE.getCreateArgumentPackageInterface();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateArgumentPackageBindingImpl <em>Create Argument Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateArgumentPackageBindingImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackageBinding()
		 * @generated
		 */
		EClass CREATE_ARGUMENT_PACKAGE_BINDING = eINSTANCE.getCreateArgumentPackageBinding();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateArgumentPackageGroupImpl <em>Create Argument Package Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateArgumentPackageGroupImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentPackageGroup()
		 * @generated
		 */
		EClass CREATE_ARGUMENT_PACKAGE_GROUP = eINSTANCE.getCreateArgumentPackageGroup();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.UpdateArgumentationElementImpl <em>Update Argumentation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.UpdateArgumentationElementImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateArgumentationElement()
		 * @generated
		 */
		EClass UPDATE_ARGUMENTATION_ELEMENT = eINSTANCE.getUpdateArgumentationElement();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT = eINSTANCE.getUpdateArgumentationElement_ArgumentationElement();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.DeleteArgumentationElementImpl <em>Delete Argumentation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.DeleteArgumentationElementImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeleteArgumentationElement()
		 * @generated
		 */
		EClass DELETE_ARGUMENTATION_ELEMENT = eINSTANCE.getDeleteArgumentationElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ARGUMENTATION_ELEMENT__INDEX = eINSTANCE.getDeleteArgumentationElement_Index();

		/**
		 * The meta object literal for the '<em><b>Argumentation Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT = eINSTANCE.getDeleteArgumentationElement_ArgumentationElement();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateArgumentAssetImpl <em>Create Argument Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateArgumentAssetImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentAsset()
		 * @generated
		 */
		EClass CREATE_ARGUMENT_ASSET = eINSTANCE.getCreateArgumentAsset();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateArtifactReferenceImpl <em>Create Artifact Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateArtifactReferenceImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArtifactReference()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_REFERENCE = eINSTANCE.getCreateArtifactReference();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.ReferToArtifactImpl <em>Refer To Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.ReferToArtifactImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getReferToArtifact()
		 * @generated
		 */
		EClass REFER_TO_ARTIFACT = eINSTANCE.getReferToArtifact();

		/**
		 * The meta object literal for the '<em><b>Referred Artifact</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFER_TO_ARTIFACT__REFERRED_ARTIFACT = eINSTANCE.getReferToArtifact_ReferredArtifact();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateAssertionImpl <em>Create Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateAssertionImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertion()
		 * @generated
		 */
		EClass CREATE_ASSERTION = eINSTANCE.getCreateAssertion();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.UpdateAssertionDeclarationImpl <em>Update Assertion Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.UpdateAssertionDeclarationImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateAssertionDeclaration()
		 * @generated
		 */
		EClass UPDATE_ASSERTION_DECLARATION = eINSTANCE.getUpdateAssertionDeclaration();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.DeclareAssertedImpl <em>Declare Asserted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.DeclareAssertedImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAsserted()
		 * @generated
		 */
		EClass DECLARE_ASSERTED = eINSTANCE.getDeclareAsserted();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.DeclareNeedsSupportImpl <em>Declare Needs Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.DeclareNeedsSupportImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareNeedsSupport()
		 * @generated
		 */
		EClass DECLARE_NEEDS_SUPPORT = eINSTANCE.getDeclareNeedsSupport();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.DeclareAssumedImpl <em>Declare Assumed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.DeclareAssumedImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAssumed()
		 * @generated
		 */
		EClass DECLARE_ASSUMED = eINSTANCE.getDeclareAssumed();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.DeclareAxiomaticImpl <em>Declare Axiomatic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.DeclareAxiomaticImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAxiomatic()
		 * @generated
		 */
		EClass DECLARE_AXIOMATIC = eINSTANCE.getDeclareAxiomatic();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.DeclareDefeatedImpl <em>Declare Defeated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.DeclareDefeatedImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareDefeated()
		 * @generated
		 */
		EClass DECLARE_DEFEATED = eINSTANCE.getDeclareDefeated();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.DeclareAsCitedImpl <em>Declare As Cited</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.DeclareAsCitedImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getDeclareAsCited()
		 * @generated
		 */
		EClass DECLARE_AS_CITED = eINSTANCE.getDeclareAsCited();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.MakeClaimImpl <em>Make Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.MakeClaimImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getMakeClaim()
		 * @generated
		 */
		EClass MAKE_CLAIM = eINSTANCE.getMakeClaim();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateArgumentReasoningImpl <em>Create Argument Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateArgumentReasoningImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateArgumentReasoning()
		 * @generated
		 */
		EClass CREATE_ARGUMENT_REASONING = eINSTANCE.getCreateArgumentReasoning();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateAssertedRelationshipImpl <em>Create Asserted Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateAssertedRelationshipImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedRelationship()
		 * @generated
		 */
		EClass CREATE_ASSERTED_RELATIONSHIP = eINSTANCE.getCreateAssertedRelationship();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateAssertedContextImpl <em>Create Asserted Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateAssertedContextImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedContext()
		 * @generated
		 */
		EClass CREATE_ASSERTED_CONTEXT = eINSTANCE.getCreateAssertedContext();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateAssertedEvidenceImpl <em>Create Asserted Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateAssertedEvidenceImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedEvidence()
		 * @generated
		 */
		EClass CREATE_ASSERTED_EVIDENCE = eINSTANCE.getCreateAssertedEvidence();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateAssertedInferenceImpl <em>Create Asserted Inference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateAssertedInferenceImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedInference()
		 * @generated
		 */
		EClass CREATE_ASSERTED_INFERENCE = eINSTANCE.getCreateAssertedInference();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateAssertedArtifactContextImpl <em>Create Asserted Artifact Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateAssertedArtifactContextImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedArtifactContext()
		 * @generated
		 */
		EClass CREATE_ASSERTED_ARTIFACT_CONTEXT = eINSTANCE.getCreateAssertedArtifactContext();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.CreateAssertedArtifactSupportImpl <em>Create Asserted Artifact Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.CreateAssertedArtifactSupportImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getCreateAssertedArtifactSupport()
		 * @generated
		 */
		EClass CREATE_ASSERTED_ARTIFACT_SUPPORT = eINSTANCE.getCreateAssertedArtifactSupport();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.UpdateReasoningImpl <em>Update Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.UpdateReasoningImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateReasoning()
		 * @generated
		 */
		EClass UPDATE_REASONING = eINSTANCE.getUpdateReasoning();

		/**
		 * The meta object literal for the '<em><b>Reasoning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_REASONING__REASONING = eINSTANCE.getUpdateReasoning_Reasoning();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.UpdateMetaClaimImpl <em>Update Meta Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.UpdateMetaClaimImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateMetaClaim()
		 * @generated
		 */
		EClass UPDATE_META_CLAIM = eINSTANCE.getUpdateMetaClaim();

		/**
		 * The meta object literal for the '<em><b>Meta Claim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_META_CLAIM__META_CLAIM = eINSTANCE.getUpdateMetaClaim_MetaClaim();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.UpdateAssertedRelationshipSourceImpl <em>Update Asserted Relationship Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.UpdateAssertedRelationshipSourceImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateAssertedRelationshipSource()
		 * @generated
		 */
		EClass UPDATE_ASSERTED_RELATIONSHIP_SOURCE = eINSTANCE.getUpdateAssertedRelationshipSource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ASSERTED_RELATIONSHIP_SOURCE__SOURCE = eINSTANCE.getUpdateAssertedRelationshipSource_Source();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.UpdateAssertedRelationshipTargetImpl <em>Update Asserted Relationship Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.UpdateAssertedRelationshipTargetImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateAssertedRelationshipTarget()
		 * @generated
		 */
		EClass UPDATE_ASSERTED_RELATIONSHIP_TARGET = eINSTANCE.getUpdateAssertedRelationshipTarget();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET = eINSTANCE.getUpdateAssertedRelationshipTarget_Target();

		/**
		 * The meta object literal for the '{@link action_argumentation.impl.UpdateIsCounterAssertedRelationshipImpl <em>Update Is Counter Asserted Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_argumentation.impl.UpdateIsCounterAssertedRelationshipImpl
		 * @see action_argumentation.impl.Action_argumentationPackageImpl#getUpdateIsCounterAssertedRelationship()
		 * @generated
		 */
		EClass UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP = eINSTANCE.getUpdateIsCounterAssertedRelationship();

		/**
		 * The meta object literal for the '<em><b>Is Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER = eINSTANCE.getUpdateIsCounterAssertedRelationship_IsCounter();

	}

} //Action_argumentationPackage
