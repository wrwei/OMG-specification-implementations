/**
 */
package action_assurancecase.impl;

import action_argumentation.Action_argumentationPackage;

import action_artifact.Action_artifactPackage;

import action_assurancecase.Action_assurancecaseFactory;
import action_assurancecase.Action_assurancecasePackage;
import action_assurancecase.AssuranceCaseActionPackage;
import action_assurancecase.CreateAssuranceCasePackage;
import action_assurancecase.CreateAssuranceCasePackageBinding;
import action_assurancecase.CreateAssuranceCasePackageInterface;
import action_assurancecase.DeleteAssuranceCaseElement;
import action_assurancecase.UpdateAssuranceCaseElement;

import action_base.Action_basePackage;

import action_terminology.Action_terminologyPackage;

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
public class Action_assurancecasePackageImpl extends EPackageImpl implements Action_assurancecasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assuranceCaseActionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssuranceCasePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssuranceCasePackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssuranceCasePackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAssuranceCaseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteAssuranceCaseElementEClass = null;

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
	 * @see action_assurancecase.Action_assurancecasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Action_assurancecasePackageImpl() {
		super(eNS_URI, Action_assurancecaseFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Action_assurancecasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Action_assurancecasePackage init() {
		if (isInited) return (Action_assurancecasePackage)EPackage.Registry.INSTANCE.getEPackage(Action_assurancecasePackage.eNS_URI);

		// Obtain or create and register package
		Action_assurancecasePackageImpl theAction_assurancecasePackage = (Action_assurancecasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Action_assurancecasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Action_assurancecasePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Action_argumentationPackage.eINSTANCE.eClass();
		Action_artifactPackage.eINSTANCE.eClass();
		Action_terminologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAction_assurancecasePackage.createPackageContents();

		// Initialize created meta-data
		theAction_assurancecasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAction_assurancecasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Action_assurancecasePackage.eNS_URI, theAction_assurancecasePackage);
		return theAction_assurancecasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssuranceCaseActionPackage() {
		return assuranceCaseActionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCaseActionPackage_Actions() {
		return (EReference)assuranceCaseActionPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCaseActionPackage_AssuranceCaseActionPackages() {
		return (EReference)assuranceCaseActionPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCaseActionPackage_ArgumentationActionPackages() {
		return (EReference)assuranceCaseActionPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCaseActionPackage_TerminologyActionPackages() {
		return (EReference)assuranceCaseActionPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssuranceCaseActionPackage_ArtifactActionPackages() {
		return (EReference)assuranceCaseActionPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssuranceCasePackage() {
		return createAssuranceCasePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssuranceCasePackageInterface() {
		return createAssuranceCasePackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssuranceCasePackageBinding() {
		return createAssuranceCasePackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAssuranceCaseElement() {
		return updateAssuranceCaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAssuranceCaseElement_ArgumentationElement() {
		return (EReference)updateAssuranceCaseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteAssuranceCaseElement() {
		return deleteAssuranceCaseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteAssuranceCaseElement_Index() {
		return (EAttribute)deleteAssuranceCaseElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteAssuranceCaseElement_ArgumentationElement() {
		return (EReference)deleteAssuranceCaseElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_assurancecaseFactory getAction_assurancecaseFactory() {
		return (Action_assurancecaseFactory)getEFactoryInstance();
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
		assuranceCaseActionPackageEClass = createEClass(ASSURANCE_CASE_ACTION_PACKAGE);
		createEReference(assuranceCaseActionPackageEClass, ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS);
		createEReference(assuranceCaseActionPackageEClass, ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES);
		createEReference(assuranceCaseActionPackageEClass, ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES);
		createEReference(assuranceCaseActionPackageEClass, ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES);
		createEReference(assuranceCaseActionPackageEClass, ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES);

		createAssuranceCasePackageEClass = createEClass(CREATE_ASSURANCE_CASE_PACKAGE);

		createAssuranceCasePackageInterfaceEClass = createEClass(CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE);

		createAssuranceCasePackageBindingEClass = createEClass(CREATE_ASSURANCE_CASE_PACKAGE_BINDING);

		updateAssuranceCaseElementEClass = createEClass(UPDATE_ASSURANCE_CASE_ELEMENT);
		createEReference(updateAssuranceCaseElementEClass, UPDATE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT);

		deleteAssuranceCaseElementEClass = createEClass(DELETE_ASSURANCE_CASE_ELEMENT);
		createEAttribute(deleteAssuranceCaseElementEClass, DELETE_ASSURANCE_CASE_ELEMENT__INDEX);
		createEReference(deleteAssuranceCaseElementEClass, DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT);
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
		Action_argumentationPackage theAction_argumentationPackage = (Action_argumentationPackage)EPackage.Registry.INSTANCE.getEPackage(Action_argumentationPackage.eNS_URI);
		Action_terminologyPackage theAction_terminologyPackage = (Action_terminologyPackage)EPackage.Registry.INSTANCE.getEPackage(Action_terminologyPackage.eNS_URI);
		Action_artifactPackage theAction_artifactPackage = (Action_artifactPackage)EPackage.Registry.INSTANCE.getEPackage(Action_artifactPackage.eNS_URI);
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		assuranceCaseActionPackageEClass.getESuperTypes().add(theAction_basePackage.getActionElement());
		createAssuranceCasePackageEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createAssuranceCasePackageInterfaceEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createAssuranceCasePackageBindingEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		updateAssuranceCaseElementEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		deleteAssuranceCaseElementEClass.getESuperTypes().add(theAction_basePackage.getDelete());

		// Initialize classes, features, and operations; add parameters
		initEClass(assuranceCaseActionPackageEClass, AssuranceCaseActionPackage.class, "AssuranceCaseActionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssuranceCaseActionPackage_Actions(), theAction_basePackage.getAction(), null, "actions", null, 0, -1, AssuranceCaseActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCaseActionPackage_AssuranceCaseActionPackages(), this.getAssuranceCaseActionPackage(), null, "assuranceCaseActionPackages", null, 0, -1, AssuranceCaseActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCaseActionPackage_ArgumentationActionPackages(), theAction_argumentationPackage.getArgumentationActionPackage(), null, "argumentationActionPackages", null, 0, -1, AssuranceCaseActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCaseActionPackage_TerminologyActionPackages(), theAction_terminologyPackage.getTerminologyActionPackage(), null, "terminologyActionPackages", null, 0, -1, AssuranceCaseActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssuranceCaseActionPackage_ArtifactActionPackages(), theAction_artifactPackage.getArtifactActionPackage(), null, "artifactActionPackages", null, 0, -1, AssuranceCaseActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createAssuranceCasePackageEClass, CreateAssuranceCasePackage.class, "CreateAssuranceCasePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssuranceCasePackageInterfaceEClass, CreateAssuranceCasePackageInterface.class, "CreateAssuranceCasePackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssuranceCasePackageBindingEClass, CreateAssuranceCasePackageBinding.class, "CreateAssuranceCasePackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateAssuranceCaseElementEClass, UpdateAssuranceCaseElement.class, "UpdateAssuranceCaseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateAssuranceCaseElement_ArgumentationElement(), theBase_Package.getArtifactElement(), null, "argumentationElement", null, 0, 1, UpdateAssuranceCaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteAssuranceCaseElementEClass, DeleteAssuranceCaseElement.class, "DeleteAssuranceCaseElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteAssuranceCaseElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, DeleteAssuranceCaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteAssuranceCaseElement_ArgumentationElement(), theBase_Package.getArtifactElement(), null, "argumentationElement", null, 0, 1, DeleteAssuranceCaseElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Action_assurancecasePackageImpl
