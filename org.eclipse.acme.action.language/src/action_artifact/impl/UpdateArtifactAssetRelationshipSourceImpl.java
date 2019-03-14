/**
 */
package action_artifact.impl;

import action_artifact.Action_artifactPackage;
import action_artifact.UpdateArtifactAssetRelationshipSource;

import action_base.impl.UpdateImpl;

import base.ModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Artifact Asset Relationship Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.impl.UpdateArtifactAssetRelationshipSourceImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link action_artifact.impl.UpdateArtifactAssetRelationshipSourceImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateArtifactAssetRelationshipSourceImpl extends UpdateImpl implements UpdateArtifactAssetRelationshipSource {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ModelElement source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateArtifactAssetRelationshipSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_artifactPackage.Literals.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ModelElement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ModelElement newSource) {
		ModelElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX:
				return getIndex();
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX:
				setIndex((Integer)newValue);
				return;
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE:
				setSource((ModelElement)newValue);
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
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE:
				setSource((ModelElement)null);
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
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__INDEX:
				return index != INDEX_EDEFAULT;
			case Action_artifactPackage.UPDATE_ARTIFACT_ASSET_RELATIONSHIP_SOURCE__SOURCE:
				return source != null;
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

} //UpdateArtifactAssetRelationshipSourceImpl
