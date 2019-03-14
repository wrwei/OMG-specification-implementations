/**
 */
package action_terminology.impl;

import action_base.Action_basePackage;

import action_terminology.Action_terminologyFactory;
import action_terminology.Action_terminologyPackage;
import action_terminology.CreateCategory;
import action_terminology.CreateExpression;
import action_terminology.CreateExpressionElement;
import action_terminology.CreateTerm;
import action_terminology.CreateTerminologyAsset;
import action_terminology.CreateTerminologyPackage;
import action_terminology.CreateTerminologyPackageBinding;
import action_terminology.CreateTerminologyPackageGroup;
import action_terminology.CreateTerminologyPackageInterface;
import action_terminology.DeleteArtifactElement;
import action_terminology.TerminologyActionPackage;
import action_terminology.UpdateArtifactElement;
import action_terminology.UpdateExpressionElementCategory;
import action_terminology.UpdateExpressionElementExpression;
import action_terminology.UpdateExpressionElementValue;
import action_terminology.UpdateTermOrigin;
import action_terminology.updateTermExternalReference;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Action_terminologyPackageImpl extends EPackageImpl implements Action_terminologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyActionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTerminologyPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTerminologyPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTerminologyPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTerminologyPackageGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateArtifactElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteArtifactElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTerminologyAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createExpressionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateExpressionElementCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateExpressionElementValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateExpressionElementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTermExternalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTermOriginEClass = null;

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
	 * @see action_terminology.Action_terminologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Action_terminologyPackageImpl() {
		super(eNS_URI, Action_terminologyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Action_terminologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Action_terminologyPackage init() {
		if (isInited) return (Action_terminologyPackage)EPackage.Registry.INSTANCE.getEPackage(Action_terminologyPackage.eNS_URI);

		// Obtain or create and register package
		Action_terminologyPackageImpl theAction_terminologyPackage = (Action_terminologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Action_terminologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Action_terminologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Action_basePackage.eINSTANCE.eClass();
		Terminology_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theAction_terminologyPackage.createPackageContents();

		// Initialize created meta-data
		theAction_terminologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAction_terminologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Action_terminologyPackage.eNS_URI, theAction_terminologyPackage);
		return theAction_terminologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyActionPackage() {
		return terminologyActionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyActionPackage_Actions() {
		return (EReference)terminologyActionPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyActionPackage_TerminologyActionPackages() {
		return (EReference)terminologyActionPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTerminologyPackage() {
		return createTerminologyPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTerminologyPackageInterface() {
		return createTerminologyPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTerminologyPackageBinding() {
		return createTerminologyPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTerminologyPackageGroup() {
		return createTerminologyPackageGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateArtifactElement() {
		return updateArtifactElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateArtifactElement_ArgumentationElement() {
		return (EReference)updateArtifactElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteArtifactElement() {
		return deleteArtifactElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteArtifactElement_Index() {
		return (EAttribute)deleteArtifactElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteArtifactElement_ArgumentationElement() {
		return (EReference)deleteArtifactElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTerminologyAsset() {
		return createTerminologyAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateCategory() {
		return createCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateExpressionElement() {
		return createExpressionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateExpressionElement_Value() {
		return (EAttribute)createExpressionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateExpression() {
		return createExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTerm() {
		return createTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateExpressionElementCategory() {
		return updateExpressionElementCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateExpressionElementCategory_Category() {
		return (EReference)updateExpressionElementCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateExpressionElementValue() {
		return updateExpressionElementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateExpressionElementValue_Value() {
		return (EAttribute)updateExpressionElementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateExpressionElementExpression() {
		return updateExpressionElementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateExpressionElementExpression_Element() {
		return (EReference)updateExpressionElementExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getupdateTermExternalReference() {
		return updateTermExternalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getupdateTermExternalReference_ExternalReference() {
		return (EAttribute)updateTermExternalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateTermOrigin() {
		return updateTermOriginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateTermOrigin_Origin() {
		return (EReference)updateTermOriginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_terminologyFactory getAction_terminologyFactory() {
		return (Action_terminologyFactory)getEFactoryInstance();
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
		terminologyActionPackageEClass = createEClass(TERMINOLOGY_ACTION_PACKAGE);
		createEReference(terminologyActionPackageEClass, TERMINOLOGY_ACTION_PACKAGE__ACTIONS);
		createEReference(terminologyActionPackageEClass, TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES);

		createTerminologyPackageEClass = createEClass(CREATE_TERMINOLOGY_PACKAGE);

		createTerminologyPackageInterfaceEClass = createEClass(CREATE_TERMINOLOGY_PACKAGE_INTERFACE);

		createTerminologyPackageBindingEClass = createEClass(CREATE_TERMINOLOGY_PACKAGE_BINDING);

		createTerminologyPackageGroupEClass = createEClass(CREATE_TERMINOLOGY_PACKAGE_GROUP);

		updateArtifactElementEClass = createEClass(UPDATE_ARTIFACT_ELEMENT);
		createEReference(updateArtifactElementEClass, UPDATE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT);

		deleteArtifactElementEClass = createEClass(DELETE_ARTIFACT_ELEMENT);
		createEAttribute(deleteArtifactElementEClass, DELETE_ARTIFACT_ELEMENT__INDEX);
		createEReference(deleteArtifactElementEClass, DELETE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT);

		createTerminologyAssetEClass = createEClass(CREATE_TERMINOLOGY_ASSET);

		createCategoryEClass = createEClass(CREATE_CATEGORY);

		createExpressionElementEClass = createEClass(CREATE_EXPRESSION_ELEMENT);
		createEAttribute(createExpressionElementEClass, CREATE_EXPRESSION_ELEMENT__VALUE);

		createExpressionEClass = createEClass(CREATE_EXPRESSION);

		createTermEClass = createEClass(CREATE_TERM);

		updateExpressionElementCategoryEClass = createEClass(UPDATE_EXPRESSION_ELEMENT_CATEGORY);
		createEReference(updateExpressionElementCategoryEClass, UPDATE_EXPRESSION_ELEMENT_CATEGORY__CATEGORY);

		updateExpressionElementValueEClass = createEClass(UPDATE_EXPRESSION_ELEMENT_VALUE);
		createEAttribute(updateExpressionElementValueEClass, UPDATE_EXPRESSION_ELEMENT_VALUE__VALUE);

		updateExpressionElementExpressionEClass = createEClass(UPDATE_EXPRESSION_ELEMENT_EXPRESSION);
		createEReference(updateExpressionElementExpressionEClass, UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT);

		updateTermExternalReferenceEClass = createEClass(UPDATE_TERM_EXTERNAL_REFERENCE);
		createEAttribute(updateTermExternalReferenceEClass, UPDATE_TERM_EXTERNAL_REFERENCE__EXTERNAL_REFERENCE);

		updateTermOriginEClass = createEClass(UPDATE_TERM_ORIGIN);
		createEReference(updateTermOriginEClass, UPDATE_TERM_ORIGIN__ORIGIN);
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
		Action_basePackage theAction_basePackage = (Action_basePackage)EPackage.Registry.INSTANCE.getEPackage(Action_basePackage.eNS_URI);
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Terminology_Package theTerminology_Package = (Terminology_Package)EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		terminologyActionPackageEClass.getESuperTypes().add(theAction_basePackage.getActionElement());
		createTerminologyPackageEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createTerminologyPackageInterfaceEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createTerminologyPackageBindingEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createTerminologyPackageGroupEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		updateArtifactElementEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		deleteArtifactElementEClass.getESuperTypes().add(theAction_basePackage.getDelete());
		createTerminologyAssetEClass.getESuperTypes().add(theAction_basePackage.getCreate());
		createCategoryEClass.getESuperTypes().add(this.getCreateTerminologyAsset());
		createExpressionElementEClass.getESuperTypes().add(theAction_basePackage.getCreate());
		createExpressionEClass.getESuperTypes().add(this.getCreateTerminologyAsset());
		createTermEClass.getESuperTypes().add(this.getCreateTerminologyAsset());
		updateExpressionElementCategoryEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateExpressionElementValueEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateExpressionElementExpressionEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateTermExternalReferenceEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateTermOriginEClass.getESuperTypes().add(theAction_basePackage.getUpdate());

		// Initialize classes, features, and operations; add parameters
		initEClass(terminologyActionPackageEClass, TerminologyActionPackage.class, "TerminologyActionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologyActionPackage_Actions(), theAction_basePackage.getAction(), null, "actions", null, 0, -1, TerminologyActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminologyActionPackage_TerminologyActionPackages(), this.getTerminologyActionPackage(), null, "terminologyActionPackages", null, 0, -1, TerminologyActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createTerminologyPackageEClass, CreateTerminologyPackage.class, "CreateTerminologyPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createTerminologyPackageInterfaceEClass, CreateTerminologyPackageInterface.class, "CreateTerminologyPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createTerminologyPackageBindingEClass, CreateTerminologyPackageBinding.class, "CreateTerminologyPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createTerminologyPackageGroupEClass, CreateTerminologyPackageGroup.class, "CreateTerminologyPackageGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateArtifactElementEClass, UpdateArtifactElement.class, "UpdateArtifactElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateArtifactElement_ArgumentationElement(), theBase_Package.getArtifactElement(), null, "argumentationElement", null, 0, 1, UpdateArtifactElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteArtifactElementEClass, DeleteArtifactElement.class, "DeleteArtifactElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteArtifactElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, DeleteArtifactElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteArtifactElement_ArgumentationElement(), theBase_Package.getArtifactElement(), null, "argumentationElement", null, 0, 1, DeleteArtifactElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createTerminologyAssetEClass, CreateTerminologyAsset.class, "CreateTerminologyAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createCategoryEClass, CreateCategory.class, "CreateCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createExpressionElementEClass, CreateExpressionElement.class, "CreateExpressionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateExpressionElement_Value(), ecorePackage.getEString(), "value", null, 0, 1, CreateExpressionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createExpressionEClass, CreateExpression.class, "CreateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createTermEClass, CreateTerm.class, "CreateTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateExpressionElementCategoryEClass, UpdateExpressionElementCategory.class, "UpdateExpressionElementCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateExpressionElementCategory_Category(), theTerminology_Package.getCategory(), null, "category", null, 0, 1, UpdateExpressionElementCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateExpressionElementValueEClass, UpdateExpressionElementValue.class, "UpdateExpressionElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateExpressionElementValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, UpdateExpressionElementValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateExpressionElementExpressionEClass, UpdateExpressionElementExpression.class, "UpdateExpressionElementExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateExpressionElementExpression_Element(), theTerminology_Package.getExpressionElement(), null, "element", null, 0, 1, UpdateExpressionElementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateTermExternalReferenceEClass, updateTermExternalReference.class, "updateTermExternalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getupdateTermExternalReference_ExternalReference(), ecorePackage.getEString(), "externalReference", null, 0, 1, updateTermExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateTermOriginEClass, UpdateTermOrigin.class, "UpdateTermOrigin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateTermOrigin_Origin(), theBase_Package.getModelElement(), null, "origin", null, 0, 1, UpdateTermOrigin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Action_terminologyPackageImpl
