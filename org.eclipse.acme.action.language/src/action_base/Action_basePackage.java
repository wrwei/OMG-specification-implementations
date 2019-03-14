/**
 */
package action_base;

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
 * @see action_base.Action_baseFactory
 * @model kind="package"
 * @generated
 */
public interface Action_basePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "action_base";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.acme.action/1.0/base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "action_base_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_basePackage eINSTANCE = action_base.impl.Action_basePackageImpl.init();

	/**
	 * The meta object id for the '{@link action_base.impl.ActionElementImpl <em>Action Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.ActionElementImpl
	 * @see action_base.impl.Action_basePackageImpl#getActionElement()
	 * @generated
	 */
	int ACTION_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__GID = 2;

	/**
	 * The number of structural features of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link action_base.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.ActionImpl
	 * @see action_base.impl.Action_basePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = ACTION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GID = ACTION_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SUB_ACTIONS = ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ACTION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.RererenceActionImpl <em>Rererence Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.RererenceActionImpl
	 * @see action_base.impl.Action_basePackageImpl#getRererenceAction()
	 * @generated
	 */
	int RERERENCE_ACTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RERERENCE_ACTION__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RERERENCE_ACTION__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RERERENCE_ACTION__GID = ACTION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RERERENCE_ACTION__SUB_ACTIONS = ACTION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RERERENCE_ACTION__REFERENCED_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rererence Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RERERENCE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rererence Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RERERENCE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.CreateImpl
	 * @see action_base.impl.Action_basePackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__DESCRIPTION = ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__GID = ACTION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__SUB_ACTIONS = ACTION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CREATED_ELEMENT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.ReadImpl
	 * @see action_base.impl.Action_basePackageImpl#getRead()
	 * @generated
	 */
	int READ = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__NAME = RERERENCE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__DESCRIPTION = RERERENCE_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__GID = RERERENCE_ACTION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__SUB_ACTIONS = RERERENCE_ACTION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__REFERENCED_ELEMENT = RERERENCE_ACTION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = RERERENCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = RERERENCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.UpdateImpl <em>Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.UpdateImpl
	 * @see action_base.impl.Action_basePackageImpl#getUpdate()
	 * @generated
	 */
	int UPDATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__NAME = RERERENCE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__DESCRIPTION = RERERENCE_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__GID = RERERENCE_ACTION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__SUB_ACTIONS = RERERENCE_ACTION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE__REFERENCED_ELEMENT = RERERENCE_ACTION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_COUNT = RERERENCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_OPERATION_COUNT = RERERENCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.DeleteImpl
	 * @see action_base.impl.Action_basePackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__NAME = RERERENCE_ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DESCRIPTION = RERERENCE_ACTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__GID = RERERENCE_ACTION__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__SUB_ACTIONS = RERERENCE_ACTION__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__REFERENCED_ELEMENT = RERERENCE_ACTION__REFERENCED_ELEMENT;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = RERERENCE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_OPERATION_COUNT = RERERENCE_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.UpdateGIDImpl <em>Update GID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.UpdateGIDImpl
	 * @see action_base.impl.Action_basePackageImpl#getUpdateGID()
	 * @generated
	 */
	int UPDATE_GID = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID__VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update GID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update GID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_GID_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.UpdateNameImpl <em>Update Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.UpdateNameImpl
	 * @see action_base.impl.Action_basePackageImpl#getUpdateName()
	 * @generated
	 */
	int UPDATE_NAME = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME__VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_NAME_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.UpdateDescriptionImpl <em>Update Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.UpdateDescriptionImpl
	 * @see action_base.impl.Action_basePackageImpl#getUpdateDescription()
	 * @generated
	 */
	int UPDATE_DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION__VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Update Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_DESCRIPTION_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.UpdateImplementationConstraintImpl <em>Update Implementation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.UpdateImplementationConstraintImpl
	 * @see action_base.impl.Action_basePackageImpl#getUpdateImplementationConstraint()
	 * @generated
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT__VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT__INDEX = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Update Implementation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Update Implementation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_IMPLEMENTATION_CONSTRAINT_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.DeleteImplementationConstraintImpl <em>Delete Implementation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.DeleteImplementationConstraintImpl
	 * @see action_base.impl.Action_basePackageImpl#getDeleteImplementationConstraint()
	 * @generated
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT__NAME = DELETE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT__DESCRIPTION = DELETE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT__GID = DELETE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT__SUB_ACTIONS = DELETE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT__REFERENCED_ELEMENT = DELETE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT__INDEX = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Implementation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT_FEATURE_COUNT = DELETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete Implementation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_IMPLEMENTATION_CONSTRAINT_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.AttachNoteImpl <em>Attach Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.AttachNoteImpl
	 * @see action_base.impl.Action_basePackageImpl#getAttachNote()
	 * @generated
	 */
	int ATTACH_NOTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE__NOTE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attach Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attach Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_NOTE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.DeleteNoteImpl <em>Delete Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.DeleteNoteImpl
	 * @see action_base.impl.Action_basePackageImpl#getDeleteNote()
	 * @generated
	 */
	int DELETE_NOTE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE__NAME = DELETE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE__DESCRIPTION = DELETE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE__GID = DELETE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE__SUB_ACTIONS = DELETE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE__REFERENCED_ELEMENT = DELETE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE__INDEX = DELETE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE_FEATURE_COUNT = DELETE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_NOTE_OPERATION_COUNT = DELETE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.AddTaggedValueImpl <em>Add Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.AddTaggedValueImpl
	 * @see action_base.impl.Action_basePackageImpl#getAddTaggedValue()
	 * @generated
	 */
	int ADD_TAGGED_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE__KEY = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE__VALUE = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TAGGED_VALUE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.UpdateTaggedValueImpl <em>Update Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.UpdateTaggedValueImpl
	 * @see action_base.impl.Action_basePackageImpl#getUpdateTaggedValue()
	 * @generated
	 */
	int UPDATE_TAGGED_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__INDEX = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__KEY = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE__VALUE = UPDATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Update Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Update Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TAGGED_VALUE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.DeleteTaggedValueImpl <em>Delete Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.DeleteTaggedValueImpl
	 * @see action_base.impl.Action_basePackageImpl#getDeleteTaggedValue()
	 * @generated
	 */
	int DELETE_TAGGED_VALUE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE__INDEX = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delete Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TAGGED_VALUE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.MakeAbstractImpl <em>Make Abstract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.MakeAbstractImpl
	 * @see action_base.impl.Action_basePackageImpl#getMakeAbstract()
	 * @generated
	 */
	int MAKE_ABSTRACT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT__VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Make Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Make Abstract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_ABSTRACT_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.MakeCitationImpl <em>Make Citation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.MakeCitationImpl
	 * @see action_base.impl.Action_basePackageImpl#getMakeCitation()
	 * @generated
	 */
	int MAKE_CITATION = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION__VALUE = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Make Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Make Citation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_CITATION_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.CiteImpl <em>Cite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.CiteImpl
	 * @see action_base.impl.Action_basePackageImpl#getCite()
	 * @generated
	 */
	int CITE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__NAME = UPDATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__DESCRIPTION = UPDATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__GID = UPDATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__SUB_ACTIONS = UPDATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__REFERENCED_ELEMENT = UPDATE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Cited</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE__CITED = UPDATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_FEATURE_COUNT = UPDATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_OPERATION_COUNT = UPDATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link action_base.impl.CreateArtifactElementImpl <em>Create Artifact Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see action_base.impl.CreateArtifactElementImpl
	 * @see action_base.impl.Action_basePackageImpl#getCreateArtifactElement()
	 * @generated
	 */
	int CREATE_ARTIFACT_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT__NAME = CREATE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT__DESCRIPTION = CREATE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT__GID = CREATE__GID;

	/**
	 * The feature id for the '<em><b>Sub Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT__SUB_ACTIONS = CREATE__SUB_ACTIONS;

	/**
	 * The feature id for the '<em><b>Created Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT__CREATED_ELEMENT = CREATE__CREATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT__CONTAINER = CREATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Create Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT_FEATURE_COUNT = CREATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Create Artifact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ARTIFACT_ELEMENT_OPERATION_COUNT = CREATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link action_base.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Element</em>'.
	 * @see action_base.ActionElement
	 * @generated
	 */
	EClass getActionElement();

	/**
	 * Returns the meta object for the attribute '{@link action_base.ActionElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see action_base.ActionElement#getName()
	 * @see #getActionElement()
	 * @generated
	 */
	EAttribute getActionElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link action_base.ActionElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see action_base.ActionElement#getDescription()
	 * @see #getActionElement()
	 * @generated
	 */
	EAttribute getActionElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link action_base.ActionElement#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see action_base.ActionElement#getGid()
	 * @see #getActionElement()
	 * @generated
	 */
	EAttribute getActionElement_Gid();

	/**
	 * Returns the meta object for class '{@link action_base.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see action_base.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link action_base.Action#getSubActions <em>Sub Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Actions</em>'.
	 * @see action_base.Action#getSubActions()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_SubActions();

	/**
	 * Returns the meta object for class '{@link action_base.RererenceAction <em>Rererence Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rererence Action</em>'.
	 * @see action_base.RererenceAction
	 * @generated
	 */
	EClass getRererenceAction();

	/**
	 * Returns the meta object for the reference '{@link action_base.RererenceAction#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see action_base.RererenceAction#getReferencedElement()
	 * @see #getRererenceAction()
	 * @generated
	 */
	EReference getRererenceAction_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link action_base.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see action_base.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the containment reference '{@link action_base.Create#getCreatedElement <em>Created Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Created Element</em>'.
	 * @see action_base.Create#getCreatedElement()
	 * @see #getCreate()
	 * @generated
	 */
	EReference getCreate_CreatedElement();

	/**
	 * Returns the meta object for class '{@link action_base.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see action_base.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link action_base.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update</em>'.
	 * @see action_base.Update
	 * @generated
	 */
	EClass getUpdate();

	/**
	 * Returns the meta object for class '{@link action_base.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see action_base.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for class '{@link action_base.UpdateGID <em>Update GID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update GID</em>'.
	 * @see action_base.UpdateGID
	 * @generated
	 */
	EClass getUpdateGID();

	/**
	 * Returns the meta object for the attribute '{@link action_base.UpdateGID#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_base.UpdateGID#getValue()
	 * @see #getUpdateGID()
	 * @generated
	 */
	EAttribute getUpdateGID_Value();

	/**
	 * Returns the meta object for class '{@link action_base.UpdateName <em>Update Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Name</em>'.
	 * @see action_base.UpdateName
	 * @generated
	 */
	EClass getUpdateName();

	/**
	 * Returns the meta object for the attribute '{@link action_base.UpdateName#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_base.UpdateName#getValue()
	 * @see #getUpdateName()
	 * @generated
	 */
	EAttribute getUpdateName_Value();

	/**
	 * Returns the meta object for class '{@link action_base.UpdateDescription <em>Update Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Description</em>'.
	 * @see action_base.UpdateDescription
	 * @generated
	 */
	EClass getUpdateDescription();

	/**
	 * Returns the meta object for the attribute '{@link action_base.UpdateDescription#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_base.UpdateDescription#getValue()
	 * @see #getUpdateDescription()
	 * @generated
	 */
	EAttribute getUpdateDescription_Value();

	/**
	 * Returns the meta object for class '{@link action_base.UpdateImplementationConstraint <em>Update Implementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Implementation Constraint</em>'.
	 * @see action_base.UpdateImplementationConstraint
	 * @generated
	 */
	EClass getUpdateImplementationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link action_base.UpdateImplementationConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_base.UpdateImplementationConstraint#getValue()
	 * @see #getUpdateImplementationConstraint()
	 * @generated
	 */
	EAttribute getUpdateImplementationConstraint_Value();

	/**
	 * Returns the meta object for the attribute '{@link action_base.UpdateImplementationConstraint#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_base.UpdateImplementationConstraint#getIndex()
	 * @see #getUpdateImplementationConstraint()
	 * @generated
	 */
	EAttribute getUpdateImplementationConstraint_Index();

	/**
	 * Returns the meta object for class '{@link action_base.DeleteImplementationConstraint <em>Delete Implementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Implementation Constraint</em>'.
	 * @see action_base.DeleteImplementationConstraint
	 * @generated
	 */
	EClass getDeleteImplementationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link action_base.DeleteImplementationConstraint#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_base.DeleteImplementationConstraint#getIndex()
	 * @see #getDeleteImplementationConstraint()
	 * @generated
	 */
	EAttribute getDeleteImplementationConstraint_Index();

	/**
	 * Returns the meta object for class '{@link action_base.AttachNote <em>Attach Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach Note</em>'.
	 * @see action_base.AttachNote
	 * @generated
	 */
	EClass getAttachNote();

	/**
	 * Returns the meta object for the attribute '{@link action_base.AttachNote#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see action_base.AttachNote#getNote()
	 * @see #getAttachNote()
	 * @generated
	 */
	EAttribute getAttachNote_Note();

	/**
	 * Returns the meta object for class '{@link action_base.DeleteNote <em>Delete Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Note</em>'.
	 * @see action_base.DeleteNote
	 * @generated
	 */
	EClass getDeleteNote();

	/**
	 * Returns the meta object for the attribute '{@link action_base.DeleteNote#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_base.DeleteNote#getIndex()
	 * @see #getDeleteNote()
	 * @generated
	 */
	EAttribute getDeleteNote_Index();

	/**
	 * Returns the meta object for class '{@link action_base.AddTaggedValue <em>Add Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Tagged Value</em>'.
	 * @see action_base.AddTaggedValue
	 * @generated
	 */
	EClass getAddTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link action_base.AddTaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see action_base.AddTaggedValue#getKey()
	 * @see #getAddTaggedValue()
	 * @generated
	 */
	EAttribute getAddTaggedValue_Key();

	/**
	 * Returns the meta object for the containment reference '{@link action_base.AddTaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see action_base.AddTaggedValue#getValue()
	 * @see #getAddTaggedValue()
	 * @generated
	 */
	EReference getAddTaggedValue_Value();

	/**
	 * Returns the meta object for class '{@link action_base.UpdateTaggedValue <em>Update Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Tagged Value</em>'.
	 * @see action_base.UpdateTaggedValue
	 * @generated
	 */
	EClass getUpdateTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link action_base.UpdateTaggedValue#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_base.UpdateTaggedValue#getIndex()
	 * @see #getUpdateTaggedValue()
	 * @generated
	 */
	EAttribute getUpdateTaggedValue_Index();

	/**
	 * Returns the meta object for the attribute '{@link action_base.UpdateTaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see action_base.UpdateTaggedValue#getKey()
	 * @see #getUpdateTaggedValue()
	 * @generated
	 */
	EAttribute getUpdateTaggedValue_Key();

	/**
	 * Returns the meta object for the containment reference '{@link action_base.UpdateTaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see action_base.UpdateTaggedValue#getValue()
	 * @see #getUpdateTaggedValue()
	 * @generated
	 */
	EReference getUpdateTaggedValue_Value();

	/**
	 * Returns the meta object for class '{@link action_base.DeleteTaggedValue <em>Delete Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Tagged Value</em>'.
	 * @see action_base.DeleteTaggedValue
	 * @generated
	 */
	EClass getDeleteTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link action_base.DeleteTaggedValue#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see action_base.DeleteTaggedValue#getIndex()
	 * @see #getDeleteTaggedValue()
	 * @generated
	 */
	EAttribute getDeleteTaggedValue_Index();

	/**
	 * Returns the meta object for class '{@link action_base.MakeAbstract <em>Make Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make Abstract</em>'.
	 * @see action_base.MakeAbstract
	 * @generated
	 */
	EClass getMakeAbstract();

	/**
	 * Returns the meta object for the attribute '{@link action_base.MakeAbstract#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_base.MakeAbstract#isValue()
	 * @see #getMakeAbstract()
	 * @generated
	 */
	EAttribute getMakeAbstract_Value();

	/**
	 * Returns the meta object for class '{@link action_base.MakeCitation <em>Make Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make Citation</em>'.
	 * @see action_base.MakeCitation
	 * @generated
	 */
	EClass getMakeCitation();

	/**
	 * Returns the meta object for the attribute '{@link action_base.MakeCitation#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see action_base.MakeCitation#isValue()
	 * @see #getMakeCitation()
	 * @generated
	 */
	EAttribute getMakeCitation_Value();

	/**
	 * Returns the meta object for class '{@link action_base.Cite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cite</em>'.
	 * @see action_base.Cite
	 * @generated
	 */
	EClass getCite();

	/**
	 * Returns the meta object for the reference '{@link action_base.Cite#getCited <em>Cited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cited</em>'.
	 * @see action_base.Cite#getCited()
	 * @see #getCite()
	 * @generated
	 */
	EReference getCite_Cited();

	/**
	 * Returns the meta object for class '{@link action_base.CreateArtifactElement <em>Create Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Artifact Element</em>'.
	 * @see action_base.CreateArtifactElement
	 * @generated
	 */
	EClass getCreateArtifactElement();

	/**
	 * Returns the meta object for the reference '{@link action_base.CreateArtifactElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see action_base.CreateArtifactElement#getContainer()
	 * @see #getCreateArtifactElement()
	 * @generated
	 */
	EReference getCreateArtifactElement_Container();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Action_baseFactory getAction_baseFactory();

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
		 * The meta object literal for the '{@link action_base.impl.ActionElementImpl <em>Action Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.ActionElementImpl
		 * @see action_base.impl.Action_basePackageImpl#getActionElement()
		 * @generated
		 */
		EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ELEMENT__NAME = eINSTANCE.getActionElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ELEMENT__DESCRIPTION = eINSTANCE.getActionElement_Description();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ELEMENT__GID = eINSTANCE.getActionElement_Gid();

		/**
		 * The meta object literal for the '{@link action_base.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.ActionImpl
		 * @see action_base.impl.Action_basePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Sub Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__SUB_ACTIONS = eINSTANCE.getAction_SubActions();

		/**
		 * The meta object literal for the '{@link action_base.impl.RererenceActionImpl <em>Rererence Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.RererenceActionImpl
		 * @see action_base.impl.Action_basePackageImpl#getRererenceAction()
		 * @generated
		 */
		EClass RERERENCE_ACTION = eINSTANCE.getRererenceAction();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RERERENCE_ACTION__REFERENCED_ELEMENT = eINSTANCE.getRererenceAction_ReferencedElement();

		/**
		 * The meta object literal for the '{@link action_base.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.CreateImpl
		 * @see action_base.impl.Action_basePackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Created Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE__CREATED_ELEMENT = eINSTANCE.getCreate_CreatedElement();

		/**
		 * The meta object literal for the '{@link action_base.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.ReadImpl
		 * @see action_base.impl.Action_basePackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '{@link action_base.impl.UpdateImpl <em>Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.UpdateImpl
		 * @see action_base.impl.Action_basePackageImpl#getUpdate()
		 * @generated
		 */
		EClass UPDATE = eINSTANCE.getUpdate();

		/**
		 * The meta object literal for the '{@link action_base.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.DeleteImpl
		 * @see action_base.impl.Action_basePackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '{@link action_base.impl.UpdateGIDImpl <em>Update GID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.UpdateGIDImpl
		 * @see action_base.impl.Action_basePackageImpl#getUpdateGID()
		 * @generated
		 */
		EClass UPDATE_GID = eINSTANCE.getUpdateGID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_GID__VALUE = eINSTANCE.getUpdateGID_Value();

		/**
		 * The meta object literal for the '{@link action_base.impl.UpdateNameImpl <em>Update Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.UpdateNameImpl
		 * @see action_base.impl.Action_basePackageImpl#getUpdateName()
		 * @generated
		 */
		EClass UPDATE_NAME = eINSTANCE.getUpdateName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_NAME__VALUE = eINSTANCE.getUpdateName_Value();

		/**
		 * The meta object literal for the '{@link action_base.impl.UpdateDescriptionImpl <em>Update Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.UpdateDescriptionImpl
		 * @see action_base.impl.Action_basePackageImpl#getUpdateDescription()
		 * @generated
		 */
		EClass UPDATE_DESCRIPTION = eINSTANCE.getUpdateDescription();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_DESCRIPTION__VALUE = eINSTANCE.getUpdateDescription_Value();

		/**
		 * The meta object literal for the '{@link action_base.impl.UpdateImplementationConstraintImpl <em>Update Implementation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.UpdateImplementationConstraintImpl
		 * @see action_base.impl.Action_basePackageImpl#getUpdateImplementationConstraint()
		 * @generated
		 */
		EClass UPDATE_IMPLEMENTATION_CONSTRAINT = eINSTANCE.getUpdateImplementationConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_IMPLEMENTATION_CONSTRAINT__VALUE = eINSTANCE.getUpdateImplementationConstraint_Value();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_IMPLEMENTATION_CONSTRAINT__INDEX = eINSTANCE.getUpdateImplementationConstraint_Index();

		/**
		 * The meta object literal for the '{@link action_base.impl.DeleteImplementationConstraintImpl <em>Delete Implementation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.DeleteImplementationConstraintImpl
		 * @see action_base.impl.Action_basePackageImpl#getDeleteImplementationConstraint()
		 * @generated
		 */
		EClass DELETE_IMPLEMENTATION_CONSTRAINT = eINSTANCE.getDeleteImplementationConstraint();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_IMPLEMENTATION_CONSTRAINT__INDEX = eINSTANCE.getDeleteImplementationConstraint_Index();

		/**
		 * The meta object literal for the '{@link action_base.impl.AttachNoteImpl <em>Attach Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.AttachNoteImpl
		 * @see action_base.impl.Action_basePackageImpl#getAttachNote()
		 * @generated
		 */
		EClass ATTACH_NOTE = eINSTANCE.getAttachNote();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACH_NOTE__NOTE = eINSTANCE.getAttachNote_Note();

		/**
		 * The meta object literal for the '{@link action_base.impl.DeleteNoteImpl <em>Delete Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.DeleteNoteImpl
		 * @see action_base.impl.Action_basePackageImpl#getDeleteNote()
		 * @generated
		 */
		EClass DELETE_NOTE = eINSTANCE.getDeleteNote();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_NOTE__INDEX = eINSTANCE.getDeleteNote_Index();

		/**
		 * The meta object literal for the '{@link action_base.impl.AddTaggedValueImpl <em>Add Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.AddTaggedValueImpl
		 * @see action_base.impl.Action_basePackageImpl#getAddTaggedValue()
		 * @generated
		 */
		EClass ADD_TAGGED_VALUE = eINSTANCE.getAddTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TAGGED_VALUE__KEY = eINSTANCE.getAddTaggedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_TAGGED_VALUE__VALUE = eINSTANCE.getAddTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link action_base.impl.UpdateTaggedValueImpl <em>Update Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.UpdateTaggedValueImpl
		 * @see action_base.impl.Action_basePackageImpl#getUpdateTaggedValue()
		 * @generated
		 */
		EClass UPDATE_TAGGED_VALUE = eINSTANCE.getUpdateTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TAGGED_VALUE__INDEX = eINSTANCE.getUpdateTaggedValue_Index();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TAGGED_VALUE__KEY = eINSTANCE.getUpdateTaggedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TAGGED_VALUE__VALUE = eINSTANCE.getUpdateTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link action_base.impl.DeleteTaggedValueImpl <em>Delete Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.DeleteTaggedValueImpl
		 * @see action_base.impl.Action_basePackageImpl#getDeleteTaggedValue()
		 * @generated
		 */
		EClass DELETE_TAGGED_VALUE = eINSTANCE.getDeleteTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_TAGGED_VALUE__INDEX = eINSTANCE.getDeleteTaggedValue_Index();

		/**
		 * The meta object literal for the '{@link action_base.impl.MakeAbstractImpl <em>Make Abstract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.MakeAbstractImpl
		 * @see action_base.impl.Action_basePackageImpl#getMakeAbstract()
		 * @generated
		 */
		EClass MAKE_ABSTRACT = eINSTANCE.getMakeAbstract();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKE_ABSTRACT__VALUE = eINSTANCE.getMakeAbstract_Value();

		/**
		 * The meta object literal for the '{@link action_base.impl.MakeCitationImpl <em>Make Citation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.MakeCitationImpl
		 * @see action_base.impl.Action_basePackageImpl#getMakeCitation()
		 * @generated
		 */
		EClass MAKE_CITATION = eINSTANCE.getMakeCitation();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAKE_CITATION__VALUE = eINSTANCE.getMakeCitation_Value();

		/**
		 * The meta object literal for the '{@link action_base.impl.CiteImpl <em>Cite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.CiteImpl
		 * @see action_base.impl.Action_basePackageImpl#getCite()
		 * @generated
		 */
		EClass CITE = eINSTANCE.getCite();

		/**
		 * The meta object literal for the '<em><b>Cited</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITE__CITED = eINSTANCE.getCite_Cited();

		/**
		 * The meta object literal for the '{@link action_base.impl.CreateArtifactElementImpl <em>Create Artifact Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see action_base.impl.CreateArtifactElementImpl
		 * @see action_base.impl.Action_basePackageImpl#getCreateArtifactElement()
		 * @generated
		 */
		EClass CREATE_ARTIFACT_ELEMENT = eINSTANCE.getCreateArtifactElement();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_ARTIFACT_ELEMENT__CONTAINER = eINSTANCE.getCreateArtifactElement_Container();

	}

} //Action_basePackage
