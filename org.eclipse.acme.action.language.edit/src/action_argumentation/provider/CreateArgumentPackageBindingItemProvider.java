/**
 */
package action_argumentation.provider;


import action_argumentation.Action_argumentationFactory;
import action_argumentation.CreateArgumentPackageBinding;

import action_base.Action_basePackage;

import action_base.provider.CreateArtifactElementItemProvider;

import argumentation.Argumentation_Factory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link action_argumentation.CreateArgumentPackageBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateArgumentPackageBindingItemProvider extends CreateArtifactElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArgumentPackageBindingItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns CreateArgumentPackageBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CreateArgumentPackageBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CreateArgumentPackageBinding)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CreateArgumentPackageBinding_type") :
			getString("_UI_CreateArgumentPackageBinding_type") + " " + label;
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Action_argumentationEditPlugin.INSTANCE;
	}

}
