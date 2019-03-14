/**
 */
package action_artifact.impl;

import action_artifact.Action_artifactPackage;
import action_artifact.UpdateArtifactAssetRelationshipTarget;

import action_base.impl.UpdateImpl;

import base.ModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Artifact Asset Relationship Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.impl.UpdateArtifactAssetRelationshipTargetImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link action_artifact.impl.UpdateArtifactAssetRelationshipTargetImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateArtifactAssetRelationshipTargetImpl extends UpdateImpl implements UpdateArtifactAssetRelationshipTarget {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ModelElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateArtifactAssetRelationshipTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_artifactPackage.Literals.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ModelElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ModelElement newTarget) {
		ModelElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX:
				return getIndex();
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX:
				setIndex((Integer)newValue);
				return;
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET:
				setTarget((ModelElement)newValue);
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
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET:
				setTarget((ModelElement)null);
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
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__INDEX:
				return index != INDEX_EDEFAULT;
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_TARGET__TARGET:
				return target != null;
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
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //UpdateArtifactAssetRelationshipTargetImpl
