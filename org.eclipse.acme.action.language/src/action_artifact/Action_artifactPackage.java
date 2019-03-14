/**
 */
package action_artifact;

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
 * @see action_artifact.Action_artifactFactory
 * @model kind="package"
 * @generated
 */
public interface Action_artifactPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action_artifact";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme.action/1.0/artifact";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action_artifact_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_artifactPackage eINSTANCE = action_artifact.impl.Action_artifactPackageImpl.init();

	/**
	 * The meta object id for the '{@link action_artifact.impl.ArtifactActionPackageImpl <em>Artifact Action Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.ArtifactActionPackageImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getArtifactActionPackage()
	 * @generated
	 */
	int ARTIFACT_ACTION_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ACTION_PACKAGE__NAME = Action_basePackage.ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ACTION_PACKAGE__DESCRIPTION = Action_basePackage.ACTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ACTION_PACKAGE__GID = Action_basePackage.ACTION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ACTION_PACKAGE__ACTIONS = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Action Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Artifact Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ACTION_PACKAGE_FEATURE_COUNT = Action_basePackage.ACTION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Artifact Action Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_ACTION_PACKAGE_OPERATION_COUNT = Action_basePackage.ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateArtifactPackageImpl <em>Create Artifact Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateArtifactPackageImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackage()
	 * @generated
	 */
	int CREATE_ARTIFACT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Artifact Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateArtifactPackageInterfaceImpl <em>Create Artifact Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateArtifactPackageInterfaceImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackageInterface()
	 * @generated
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Artifact Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_INTERFACE_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateArtifactPackageBindingImpl <em>Create Artifact Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateArtifactPackageBindingImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackageBinding()
	 * @generated
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Artifact Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_BINDING_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateArtifactPackageGroupImpl <em>Create Artifact Package Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateArtifactPackageGroupImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackageGroup()
	 * @generated
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP__NAME = Action_basePackage.CREATE_ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP__DESCRIPTION = Action_basePackage.CREATE_ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP__GID = Action_basePackage.CREATE_ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP__SUB_ACTIONS = Action_basePackage.CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP__CREATED_ELEMENT = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP__CONTAINER = Action_basePackage.CREATE_ARTIFACT_ELEMENT__CONTAINER;

	/**
	 * The number of structural features of the '<em>Create Artifact Package Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP_FEATURE_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact Package Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_PACKAGE_GROUP_OPERATION_COUNT = Action_basePackage.CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateArtifactElementImpl <em>Update Artifact Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateArtifactElementImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactElement()
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
	 * The meta object id for the '{@link action_artifact.impl.DeleteArtifactElementImpl <em>Delete Artifact Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.DeleteArtifactElementImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getDeleteArtifactElement()
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
	 * The meta object id for the '{@link action_artifact.impl.CreateArtifactAssetImpl <em>Create Artifact Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateArtifactAssetImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactAsset()
	 * @generated
	 */
	int CREATE_ARTIFACT_ASSET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET__NAME = Action_basePackage.CREATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET__DESCRIPTION = Action_basePackage.CREATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET__GID = Action_basePackage.CREATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET__SUB_ACTIONS = Action_basePackage.CREATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET__CREATED_ELEMENT = Action_basePackage.CREATE__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Artifact Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_FEATURE_COUNT = Action_basePackage.CREATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_OPERATION_COUNT = Action_basePackage.CREATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateArtifactImpl <em>Create Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateArtifactImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifact()
	 * @generated
	 */
	int CREATE_ARTIFACT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateActivityImpl <em>Create Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateActivityImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateActivity()
	 * @generated
	 */
	int CREATE_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTIVITY__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTIVITY__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTIVITY__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTIVITY__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTIVITY__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTIVITY_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ACTIVITY_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateEventImpl <em>Create Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateEventImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateEvent()
	 * @generated
	 */
	int CREATE_EVENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EVENT_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateParticipantImpl <em>Create Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateParticipantImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateParticipant()
	 * @generated
	 */
	int CREATE_PARTICIPANT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTICIPANT__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTICIPANT__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTICIPANT__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTICIPANT__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTICIPANT__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTICIPANT_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PARTICIPANT_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateTechniqueImpl <em>Create Technique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateTechniqueImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateTechnique()
	 * @generated
	 */
	int CREATE_TECHNIQUE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TECHNIQUE__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TECHNIQUE__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TECHNIQUE__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TECHNIQUE__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TECHNIQUE__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TECHNIQUE_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Technique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TECHNIQUE_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateResourceImpl <em>Create Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateResourceImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateResource()
	 * @generated
	 */
	int CREATE_RESOURCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESOURCE__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESOURCE__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESOURCE__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESOURCE__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESOURCE__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESOURCE_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_RESOURCE_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreatePropertyImpl <em>Create Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreatePropertyImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateProperty()
	 * @generated
	 */
	int CREATE_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROPERTY__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROPERTY__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROPERTY__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROPERTY__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROPERTY__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROPERTY_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_PROPERTY_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.CreateArtifactAssetRelationshipImpl <em>Create Artifact Asset Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.CreateArtifactAssetRelationshipImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactAssetRelationship()
	 * @generated
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP__NAME = CREATE_ARTIFACT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP__DESCRIPTION = CREATE_ARTIFACT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP__GID = CREATE_ARTIFACT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP__SUB_ACTIONS = CREATE_ARTIFACT_ASSET__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP__CREATED_ELEMENT = CREATE_ARTIFACT_ASSET__CREATED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Create Artifact Asset Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP_FEATURE_COUNT = CREATE_ARTIFACT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Artifact Asset Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ASSET_RELATIONSHIP_OPERATION_COUNT = CREATE_ARTIFACT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdatePropertyPurposeImpl <em>Update Property Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdatePropertyPurposeImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdatePropertyPurpose()
	 * @generated
	 */
	int UPDATE_PROPERTY_PURPOSE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE__PURPOSE = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Property Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Property Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_PROPERTY_PURPOSE_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateArtifactAssetRelationshipSourceImpl <em>Update Artifact Asset Relationship Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateArtifactAssetRelationshipSourceImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactAssetRelationshipSource()
	 * @generated
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Artifact Asset Relationship Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Artifact Asset Relationship Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateArtifactAssetRelationshipTargetImpl <em>Update Artifact Asset Relationship Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateArtifactAssetRelationshipTargetImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactAssetRelationshipTarget()
	 * @generated
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Artifact Asset Relationship Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Artifact Asset Relationship Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateArtifactVersionImpl <em>Update Artifact Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateArtifactVersionImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactVersion()
	 * @generated
	 */
	int UPDATE_ARTIFACT_VERSION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION__VERSION = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Artifact Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Artifact Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_VERSION_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateArtifactDateImpl <em>Update Artifact Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateArtifactDateImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactDate()
	 * @generated
	 */
	int UPDATE_ARTIFACT_DATE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE__DATE = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Artifact Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Artifact Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ARTIFACT_DATE_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateActivityStartTimeImpl <em>Update Activity Start Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateActivityStartTimeImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateActivityStartTime()
	 * @generated
	 */
	int UPDATE_ACTIVITY_START_TIME = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME__START_TIME = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Activity Start Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Activity Start Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_START_TIME_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateActivityEndTimeImpl <em>Update Activity End Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateActivityEndTimeImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateActivityEndTime()
	 * @generated
	 */
	int UPDATE_ACTIVITY_END_TIME = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME__END_TIME = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Activity End Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Activity End Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ACTIVITY_END_TIME_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_artifact.impl.UpdateResourceOccurenceImpl <em>Update Resource Occurence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_artifact.impl.UpdateResourceOccurenceImpl
	 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateResourceOccurence()
	 * @generated
	 */
	int UPDATE_RESOURCE_OCCURENCE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE__NAME = Action_basePackage.UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE__DESCRIPTION = Action_basePackage.UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE__GID = Action_basePackage.UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE__SUB_ACTIONS = Action_basePackage.UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE__REFERENCED_ELEMENT = Action_basePackage.UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Occurence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE__OCCURENCE = Action_basePackage.UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Resource Occurence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE_FEATURE_COUNT = Action_basePackage.UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Resource Occurence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_RESOURCE_OCCURENCE_OPERATION_COUNT = Action_basePackage.UPDATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link action_artifact.ArtifactActionPackage <em>Artifact Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Action Package</em>'.
	 * @see action_artifact.ArtifactActionPackage
	 * @generated
	 */
	EClass getArtifactActionPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link action_artifact.ArtifactActionPackage#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see action_artifact.ArtifactActionPackage#getActions()
	 * @see #getArtifactActionPackage()
	 * @generated
	 */
	EReference getArtifactActionPackage_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link action_artifact.ArtifactActionPackage#getArtifactActionPackages <em>Artifact Action Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Action Packages</em>'.
	 * @see action_artifact.ArtifactActionPackage#getArtifactActionPackages()
	 * @see #getArtifactActionPackage()
	 * @generated
	 */
	EReference getArtifactActionPackage_ArtifactActionPackages();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateArtifactPackage <em>Create Artifact Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Package</em>'.
	 * @see action_artifact.CreateArtifactPackage
	 * @generated
	 */
	EClass getCreateArtifactPackage();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateArtifactPackageInterface <em>Create Artifact Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Package Interface</em>'.
	 * @see action_artifact.CreateArtifactPackageInterface
	 * @generated
	 */
	EClass getCreateArtifactPackageInterface();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateArtifactPackageBinding <em>Create Artifact Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Package Binding</em>'.
	 * @see action_artifact.CreateArtifactPackageBinding
	 * @generated
	 */
	EClass getCreateArtifactPackageBinding();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateArtifactPackageGroup <em>Create Artifact Package Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Package Group</em>'.
	 * @see action_artifact.CreateArtifactPackageGroup
	 * @generated
	 */
	EClass getCreateArtifactPackageGroup();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateArtifactElement <em>Update Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Artifact Element</em>'.
	 * @see action_artifact.UpdateArtifactElement
	 * @generated
	 */
	EClass getUpdateArtifactElement();

	/**
	 * Returns the meta object for the reference '{@link action_artifact.UpdateArtifactElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_artifact.UpdateArtifactElement#getArgumentationElement()
	 * @see #getUpdateArtifactElement()
	 * @generated
	 */
	EReference getUpdateArtifactElement_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link action_artifact.DeleteArtifactElement <em>Delete Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Artifact Element</em>'.
	 * @see action_artifact.DeleteArtifactElement
	 * @generated
	 */
	EClass getDeleteArtifactElement();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.DeleteArtifactElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_artifact.DeleteArtifactElement#getIndex()
	 * @see #getDeleteArtifactElement()
	 * @generated
	 */
	EAttribute getDeleteArtifactElement_Index();

	/**
	 * Returns the meta object for the reference '{@link action_artifact.DeleteArtifactElement#getArgumentationElement <em>Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Argumentation Element</em>'.
	 * @see action_artifact.DeleteArtifactElement#getArgumentationElement()
	 * @see #getDeleteArtifactElement()
	 * @generated
	 */
	EReference getDeleteArtifactElement_ArgumentationElement();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateArtifactAsset <em>Create Artifact Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Asset</em>'.
	 * @see action_artifact.CreateArtifactAsset
	 * @generated
	 */
	EClass getCreateArtifactAsset();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateArtifact <em>Create Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact</em>'.
	 * @see action_artifact.CreateArtifact
	 * @generated
	 */
	EClass getCreateArtifact();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateActivity <em>Create Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Activity</em>'.
	 * @see action_artifact.CreateActivity
	 * @generated
	 */
	EClass getCreateActivity();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateEvent <em>Create Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Event</em>'.
	 * @see action_artifact.CreateEvent
	 * @generated
	 */
	EClass getCreateEvent();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateParticipant <em>Create Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Participant</em>'.
	 * @see action_artifact.CreateParticipant
	 * @generated
	 */
	EClass getCreateParticipant();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateTechnique <em>Create Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Technique</em>'.
	 * @see action_artifact.CreateTechnique
	 * @generated
	 */
	EClass getCreateTechnique();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateResource <em>Create Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Resource</em>'.
	 * @see action_artifact.CreateResource
	 * @generated
	 */
	EClass getCreateResource();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateProperty <em>Create Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Property</em>'.
	 * @see action_artifact.CreateProperty
	 * @generated
	 */
	EClass getCreateProperty();

	/**
	 * Returns the meta object for class '{@link action_artifact.CreateArtifactAssetRelationship <em>Create Artifact Asset Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Asset Relationship</em>'.
	 * @see action_artifact.CreateArtifactAssetRelationship
	 * @generated
	 */
	EClass getCreateArtifactAssetRelationship();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdatePropertyPurpose <em>Update Property Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Property Purpose</em>'.
	 * @see action_artifact.UpdatePropertyPurpose
	 * @generated
	 */
	EClass getUpdatePropertyPurpose();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdatePropertyPurpose#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see action_artifact.UpdatePropertyPurpose#getPurpose()
	 * @see #getUpdatePropertyPurpose()
	 * @generated
	 */
	EAttribute getUpdatePropertyPurpose_Purpose();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateArtifactAssetRelationshipSource <em>Update Artifact Asset Relationship Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Artifact Asset Relationship Source</em>'.
	 * @see action_artifact.UpdateArtifactAssetRelationshipSource
	 * @generated
	 */
	EClass getUpdateArtifactAssetRelationshipSource();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdateArtifactAssetRelationshipSource#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_artifact.UpdateArtifactAssetRelationshipSource#getIndex()
	 * @see #getUpdateArtifactAssetRelationshipSource()
	 * @generated
	 */
	EAttribute getUpdateArtifactAssetRelationshipSource_Index();

	/**
	 * Returns the meta object for the reference '{@link action_artifact.UpdateArtifactAssetRelationshipSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see action_artifact.UpdateArtifactAssetRelationshipSource#getSource()
	 * @see #getUpdateArtifactAssetRelationshipSource()
	 * @generated
	 */
	EReference getUpdateArtifactAssetRelationshipSource_Source();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateArtifactAssetRelationshipTarget <em>Update Artifact Asset Relationship Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Artifact Asset Relationship Target</em>'.
	 * @see action_artifact.UpdateArtifactAssetRelationshipTarget
	 * @generated
	 */
	EClass getUpdateArtifactAssetRelationshipTarget();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdateArtifactAssetRelationshipTarget#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_artifact.UpdateArtifactAssetRelationshipTarget#getIndex()
	 * @see #getUpdateArtifactAssetRelationshipTarget()
	 * @generated
	 */
	EAttribute getUpdateArtifactAssetRelationshipTarget_Index();

	/**
	 * Returns the meta object for the reference '{@link action_artifact.UpdateArtifactAssetRelationshipTarget#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see action_artifact.UpdateArtifactAssetRelationshipTarget#getTarget()
	 * @see #getUpdateArtifactAssetRelationshipTarget()
	 * @generated
	 */
	EReference getUpdateArtifactAssetRelationshipTarget_Target();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateArtifactVersion <em>Update Artifact Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Artifact Version</em>'.
	 * @see action_artifact.UpdateArtifactVersion
	 * @generated
	 */
	EClass getUpdateArtifactVersion();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdateArtifactVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see action_artifact.UpdateArtifactVersion#getVersion()
	 * @see #getUpdateArtifactVersion()
	 * @generated
	 */
	EAttribute getUpdateArtifactVersion_Version();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateArtifactDate <em>Update Artifact Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Artifact Date</em>'.
	 * @see action_artifact.UpdateArtifactDate
	 * @generated
	 */
	EClass getUpdateArtifactDate();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdateArtifactDate#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see action_artifact.UpdateArtifactDate#getDate()
	 * @see #getUpdateArtifactDate()
	 * @generated
	 */
	EAttribute getUpdateArtifactDate_Date();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateActivityStartTime <em>Update Activity Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Activity Start Time</em>'.
	 * @see action_artifact.UpdateActivityStartTime
	 * @generated
	 */
	EClass getUpdateActivityStartTime();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdateActivityStartTime#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see action_artifact.UpdateActivityStartTime#getStartTime()
	 * @see #getUpdateActivityStartTime()
	 * @generated
	 */
	EAttribute getUpdateActivityStartTime_StartTime();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateActivityEndTime <em>Update Activity End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Activity End Time</em>'.
	 * @see action_artifact.UpdateActivityEndTime
	 * @generated
	 */
	EClass getUpdateActivityEndTime();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdateActivityEndTime#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see action_artifact.UpdateActivityEndTime#getEndTime()
	 * @see #getUpdateActivityEndTime()
	 * @generated
	 */
	EAttribute getUpdateActivityEndTime_EndTime();

	/**
	 * Returns the meta object for class '{@link action_artifact.UpdateResourceOccurence <em>Update Resource Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Resource Occurence</em>'.
	 * @see action_artifact.UpdateResourceOccurence
	 * @generated
	 */
	EClass getUpdateResourceOccurence();

	/**
	 * Returns the meta object for the attribute '{@link action_artifact.UpdateResourceOccurence#getOccurence <em>Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurence</em>'.
	 * @see action_artifact.UpdateResourceOccurence#getOccurence()
	 * @see #getUpdateResourceOccurence()
	 * @generated
	 */
	EAttribute getUpdateResourceOccurence_Occurence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Action_artifactFactory getAction_artifactFactory();

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
		 * The meta object literal for the '{@link action_artifact.impl.ArtifactActionPackageImpl <em>Artifact Action Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.ArtifactActionPackageImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getArtifactActionPackage()
		 * @generated
		 */
		EClass ARTIFACT_ACTION_PACKAGE = eINSTANCE.getArtifactActionPackage();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_ACTION_PACKAGE__ACTIONS = eINSTANCE.getArtifactActionPackage_Actions();

		/**
		 * The meta object literal for the '<em><b>Artifact Action Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES = eINSTANCE.getArtifactActionPackage_ArtifactActionPackages();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateArtifactPackageImpl <em>Create Artifact Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateArtifactPackageImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackage()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_PACKAGE = eINSTANCE.getCreateArtifactPackage();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateArtifactPackageInterfaceImpl <em>Create Artifact Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateArtifactPackageInterfaceImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackageInterface()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_PACKAGE_INTERFACE = eINSTANCE.getCreateArtifactPackageInterface();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateArtifactPackageBindingImpl <em>Create Artifact Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateArtifactPackageBindingImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackageBinding()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_PACKAGE_BINDING = eINSTANCE.getCreateArtifactPackageBinding();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateArtifactPackageGroupImpl <em>Create Artifact Package Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateArtifactPackageGroupImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactPackageGroup()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_PACKAGE_GROUP = eINSTANCE.getCreateArtifactPackageGroup();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateArtifactElementImpl <em>Update Artifact Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateArtifactElementImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactElement()
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
		 * The meta object literal for the '{@link action_artifact.impl.DeleteArtifactElementImpl <em>Delete Artifact Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.DeleteArtifactElementImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getDeleteArtifactElement()
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
		 * The meta object literal for the '{@link action_artifact.impl.CreateArtifactAssetImpl <em>Create Artifact Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateArtifactAssetImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactAsset()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_ASSET = eINSTANCE.getCreateArtifactAsset();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateArtifactImpl <em>Create Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateArtifactImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifact()
		 * @generated
		 */
		EClass CREATE_ARTIFACT = eINSTANCE.getCreateArtifact();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateActivityImpl <em>Create Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateActivityImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateActivity()
		 * @generated
		 */
		EClass CREATE_ACTIVITY = eINSTANCE.getCreateActivity();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateEventImpl <em>Create Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateEventImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateEvent()
		 * @generated
		 */
		EClass CREATE_EVENT = eINSTANCE.getCreateEvent();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateParticipantImpl <em>Create Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateParticipantImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateParticipant()
		 * @generated
		 */
		EClass CREATE_PARTICIPANT = eINSTANCE.getCreateParticipant();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateTechniqueImpl <em>Create Technique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateTechniqueImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateTechnique()
		 * @generated
		 */
		EClass CREATE_TECHNIQUE = eINSTANCE.getCreateTechnique();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateResourceImpl <em>Create Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateResourceImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateResource()
		 * @generated
		 */
		EClass CREATE_RESOURCE = eINSTANCE.getCreateResource();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreatePropertyImpl <em>Create Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreatePropertyImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateProperty()
		 * @generated
		 */
		EClass CREATE_PROPERTY = eINSTANCE.getCreateProperty();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.CreateArtifactAssetRelationshipImpl <em>Create Artifact Asset Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.CreateArtifactAssetRelationshipImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getCreateArtifactAssetRelationship()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_ASSET_RELATIONSHIP = eINSTANCE.getCreateArtifactAssetRelationship();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdatePropertyPurposeImpl <em>Update Property Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdatePropertyPurposeImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdatePropertyPurpose()
		 * @generated
		 */
		EClass UPDATE_PROPERTY_PURPOSE = eINSTANCE.getUpdatePropertyPurpose();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_PROPERTY_PURPOSE__PURPOSE = eINSTANCE.getUpdatePropertyPurpose_Purpose();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateArtifactAssetRelationshipSourceImpl <em>Update Artifact Asset Relationship Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateArtifactAssetRelationshipSourceImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactAssetRelationshipSource()
		 * @generated
		 */
		EClass UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE = eINSTANCE.getUpdateArtifactAssetRelationshipSource();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX = eINSTANCE.getUpdateArtifactAssetRelationshipSource_Index();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE = eINSTANCE.getUpdateArtifactAssetRelationshipSource_Source();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateArtifactAssetRelationshipTargetImpl <em>Update Artifact Asset Relationship Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateArtifactAssetRelationshipTargetImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactAssetRelationshipTarget()
		 * @generated
		 */
		EClass UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET = eINSTANCE.getUpdateArtifactAssetRelationshipTarget();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX = eINSTANCE.getUpdateArtifactAssetRelationshipTarget_Index();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET = eINSTANCE.getUpdateArtifactAssetRelationshipTarget_Target();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateArtifactVersionImpl <em>Update Artifact Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateArtifactVersionImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactVersion()
		 * @generated
		 */
		EClass UPDATE_ARTIFACT_VERSION = eINSTANCE.getUpdateArtifactVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ARTIFACT_VERSION__VERSION = eINSTANCE.getUpdateArtifactVersion_Version();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateArtifactDateImpl <em>Update Artifact Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateArtifactDateImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateArtifactDate()
		 * @generated
		 */
		EClass UPDATE_ARTIFACT_DATE = eINSTANCE.getUpdateArtifactDate();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ARTIFACT_DATE__DATE = eINSTANCE.getUpdateArtifactDate_Date();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateActivityStartTimeImpl <em>Update Activity Start Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateActivityStartTimeImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateActivityStartTime()
		 * @generated
		 */
		EClass UPDATE_ACTIVITY_START_TIME = eINSTANCE.getUpdateActivityStartTime();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ACTIVITY_START_TIME__START_TIME = eINSTANCE.getUpdateActivityStartTime_StartTime();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateActivityEndTimeImpl <em>Update Activity End Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateActivityEndTimeImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateActivityEndTime()
		 * @generated
		 */
		EClass UPDATE_ACTIVITY_END_TIME = eINSTANCE.getUpdateActivityEndTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ACTIVITY_END_TIME__END_TIME = eINSTANCE.getUpdateActivityEndTime_EndTime();

		/**
		 * The meta object literal for the '{@link action_artifact.impl.UpdateResourceOccurenceImpl <em>Update Resource Occurence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_artifact.impl.UpdateResourceOccurenceImpl
		 * @see action_artifact.impl.Action_artifactPackageImpl#getUpdateResourceOccurence()
		 * @generated
		 */
		EClass UPDATE_RESOURCE_OCCURENCE = eINSTANCE.getUpdateResourceOccurence();

		/**
		 * The meta object literal for the '<em><b>Occurence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_RESOURCE_OCCURENCE__OCCURENCE = eINSTANCE.getUpdateResourceOccurence_Occurence();

	}

} //Action_artifactPackage
