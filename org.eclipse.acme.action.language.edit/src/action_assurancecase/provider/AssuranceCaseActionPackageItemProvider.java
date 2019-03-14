/**
 */
package action_assurancecase.provider;


import action_argumentation.Action_argumentationFactory;

import action_artifact.Action_artifactFactory;

import action_assurancecase.Action_assurancecaseFactory;
import action_assurancecase.Action_assurancecasePackage;
import action_assurancecase.AssuranceCaseActionPackage;

import action_base.Action_baseFactory;

import action_base.provider.ActionElementItemProvider;

import action_terminology.Action_terminologyFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link action_assurancecase.AssuranceCaseActionPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AssuranceCaseActionPackageItemProvider extends ActionElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCaseActionPackageItemProvider(AdapterFactory adapterFactory) {
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS);
			childrenFeatures.add(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES);
			childrenFeatures.add(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES);
			childrenFeatures.add(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES);
			childrenFeatures.add(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AssuranceCaseActionPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AssuranceCaseActionPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AssuranceCaseActionPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AssuranceCaseActionPackage_type") :
			getString("_UI_AssuranceCaseActionPackage_type") + " " + label;
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

		switch (notification.getFeatureID(AssuranceCaseActionPackage.class)) {
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS:
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES:
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createCreateAssuranceCasePackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createCreateAssuranceCasePackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createCreateAssuranceCasePackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createUpdateAssuranceCaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_assurancecaseFactory.eINSTANCE.createDeleteAssuranceCaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentPackageGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateArgumentationElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeleteArgumentationElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArtifactReference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createReferToArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAsserted()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareNeedsSupport()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAssumed()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAxiomatic()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareDefeated()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createDeclareAsCited()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createMakeClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateArgumentReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedContext()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedEvidence()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedInference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedArtifactContext()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createCreateAssertedArtifactSupport()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateReasoning()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateMetaClaim()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateAssertedRelationshipSource()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateAssertedRelationshipTarget()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_argumentationFactory.eINSTANCE.createUpdateIsCounterAssertedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactPackageGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createDeleteArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateTechnique()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateResource()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createCreateArtifactAssetRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdatePropertyPurpose()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactAssetRelationshipSource()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactAssetRelationshipTarget()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactVersion()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateArtifactDate()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateActivityStartTime()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateActivityEndTime()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_artifactFactory.eINSTANCE.createUpdateResourceOccurence()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createRead()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateGID()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateName()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateDescription()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateImplementationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDeleteImplementationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createAttachNote()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDeleteNote()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createAddTaggedValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateTaggedValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDeleteTaggedValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createMakeAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createMakeCitation()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createCite()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createDeleteArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerm()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createupdateTermExternalReference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateTermOrigin()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES,
				 Action_assurancecaseFactory.eINSTANCE.createAssuranceCaseActionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES,
				 Action_argumentationFactory.eINSTANCE.createArgumentationActionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES,
				 Action_terminologyFactory.eINSTANCE.createTerminologyActionPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES,
				 Action_artifactFactory.eINSTANCE.createArtifactActionPackage()));
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
