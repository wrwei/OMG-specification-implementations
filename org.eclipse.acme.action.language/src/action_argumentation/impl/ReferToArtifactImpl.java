/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationPackage;
import action_argumentation.ReferToArtifact;

import action_base.impl.UpdateImpl;

import base.ModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refer To Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.impl.ReferToArtifactImpl#getReferredArtifact <em>Referred Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferToArtifactImpl extends UpdateImpl implements ReferToArtifact {
	/**
	 * The cached value of the '{@link #getReferredArtifact() <em>Referred Artifact</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredArtifact()
	 * @generated
	 * @ordered
	 */
	protected ModelElement referredArtifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferToArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_argumentationPackage.Literals.REFER_TO_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getReferredArtifact() {
		if (referredArtifact != null && referredArtifact.eIsProxy()) {
			InternalEObject oldReferredArtifact = (InternalEObject)referredArtifact;
			referredArtifact = (ModelElement)eResolveProxy(oldReferredArtifact);
			if (referredArtifact != oldReferredArtifact) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_argumentationPackage.REFER_TO_ARTIFACT__REFERRED_ARTIFACT, oldReferredArtifact, referredArtifact));
			}
		}
		return referredArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetReferredArtifact() {
		return referredArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredArtifact(ModelElement newReferredArtifact) {
		ModelElement oldReferredArtifact = referredArtifact;
		referredArtifact = newReferredArtifact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_argumentationPackage.REFER_TO_ARTIFACT__REFERRED_ARTIFACT, oldReferredArtifact, referredArtifact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_argumentationPackage.REFER_TO_ARTIFACT__REFERRED_ARTIFACT:
				if (resolve) return getReferredArtifact();
				return basicGetReferredArtifact();
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
			case Action_argumentationPackage.REFER_TO_ARTIFACT__REFERRED_ARTIFACT:
				setReferredArtifact((ModelElement)newValue);
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
			case Action_argumentationPackage.REFER_TO_ARTIFACT__REFERRED_ARTIFACT:
				setReferredArtifact((ModelElement)null);
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
			case Action_argumentationPackage.REFER_TO_ARTIFACT__REFERRED_ARTIFACT:
				return referredArtifact != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferToArtifactImpl
