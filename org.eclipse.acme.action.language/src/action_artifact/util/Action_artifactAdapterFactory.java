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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see action_artifact.Action_artifactPackage
 * @generated
 */
public class Action_artifactAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_artifactPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_artifactAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Action_artifactPackage.eINSTANCE;
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
	protected Action_artifactSwitch<Adapter> modelSwitch =
		new Action_artifactSwitch<Adapter>() {
			@Override
			public Adapter caseArtifactActionPackage(ArtifactActionPackage object) {
				return createArtifactActionPackageAdapter();
			}
			@Override
			public Adapter caseCreateArtifactPackage(CreateArtifactPackage object) {
				return createCreateArtifactPackageAdapter();
			}
			@Override
			public Adapter caseCreateArtifactPackageInterface(CreateArtifactPackageInterface object) {
				return createCreateArtifactPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseCreateArtifactPackageBinding(CreateArtifactPackageBinding object) {
				return createCreateArtifactPackageBindingAdapter();
			}
			@Override
			public Adapter caseCreateArtifactPackageGroup(CreateArtifactPackageGroup object) {
				return createCreateArtifactPackageGroupAdapter();
			}
			@Override
			public Adapter caseUpdateArtifactElement(UpdateArtifactElement object) {
				return createUpdateArtifactElementAdapter();
			}
			@Override
			public Adapter caseDeleteArtifactElement(DeleteArtifactElement object) {
				return createDeleteArtifactElementAdapter();
			}
			@Override
			public Adapter caseCreateArtifactAsset(CreateArtifactAsset object) {
				return createCreateArtifactAssetAdapter();
			}
			@Override
			public Adapter caseCreateArtifact(CreateArtifact object) {
				return createCreateArtifactAdapter();
			}
			@Override
			public Adapter caseCreateActivity(CreateActivity object) {
				return createCreateActivityAdapter();
			}
			@Override
			public Adapter caseCreateEvent(CreateEvent object) {
				return createCreateEventAdapter();
			}
			@Override
			public Adapter caseCreateParticipant(CreateParticipant object) {
				return createCreateParticipantAdapter();
			}
			@Override
			public Adapter caseCreateTechnique(CreateTechnique object) {
				return createCreateTechniqueAdapter();
			}
			@Override
			public Adapter caseCreateResource(CreateResource object) {
				return createCreateResourceAdapter();
			}
			@Override
			public Adapter caseCreateProperty(CreateProperty object) {
				return createCreatePropertyAdapter();
			}
			@Override
			public Adapter caseCreateArtifactAssetRelationship(CreateArtifactAssetRelationship object) {
				return createCreateArtifactAssetRelationshipAdapter();
			}
			@Override
			public Adapter caseUpdatePropertyPurpose(UpdatePropertyPurpose object) {
				return createUpdatePropertyPurposeAdapter();
			}
			@Override
			public Adapter caseUpdateArtifactAssetRelationshipSource(UpdateArtifactAssetRelationshipSource object) {
				return createUpdateArtifactAssetRelationshipSourceAdapter();
			}
			@Override
			public Adapter caseUpdateArtifactAssetRelationshipTarget(UpdateArtifactAssetRelationshipTarget object) {
				return createUpdateArtifactAssetRelationshipTargetAdapter();
			}
			@Override
			public Adapter caseUpdateArtifactVersion(UpdateArtifactVersion object) {
				return createUpdateArtifactVersionAdapter();
			}
			@Override
			public Adapter caseUpdateArtifactDate(UpdateArtifactDate object) {
				return createUpdateArtifactDateAdapter();
			}
			@Override
			public Adapter caseUpdateActivityStartTime(UpdateActivityStartTime object) {
				return createUpdateActivityStartTimeAdapter();
			}
			@Override
			public Adapter caseUpdateActivityEndTime(UpdateActivityEndTime object) {
				return createUpdateActivityEndTimeAdapter();
			}
			@Override
			public Adapter caseUpdateResourceOccurence(UpdateResourceOccurence object) {
				return createUpdateResourceOccurenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link action_artifact.ArtifactActionPackage <em>Artifact Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.ArtifactActionPackage
	 * @generated
	 */
	public Adapter createArtifactActionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateArtifactPackage <em>Create Artifact Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateArtifactPackage
	 * @generated
	 */
	public Adapter createCreateArtifactPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateArtifactPackageInterface <em>Create Artifact Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateArtifactPackageInterface
	 * @generated
	 */
	public Adapter createCreateArtifactPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateArtifactPackageBinding <em>Create Artifact Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateArtifactPackageBinding
	 * @generated
	 */
	public Adapter createCreateArtifactPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateArtifactPackageGroup <em>Create Artifact Package Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateArtifactPackageGroup
	 * @generated
	 */
	public Adapter createCreateArtifactPackageGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateArtifactElement <em>Update Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateArtifactElement
	 * @generated
	 */
	public Adapter createUpdateArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.DeleteArtifactElement <em>Delete Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.DeleteArtifactElement
	 * @generated
	 */
	public Adapter createDeleteArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateArtifactAsset <em>Create Artifact Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateArtifactAsset
	 * @generated
	 */
	public Adapter createCreateArtifactAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateArtifact <em>Create Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateArtifact
	 * @generated
	 */
	public Adapter createCreateArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateActivity <em>Create Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateActivity
	 * @generated
	 */
	public Adapter createCreateActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateEvent <em>Create Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateEvent
	 * @generated
	 */
	public Adapter createCreateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateParticipant <em>Create Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateParticipant
	 * @generated
	 */
	public Adapter createCreateParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateTechnique <em>Create Technique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateTechnique
	 * @generated
	 */
	public Adapter createCreateTechniqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateResource <em>Create Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateResource
	 * @generated
	 */
	public Adapter createCreateResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateProperty <em>Create Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateProperty
	 * @generated
	 */
	public Adapter createCreatePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.CreateArtifactAssetRelationship <em>Create Artifact Asset Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.CreateArtifactAssetRelationship
	 * @generated
	 */
	public Adapter createCreateArtifactAssetRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdatePropertyPurpose <em>Update Property Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdatePropertyPurpose
	 * @generated
	 */
	public Adapter createUpdatePropertyPurposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateArtifactAssetRelationshipSource <em>Update Artifact Asset Relationship Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateArtifactAssetRelationshipSource
	 * @generated
	 */
	public Adapter createUpdateArtifactAssetRelationshipSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateArtifactAssetRelationshipTarget <em>Update Artifact Asset Relationship Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateArtifactAssetRelationshipTarget
	 * @generated
	 */
	public Adapter createUpdateArtifactAssetRelationshipTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateArtifactVersion <em>Update Artifact Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateArtifactVersion
	 * @generated
	 */
	public Adapter createUpdateArtifactVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateArtifactDate <em>Update Artifact Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateArtifactDate
	 * @generated
	 */
	public Adapter createUpdateArtifactDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateActivityStartTime <em>Update Activity Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateActivityStartTime
	 * @generated
	 */
	public Adapter createUpdateActivityStartTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateActivityEndTime <em>Update Activity End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateActivityEndTime
	 * @generated
	 */
	public Adapter createUpdateActivityEndTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_artifact.UpdateResourceOccurence <em>Update Resource Occurence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_artifact.UpdateResourceOccurence
	 * @generated
	 */
	public Adapter createUpdateResourceOccurenceAdapter() {
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

} //Action_artifactAdapterFactory
