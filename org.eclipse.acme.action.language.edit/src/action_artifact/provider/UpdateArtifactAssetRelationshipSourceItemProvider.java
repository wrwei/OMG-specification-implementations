/**
 */
package action_artifact.provider;


import action_artifact.Action_artifactFactory;
import action_artifact.Action_artifactPackage;
import action_artifact.UpdateArtifactAssetRelationshipSource;

import action_base.Action_basePackage;

import action_base.provider.UpdateItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link action_artifact.UpdateArtifactAssetRelationshipSource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateArtifactAssetRelationshipSourceItemProvider extends UpdateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactAssetRelationshipSourceItemProvider(AdapterFactory adapterFactory) {
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

			addIndexPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UpdateArtifactAssetRelationshipSource_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateArtifactAssetRelationshipSource_index_feature", "_UI_UpdateArtifactAssetRelationshipSource_type"),
				 Action_artifactPackage.Literals.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UpdateArtifactAssetRelationshipSource_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateArtifactAssetRelationshipSource_source_feature", "_UI_UpdateArtifactAssetRelationshipSource_type"),
				 Action_artifactPackage.Literals.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns UpdateArtifactAssetRelationshipSource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UpdateArtifactAssetRelationshipSource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UpdateArtifactAssetRelationshipSource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UpdateArtifactAssetRelationshipSource_type") :
			getString("_UI_UpdateArtifactAssetRelationshipSource_type") + " " + label;
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

		switch (notification.getFeatureID(UpdateArtifactAssetRelationshipSource.class)) {
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Action_artifactEditPlugin.INSTANCE;
	}

}
