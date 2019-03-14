/**
 */
package action_artifact.impl;

import action_artifact.Action_artifactPackage;
import action_artifact.ArtifactActionPackage;

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
 * An implementation of the model object '<em><b>Artifact Action Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_artifact.impl.ArtifactActionPackageImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link action_artifact.impl.ArtifactActionPackageImpl#getArtifactActionPackages <em>Artifact Action Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactActionPackageImpl extends ActionElementImpl implements ArtifactActionPackage {
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
	 * The cached value of the '{@link #getArtifactActionPackages() <em>Artifact Action Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactActionPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactActionPackage> artifactActionPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactActionPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_artifactPackage.Literals.ARTIFACT_ACTION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactActionPackage> getArtifactActionPackages() {
		if (artifactActionPackages == null) {
			artifactActionPackages = new EObjectContainmentEList<ArtifactActionPackage>(ArtifactActionPackage.class, this, Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES);
		}
		return artifactActionPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
				return ((InternalEList<?>)getArtifactActionPackages()).basicRemove(otherEnd, msgs);
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
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ACTIONS:
				return getActions();
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
				return getArtifactActionPackages();
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
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
				getArtifactActionPackages().clear();
				getArtifactActionPackages().addAll((Collection<? extends ArtifactActionPackage>)newValue);
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
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				return;
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
				getArtifactActionPackages().clear();
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
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Action_artifactPackage.ARTIFACT_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
				return artifactActionPackages != null && !artifactActionPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactActionPackageImpl
