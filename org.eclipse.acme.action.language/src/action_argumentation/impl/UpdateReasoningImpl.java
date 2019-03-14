/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationPackage;
import action_argumentation.UpdateReasoning;

import action_base.impl.UpdateImpl;

import argumentation.ArgumentReasoning;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Reasoning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.impl.UpdateReasoningImpl#getReasoning <em>Reasoning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateReasoningImpl extends UpdateImpl implements UpdateReasoning {
	/**
	 * The cached value of the '{@link #getReasoning() <em>Reasoning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasoning()
	 * @generated
	 * @ordered
	 */
	protected ArgumentReasoning reasoning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateReasoningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_argumentationPackage.Literals.UPDATE_REASONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoning getReasoning() {
		if (reasoning != null && reasoning.eIsProxy()) {
			InternalEObject oldReasoning = (InternalEObject)reasoning;
			reasoning = (ArgumentReasoning)eResolveProxy(oldReasoning);
			if (reasoning != oldReasoning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_argumentationPackage.UPDATE_REASONING__REASONING, oldReasoning, reasoning));
			}
		}
		return reasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoning basicGetReasoning() {
		return reasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReasoning(ArgumentReasoning newReasoning) {
		ArgumentReasoning oldReasoning = reasoning;
		reasoning = newReasoning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_argumentationPackage.UPDATE_REASONING__REASONING, oldReasoning, reasoning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_argumentationPackage.UPDATE_REASONING__REASONING:
				if (resolve) return getReasoning();
				return basicGetReasoning();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Action_argumentationPackage.UPDATE_REASONING__REASONING:
				setReasoning((ArgumentReasoning)newValue);
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
			case Action_argumentationPackage.UPDATE_REASONING__REASONING:
				setReasoning((ArgumentReasoning)null);
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
			case Action_argumentationPackage.UPDATE_REASONING__REASONING:
				return reasoning != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateReasoningImpl
