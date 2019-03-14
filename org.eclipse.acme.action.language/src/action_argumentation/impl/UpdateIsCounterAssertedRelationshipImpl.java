/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationPackage;
import action_argumentation.UpdateIsCounterAssertedRelationship;

import action_base.impl.UpdateImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Is Counter Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.impl.UpdateIsCounterAssertedRelationshipImpl#isIsCounter <em>Is Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateIsCounterAssertedRelationshipImpl extends UpdateImpl implements UpdateIsCounterAssertedRelationship {
	/**
	 * The default value of the '{@link #isIsCounter() <em>Is Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCounter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COUNTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCounter() <em>Is Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCounter()
	 * @generated
	 * @ordered
	 */
	protected boolean isCounter = IS_COUNTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateIsCounterAssertedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_argumentationPackage.Literals.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCounter() {
		return isCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCounter(boolean newIsCounter) {
		boolean oldIsCounter = isCounter;
		isCounter = newIsCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_argumentationPackage.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER, oldIsCounter, isCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_argumentationPackage.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER:
				return isIsCounter();
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
			case Action_argumentationPackage.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER:
				setIsCounter((Boolean)newValue);
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
			case Action_argumentationPackage.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER:
				setIsCounter(IS_COUNTER_EDEFAULT);
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
			case Action_argumentationPackage.UPDATE_IS_COUNTER_ASSERTED_RELATIONSHIP__IS_COUNTER:
				return isCounter != IS_COUNTER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isCounter: ");
		result.append(isCounter);
		result.append(')');
		return result.toString();
	}

} //UpdateIsCounterAssertedRelationshipImpl
