/**
 */
package action_argumentation.impl;

import action_argumentation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Action_argumentationFactoryImpl extends EFactoryImpl implements Action_argumentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action_argumentationFactory init() {
		try {
			Action_argumentationFactory theAction_argumentationFactory = (Action_argumentationFactory)EPackage.Registry.INSTANCE.getEFactory(Action_argumentationPackage.eNS_URI);
			if (theAction_argumentationFactory != null) {
				return theAction_argumentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Action_argumentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_argumentationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE: return createArgumentationActionPackage();
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE: return createCreateArgumentPackage();
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE_INTERFACE: return createCreateArgumentPackageInterface();
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE_BINDING: return createCreateArgumentPackageBinding();
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE_GROUP: return createCreateArgumentPackageGroup();
			case Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT: return createUpdateArgumentationElement();
			case Action_argumentationPackage.DELETE_ARGUMENTATION_ELEMENT: return createDeleteArgumentationElement();
			case Action_argumentationPackage.CREATE_ARTIFACT_REFERENCE: return createCreateArtifactReference();
			case Action_argumentationPackage.REFER_TO_ARTIFACT: return createReferToArtifact();
			case Action_argumentationPackage.DECLARE_ASSERTED: return createDeclareAsserted();
			case Action_argumentationPackage.DECLARE_NEEDS_SUPPORT: return createDeclareNeedsSupport();
			case Action_argumentationPackage.DECLARE_ASSUMED: return createDeclareAssumed();
			case Action_argumentationPackage.DECLARE_AXIOMATIC: return createDeclareAxiomatic();
			case Action_argumentationPackage.DECLARE_DEFEATED: return createDeclareDefeated();
			case Action_argumentationPackage.DECLARE_AS_CITED: return createDeclareAsCited();
			case Action_argumentationPackage.MAKE_CLAIM: return createMakeClaim();
			case Action_argumentationPackage.CREATE_ARGUMENT_REASONING: return createCreateArgumentReasoning();
			case Action_argumentationPackage.CREATE_ASSERTED_CONTEXT: return createCreateAssertedContext();
			case Action_argumentationPackage.CREATE_ASSERTED_EVIDENCE: return createCreateAssertedEvidence();
			case Action_argumentationPackage.CREATE_ASSERTED_INFERENCE: return createCreateAssertedInference();
			case Action_argumentationPackage.CREATE_ASSERTED_ARTIFACT_CONTEXT: return createCreateAssertedArtifactContext();
			case Action_argumentationPackage.CREATE_ASSERTED_ARTIFACT_SUPPORT: return createCreateAssertedArtifactSupport();
			case Action_argumentationPackage.UPDATE_REASONING: return createUpdateReasoning();
			case Action_argumentationPackage.UPDATE_META_CLAIM: return createUpdateMetaClaim();
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_SOURCE: return createUpdateAssertedRelationshipSource();
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_TARGET: return createUpdateAssertedRelationshipTarget();
			case Action_argumentationPackage.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP: return createUpdateIsCounterAssertedRelationship();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationActionPackage createArgumentationActionPackage() {
		ArgumentationActionPackageImpl argumentationActionPackage = new ArgumentationActionPackageImpl();
		return argumentationActionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArgumentPackage createCreateArgumentPackage() {
		CreateArgumentPackageImpl createArgumentPackage = new CreateArgumentPackageImpl();
		return createArgumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArgumentPackageInterface createCreateArgumentPackageInterface() {
		CreateArgumentPackageInterfaceImpl createArgumentPackageInterface = new CreateArgumentPackageInterfaceImpl();
		return createArgumentPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArgumentPackageBinding createCreateArgumentPackageBinding() {
		CreateArgumentPackageBindingImpl createArgumentPackageBinding = new CreateArgumentPackageBindingImpl();
		return createArgumentPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArgumentPackageGroup createCreateArgumentPackageGroup() {
		CreateArgumentPackageGroupImpl createArgumentPackageGroup = new CreateArgumentPackageGroupImpl();
		return createArgumentPackageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArgumentationElement createUpdateArgumentationElement() {
		UpdateArgumentationElementImpl updateArgumentationElement = new UpdateArgumentationElementImpl();
		return updateArgumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteArgumentationElement createDeleteArgumentationElement() {
		DeleteArgumentationElementImpl deleteArgumentationElement = new DeleteArgumentationElementImpl();
		return deleteArgumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactReference createCreateArtifactReference() {
		CreateArtifactReferenceImpl createArtifactReference = new CreateArtifactReferenceImpl();
		return createArtifactReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferToArtifact createReferToArtifact() {
		ReferToArtifactImpl referToArtifact = new ReferToArtifactImpl();
		return referToArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareAsserted createDeclareAsserted() {
		DeclareAssertedImpl declareAsserted = new DeclareAssertedImpl();
		return declareAsserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareNeedsSupport createDeclareNeedsSupport() {
		DeclareNeedsSupportImpl declareNeedsSupport = new DeclareNeedsSupportImpl();
		return declareNeedsSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareAssumed createDeclareAssumed() {
		DeclareAssumedImpl declareAssumed = new DeclareAssumedImpl();
		return declareAssumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareAxiomatic createDeclareAxiomatic() {
		DeclareAxiomaticImpl declareAxiomatic = new DeclareAxiomaticImpl();
		return declareAxiomatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareDefeated createDeclareDefeated() {
		DeclareDefeatedImpl declareDefeated = new DeclareDefeatedImpl();
		return declareDefeated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareAsCited createDeclareAsCited() {
		DeclareAsCitedImpl declareAsCited = new DeclareAsCitedImpl();
		return declareAsCited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeClaim createMakeClaim() {
		MakeClaimImpl makeClaim = new MakeClaimImpl();
		return makeClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArgumentReasoning createCreateArgumentReasoning() {
		CreateArgumentReasoningImpl createArgumentReasoning = new CreateArgumentReasoningImpl();
		return createArgumentReasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssertedContext createCreateAssertedContext() {
		CreateAssertedContextImpl createAssertedContext = new CreateAssertedContextImpl();
		return createAssertedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssertedEvidence createCreateAssertedEvidence() {
		CreateAssertedEvidenceImpl createAssertedEvidence = new CreateAssertedEvidenceImpl();
		return createAssertedEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssertedInference createCreateAssertedInference() {
		CreateAssertedInferenceImpl createAssertedInference = new CreateAssertedInferenceImpl();
		return createAssertedInference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssertedArtifactContext createCreateAssertedArtifactContext() {
		CreateAssertedArtifactContextImpl createAssertedArtifactContext = new CreateAssertedArtifactContextImpl();
		return createAssertedArtifactContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssertedArtifactSupport createCreateAssertedArtifactSupport() {
		CreateAssertedArtifactSupportImpl createAssertedArtifactSupport = new CreateAssertedArtifactSupportImpl();
		return createAssertedArtifactSupport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateReasoning createUpdateReasoning() {
		UpdateReasoningImpl updateReasoning = new UpdateReasoningImpl();
		return updateReasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateMetaClaim createUpdateMetaClaim() {
		UpdateMetaClaimImpl updateMetaClaim = new UpdateMetaClaimImpl();
		return updateMetaClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAssertedRelationshipSource createUpdateAssertedRelationshipSource() {
		UpdateAssertedRelationshipSourceImpl updateAssertedRelationshipSource = new UpdateAssertedRelationshipSourceImpl();
		return updateAssertedRelationshipSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAssertedRelationshipTarget createUpdateAssertedRelationshipTarget() {
		UpdateAssertedRelationshipTargetImpl updateAssertedRelationshipTarget = new UpdateAssertedRelationshipTargetImpl();
		return updateAssertedRelationshipTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateIsCounterAssertedRelationship createUpdateIsCounterAssertedRelationship() {
		UpdateIsCounterAssertedRelationshipImpl updateIsCounterAssertedRelationship = new UpdateIsCounterAssertedRelationshipImpl();
		return updateIsCounterAssertedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_argumentationPackage getAction_argumentationPackage() {
		return (Action_argumentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Action_argumentationPackage getPackage() {
		return Action_argumentationPackage.eINSTANCE;
	}

} //Action_argumentationFactoryImpl
