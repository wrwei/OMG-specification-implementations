/**
 */
package action_terminology.provider;


import action_base.Action_baseFactory;

import action_base.provider.ActionElementItemProvider;

import action_terminology.Action_terminologyFactory;
import action_terminology.Action_terminologyPackage;
import action_terminology.TerminologyActionPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link action_terminology.TerminologyActionPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminologyActionPackageItemProvider extends ActionElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyActionPackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS);
			childrenFeatures.add(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES);
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
	 * This returns TerminologyActionPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TerminologyActionPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TerminologyActionPackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TerminologyActionPackage_type") :
			getString("_UI_TerminologyActionPackage_type") + " " + label;
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

		switch (notification.getFeatureID(TerminologyActionPackage.class)) {
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__ACTIONS:
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
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
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerminologyPackageGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createDeleteArtifactElement()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createCreateTerm()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateExpressionElementExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createupdateTermExternalReference()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_terminologyFactory.eINSTANCE.createUpdateTermOrigin()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createRead()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDelete()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateGID()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateName()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateDescription()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateImplementationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDeleteImplementationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createAttachNote()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDeleteNote()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createAddTaggedValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createUpdateTaggedValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createDeleteTaggedValue()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createMakeAbstract()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createMakeCitation()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__ACTIONS,
				 Action_baseFactory.eINSTANCE.createCite()));

		newChildDescriptors.add
			(createChildParameter
				(Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES,
				 Action_terminologyFactory.eINSTANCE.createTerminologyActionPackage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Action_terminologyEditPlugin.INSTANCE;
	}

}
