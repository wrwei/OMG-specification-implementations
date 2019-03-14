/**
 */
package action_artifact.util;

import action_artifact.*;

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
 * @see action_artifact.Action_artifactPackage
 * @generated
 */
public class Action_artifactSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_artifactPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_artifactSwitch() {
		if (modelPackage == null) {
			modelPackage = Action_artifactPackage.eINSTANCE;
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
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE: {
				ArtifactActionPackage artifactActionPackage = (ArtifactActionPackage)theEObject;
				T result = caseArtifactActionPackage(artifactActionPackage);
				if (result == null) result = caseActionElement(artifactActionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE: {
				CreateArtifactPackage createArtifactPackage = (CreateArtifactPackage)theEObject;
				T result = caseCreateArtifactPackage(createArtifactPackage);
				if (result == null) result = caseCreateArtifactElement(createArtifactPackage);
				if (result == null) result = caseCreate(createArtifactPackage);
				if (result == null) result = caseAction(createArtifactPackage);
				if (result == null) result = caseActionElement(createArtifactPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE_INTERFACE: {
				CreateArtifactPackageInterface createArtifactPackageInterface = (CreateArtifactPackageInterface)theEObject;
				T result = caseCreateArtifactPackageInterface(createArtifactPackageInterface);
				if (result == null) result = caseCreateArtifactElement(createArtifactPackageInterface);
				if (result == null) result = caseCreate(createArtifactPackageInterface);
				if (result == null) result = caseAction(createArtifactPackageInterface);
				if (result == null) result = caseActionElement(createArtifactPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE_BINDING: {
				CreateArtifactPackageBinding createArtifactPackageBinding = (CreateArtifactPackageBinding)theEObject;
				T result = caseCreateArtifactPackageBinding(createArtifactPackageBinding);
				if (result == null) result = caseCreateArtifactElement(createArtifactPackageBinding);
				if (result == null) result = caseCreate(createArtifactPackageBinding);
				if (result == null) result = caseAction(createArtifactPackageBinding);
				if (result == null) result = caseActionElement(createArtifactPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE_GROUP: {
				CreateArtifactPackageGroup createArtifactPackageGroup = (CreateArtifactPackageGroup)theEObject;
				T result = caseCreateArtifactPackageGroup(createArtifactPackageGroup);
				if (result == null) result = caseCreateArtifactElement(createArtifactPackageGroup);
				if (result == null) result = caseCreate(createArtifactPackageGroup);
				if (result == null) result = caseAction(createArtifactPackageGroup);
				if (result == null) result = caseActionElement(createArtifactPackageGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_ARTIFACT_ELEMENT: {
				UpdateArtifactElement updateArtifactElement = (UpdateArtifactElement)theEObject;
				T result = caseUpdateArtifactElement(updateArtifactElement);
				if (result == null) result = caseUpdate(updateArtifactElement);
				if (result == null) result = caseRererenceAction(updateArtifactElement);
				if (result == null) result = caseAction(updateArtifactElement);
				if (result == null) result = caseActionElement(updateArtifactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.DELETE_ARTIFACT_ELEMENT: {
				DeleteArtifactElement deleteArtifactElement = (DeleteArtifactElement)theEObject;
				T result = caseDeleteArtifactElement(deleteArtifactElement);
				if (result == null) result = caseDelete(deleteArtifactElement);
				if (result == null) result = caseRererenceAction(deleteArtifactElement);
				if (result == null) result = caseAction(deleteArtifactElement);
				if (result == null) result = caseActionElement(deleteArtifactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ARTIFACT_ASSET: {
				CreateArtifactAsset createArtifactAsset = (CreateArtifactAsset)theEObject;
				T result = caseCreateArtifactAsset(createArtifactAsset);
				if (result == null) result = caseCreate(createArtifactAsset);
				if (result == null) result = caseAction(createArtifactAsset);
				if (result == null) result = caseActionElement(createArtifactAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ARTIFACT: {
				CreateArtifact createArtifact = (CreateArtifact)theEObject;
				T result = caseCreateArtifact(createArtifact);
				if (result == null) result = caseCreateArtifactAsset(createArtifact);
				if (result == null) result = caseCreate(createArtifact);
				if (result == null) result = caseAction(createArtifact);
				if (result == null) result = caseActionElement(createArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ACTIVITY: {
				CreateActivity createActivity = (CreateActivity)theEObject;
				T result = caseCreateActivity(createActivity);
				if (result == null) result = caseCreateArtifactAsset(createActivity);
				if (result == null) result = caseCreate(createActivity);
				if (result == null) result = caseAction(createActivity);
				if (result == null) result = caseActionElement(createActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_EVENT: {
				CreateEvent createEvent = (CreateEvent)theEObject;
				T result = caseCreateEvent(createEvent);
				if (result == null) result = caseCreateArtifactAsset(createEvent);
				if (result == null) result = caseCreate(createEvent);
				if (result == null) result = caseAction(createEvent);
				if (result == null) result = caseActionElement(createEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_PARTICIPANT: {
				CreateParticipant createParticipant = (CreateParticipant)theEObject;
				T result = caseCreateParticipant(createParticipant);
				if (result == null) result = caseCreateArtifactAsset(createParticipant);
				if (result == null) result = caseCreate(createParticipant);
				if (result == null) result = caseAction(createParticipant);
				if (result == null) result = caseActionElement(createParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_TECHNIQUE: {
				CreateTechnique createTechnique = (CreateTechnique)theEObject;
				T result = caseCreateTechnique(createTechnique);
				if (result == null) result = caseCreateArtifactAsset(createTechnique);
				if (result == null) result = caseCreate(createTechnique);
				if (result == null) result = caseAction(createTechnique);
				if (result == null) result = caseActionElement(createTechnique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_RESOURCE: {
				CreateResource createResource = (CreateResource)theEObject;
				T result = caseCreateResource(createResource);
				if (result == null) result = caseCreateArtifactAsset(createResource);
				if (result == null) result = caseCreate(createResource);
				if (result == null) result = caseAction(createResource);
				if (result == null) result = caseActionElement(createResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_PROPERTY: {
				CreateProperty createProperty = (CreateProperty)theEObject;
				T result = caseCreateProperty(createProperty);
				if (result == null) result = caseCreateArtifactAsset(createProperty);
				if (result == null) result = caseCreate(createProperty);
				if (result == null) result = caseAction(createProperty);
				if (result == null) result = caseActionElement(createProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.CREATE_ARTIFACT_ASSET_RELATIONSHIP: {
				CreateArtifactAssetRelationship createArtifactAssetRelationship = (CreateArtifactAssetRelationship)theEObject;
				T result = caseCreateArtifactAssetRelationship(createArtifactAssetRelationship);
				if (result == null) result = caseCreateArtifactAsset(createArtifactAssetRelationship);
				if (result == null) result = caseCreate(createArtifactAssetRelationship);
				if (result == null) result = caseAction(createArtifactAssetRelationship);
				if (result == null) result = caseActionElement(createArtifactAssetRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_PROPERTY_PURPOSE: {
				UpdatePropertyPurpose updatePropertyPurpose = (UpdatePropertyPurpose)theEObject;
				T result = caseUpdatePropertyPurpose(updatePropertyPurpose);
				if (result == null) result = caseUpdate(updatePropertyPurpose);
				if (result == null) result = caseRererenceAction(updatePropertyPurpose);
				if (result == null) result = caseAction(updatePropertyPurpose);
				if (result == null) result = caseActionElement(updatePropertyPurpose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE: {
				UpdateArtifactAssetRelationshipSource updateArtifactAssetRelationshipSource = (UpdateArtifactAssetRelationshipSource)theEObject;
				T result = caseUpdateArtifactAssetRelationshipSource(updateArtifactAssetRelationshipSource);
				if (result == null) result = caseUpdate(updateArtifactAssetRelationshipSource);
				if (result == null) result = caseRererenceAction(updateArtifactAssetRelationshipSource);
				if (result == null) result = caseAction(updateArtifactAssetRelationshipSource);
				if (result == null) result = caseActionElement(updateArtifactAssetRelationshipSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET: {
				UpdateArtifactAssetRelationshipTarget updateArtifactAssetRelationshipTarget = (UpdateArtifactAssetRelationshipTarget)theEObject;
				T result = caseUpdateArtifactAssetRelationshipTarget(updateArtifactAssetRelationshipTarget);
				if (result == null) result = caseUpdate(updateArtifactAssetRelationshipTarget);
				if (result == null) result = caseRererenceAction(updateArtifactAssetRelationshipTarget);
				if (result == null) result = caseAction(updateArtifactAssetRelationshipTarget);
				if (result == null) result = caseActionElement(updateArtifactAssetRelationshipTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_ARTIFACT_VERSION: {
				UpdateArtifactVersion updateArtifactVersion = (UpdateArtifactVersion)theEObject;
				T result = caseUpdateArtifactVersion(updateArtifactVersion);
				if (result == null) result = caseUpdate(updateArtifactVersion);
				if (result == null) result = caseRererenceAction(updateArtifactVersion);
				if (result == null) result = caseAction(updateArtifactVersion);
				if (result == null) result = caseActionElement(updateArtifactVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_ARTIFACT_DATE: {
				UpdateArtifactDate updateArtifactDate = (UpdateArtifactDate)theEObject;
				T result = caseUpdateArtifactDate(updateArtifactDate);
				if (result == null) result = caseUpdate(updateArtifactDate);
				if (result == null) result = caseRererenceAction(updateArtifactDate);
				if (result == null) result = caseAction(updateArtifactDate);
				if (result == null) result = caseActionElement(updateArtifactDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_ACTIVITY_START_TIME: {
				UpdateActivityStartTime updateActivityStartTime = (UpdateActivityStartTime)theEObject;
				T result = caseUpdateActivityStartTime(updateActivityStartTime);
				if (result == null) result = caseUpdate(updateActivityStartTime);
				if (result == null) result = caseRererenceAction(updateActivityStartTime);
				if (result == null) result = caseAction(updateActivityStartTime);
				if (result == null) result = caseActionElement(updateActivityStartTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_ACTIVITY_END_TIME: {
				UpdateActivityEndTime updateActivityEndTime = (UpdateActivityEndTime)theEObject;
				T result = caseUpdateActivityEndTime(updateActivityEndTime);
				if (result == null) result = caseUpdate(updateActivityEndTime);
				if (result == null) result = caseRererenceAction(updateActivityEndTime);
				if (result == null) result = caseAction(updateActivityEndTime);
				if (result == null) result = caseActionElement(updateActivityEndTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_artifactPackage.UPDATE_RESOURCE_OCCURENCE: {
				UpdateResourceOccurence updateResourceOccurence = (UpdateResourceOccurence)theEObject;
				T result = caseUpdateResourceOccurence(updateResourceOccurence);
				if (result == null) result = caseUpdate(updateResourceOccurence);
				if (result == null) result = caseRererenceAction(updateResourceOccurence);
				if (result == null) result = caseAction(updateResourceOccurence);
				if (result == null) result = caseActionElement(updateResourceOccurence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Action Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactActionPackage(ArtifactActionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactPackage(CreateArtifactPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactPackageInterface(CreateArtifactPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactPackageBinding(CreateArtifactPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Package Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Package Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactPackageGroup(CreateArtifactPackageGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateArtifactElement(UpdateArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteArtifactElement(DeleteArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactAsset(CreateArtifactAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifact(CreateArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateActivity(CreateActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateEvent(CreateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateParticipant(CreateParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Technique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Technique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTechnique(CreateTechnique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateResource(CreateResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateProperty(CreateProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Asset Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Asset Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactAssetRelationship(CreateArtifactAssetRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Property Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Property Purpose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatePropertyPurpose(UpdatePropertyPurpose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Artifact Asset Relationship Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Artifact Asset Relationship Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateArtifactAssetRelationshipSource(UpdateArtifactAssetRelationshipSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Artifact Asset Relationship Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Artifact Asset Relationship Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateArtifactAssetRelationshipTarget(UpdateArtifactAssetRelationshipTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Artifact Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Artifact Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateArtifactVersion(UpdateArtifactVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Artifact Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Artifact Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateArtifactDate(UpdateArtifactDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Activity Start Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Activity Start Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateActivityStartTime(UpdateActivityStartTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Activity End Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Activity End Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateActivityEndTime(UpdateActivityEndTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Resource Occurence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Resource Occurence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateResourceOccurence(UpdateResourceOccurence object) {
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

} //Action_artifactSwitch
