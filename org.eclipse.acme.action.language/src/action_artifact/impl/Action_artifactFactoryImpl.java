/**
 */
package action_artifact.impl;

import action_artifact.*;

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
public class Action_artifactFactoryImpl extends EFactoryImpl implements Action_artifactFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action_artifactFactory init() {
		try {
			Action_artifactFactory theAction_artifactFactory = (Action_artifactFactory)EPackage.Registry.INSTANCE.getEFactory(Action_artifactPackage.eNS_URI);
			if (theAction_artifactFactory != null) {
				return theAction_artifactFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Action_artifactFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_artifactFactoryImpl() {
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
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE: return createArtifactActionPackage();
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE: return createCreateArtifactPackage();
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE_INTERFACE: return createCreateArtifactPackageInterface();
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE_BINDING: return createCreateArtifactPackageBinding();
			case Action_artifactPackage.CREATE_ARTIFACT_PACKAGE_GROUP: return createCreateArtifactPackageGroup();
			case Action_artifactPackage.UPDATE_ARTIFACT_ELEMENT: return createUpdateArtifactElement();
			case Action_artifactPackage.DELETE_ARTIFACT_ELEMENT: return createDeleteArtifactElement();
			case Action_artifactPackage.CREATE_ARTIFACT: return createCreateArtifact();
			case Action_artifactPackage.CREATE_ACTIVITY: return createCreateActivity();
			case Action_artifactPackage.CREATE_EVENT: return createCreateEvent();
			case Action_artifactPackage.CREATE_PARTICIPANT: return createCreateParticipant();
			case Action_artifactPackage.CREATE_TECHNIQUE: return createCreateTechnique();
			case Action_artifactPackage.CREATE_RESOURCE: return createCreateResource();
			case Action_artifactPackage.CREATE_PROPERTY: return createCreateProperty();
			case Action_artifactPackage.CREATE_ARTIFACT_ASSET_RELATIONSHIP: return createCreateArtifactAssetRelationship();
			case Action_artifactPackage.UPDATE_PROPERTY_PURPOSE: return createUpdatePropertyPurpose();
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE: return createUpdateArtifactAssetRelationshipSource();
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET: return createUpdateArtifactAssetRelationshipTarget();
			case Action_artifactPackage.UPDATE_ARTIFACT_VERSION: return createUpdateArtifactVersion();
			case Action_artifactPackage.UPDATE_ARTIFACT_DATE: return createUpdateArtifactDate();
			case Action_artifactPackage.UPDATE_ACTIVITY_START_TIME: return createUpdateActivityStartTime();
			case Action_artifactPackage.UPDATE_ACTIVITY_END_TIME: return createUpdateActivityEndTime();
			case Action_artifactPackage.UPDATE_RESOURCE_OCCURENCE: return createUpdateResourceOccurence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactActionPackage createArtifactActionPackage() {
		ArtifactActionPackageImpl artifactActionPackage = new ArtifactActionPackageImpl();
		return artifactActionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactPackage createCreateArtifactPackage() {
		CreateArtifactPackageImpl createArtifactPackage = new CreateArtifactPackageImpl();
		return createArtifactPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactPackageInterface createCreateArtifactPackageInterface() {
		CreateArtifactPackageInterfaceImpl createArtifactPackageInterface = new CreateArtifactPackageInterfaceImpl();
		return createArtifactPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactPackageBinding createCreateArtifactPackageBinding() {
		CreateArtifactPackageBindingImpl createArtifactPackageBinding = new CreateArtifactPackageBindingImpl();
		return createArtifactPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactPackageGroup createCreateArtifactPackageGroup() {
		CreateArtifactPackageGroupImpl createArtifactPackageGroup = new CreateArtifactPackageGroupImpl();
		return createArtifactPackageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactElement createUpdateArtifactElement() {
		UpdateArtifactElementImpl updateArtifactElement = new UpdateArtifactElementImpl();
		return updateArtifactElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteArtifactElement createDeleteArtifactElement() {
		DeleteArtifactElementImpl deleteArtifactElement = new DeleteArtifactElementImpl();
		return deleteArtifactElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifact createCreateArtifact() {
		CreateArtifactImpl createArtifact = new CreateArtifactImpl();
		return createArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateActivity createCreateActivity() {
		CreateActivityImpl createActivity = new CreateActivityImpl();
		return createActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateEvent createCreateEvent() {
		CreateEventImpl createEvent = new CreateEventImpl();
		return createEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateParticipant createCreateParticipant() {
		CreateParticipantImpl createParticipant = new CreateParticipantImpl();
		return createParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTechnique createCreateTechnique() {
		CreateTechniqueImpl createTechnique = new CreateTechniqueImpl();
		return createTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateResource createCreateResource() {
		CreateResourceImpl createResource = new CreateResourceImpl();
		return createResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateProperty createCreateProperty() {
		CreatePropertyImpl createProperty = new CreatePropertyImpl();
		return createProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactAssetRelationship createCreateArtifactAssetRelationship() {
		CreateArtifactAssetRelationshipImpl createArtifactAssetRelationship = new CreateArtifactAssetRelationshipImpl();
		return createArtifactAssetRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdatePropertyPurpose createUpdatePropertyPurpose() {
		UpdatePropertyPurposeImpl updatePropertyPurpose = new UpdatePropertyPurposeImpl();
		return updatePropertyPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactAssetRelationshipSource createUpdateArtifactAssetRelationshipSource() {
		UpdateArtifactAssetRelationshipSourceImpl updateArtifactAssetRelationshipSource = new UpdateArtifactAssetRelationshipSourceImpl();
		return updateArtifactAssetRelationshipSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactAssetRelationshipTarget createUpdateArtifactAssetRelationshipTarget() {
		UpdateArtifactAssetRelationshipTargetImpl updateArtifactAssetRelationshipTarget = new UpdateArtifactAssetRelationshipTargetImpl();
		return updateArtifactAssetRelationshipTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactVersion createUpdateArtifactVersion() {
		UpdateArtifactVersionImpl updateArtifactVersion = new UpdateArtifactVersionImpl();
		return updateArtifactVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactDate createUpdateArtifactDate() {
		UpdateArtifactDateImpl updateArtifactDate = new UpdateArtifactDateImpl();
		return updateArtifactDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateActivityStartTime createUpdateActivityStartTime() {
		UpdateActivityStartTimeImpl updateActivityStartTime = new UpdateActivityStartTimeImpl();
		return updateActivityStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateActivityEndTime createUpdateActivityEndTime() {
		UpdateActivityEndTimeImpl updateActivityEndTime = new UpdateActivityEndTimeImpl();
		return updateActivityEndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateResourceOccurence createUpdateResourceOccurence() {
		UpdateResourceOccurenceImpl updateResourceOccurence = new UpdateResourceOccurenceImpl();
		return updateResourceOccurence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_artifactPackage getAction_artifactPackage() {
		return (Action_artifactPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Action_artifactPackage getPackage() {
		return Action_artifactPackage.eINSTANCE;
	}

} //Action_artifactFactoryImpl
