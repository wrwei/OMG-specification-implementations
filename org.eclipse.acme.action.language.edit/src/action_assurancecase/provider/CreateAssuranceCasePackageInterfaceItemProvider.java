/**
 */
package action_assurancecase.provider;


import action_argumentation.Action_argumentationFactory;

import action_artifact.Action_artifactFactory;

import action_assurancecase.Action_assurancecaseFactory;
import action_assurancecase.CreateAssuranceCasePackageInterface;

import action_base.Action_basePackage;

import action_base.provider.CreateArtifactElementItemProvider;

import action_terminology.Action_terminologyFactory;

import argumentation.Argumentation_Factory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import terminology.Terminology_Factory;

/**
 * This is the item provider adapter for a {@link action_assurancecase.CreateAssuranceCasePackageInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateAssuranceCasePackageInterfaceItemProvider extends CreateArtifactElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssuranceCasePackageInterfaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns CreateAssuranceCasePackageInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateAssuranceCasePackageInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CreateAssuranceCasePackageInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CreateAssuranceCasePackageInterface_type") :
			getString("_UI_CreateAssuranceCasePackageInterface_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createCreateAssuranceCasePackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createCreateAssuranceCasePackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createCreateAssuranceCasePackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createUpdateAssuranceCaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createDeleteAssuranceCaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackageGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateArgumentationElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeleteArgumentationElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArtifactReference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createReferToArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAsserted()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareNeedsSupport()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAssumed()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAxiomatic()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareDefeated()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAsCited()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createMakeClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedContext()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedInference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedArtifactContext()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedArtifactSupport()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateMetaClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateAssertedRelationshipSource()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateAssertedRelationshipTarget()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateIsCounterAssertedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackageGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createDeleteArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateTechnique()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateResource()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactAssetRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdatePropertyPurpose()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactAssetRelationshipSource()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactAssetRelationshipTarget()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactVersion()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactDate()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateActivityStartTime()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateActivityEndTime()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateResourceOccurence()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createDeleteArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerm()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createupdateTermExternalReference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.ACTION__SUB_ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateTermOrigin()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArgumentReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createArtifactReference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedArtifactSupport()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedInference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedContext()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Argumentation_Factory.eINSTANCE.createAssertedArtifactContext()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Terminology_Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Terminology_Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Action_basePackage.Literals.CREATE__CREATED_ELEMENT,
				 Terminology_Factory.eINSTANCE.createTerm()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Action_assurancecaseEditPlugin.INSTANCE;
	}

}
