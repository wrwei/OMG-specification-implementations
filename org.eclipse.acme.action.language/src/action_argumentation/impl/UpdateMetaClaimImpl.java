/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationPackage;
import action_argumentation.UpdateMetaClaim;

import action_base.impl.UpdateImpl;

import argumentation.Claim;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Meta Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.impl.UpdateMetaClaimImpl#getMetaClaim <em>Meta Claim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateMetaClaimImpl extends UpdateImpl implements UpdateMetaClaim {
	/**
	 * The cached value of the '{@link #getMetaClaim() <em>Meta Claim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaClaim()
	 * @generated
	 * @ordered
	 */
	protected Claim metaClaim;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateMetaClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_argumentationPackage.Literals.UPDATE_META_CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getMetaClaim() {
		if (metaClaim != null && metaClaim.eIsProxy()) {
			InternalEObject oldMetaClaim = (InternalEObject)metaClaim;
			metaClaim = (Claim)eResolveProxy(oldMetaClaim);
			if (metaClaim != oldMetaClaim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_argumentationPackage.UPDATE_META_CLAIM__META_CLAIM, oldMetaClaim, metaClaim));
			}
		}
		return metaClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim basicGetMetaClaim() {
		return metaClaim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaClaim(Claim newMetaClaim) {
		Claim oldMetaClaim = metaClaim;
		metaClaim = newMetaClaim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_argumentationPackage.UPDATE_META_CLAIM__META_CLAIM, oldMetaClaim, metaClaim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_argumentationPackage.UPDATE_META_CLAIM__META_CLAIM:
				if (resolve) return getMetaClaim();
				return basicGetMetaClaim();
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
			case Action_argumentationPackage.UPDATE_META_CLAIM__META_CLAIM:
				setMetaClaim((Claim)newValue);
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
			case Action_argumentationPackage.UPDATE_META_CLAIM__META_CLAIM:
				setMetaClaim((Claim)null);
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
			case Action_argumentationPackage.UPDATE_META_CLAIM__META_CLAIM:
				return metaClaim != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateMetaClaimImpl
