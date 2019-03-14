/**
 */
package action_artifact.impl;

import action_artifact.Action_artifactFactory;
import action_artifact.Action_artifactPackage;
import action_artifact.ArtifactActionPackage;
import action_artifact.CreateActivity;
import action_artifact.CreateArtifact;
import action_artifact.CreateArtifactAsset;
import action_artifact.CreateArtifactAssetRelationship;
import action_artifact.CreateArtifactPackage;
import action_artifact.CreateArtifactPackageBinding;
import action_artifact.CreateArtifactPackageGroup;
import action_artifact.CreateArtifactPackageInterface;
import action_artifact.CreateEvent;
import action_artifact.CreateParticipant;
import action_artifact.CreateProperty;
import action_artifact.CreateResource;
import action_artifact.CreateTechnique;
import action_artifact.DeleteArtifactElement;
import action_artifact.UpdateActivityEndTime;
import action_artifact.UpdateActivityStartTime;
import action_artifact.UpdateArtifactAssetRelationshipSource;
import action_artifact.UpdateArtifactAssetRelationshipTarget;
import action_artifact.UpdateArtifactDate;
import action_artifact.UpdateArtifactElement;
import action_artifact.UpdateArtifactVersion;
import action_artifact.UpdatePropertyPurpose;
import action_artifact.UpdateResourceOccurence;

import action_base.Action_basePackage;

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
public class Action_artifactPackageImpl extends EPackageImpl implements Action_artifactPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactActionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactPackageGroupEClass = null;

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
	private EClass createArtifactAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTechniqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactAssetRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatePropertyPurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateArtifactAssetRelationshipSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateArtifactAssetRelationshipTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateArtifactVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateArtifactDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateActivityStartTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateActivityEndTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateResourceOccurenceEClass = null;

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
	 * @see action_artifact.Action_artifactPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Action_artifactPackageImpl() {
		super(eNS_URI, Action_artifactFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Action_artifactPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Action_artifactPackage init() {
		if (isInited) return (Action_artifactPackage)EPackage.Registry.INSTANCE.getEPackage(Action_artifactPackage.eNS_URI);

		// Obtain or create and register package
		Action_artifactPackageImpl theAction_artifactPackage = (Action_artifactPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Action_artifactPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Action_artifactPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Action_basePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAction_artifactPackage.createPackageContents();

		// Initialize created meta-data
		theAction_artifactPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAction_artifactPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Action_artifactPackage.eNS_URI, theAction_artifactPackage);
		return theAction_artifactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactActionPackage() {
		return artifactActionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactActionPackage_Actions() {
		return (EReference)artifactActionPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactActionPackage_ArtifactActionPackages() {
		return (EReference)artifactActionPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifactPackage() {
		return createArtifactPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifactPackageInterface() {
		return createArtifactPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifactPackageBinding() {
		return createArtifactPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifactPackageGroup() {
		return createArtifactPackageGroupEClass;
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
	public EClass getCreateArtifactAsset() {
		return createArtifactAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifact() {
		return createArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateActivity() {
		return createActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateEvent() {
		return createEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateParticipant() {
		return createParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTechnique() {
		return createTechniqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateResource() {
		return createResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateProperty() {
		return createPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifactAssetRelationship() {
		return createArtifactAssetRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdatePropertyPurpose() {
		return updatePropertyPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdatePropertyPurpose_Purpose() {
		return (EAttribute)updatePropertyPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateArtifactAssetRelationshipSource() {
		return updateArtifactAssetRelationshipSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateArtifactAssetRelationshipSource_Index() {
		return (EAttribute)updateArtifactAssetRelationshipSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateArtifactAssetRelationshipSource_Source() {
		return (EReference)updateArtifactAssetRelationshipSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateArtifactAssetRelationshipTarget() {
		return updateArtifactAssetRelationshipTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateArtifactAssetRelationshipTarget_Index() {
		return (EAttribute)updateArtifactAssetRelationshipTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateArtifactAssetRelationshipTarget_Target() {
		return (EReference)updateArtifactAssetRelationshipTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateArtifactVersion() {
		return updateArtifactVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateArtifactVersion_Version() {
		return (EAttribute)updateArtifactVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateArtifactDate() {
		return updateArtifactDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateArtifactDate_Date() {
		return (EAttribute)updateArtifactDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateActivityStartTime() {
		return updateActivityStartTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateActivityStartTime_StartTime() {
		return (EAttribute)updateActivityStartTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateActivityEndTime() {
		return updateActivityEndTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateActivityEndTime_EndTime() {
		return (EAttribute)updateActivityEndTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateResourceOccurence() {
		return updateResourceOccurenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateResourceOccurence_Occurence() {
		return (EAttribute)updateResourceOccurenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_artifactFactory getAction_artifactFactory() {
		return (Action_artifactFactory)getEFactoryInstance();
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
		artifactActionPackageEClass = createEClass(ARTIFACT_ACTION_PACKAGE);
		createEReference(artifactActionPackageEClass, ARTIFACT_ACTION_PACKAGE__ACTIONS);
		createEReference(artifactActionPackageEClass, ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES);

		createArtifactPackageEClass = createEClass(CREATE_ARTIFACT_PACKAGE);

		createArtifactPackageInterfaceEClass = createEClass(CREATE_ARTIFACT_PACKAGE_INTERFACE);

		createArtifactPackageBindingEClass = createEClass(CREATE_ARTIFACT_PACKAGE_BINDING);

		createArtifactPackageGroupEClass = createEClass(CREATE_ARTIFACT_PACKAGE_GROUP);

		updateArtifactElementEClass = createEClass(UPDATE_ARTIFACT_ELEMENT);
		createEReference(updateArtifactElementEClass, UPDATE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT);

		deleteArtifactElementEClass = createEClass(DELETE_ARTIFACT_ELEMENT);
		createEAttribute(deleteArtifactElementEClass, DELETE_ARTIFACT_ELEMENT__INDEX);
		createEReference(deleteArtifactElementEClass, DELETE_ARTIFACT_ELEMENT__ARGUMENTATION_ELEMENT);

		createArtifactAssetEClass = createEClass(CREATE_ARTIFACT_ASSET);

		createArtifactEClass = createEClass(CREATE_ARTIFACT);

		createActivityEClass = createEClass(CREATE_ACTIVITY);

		createEventEClass = createEClass(CREATE_EVENT);

		createParticipantEClass = createEClass(CREATE_PARTICIPANT);

		createTechniqueEClass = createEClass(CREATE_TECHNIQUE);

		createResourceEClass = createEClass(CREATE_RESOURCE);

		createPropertyEClass = createEClass(CREATE_PROPERTY);

		createArtifactAssetRelationshipEClass = createEClass(CREATE_ARTIFACT_ASSET_RELATIONSHIP);

		updatePropertyPurposeEClass = createEClass(UPDATE_PROPERTY_PURPOSE);
		createEAttribute(updatePropertyPurposeEClass, UPDATE_PROPERTY_PURPOSE__PURPOSE);

		updateArtifactAssetRelationshipSourceEClass = createEClass(UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE);
		createEAttribute(updateArtifactAssetRelationshipSourceEClass, UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX);
		createEReference(updateArtifactAssetRelationshipSourceEClass, UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE);

		updateArtifactAssetRelationshipTargetEClass = createEClass(UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET);
		createEAttribute(updateArtifactAssetRelationshipTargetEClass, UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX);
		createEReference(updateArtifactAssetRelationshipTargetEClass, UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET);

		updateArtifactVersionEClass = createEClass(UPDATE_ARTIFACT_VERSION);
		createEAttribute(updateArtifactVersionEClass, UPDATE_ARTIFACT_VERSION__VERSION);

		updateArtifactDateEClass = createEClass(UPDATE_ARTIFACT_DATE);
		createEAttribute(updateArtifactDateEClass, UPDATE_ARTIFACT_DATE__DATE);

		updateActivityStartTimeEClass = createEClass(UPDATE_ACTIVITY_START_TIME);
		createEAttribute(updateActivityStartTimeEClass, UPDATE_ACTIVITY_START_TIME__START_TIME);

		updateActivityEndTimeEClass = createEClass(UPDATE_ACTIVITY_END_TIME);
		createEAttribute(updateActivityEndTimeEClass, UPDATE_ACTIVITY_END_TIME__END_TIME);

		updateResourceOccurenceEClass = createEClass(UPDATE_RESOURCE_OCCURENCE);
		createEAttribute(updateResourceOccurenceEClass, UPDATE_RESOURCE_OCCURENCE__OCCURENCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		artifactActionPackageEClass.getESuperTypes().add(theAction_basePackage.getActionElement());
		createArtifactPackageEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createArtifactPackageInterfaceEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createArtifactPackageBindingEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createArtifactPackageGroupEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		updateArtifactElementEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		deleteArtifactElementEClass.getESuperTypes().add(theAction_basePackage.getDelete());
		createArtifactAssetEClass.getESuperTypes().add(theAction_basePackage.getCreate());
		createArtifactEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		createActivityEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		createEventEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		createParticipantEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		createTechniqueEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		createResourceEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		createPropertyEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		createArtifactAssetRelationshipEClass.getESuperTypes().add(this.getCreateArtifactAsset());
		updatePropertyPurposeEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateArtifactAssetRelationshipSourceEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateArtifactAssetRelationshipTargetEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateArtifactVersionEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateArtifactDateEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateActivityStartTimeEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateActivityEndTimeEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateResourceOccurenceEClass.getESuperTypes().add(theAction_basePackage.getUpdate());

		// Initialize classes, features, and operations; add parameters
		initEClass(artifactActionPackageEClass, ArtifactActionPackage.class, "ArtifactActionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArtifactActionPackage_Actions(), theAction_basePackage.getAction(), null, "actions", null, 0, -1, ArtifactActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifactActionPackage_ArtifactActionPackages(), this.getArtifactActionPackage(), null, "artifactActionPackages", null, 0, -1, ArtifactActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createArtifactPackageEClass, CreateArtifactPackage.class, "CreateArtifactPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArtifactPackageInterfaceEClass, CreateArtifactPackageInterface.class, "CreateArtifactPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArtifactPackageBindingEClass, CreateArtifactPackageBinding.class, "CreateArtifactPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArtifactPackageGroupEClass, CreateArtifactPackageGroup.class, "CreateArtifactPackageGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateArtifactElementEClass, UpdateArtifactElement.class, "UpdateArtifactElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateArtifactElement_ArgumentationElement(), theBase_Package.getArtifactElement(), null, "argumentationElement", null, 0, 1, UpdateArtifactElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteArtifactElementEClass, DeleteArtifactElement.class, "DeleteArtifactElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteArtifactElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, DeleteArtifactElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteArtifactElement_ArgumentationElement(), theBase_Package.getArtifactElement(), null, "argumentationElement", null, 0, 1, DeleteArtifactElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createArtifactAssetEClass, CreateArtifactAsset.class, "CreateArtifactAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArtifactEClass, CreateArtifact.class, "CreateArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createActivityEClass, CreateActivity.class, "CreateActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEventEClass, CreateEvent.class, "CreateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createParticipantEClass, CreateParticipant.class, "CreateParticipant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createTechniqueEClass, CreateTechnique.class, "CreateTechnique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createResourceEClass, CreateResource.class, "CreateResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createPropertyEClass, CreateProperty.class, "CreateProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArtifactAssetRelationshipEClass, CreateArtifactAssetRelationship.class, "CreateArtifactAssetRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updatePropertyPurposeEClass, UpdatePropertyPurpose.class, "UpdatePropertyPurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdatePropertyPurpose_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, UpdatePropertyPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateArtifactAssetRelationshipSourceEClass, UpdateArtifactAssetRelationshipSource.class, "UpdateArtifactAssetRelationshipSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateArtifactAssetRelationshipSource_Index(), ecorePackage.getEInt(), "index", null, 0, 1, UpdateArtifactAssetRelationshipSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateArtifactAssetRelationshipSource_Source(), theBase_Package.getModelElement(), null, "source", null, 0, 1, UpdateArtifactAssetRelationshipSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateArtifactAssetRelationshipTargetEClass, UpdateArtifactAssetRelationshipTarget.class, "UpdateArtifactAssetRelationshipTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateArtifactAssetRelationshipTarget_Index(), ecorePackage.getEInt(), "index", null, 0, 1, UpdateArtifactAssetRelationshipTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateArtifactAssetRelationshipTarget_Target(), theBase_Package.getModelElement(), null, "target", null, 0, 1, UpdateArtifactAssetRelationshipTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateArtifactVersionEClass, UpdateArtifactVersion.class, "UpdateArtifactVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateArtifactVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1, UpdateArtifactVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateArtifactDateEClass, UpdateArtifactDate.class, "UpdateArtifactDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateArtifactDate_Date(), ecorePackage.getEDate(), "date", null, 0, 1, UpdateArtifactDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateActivityStartTimeEClass, UpdateActivityStartTime.class, "UpdateActivityStartTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateActivityStartTime_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, UpdateActivityStartTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateActivityEndTimeEClass, UpdateActivityEndTime.class, "UpdateActivityEndTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateActivityEndTime_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, UpdateActivityEndTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateResourceOccurenceEClass, UpdateResourceOccurence.class, "UpdateResourceOccurence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateResourceOccurence_Occurence(), ecorePackage.getEDate(), "occurence", null, 0, 1, UpdateResourceOccurence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Action_artifactPackageImpl
