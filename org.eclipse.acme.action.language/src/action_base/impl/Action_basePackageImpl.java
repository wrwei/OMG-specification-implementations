/**
 */
package action_base.impl;

import action_base.Action;
import action_base.ActionElement;
import action_base.Action_baseFactory;
import action_base.Action_basePackage;
import action_base.AddTaggedValue;
import action_base.AttachNote;
import action_base.Cite;
import action_base.Create;
import action_base.CreateArtifactElement;
import action_base.Delete;
import action_base.DeleteImplementationConstraint;
import action_base.DeleteNote;
import action_base.DeleteTaggedValue;
import action_base.MakeAbstract;
import action_base.MakeCitation;
import action_base.Read;
import action_base.RererenceAction;
import action_base.Update;
import action_base.UpdateDescription;
import action_base.UpdateGID;
import action_base.UpdateImplementationConstraint;
import action_base.UpdateName;
import action_base.UpdateTaggedValue;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Action_basePackageImpl extends EPackageImpl implements Action_basePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rererenceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateGIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateImplementationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteImplementationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addTaggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTaggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteTaggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeCitationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see action_base.Action_basePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Action_basePackageImpl() {
		super(eNS_URI, Action_baseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Action_basePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Action_basePackage init() {
		if (isInited) return (Action_basePackage)EPackage.Registry.INSTANCE.getEPackage(Action_basePackage.eNS_URI);

		// Obtain or create and register package
		Action_basePackageImpl theAction_basePackage = (Action_basePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Action_basePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Action_basePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Base_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theAction_basePackage.createPackageContents();

		// Initialize created meta-data
		theAction_basePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAction_basePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Action_basePackage.eNS_URI, theAction_basePackage);
		return theAction_basePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionElement() {
		return actionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionElement_Name() {
		return (EAttribute)actionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionElement_Description() {
		return (EAttribute)actionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionElement_Gid() {
		return (EAttribute)actionElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_SubActions() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRererenceAction() {
		return rererenceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRererenceAction_ReferencedElement() {
		return (EReference)rererenceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreate_CreatedElement() {
		return (EReference)createEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRead() {
		return readEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdate() {
		return updateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelete() {
		return deleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateGID() {
		return updateGIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateGID_Value() {
		return (EAttribute)updateGIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateName() {
		return updateNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateName_Value() {
		return (EAttribute)updateNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateDescription() {
		return updateDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateDescription_Value() {
		return (EAttribute)updateDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateImplementationConstraint() {
		return updateImplementationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateImplementationConstraint_Value() {
		return (EAttribute)updateImplementationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateImplementationConstraint_Index() {
		return (EAttribute)updateImplementationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteImplementationConstraint() {
		return deleteImplementationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteImplementationConstraint_Index() {
		return (EAttribute)deleteImplementationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachNote() {
		return attachNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachNote_Note() {
		return (EAttribute)attachNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteNote() {
		return deleteNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteNote_Index() {
		return (EAttribute)deleteNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddTaggedValue() {
		return addTaggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddTaggedValue_Key() {
		return (EAttribute)addTaggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddTaggedValue_Value() {
		return (EReference)addTaggedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateTaggedValue() {
		return updateTaggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTaggedValue_Index() {
		return (EAttribute)updateTaggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTaggedValue_Key() {
		return (EAttribute)updateTaggedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateTaggedValue_Value() {
		return (EReference)updateTaggedValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteTaggedValue() {
		return deleteTaggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteTaggedValue_Index() {
		return (EAttribute)deleteTaggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakeAbstract() {
		return makeAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMakeAbstract_Value() {
		return (EAttribute)makeAbstractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakeCitation() {
		return makeCitationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMakeCitation_Value() {
		return (EAttribute)makeCitationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCite() {
		return citeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCite_Cited() {
		return (EReference)citeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifactElement() {
		return createArtifactElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateArtifactElement_Container() {
		return (EReference)createArtifactElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_baseFactory getAction_baseFactory() {
		return (Action_baseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		actionElementEClass = createEClass(ACTION_ELEMENT);
		createEAttribute(actionElementEClass, ACTION_ELEMENT__NAME);
		createEAttribute(actionElementEClass, ACTION_ELEMENT__DESCRIPTION);
		createEAttribute(actionElementEClass, ACTION_ELEMENT__GID);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__SUB_ACTIONS);

		rererenceActionEClass = createEClass(RERERENCE_ACTION);
		createEReference(rererenceActionEClass, RERERENCE_ACTION__REFERENCED_ELEMENT);

		createEClass = createEClass(CREATE);
		createEReference(createEClass, CREATE__CREATED_ELEMENT);

		readEClass = createEClass(READ);

		updateEClass = createEClass(UPDATE);

		deleteEClass = createEClass(DELETE);

		updateGIDEClass = createEClass(UPDATE_GID);
		createEAttribute(updateGIDEClass, UPDATE_GID__VALUE);

		updateNameEClass = createEClass(UPDATE_NAME);
		createEAttribute(updateNameEClass, UPDATE_NAME__VALUE);

		updateDescriptionEClass = createEClass(UPDATE_DESCRIPTION);
		createEAttribute(updateDescriptionEClass, UPDATE_DESCRIPTION__VALUE);

		updateImplementationConstraintEClass = createEClass(UPDATE_IMPLEMENTATION_CONSTRAINT);
		createEAttribute(updateImplementationConstraintEClass, UPDATE_IMPLEMENTATION_CONSTRAINT__VALUE);
		createEAttribute(updateImplementationConstraintEClass, UPDATE_IMPLEMENTATION_CONSTRAINT__INDEX);

		deleteImplementationConstraintEClass = createEClass(DELETE_IMPLEMENTATION_CONSTRAINT);
		createEAttribute(deleteImplementationConstraintEClass, DELETE_IMPLEMENTATION_CONSTRAINT__INDEX);

		attachNoteEClass = createEClass(ATTACH_NOTE);
		createEAttribute(attachNoteEClass, ATTACH_NOTE__NOTE);

		deleteNoteEClass = createEClass(DELETE_NOTE);
		createEAttribute(deleteNoteEClass, DELETE_NOTE__INDEX);

		addTaggedValueEClass = createEClass(ADD_TAGGED_VALUE);
		createEAttribute(addTaggedValueEClass, ADD_TAGGED_VALUE__KEY);
		createEReference(addTaggedValueEClass, ADD_TAGGED_VALUE__VALUE);

		updateTaggedValueEClass = createEClass(UPDATE_TAGGED_VALUE);
		createEAttribute(updateTaggedValueEClass, UPDATE_TAGGED_VALUE__INDEX);
		createEAttribute(updateTaggedValueEClass, UPDATE_TAGGED_VALUE__KEY);
		createEReference(updateTaggedValueEClass, UPDATE_TAGGED_VALUE__VALUE);

		deleteTaggedValueEClass = createEClass(DELETE_TAGGED_VALUE);
		createEAttribute(deleteTaggedValueEClass, DELETE_TAGGED_VALUE__INDEX);

		makeAbstractEClass = createEClass(MAKE_ABSTRACT);
		createEAttribute(makeAbstractEClass, MAKE_ABSTRACT__VALUE);

		makeCitationEClass = createEClass(MAKE_CITATION);
		createEAttribute(makeCitationEClass, MAKE_CITATION__VALUE);

		citeEClass = createEClass(CITE);
		createEReference(citeEClass, CITE__CITED);

		createArtifactElementEClass = createEClass(CREATE_ARTIFACT_ELEMENT);
		createEReference(createArtifactElementEClass, CREATE_ARTIFACT_ELEMENT__CONTAINER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		actionEClass.getESuperTypes().add(this.getActionElement());
		rererenceActionEClass.getESuperTypes().add(this.getAction());
		createEClass.getESuperTypes().add(this.getAction());
		readEClass.getESuperTypes().add(this.getRererenceAction());
		updateEClass.getESuperTypes().add(this.getRererenceAction());
		deleteEClass.getESuperTypes().add(this.getRererenceAction());
		updateGIDEClass.getESuperTypes().add(this.getUpdate());
		updateNameEClass.getESuperTypes().add(this.getUpdate());
		updateDescriptionEClass.getESuperTypes().add(this.getUpdate());
		updateImplementationConstraintEClass.getESuperTypes().add(this.getUpdate());
		deleteImplementationConstraintEClass.getESuperTypes().add(this.getDelete());
		attachNoteEClass.getESuperTypes().add(this.getUpdate());
		deleteNoteEClass.getESuperTypes().add(this.getDelete());
		addTaggedValueEClass.getESuperTypes().add(this.getUpdate());
		updateTaggedValueEClass.getESuperTypes().add(this.getUpdate());
		deleteTaggedValueEClass.getESuperTypes().add(this.getUpdate());
		makeAbstractEClass.getESuperTypes().add(this.getUpdate());
		makeCitationEClass.getESuperTypes().add(this.getUpdate());
		citeEClass.getESuperTypes().add(this.getUpdate());
		createArtifactElementEClass.getESuperTypes().add(this.getCreate());

		// Initialize classes, features, and operations; add parameters
		initEClass(actionElementEClass, ActionElement.class, "ActionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ActionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionElement_Gid(), ecorePackage.getEString(), "gid", null, 0, 1, ActionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_SubActions(), this.getAction(), null, "subActions", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rererenceActionEClass, RererenceAction.class, "RererenceAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRererenceAction_ReferencedElement(), theBase_Package.getModelElement(), null, "referencedElement", null, 0, 1, RererenceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createEClass, Create.class, "Create", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreate_CreatedElement(), theBase_Package.getModelElement(), null, "createdElement", null, 0, 1, Create.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateEClass, Update.class, "Update", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteEClass, Delete.class, "Delete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateGIDEClass, UpdateGID.class, "UpdateGID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateGID_Value(), ecorePackage.getEString(), "value", null, 0, 1, UpdateGID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateNameEClass, UpdateName.class, "UpdateName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateName_Value(), ecorePackage.getEString(), "value", null, 0, 1, UpdateName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateDescriptionEClass, UpdateDescription.class, "UpdateDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateDescription_Value(), ecorePackage.getEString(), "value", null, 0, 1, UpdateDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateImplementationConstraintEClass, UpdateImplementationConstraint.class, "UpdateImplementationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateImplementationConstraint_Value(), ecorePackage.getEString(), "value", null, 0, 1, UpdateImplementationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateImplementationConstraint_Index(), ecorePackage.getEInt(), "index", null, 0, 1, UpdateImplementationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteImplementationConstraintEClass, DeleteImplementationConstraint.class, "DeleteImplementationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteImplementationConstraint_Index(), ecorePackage.getEInt(), "index", null, 0, 1, DeleteImplementationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachNoteEClass, AttachNote.class, "AttachNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachNote_Note(), ecorePackage.getEString(), "note", null, 0, 1, AttachNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteNoteEClass, DeleteNote.class, "DeleteNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteNote_Index(), ecorePackage.getEInt(), "index", null, 0, 1, DeleteNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addTaggedValueEClass, AddTaggedValue.class, "AddTaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddTaggedValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, AddTaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddTaggedValue_Value(), theBase_Package.getModelElement(), null, "value", null, 0, 1, AddTaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateTaggedValueEClass, UpdateTaggedValue.class, "UpdateTaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateTaggedValue_Index(), ecorePackage.getEInt(), "index", null, 0, 1, UpdateTaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateTaggedValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, UpdateTaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateTaggedValue_Value(), theBase_Package.getModelElement(), null, "value", null, 0, 1, UpdateTaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteTaggedValueEClass, DeleteTaggedValue.class, "DeleteTaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteTaggedValue_Index(), ecorePackage.getEInt(), "index", null, 0, 1, DeleteTaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(makeAbstractEClass, MakeAbstract.class, "MakeAbstract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMakeAbstract_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, MakeAbstract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(makeCitationEClass, MakeCitation.class, "MakeCitation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMakeCitation_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, MakeCitation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citeEClass, Cite.class, "Cite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCite_Cited(), theBase_Package.getModelElement(), null, "cited", null, 0, 1, Cite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createArtifactElementEClass, CreateArtifactElement.class, "CreateArtifactElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateArtifactElement_Container(), theBase_Package.getModelElement(), null, "container", null, 0, 1, CreateArtifactElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Action_basePackageImpl
