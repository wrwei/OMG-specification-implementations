/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationPackage;
import action_argumentation.ArgumentationActionPackage;

import action_base.Action;

import action_base.impl.ActionElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argumentation Action Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.impl.ArgumentationActionPackageImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link action_argumentation.impl.ArgumentationActionPackageImpl#getArgumentationActionPackages <em>Argumentation Action Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentationActionPackageImpl extends ActionElementImpl implements ArgumentationActionPackage {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getArgumentationActionPackages() <em>Argumentation Action Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentationActionPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentationActionPackage> argumentationActionPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationActionPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_argumentationPackage.Literals.ARGUMENTATION_ACTION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentationActionPackage> getArgumentationActionPackages() {
		if (argumentationActionPackages == null) {
			argumentationActionPackages = new EObjectContainmentEList<ArgumentationActionPackage>(ArgumentationActionPackage.class, this, Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES);
		}
		return argumentationActionPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				return ((InternalEList<?>)getArgumentationActionPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ACTIONS:
				return getActions();
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				return getArgumentationActionPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				getArgumentationActionPackages().clear();
				getArgumentationActionPackages().addAll((Collection<? extends ArgumentationActionPackage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				return;
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				getArgumentationActionPackages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Action_argumentationPackage.ARGUMENTATION_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				return argumentationActionPackages != null && !argumentationActionPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentationActionPackageImpl
