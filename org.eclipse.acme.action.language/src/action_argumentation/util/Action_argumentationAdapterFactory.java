/**
 */
package action_argumentation.util;

import action_argumentation.*;

import action_base.Action;
import action_base.ActionElement;
import action_base.Create;
import action_base.CreateArtifactElement;
import action_base.Delete;
import action_base.RererenceAction;
import action_base.Update;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see action_argumentation.Action_argumentationPackage
 * @generated
 */
public class Action_argumentationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_argumentationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_argumentationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Action_argumentationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Action_argumentationSwitch<Adapter> modelSwitch =
		new Action_argumentationSwitch<Adapter>() {
			@Override
			public Adapter caseArgumentationActionPackage(ArgumentationActionPackage object) {
				return createArgumentationActionPackageAdapter();
			}
			@Override
			public Adapter caseCreateArgumentPackage(CreateArgumentPackage object) {
				return createCreateArgumentPackageAdapter();
			}
			@Override
			public Adapter caseCreateArgumentPackageInterface(CreateArgumentPackageInterface object) {
				return createCreateArgumentPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseCreateArgumentPackageBinding(CreateArgumentPackageBinding object) {
				return createCreateArgumentPackageBindingAdapter();
			}
			@Override
			public Adapter caseCreateArgumentPackageGroup(CreateArgumentPackageGroup object) {
				return createCreateArgumentPackageGroupAdapter();
			}
			@Override
			public Adapter caseUpdateArgumentationElement(UpdateArgumentationElement object) {
				return createUpdateArgumentationElementAdapter();
			}
			@Override
			public Adapter caseDeleteArgumentationElement(DeleteArgumentationElement object) {
				return createDeleteArgumentationElementAdapter();
			}
			@Override
			public Adapter caseCreateArgumentAsset(CreateArgumentAsset object) {
				return createCreateArgumentAssetAdapter();
			}
			@Override
			public Adapter caseCreateArtifactReference(CreateArtifactReference object) {
				return createCreateArtifactReferenceAdapter();
			}
			@Override
			public Adapter caseReferToArtifact(ReferToArtifact object) {
				return createReferToArtifactAdapter();
			}
			@Override
			public Adapter caseCreateAssertion(CreateAssertion object) {
				return createCreateAssertionAdapter();
			}
			@Override
			public Adapter caseUpdateAssertionDeclaration(UpdateAssertionDeclaration object) {
				return createUpdateAssertionDeclarationAdapter();
			}
			@Override
			public Adapter caseDeclareAsserted(DeclareAsserted object) {
				return createDeclareAssertedAdapter();
			}
			@Override
			public Adapter caseDeclareNeedsSupport(DeclareNeedsSupport object) {
				return createDeclareNeedsSupportAdapter();
			}
			@Override
			public Adapter caseDeclareAssumed(DeclareAssumed object) {
				return createDeclareAssumedAdapter();
			}
			@Override
			public Adapter caseDeclareAxiomatic(DeclareAxiomatic object) {
				return createDeclareAxiomaticAdapter();
			}
			@Override
			public Adapter caseDeclareDefeated(DeclareDefeated object) {
				return createDeclareDefeatedAdapter();
			}
			@Override
			public Adapter caseDeclareAsCited(DeclareAsCited object) {
				return createDeclareAsCitedAdapter();
			}
			@Override
			public Adapter caseMakeClaim(MakeClaim object) {
				return createMakeClaimAdapter();
			}
			@Override
			public Adapter caseCreateArgumentReasoning(CreateArgumentReasoning object) {
				return createCreateArgumentReasoningAdapter();
			}
			@Override
			public Adapter caseCreateAssertedRelationship(CreateAssertedRelationship object) {
				return createCreateAssertedRelationshipAdapter();
			}
			@Override
			public Adapter caseCreateAssertedContext(CreateAssertedContext object) {
				return createCreateAssertedContextAdapter();
			}
			@Override
			public Adapter caseCreateAssertedEvidence(CreateAssertedEvidence object) {
				return createCreateAssertedEvidenceAdapter();
			}
			@Override
			public Adapter caseCreateAssertedInference(CreateAssertedInference object) {
				return createCreateAssertedInferenceAdapter();
			}
			@Override
			public Adapter caseCreateAssertedArtifactContext(CreateAssertedArtifactContext object) {
				return createCreateAssertedArtifactContextAdapter();
			}
			@Override
			public Adapter caseCreateAssertedArtifactSupport(CreateAssertedArtifactSupport object) {
				return createCreateAssertedArtifactSupportAdapter();
			}
			@Override
			public Adapter caseUpdateReasoning(UpdateReasoning object) {
				return createUpdateReasoningAdapter();
			}
			@Override
			public Adapter caseUpdateMetaClaim(UpdateMetaClaim object) {
				return createUpdateMetaClaimAdapter();
			}
			@Override
			public Adapter caseUpdateAssertedRelationshipSource(UpdateAssertedRelationshipSource object) {
				return createUpdateAssertedRelationshipSourceAdapter();
			}
			@Override
			public Adapter caseUpdateAssertedRelationshipTarget(UpdateAssertedRelationshipTarget object) {
				return createUpdateAssertedRelationshipTargetAdapter();
			}
			@Override
			public Adapter caseUpdateIsCounterAssertedRelationship(UpdateIsCounterAssertedRelationship object) {
				return createUpdateIsCounterAssertedRelationshipAdapter();
			}
			@Override
			public Adapter caseActionElement(ActionElement object) {
				return createActionElementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseCreateArtifactElement(CreateArtifactElement object) {
				return createCreateArtifactElementAdapter();
			}
			@Override
			public Adapter caseRererenceAction(RererenceAction object) {
				return createRererenceActionAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.ArgumentationActionPackage <em>Argumentation Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.ArgumentationActionPackage
	 * @generated
	 */
	public Adapter createArgumentationActionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateArgumentPackage <em>Create Argument Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateArgumentPackage
	 * @generated
	 */
	public Adapter createCreateArgumentPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateArgumentPackageInterface <em>Create Argument Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateArgumentPackageInterface
	 * @generated
	 */
	public Adapter createCreateArgumentPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateArgumentPackageBinding <em>Create Argument Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateArgumentPackageBinding
	 * @generated
	 */
	public Adapter createCreateArgumentPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateArgumentPackageGroup <em>Create Argument Package Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateArgumentPackageGroup
	 * @generated
	 */
	public Adapter createCreateArgumentPackageGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.UpdateArgumentationElement <em>Update Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.UpdateArgumentationElement
	 * @generated
	 */
	public Adapter createUpdateArgumentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.DeleteArgumentationElement <em>Delete Argumentation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.DeleteArgumentationElement
	 * @generated
	 */
	public Adapter createDeleteArgumentationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateArgumentAsset <em>Create Argument Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateArgumentAsset
	 * @generated
	 */
	public Adapter createCreateArgumentAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateArtifactReference <em>Create Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateArtifactReference
	 * @generated
	 */
	public Adapter createCreateArtifactReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.ReferToArtifact <em>Refer To Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.ReferToArtifact
	 * @generated
	 */
	public Adapter createReferToArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateAssertion <em>Create Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateAssertion
	 * @generated
	 */
	public Adapter createCreateAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.UpdateAssertionDeclaration <em>Update Assertion Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.UpdateAssertionDeclaration
	 * @generated
	 */
	public Adapter createUpdateAssertionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.DeclareAsserted <em>Declare Asserted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.DeclareAsserted
	 * @generated
	 */
	public Adapter createDeclareAssertedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.DeclareNeedsSupport <em>Declare Needs Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.DeclareNeedsSupport
	 * @generated
	 */
	public Adapter createDeclareNeedsSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.DeclareAssumed <em>Declare Assumed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.DeclareAssumed
	 * @generated
	 */
	public Adapter createDeclareAssumedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.DeclareAxiomatic <em>Declare Axiomatic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.DeclareAxiomatic
	 * @generated
	 */
	public Adapter createDeclareAxiomaticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.DeclareDefeated <em>Declare Defeated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.DeclareDefeated
	 * @generated
	 */
	public Adapter createDeclareDefeatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.DeclareAsCited <em>Declare As Cited</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.DeclareAsCited
	 * @generated
	 */
	public Adapter createDeclareAsCitedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.MakeClaim <em>Make Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.MakeClaim
	 * @generated
	 */
	public Adapter createMakeClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateArgumentReasoning <em>Create Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateArgumentReasoning
	 * @generated
	 */
	public Adapter createCreateArgumentReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateAssertedRelationship <em>Create Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateAssertedRelationship
	 * @generated
	 */
	public Adapter createCreateAssertedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateAssertedContext <em>Create Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateAssertedContext
	 * @generated
	 */
	public Adapter createCreateAssertedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateAssertedEvidence <em>Create Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateAssertedEvidence
	 * @generated
	 */
	public Adapter createCreateAssertedEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateAssertedInference <em>Create Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateAssertedInference
	 * @generated
	 */
	public Adapter createCreateAssertedInferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateAssertedArtifactContext <em>Create Asserted Artifact Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateAssertedArtifactContext
	 * @generated
	 */
	public Adapter createCreateAssertedArtifactContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.CreateAssertedArtifactSupport <em>Create Asserted Artifact Support</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.CreateAssertedArtifactSupport
	 * @generated
	 */
	public Adapter createCreateAssertedArtifactSupportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.UpdateReasoning <em>Update Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.UpdateReasoning
	 * @generated
	 */
	public Adapter createUpdateReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.UpdateMetaClaim <em>Update Meta Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.UpdateMetaClaim
	 * @generated
	 */
	public Adapter createUpdateMetaClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.UpdateAssertedRelationshipSource <em>Update Asserted Relationship Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.UpdateAssertedRelationshipSource
	 * @generated
	 */
	public Adapter createUpdateAssertedRelationshipSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.UpdateAssertedRelationshipTarget <em>Update Asserted Relationship Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.UpdateAssertedRelationshipTarget
	 * @generated
	 */
	public Adapter createUpdateAssertedRelationshipTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_argumentation.UpdateIsCounterAssertedRelationship <em>Update Is Counter Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_argumentation.UpdateIsCounterAssertedRelationship
	 * @generated
	 */
	public Adapter createUpdateIsCounterAssertedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.ActionElement
	 * @generated
	 */
	public Adapter createActionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.CreateArtifactElement <em>Create Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.CreateArtifactElement
	 * @generated
	 */
	public Adapter createCreateArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.RererenceAction <em>Rererence Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.RererenceAction
	 * @generated
	 */
	public Adapter createRererenceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Action_argumentationAdapterFactory
