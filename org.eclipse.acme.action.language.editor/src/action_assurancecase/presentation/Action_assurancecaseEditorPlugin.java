/**
 */
package action_assurancecase.presentation;

import action_argumentation.provider.Action_argumentationEditPlugin;

import action_artifact.provider.Action_artifactEditPlugin;

import action_base.provider.Action_baseEditPlugin;

import action_terminology.provider.Action_terminologyEditPlugin;

import argumentation.provider.ArgumentationEditPlugin;

import base.provider.BaseEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.ui.EclipseUIPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import terminology.provider.TerminologyEditPlugin;

/**
 * This is the central singleton for the Action_assurancecase editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Action_assurancecaseEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Action_assurancecaseEditorPlugin INSTANCE = new Action_assurancecaseEditorPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_assurancecaseEditorPlugin() {
		super
			(new ResourceLocator [] {
				Action_argumentationEditPlugin.INSTANCE,
				Action_artifactEditPlugin.INSTANCE,
				Action_baseEditPlugin.INSTANCE,
				Action_terminologyEditPlugin.INSTANCE,
				ArgumentationEditPlugin.INSTANCE,
				BaseEditPlugin.INSTANCE,
				TerminologyEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
