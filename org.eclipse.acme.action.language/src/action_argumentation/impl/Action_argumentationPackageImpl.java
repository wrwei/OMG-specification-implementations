/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationFactory;
import action_argumentation.Action_argumentationPackage;
import action_argumentation.ArgumentationActionPackage;
import action_argumentation.CreateArgumentAsset;
import action_argumentation.CreateArgumentPackage;
import action_argumentation.CreateArgumentPackageBinding;
import action_argumentation.CreateArgumentPackageGroup;
import action_argumentation.CreateArgumentPackageInterface;
import action_argumentation.CreateArgumentReasoning;
import action_argumentation.CreateArtifactReference;
import action_argumentation.CreateAssertedArtifactContext;
import action_argumentation.CreateAssertedArtifactSupport;
import action_argumentation.CreateAssertedContext;
import action_argumentation.CreateAssertedEvidence;
import action_argumentation.CreateAssertedInference;
import action_argumentation.CreateAssertedRelationship;
import action_argumentation.CreateAssertion;
import action_argumentation.DeclareAsCited;
import action_argumentation.DeclareAsserted;
import action_argumentation.DeclareAssumed;
import action_argumentation.DeclareAxiomatic;
import action_argumentation.DeclareDefeated;
import action_argumentation.DeclareNeedsSupport;
import action_argumentation.DeleteArgumentationElement;
import action_argumentation.MakeClaim;
import action_argumentation.ReferToArtifact;
import action_argumentation.UpdateArgumentationElement;
import action_argumentation.UpdateAssertedRelationshipSource;
import action_argumentation.UpdateAssertedRelationshipTarget;
import action_argumentation.UpdateAssertionDeclaration;
import action_argumentation.UpdateIsCounterAssertedRelationship;
import action_argumentation.UpdateMetaClaim;
import action_argumentation.UpdateReasoning;

import action_base.Action_basePackage;

import argumentation.Argumentation_Package;

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
public class Action_argumentationPackageImpl extends EPackageImpl implements Action_argumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationActionPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArgumentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArgumentPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArgumentPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArgumentPackageGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateArgumentationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteArgumentationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArgumentAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArtifactReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referToArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAssertionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareAssertedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareNeedsSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareAssumedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareAxiomaticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareDefeatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declareAsCitedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createArgumentReasoningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssertedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssertedContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssertedEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssertedInferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssertedArtifactContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createAssertedArtifactSupportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateReasoningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateMetaClaimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAssertedRelationshipSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAssertedRelationshipTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateIsCounterAssertedRelationshipEClass = null;

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
	 * @see action_argumentation.Action_argumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Action_argumentationPackageImpl() {
		super(eNS_URI, Action_argumentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Action_argumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Action_argumentationPackage init() {
		if (isInited) return (Action_argumentationPackage)EPackage.Registry.INSTANCE.getEPackage(Action_argumentationPackage.eNS_URI);

		// Obtain or create and register package
		Action_argumentationPackageImpl theAction_argumentationPackage = (Action_argumentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Action_argumentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Action_argumentationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Action_basePackage.eINSTANCE.eClass();
		Argumentation_Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theAction_argumentationPackage.createPackageContents();

		// Initialize created meta-data
		theAction_argumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAction_argumentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Action_argumentationPackage.eNS_URI, theAction_argumentationPackage);
		return theAction_argumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentationActionPackage() {
		return argumentationActionPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentationActionPackage_Actions() {
		return (EReference)argumentationActionPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentationActionPackage_ArgumentationActionPackages() {
		return (EReference)argumentationActionPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArgumentPackage() {
		return createArgumentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArgumentPackageInterface() {
		return createArgumentPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArgumentPackageBinding() {
		return createArgumentPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArgumentPackageGroup() {
		return createArgumentPackageGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateArgumentationElement() {
		return updateArgumentationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateArgumentationElement_ArgumentationElement() {
		return (EReference)updateArgumentationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteArgumentationElement() {
		return deleteArgumentationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteArgumentationElement_Index() {
		return (EAttribute)deleteArgumentationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteArgumentationElement_ArgumentationElement() {
		return (EReference)deleteArgumentationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArgumentAsset() {
		return createArgumentAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArtifactReference() {
		return createArtifactReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferToArtifact() {
		return referToArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferToArtifact_ReferredArtifact() {
		return (EReference)referToArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssertion() {
		return createAssertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAssertionDeclaration() {
		return updateAssertionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareAsserted() {
		return declareAssertedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareNeedsSupport() {
		return declareNeedsSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareAssumed() {
		return declareAssumedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareAxiomatic() {
		return declareAxiomaticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareDefeated() {
		return declareDefeatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclareAsCited() {
		return declareAsCitedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMakeClaim() {
		return makeClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateArgumentReasoning() {
		return createArgumentReasoningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssertedRelationship() {
		return createAssertedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssertedContext() {
		return createAssertedContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssertedEvidence() {
		return createAssertedEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssertedInference() {
		return createAssertedInferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssertedArtifactContext() {
		return createAssertedArtifactContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateAssertedArtifactSupport() {
		return createAssertedArtifactSupportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateReasoning() {
		return updateReasoningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateReasoning_Reasoning() {
		return (EReference)updateReasoningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateMetaClaim() {
		return updateMetaClaimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateMetaClaim_MetaClaim() {
		return (EReference)updateMetaClaimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAssertedRelationshipSource() {
		return updateAssertedRelationshipSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAssertedRelationshipSource_Source() {
		return (EReference)updateAssertedRelationshipSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAssertedRelationshipTarget() {
		return updateAssertedRelationshipTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateAssertedRelationshipTarget_Target() {
		return (EReference)updateAssertedRelationshipTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateIsCounterAssertedRelationship() {
		return updateIsCounterAssertedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateIsCounterAssertedRelationship_IsCounter() {
		return (EAttribute)updateIsCounterAssertedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_argumentationFactory getAction_argumentationFactory() {
		return (Action_argumentationFactory)getEFactoryInstance();
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
		argumentationActionPackageEClass = createEClass(ARGUMENTATION_ACTION_PACKAGE);
		createEReference(argumentationActionPackageEClass, ARGUMENTATION_ACTION_PACKAGE__ACTIONS);
		createEReference(argumentationActionPackageEClass, ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES);

		createArgumentPackageEClass = createEClass(CREATE_ARGUMENT_PACKAGE);

		createArgumentPackageInterfaceEClass = createEClass(CREATE_ARGUMENT_PACKAGE_INTERFACE);

		createArgumentPackageBindingEClass = createEClass(CREATE_ARGUMENT_PACKAGE_BINDING);

		createArgumentPackageGroupEClass = createEClass(CREATE_ARGUMENT_PACKAGE_GROUP);

		updateArgumentationElementEClass = createEClass(UPDATE_ARGUMENTATION_ELEMENT);
		createEReference(updateArgumentationElementEClass, UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT);

		deleteArgumentationElementEClass = createEClass(DELETE_ARGUMENTATION_ELEMENT);
		createEAttribute(deleteArgumentationElementEClass, DELETE_ARGUMENTATION_ELEMENT__INDEX);
		createEReference(deleteArgumentationElementEClass, DELETE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT);

		createArgumentAssetEClass = createEClass(CREATE_ARGUMENT_ASSET);

		createArtifactReferenceEClass = createEClass(CREATE_ARTIFACT_REFERENCE);

		referToArtifactEClass = createEClass(REFER_TO_ARTIFACT);
		createEReference(referToArtifactEClass, REFER_TO_ARTIFACT__REFERRED_ARTIFACT);

		createAssertionEClass = createEClass(CREATE_ASSERTION);

		updateAssertionDeclarationEClass = createEClass(UPDATE_ASSERTION_DECLARATION);

		declareAssertedEClass = createEClass(DECLARE_ASSERTED);

		declareNeedsSupportEClass = createEClass(DECLARE_NEEDS_SUPPORT);

		declareAssumedEClass = createEClass(DECLARE_ASSUMED);

		declareAxiomaticEClass = createEClass(DECLARE_AXIOMATIC);

		declareDefeatedEClass = createEClass(DECLARE_DEFEATED);

		declareAsCitedEClass = createEClass(DECLARE_AS_CITED);

		makeClaimEClass = createEClass(MAKE_CLAIM);

		createArgumentReasoningEClass = createEClass(CREATE_ARGUMENT_REASONING);

		createAssertedRelationshipEClass = createEClass(CREATE_ASSERTED_RELATIONSHIP);

		createAssertedContextEClass = createEClass(CREATE_ASSERTED_CONTEXT);

		createAssertedEvidenceEClass = createEClass(CREATE_ASSERTED_EVIDENCE);

		createAssertedInferenceEClass = createEClass(CREATE_ASSERTED_INFERENCE);

		createAssertedArtifactContextEClass = createEClass(CREATE_ASSERTED_ARTIFACT_CONTEXT);

		createAssertedArtifactSupportEClass = createEClass(CREATE_ASSERTED_ARTIFACT_SUPPORT);

		updateReasoningEClass = createEClass(UPDATE_REASONING);
		createEReference(updateReasoningEClass, UPDATE_REASONING__REASONING);

		updateMetaClaimEClass = createEClass(UPDATE_META_CLAIM);
		createEReference(updateMetaClaimEClass, UPDATE_META_CLAIM__META_CLAIM);

		updateAssertedRelationshipSourceEClass = createEClass(UPDATE_ASSERTED_RELATIONSHIP_SOURCE);
		createEReference(updateAssertedRelationshipSourceEClass, UPDATE_ASSERTED_RELATIONSHIP_SOURCE__SOURCE);

		updateAssertedRelationshipTargetEClass = createEClass(UPDATE_ASSERTED_RELATIONSHIP_TARGET);
		createEReference(updateAssertedRelationshipTargetEClass, UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET);

		updateIsCounterAssertedRelationshipEClass = createEClass(UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP);
		createEAttribute(updateIsCounterAssertedRelationshipEClass, UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER);
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
		Argumentation_Package theArgumentation_Package = (Argumentation_Package)EPackage.Registry.INSTANCE.getEPackage(Argumentation_Package.eNS_URI);
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		argumentationActionPackageEClass.getESuperTypes().add(theAction_basePackage.getActionElement());
		createArgumentPackageEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createArgumentPackageInterfaceEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createArgumentPackageBindingEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		createArgumentPackageGroupEClass.getESuperTypes().add(theAction_basePackage.getCreateArtifactElement());
		updateArgumentationElementEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		deleteArgumentationElementEClass.getESuperTypes().add(theAction_basePackage.getDelete());
		createArgumentAssetEClass.getESuperTypes().add(theAction_basePackage.getCreate());
		createArtifactReferenceEClass.getESuperTypes().add(this.getCreateArgumentAsset());
		referToArtifactEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		createAssertionEClass.getESuperTypes().add(this.getCreateArgumentAsset());
		updateAssertionDeclarationEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		declareAssertedEClass.getESuperTypes().add(this.getUpdateAssertionDeclaration());
		declareNeedsSupportEClass.getESuperTypes().add(this.getUpdateAssertionDeclaration());
		declareAssumedEClass.getESuperTypes().add(this.getUpdateAssertionDeclaration());
		declareAxiomaticEClass.getESuperTypes().add(this.getUpdateAssertionDeclaration());
		declareDefeatedEClass.getESuperTypes().add(this.getUpdateAssertionDeclaration());
		declareAsCitedEClass.getESuperTypes().add(this.getUpdateAssertionDeclaration());
		makeClaimEClass.getESuperTypes().add(this.getCreateAssertion());
		createArgumentReasoningEClass.getESuperTypes().add(this.getCreateArgumentAsset());
		createAssertedRelationshipEClass.getESuperTypes().add(this.getCreateAssertion());
		createAssertedContextEClass.getESuperTypes().add(this.getCreateAssertedRelationship());
		createAssertedEvidenceEClass.getESuperTypes().add(this.getCreateAssertedRelationship());
		createAssertedInferenceEClass.getESuperTypes().add(this.getCreateAssertedRelationship());
		createAssertedArtifactContextEClass.getESuperTypes().add(this.getCreateAssertedRelationship());
		createAssertedArtifactSupportEClass.getESuperTypes().add(this.getCreateAssertedRelationship());
		updateReasoningEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateMetaClaimEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateAssertedRelationshipSourceEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateAssertedRelationshipTargetEClass.getESuperTypes().add(theAction_basePackage.getUpdate());
		updateIsCounterAssertedRelationshipEClass.getESuperTypes().add(theAction_basePackage.getUpdate());

		// Initialize classes, features, and operations; add parameters
		initEClass(argumentationActionPackageEClass, ArgumentationActionPackage.class, "ArgumentationActionPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentationActionPackage_Actions(), theAction_basePackage.getAction(), null, "actions", null, 0, -1, ArgumentationActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentationActionPackage_ArgumentationActionPackages(), this.getArgumentationActionPackage(), null, "argumentationActionPackages", null, 0, -1, ArgumentationActionPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createArgumentPackageEClass, CreateArgumentPackage.class, "CreateArgumentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArgumentPackageInterfaceEClass, CreateArgumentPackageInterface.class, "CreateArgumentPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArgumentPackageBindingEClass, CreateArgumentPackageBinding.class, "CreateArgumentPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArgumentPackageGroupEClass, CreateArgumentPackageGroup.class, "CreateArgumentPackageGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateArgumentationElementEClass, UpdateArgumentationElement.class, "UpdateArgumentationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateArgumentationElement_ArgumentationElement(), theArgumentation_Package.getArgumentationElement(), null, "argumentationElement", null, 0, 1, UpdateArgumentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteArgumentationElementEClass, DeleteArgumentationElement.class, "DeleteArgumentationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteArgumentationElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, DeleteArgumentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteArgumentationElement_ArgumentationElement(), theArgumentation_Package.getArgumentationElement(), null, "argumentationElement", null, 0, 1, DeleteArgumentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createArgumentAssetEClass, CreateArgumentAsset.class, "CreateArgumentAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArtifactReferenceEClass, CreateArtifactReference.class, "CreateArtifactReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referToArtifactEClass, ReferToArtifact.class, "ReferToArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferToArtifact_ReferredArtifact(), theBase_Package.getModelElement(), null, "referredArtifact", null, 0, 1, ReferToArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createAssertionEClass, CreateAssertion.class, "CreateAssertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateAssertionDeclarationEClass, UpdateAssertionDeclaration.class, "UpdateAssertionDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declareAssertedEClass, DeclareAsserted.class, "DeclareAsserted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declareNeedsSupportEClass, DeclareNeedsSupport.class, "DeclareNeedsSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declareAssumedEClass, DeclareAssumed.class, "DeclareAssumed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declareAxiomaticEClass, DeclareAxiomatic.class, "DeclareAxiomatic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declareDefeatedEClass, DeclareDefeated.class, "DeclareDefeated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declareAsCitedEClass, DeclareAsCited.class, "DeclareAsCited", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(makeClaimEClass, MakeClaim.class, "MakeClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createArgumentReasoningEClass, CreateArgumentReasoning.class, "CreateArgumentReasoning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssertedRelationshipEClass, CreateAssertedRelationship.class, "CreateAssertedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssertedContextEClass, CreateAssertedContext.class, "CreateAssertedContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssertedEvidenceEClass, CreateAssertedEvidence.class, "CreateAssertedEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssertedInferenceEClass, CreateAssertedInference.class, "CreateAssertedInference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssertedArtifactContextEClass, CreateAssertedArtifactContext.class, "CreateAssertedArtifactContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createAssertedArtifactSupportEClass, CreateAssertedArtifactSupport.class, "CreateAssertedArtifactSupport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateReasoningEClass, UpdateReasoning.class, "UpdateReasoning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateReasoning_Reasoning(), theArgumentation_Package.getArgumentReasoning(), null, "reasoning", null, 0, 1, UpdateReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateMetaClaimEClass, UpdateMetaClaim.class, "UpdateMetaClaim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateMetaClaim_MetaClaim(), theArgumentation_Package.getClaim(), null, "metaClaim", null, 0, 1, UpdateMetaClaim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateAssertedRelationshipSourceEClass, UpdateAssertedRelationshipSource.class, "UpdateAssertedRelationshipSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateAssertedRelationshipSource_Source(), theBase_Package.getModelElement(), null, "source", null, 0, 1, UpdateAssertedRelationshipSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateAssertedRelationshipTargetEClass, UpdateAssertedRelationshipTarget.class, "UpdateAssertedRelationshipTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateAssertedRelationshipTarget_Target(), theBase_Package.getModelElement(), null, "target", null, 0, -1, UpdateAssertedRelationshipTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateIsCounterAssertedRelationshipEClass, UpdateIsCounterAssertedRelationship.class, "UpdateIsCounterAssertedRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateIsCounterAssertedRelationship_IsCounter(), ecorePackage.getEBoolean(), "isCounter", null, 0, 1, UpdateIsCounterAssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Action_argumentationPackageImpl
