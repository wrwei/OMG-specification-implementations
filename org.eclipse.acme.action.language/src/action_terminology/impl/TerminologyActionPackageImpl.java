/**
 */
package action_terminology.impl;

import action_base.Action;

import action_base.impl.ActionElementImpl;

import action_terminology.Action_terminologyPackage;
import action_terminology.TerminologyActionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminology Action Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.impl.TerminologyActionPackageImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link action_terminology.impl.TerminologyActionPackageImpl#getTerminologyActionPackages <em>Terminology Action Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyActionPackageImpl extends ActionElementImpl implements TerminologyActionPackage {
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
	 * The cached value of the '{@link #getTerminologyActionPackages() <em>Terminology Action Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyActionPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyActionPackage> terminologyActionPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyActionPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_terminologyPackage.Literals.TERMINOLOGY_ACTION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyActionPackage> getTerminologyActionPackages() {
		if (terminologyActionPackages == null) {
			terminologyActionPackages = new EObjectContainmentEList<TerminologyActionPackage>(TerminologyActionPackage.class, this, Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES);
		}
		return terminologyActionPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				return ((InternalEList<?>)getTerminologyActionPackages()).basicRemove(otherEnd, msgs);
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
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__ACTIONS:
				return getActions();
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				return getTerminologyActionPackages();
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
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				getTerminologyActionPackages().clear();
				getTerminologyActionPackages().addAll((Collection<? extends TerminologyActionPackage>)newValue);
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
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				return;
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				getTerminologyActionPackages().clear();
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
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				return terminologyActionPackages != null && !terminologyActionPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TerminologyActionPackageImpl
