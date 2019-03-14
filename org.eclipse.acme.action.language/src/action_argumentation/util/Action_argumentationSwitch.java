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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see action_argumentation.Action_argumentationPackage
 * @generated
 */
public class Action_argumentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_argumentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_argumentationSwitch() {
		if (modelPackage == null) {
			modelPackage = Action_argumentationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE: {
				ArgumentationActionPackage argumentationActionPackage = (ArgumentationActionPackage)theEObject;
				T result = caseArgumentationActionPackage(argumentationActionPackage);
				if (result == null) result = caseActionElement(argumentationActionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE: {
				CreateArgumentPackage createArgumentPackage = (CreateArgumentPackage)theEObject;
				T result = caseCreateArgumentPackage(createArgumentPackage);
				if (result == null) result = caseCreateArtifactElement(createArgumentPackage);
				if (result == null) result = caseCreate(createArgumentPackage);
				if (result == null) result = caseAction(createArgumentPackage);
				if (result == null) result = caseActionElement(createArgumentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE_INTERFACE: {
				CreateArgumentPackageInterface createArgumentPackageInterface = (CreateArgumentPackageInterface)theEObject;
				T result = caseCreateArgumentPackageInterface(createArgumentPackageInterface);
				if (result == null) result = caseCreateArtifactElement(createArgumentPackageInterface);
				if (result == null) result = caseCreate(createArgumentPackageInterface);
				if (result == null) result = caseAction(createArgumentPackageInterface);
				if (result == null) result = caseActionElement(createArgumentPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE_BINDING: {
				CreateArgumentPackageBinding createArgumentPackageBinding = (CreateArgumentPackageBinding)theEObject;
				T result = caseCreateArgumentPackageBinding(createArgumentPackageBinding);
				if (result == null) result = caseCreateArtifactElement(createArgumentPackageBinding);
				if (result == null) result = caseCreate(createArgumentPackageBinding);
				if (result == null) result = caseAction(createArgumentPackageBinding);
				if (result == null) result = caseActionElement(createArgumentPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ARGUMENT_PACKAGE_GROUP: {
				CreateArgumentPackageGroup createArgumentPackageGroup = (CreateArgumentPackageGroup)theEObject;
				T result = caseCreateArgumentPackageGroup(createArgumentPackageGroup);
				if (result == null) result = caseCreateArtifactElement(createArgumentPackageGroup);
				if (result == null) result = caseCreate(createArgumentPackageGroup);
				if (result == null) result = caseAction(createArgumentPackageGroup);
				if (result == null) result = caseActionElement(createArgumentPackageGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT: {
				UpdateArgumentationElement updateArgumentationElement = (UpdateArgumentationElement)theEObject;
				T result = caseUpdateArgumentationElement(updateArgumentationElement);
				if (result == null) result = caseUpdate(updateArgumentationElement);
				if (result == null) result = caseRererenceAction(updateArgumentationElement);
				if (result == null) result = caseAction(updateArgumentationElement);
				if (result == null) result = caseActionElement(updateArgumentationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.DELETE_ARGUMENTATION_ELEMENT: {
				DeleteArgumentationElement deleteArgumentationElement = (DeleteArgumentationElement)theEObject;
				T result = caseDeleteArgumentationElement(deleteArgumentationElement);
				if (result == null) result = caseDelete(deleteArgumentationElement);
				if (result == null) result = caseRererenceAction(deleteArgumentationElement);
				if (result == null) result = caseAction(deleteArgumentationElement);
				if (result == null) result = caseActionElement(deleteArgumentationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ARGUMENT_ASSET: {
				CreateArgumentAsset createArgumentAsset = (CreateArgumentAsset)theEObject;
				T result = caseCreateArgumentAsset(createArgumentAsset);
				if (result == null) result = caseCreate(createArgumentAsset);
				if (result == null) result = caseAction(createArgumentAsset);
				if (result == null) result = caseActionElement(createArgumentAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ARTIFACT_REFERENCE: {
				CreateArtifactReference createArtifactReference = (CreateArtifactReference)theEObject;
				T result = caseCreateArtifactReference(createArtifactReference);
				if (result == null) result = caseCreateArgumentAsset(createArtifactReference);
				if (result == null) result = caseCreate(createArtifactReference);
				if (result == null) result = caseAction(createArtifactReference);
				if (result == null) result = caseActionElement(createArtifactReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.REFER_TO_ARTIFACT: {
				ReferToArtifact referToArtifact = (ReferToArtifact)theEObject;
				T result = caseReferToArtifact(referToArtifact);
				if (result == null) result = caseUpdate(referToArtifact);
				if (result == null) result = caseRererenceAction(referToArtifact);
				if (result == null) result = caseAction(referToArtifact);
				if (result == null) result = caseActionElement(referToArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ASSERTION: {
				CreateAssertion createAssertion = (CreateAssertion)theEObject;
				T result = caseCreateAssertion(createAssertion);
				if (result == null) result = caseCreateArgumentAsset(createAssertion);
				if (result == null) result = caseCreate(createAssertion);
				if (result == null) result = caseAction(createAssertion);
				if (result == null) result = caseActionElement(createAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.UPDATE_ASSERTION_DECLARATION: {
				UpdateAssertionDeclaration updateAssertionDeclaration = (UpdateAssertionDeclaration)theEObject;
				T result = caseUpdateAssertionDeclaration(updateAssertionDeclaration);
				if (result == null) result = caseUpdate(updateAssertionDeclaration);
				if (result == null) result = caseRererenceAction(updateAssertionDeclaration);
				if (result == null) result = caseAction(updateAssertionDeclaration);
				if (result == null) result = caseActionElement(updateAssertionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.DECLARE_ASSERTED: {
				DeclareAsserted declareAsserted = (DeclareAsserted)theEObject;
				T result = caseDeclareAsserted(declareAsserted);
				if (result == null) result = caseUpdateAssertionDeclaration(declareAsserted);
				if (result == null) result = caseUpdate(declareAsserted);
				if (result == null) result = caseRererenceAction(declareAsserted);
				if (result == null) result = caseAction(declareAsserted);
				if (result == null) result = caseActionElement(declareAsserted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.DECLARE_NEEDS_SUPPORT: {
				DeclareNeedsSupport declareNeedsSupport = (DeclareNeedsSupport)theEObject;
				T result = caseDeclareNeedsSupport(declareNeedsSupport);
				if (result == null) result = caseUpdateAssertionDeclaration(declareNeedsSupport);
				if (result == null) result = caseUpdate(declareNeedsSupport);
				if (result == null) result = caseRererenceAction(declareNeedsSupport);
				if (result == null) result = caseAction(declareNeedsSupport);
				if (result == null) result = caseActionElement(declareNeedsSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.DECLARE_ASSUMED: {
				DeclareAssumed declareAssumed = (DeclareAssumed)theEObject;
				T result = caseDeclareAssumed(declareAssumed);
				if (result == null) result = caseUpdateAssertionDeclaration(declareAssumed);
				if (result == null) result = caseUpdate(declareAssumed);
				if (result == null) result = caseRererenceAction(declareAssumed);
				if (result == null) result = caseAction(declareAssumed);
				if (result == null) result = caseActionElement(declareAssumed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.DECLARE_AXIOMATIC: {
				DeclareAxiomatic declareAxiomatic = (DeclareAxiomatic)theEObject;
				T result = caseDeclareAxiomatic(declareAxiomatic);
				if (result == null) result = caseUpdateAssertionDeclaration(declareAxiomatic);
				if (result == null) result = caseUpdate(declareAxiomatic);
				if (result == null) result = caseRererenceAction(declareAxiomatic);
				if (result == null) result = caseAction(declareAxiomatic);
				if (result == null) result = caseActionElement(declareAxiomatic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.DECLARE_DEFEATED: {
				DeclareDefeated declareDefeated = (DeclareDefeated)theEObject;
				T result = caseDeclareDefeated(declareDefeated);
				if (result == null) result = caseUpdateAssertionDeclaration(declareDefeated);
				if (result == null) result = caseUpdate(declareDefeated);
				if (result == null) result = caseRererenceAction(declareDefeated);
				if (result == null) result = caseAction(declareDefeated);
				if (result == null) result = caseActionElement(declareDefeated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.DECLARE_AS_CITED: {
				DeclareAsCited declareAsCited = (DeclareAsCited)theEObject;
				T result = caseDeclareAsCited(declareAsCited);
				if (result == null) result = caseUpdateAssertionDeclaration(declareAsCited);
				if (result == null) result = caseUpdate(declareAsCited);
				if (result == null) result = caseRererenceAction(declareAsCited);
				if (result == null) result = caseAction(declareAsCited);
				if (result == null) result = caseActionElement(declareAsCited);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.MAKE_CLAIM: {
				MakeClaim makeClaim = (MakeClaim)theEObject;
				T result = caseMakeClaim(makeClaim);
				if (result == null) result = caseCreateAssertion(makeClaim);
				if (result == null) result = caseCreateArgumentAsset(makeClaim);
				if (result == null) result = caseCreate(makeClaim);
				if (result == null) result = caseAction(makeClaim);
				if (result == null) result = caseActionElement(makeClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ARGUMENT_REASONING: {
				CreateArgumentReasoning createArgumentReasoning = (CreateArgumentReasoning)theEObject;
				T result = caseCreateArgumentReasoning(createArgumentReasoning);
				if (result == null) result = caseCreateArgumentAsset(createArgumentReasoning);
				if (result == null) result = caseCreate(createArgumentReasoning);
				if (result == null) result = caseAction(createArgumentReasoning);
				if (result == null) result = caseActionElement(createArgumentReasoning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ASSERTED_RELATIONSHIP: {
				CreateAssertedRelationship createAssertedRelationship = (CreateAssertedRelationship)theEObject;
				T result = caseCreateAssertedRelationship(createAssertedRelationship);
				if (result == null) result = caseCreateAssertion(createAssertedRelationship);
				if (result == null) result = caseCreateArgumentAsset(createAssertedRelationship);
				if (result == null) result = caseCreate(createAssertedRelationship);
				if (result == null) result = caseAction(createAssertedRelationship);
				if (result == null) result = caseActionElement(createAssertedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ASSERTED_CONTEXT: {
				CreateAssertedContext createAssertedContext = (CreateAssertedContext)theEObject;
				T result = caseCreateAssertedContext(createAssertedContext);
				if (result == null) result = caseCreateAssertedRelationship(createAssertedContext);
				if (result == null) result = caseCreateAssertion(createAssertedContext);
				if (result == null) result = caseCreateArgumentAsset(createAssertedContext);
				if (result == null) result = caseCreate(createAssertedContext);
				if (result == null) result = caseAction(createAssertedContext);
				if (result == null) result = caseActionElement(createAssertedContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ASSERTED_EVIDENCE: {
				CreateAssertedEvidence createAssertedEvidence = (CreateAssertedEvidence)theEObject;
				T result = caseCreateAssertedEvidence(createAssertedEvidence);
				if (result == null) result = caseCreateAssertedRelationship(createAssertedEvidence);
				if (result == null) result = caseCreateAssertion(createAssertedEvidence);
				if (result == null) result = caseCreateArgumentAsset(createAssertedEvidence);
				if (result == null) result = caseCreate(createAssertedEvidence);
				if (result == null) result = caseAction(createAssertedEvidence);
				if (result == null) result = caseActionElement(createAssertedEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ASSERTED_INFERENCE: {
				CreateAssertedInference createAssertedInference = (CreateAssertedInference)theEObject;
				T result = caseCreateAssertedInference(createAssertedInference);
				if (result == null) result = caseCreateAssertedRelationship(createAssertedInference);
				if (result == null) result = caseCreateAssertion(createAssertedInference);
				if (result == null) result = caseCreateArgumentAsset(createAssertedInference);
				if (result == null) result = caseCreate(createAssertedInference);
				if (result == null) result = caseAction(createAssertedInference);
				if (result == null) result = caseActionElement(createAssertedInference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ASSERTED_ARTIFACT_CONTEXT: {
				CreateAssertedArtifactContext createAssertedArtifactContext = (CreateAssertedArtifactContext)theEObject;
				T result = caseCreateAssertedArtifactContext(createAssertedArtifactContext);
				if (result == null) result = caseCreateAssertedRelationship(createAssertedArtifactContext);
				if (result == null) result = caseCreateAssertion(createAssertedArtifactContext);
				if (result == null) result = caseCreateArgumentAsset(createAssertedArtifactContext);
				if (result == null) result = caseCreate(createAssertedArtifactContext);
				if (result == null) result = caseAction(createAssertedArtifactContext);
				if (result == null) result = caseActionElement(createAssertedArtifactContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.CREATE_ASSERTED_ARTIFACT_SUPPORT: {
				CreateAssertedArtifactSupport createAssertedArtifactSupport = (CreateAssertedArtifactSupport)theEObject;
				T result = caseCreateAssertedArtifactSupport(createAssertedArtifactSupport);
				if (result == null) result = caseCreateAssertedRelationship(createAssertedArtifactSupport);
				if (result == null) result = caseCreateAssertion(createAssertedArtifactSupport);
				if (result == null) result = caseCreateArgumentAsset(createAssertedArtifactSupport);
				if (result == null) result = caseCreate(createAssertedArtifactSupport);
				if (result == null) result = caseAction(createAssertedArtifactSupport);
				if (result == null) result = caseActionElement(createAssertedArtifactSupport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.UPDATE_REASONING: {
				UpdateReasoning updateReasoning = (UpdateReasoning)theEObject;
				T result = caseUpdateReasoning(updateReasoning);
				if (result == null) result = caseUpdate(updateReasoning);
				if (result == null) result = caseRererenceAction(updateReasoning);
				if (result == null) result = caseAction(updateReasoning);
				if (result == null) result = caseActionElement(updateReasoning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.UPDATE_META_CLAIM: {
				UpdateMetaClaim updateMetaClaim = (UpdateMetaClaim)theEObject;
				T result = caseUpdateMetaClaim(updateMetaClaim);
				if (result == null) result = caseUpdate(updateMetaClaim);
				if (result == null) result = caseRererenceAction(updateMetaClaim);
				if (result == null) result = caseAction(updateMetaClaim);
				if (result == null) result = caseActionElement(updateMetaClaim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_SOURCE: {
				UpdateAssertedRelationshipSource updateAssertedRelationshipSource = (UpdateAssertedRelationshipSource)theEObject;
				T result = caseUpdateAssertedRelationshipSource(updateAssertedRelationshipSource);
				if (result == null) result = caseUpdate(updateAssertedRelationshipSource);
				if (result == null) result = caseRererenceAction(updateAssertedRelationshipSource);
				if (result == null) result = caseAction(updateAssertedRelationshipSource);
				if (result == null) result = caseActionElement(updateAssertedRelationshipSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_TARGET: {
				UpdateAssertedRelationshipTarget updateAssertedRelationshipTarget = (UpdateAssertedRelationshipTarget)theEObject;
				T result = caseUpdateAssertedRelationshipTarget(updateAssertedRelationshipTarget);
				if (result == null) result = caseUpdate(updateAssertedRelationshipTarget);
				if (result == null) result = caseRererenceAction(updateAssertedRelationshipTarget);
				if (result == null) result = caseAction(updateAssertedRelationshipTarget);
				if (result == null) result = caseActionElement(updateAssertedRelationshipTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_argumentationPackage.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP: {
				UpdateIsCounterAssertedRelationship updateIsCounterAssertedRelationship = (UpdateIsCounterAssertedRelationship)theEObject;
				T result = caseUpdateIsCounterAssertedRelationship(updateIsCounterAssertedRelationship);
				if (result == null) result = caseUpdate(updateIsCounterAssertedRelationship);
				if (result == null) result = caseRererenceAction(updateIsCounterAssertedRelationship);
				if (result == null) result = caseAction(updateIsCounterAssertedRelationship);
				if (result == null) result = caseActionElement(updateIsCounterAssertedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentation Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentation Action Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentationActionPackage(ArgumentationActionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Argument Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Argument Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArgumentPackage(CreateArgumentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Argument Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Argument Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArgumentPackageInterface(CreateArgumentPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Argument Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Argument Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArgumentPackageBinding(CreateArgumentPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Argument Package Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Argument Package Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArgumentPackageGroup(CreateArgumentPackageGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Argumentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Argumentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateArgumentationElement(UpdateArgumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Argumentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Argumentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteArgumentationElement(DeleteArgumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Argument Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Argument Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArgumentAsset(CreateArgumentAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactReference(CreateArtifactReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refer To Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refer To Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferToArtifact(ReferToArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssertion(CreateAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Assertion Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Assertion Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAssertionDeclaration(UpdateAssertionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Asserted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Asserted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareAsserted(DeclareAsserted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Needs Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Needs Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareNeedsSupport(DeclareNeedsSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Assumed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Assumed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareAssumed(DeclareAssumed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Axiomatic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Axiomatic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareAxiomatic(DeclareAxiomatic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare Defeated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare Defeated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareDefeated(DeclareDefeated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declare As Cited</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declare As Cited</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclareAsCited(DeclareAsCited object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMakeClaim(MakeClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Argument Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArgumentReasoning(CreateArgumentReasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Asserted Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssertedRelationship(CreateAssertedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Asserted Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssertedContext(CreateAssertedContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Asserted Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssertedEvidence(CreateAssertedEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Asserted Inference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssertedInference(CreateAssertedInference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Asserted Artifact Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Asserted Artifact Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssertedArtifactContext(CreateAssertedArtifactContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Asserted Artifact Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Asserted Artifact Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssertedArtifactSupport(CreateAssertedArtifactSupport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateReasoning(UpdateReasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Meta Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Meta Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateMetaClaim(UpdateMetaClaim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Asserted Relationship Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Asserted Relationship Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAssertedRelationshipSource(UpdateAssertedRelationshipSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Asserted Relationship Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Asserted Relationship Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAssertedRelationshipTarget(UpdateAssertedRelationshipTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Is Counter Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Is Counter Asserted Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateIsCounterAssertedRelationship(UpdateIsCounterAssertedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionElement(ActionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactElement(CreateArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rererence Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rererence Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRererenceAction(RererenceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Action_argumentationSwitch
