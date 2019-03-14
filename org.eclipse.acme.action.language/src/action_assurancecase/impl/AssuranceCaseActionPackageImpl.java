/**
 */
package action_assurancecase.impl;

import action_argumentation.ArgumentationActionPackage;

import action_artifact.ArtifactActionPackage;

import action_assurancecase.Action_assurancecasePackage;
import action_assurancecase.AssuranceCaseActionPackage;

import action_base.Action;

import action_base.impl.ActionElementImpl;

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
 * An implementation of the model object '<em><b>Assurance Case Action Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_assurancecase.impl.AssuranceCaseActionPackageImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link action_assurancecase.impl.AssuranceCaseActionPackageImpl#getAssuranceCaseActionPackages <em>Assurance Case Action Packages</em>}</li>
 *   <li>{@link action_assurancecase.impl.AssuranceCaseActionPackageImpl#getArgumentationActionPackages <em>Argumentation Action Packages</em>}</li>
 *   <li>{@link action_assurancecase.impl.AssuranceCaseActionPackageImpl#getTerminologyActionPackages <em>Terminology Action Packages</em>}</li>
 *   <li>{@link action_assurancecase.impl.AssuranceCaseActionPackageImpl#getArtifactActionPackages <em>Artifact Action Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssuranceCaseActionPackageImpl extends ActionElementImpl implements AssuranceCaseActionPackage {
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
	 * The cached value of the '{@link #getAssuranceCaseActionPackages() <em>Assurance Case Action Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssuranceCaseActionPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<AssuranceCaseActionPackage> assuranceCaseActionPackages;

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
	 * The cached value of the '{@link #getTerminologyActionPackages() <em>Terminology Action Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminologyActionPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyActionPackage> terminologyActionPackages;

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
	protected AssuranceCaseActionPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_assurancecasePackage.Literals.ASSURANCE_CASE_ACTION_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssuranceCaseActionPackage> getAssuranceCaseActionPackages() {
		if (assuranceCaseActionPackages == null) {
			assuranceCaseActionPackages = new EObjectContainmentEList<AssuranceCaseActionPackage>(AssuranceCaseActionPackage.class, this, Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES);
		}
		return assuranceCaseActionPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentationActionPackage> getArgumentationActionPackages() {
		if (argumentationActionPackages == null) {
			argumentationActionPackages = new EObjectContainmentEList<ArgumentationActionPackage>(ArgumentationActionPackage.class, this, Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES);
		}
		return argumentationActionPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyActionPackage> getTerminologyActionPackages() {
		if (terminologyActionPackages == null) {
			terminologyActionPackages = new EObjectContainmentEList<TerminologyActionPackage>(TerminologyActionPackage.class, this, Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES);
		}
		return terminologyActionPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactActionPackage> getArtifactActionPackages() {
		if (artifactActionPackages == null) {
			artifactActionPackages = new EObjectContainmentEList<ArtifactActionPackage>(ArtifactActionPackage.class, this, Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES);
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
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES:
				return ((InternalEList<?>)getAssuranceCaseActionPackages()).basicRemove(otherEnd, msgs);
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				return ((InternalEList<?>)getArgumentationActionPackages()).basicRemove(otherEnd, msgs);
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				return ((InternalEList<?>)getTerminologyActionPackages()).basicRemove(otherEnd, msgs);
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
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
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS:
				return getActions();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES:
				return getAssuranceCaseActionPackages();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				return getArgumentationActionPackages();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				return getTerminologyActionPackages();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
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
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES:
				getAssuranceCaseActionPackages().clear();
				getAssuranceCaseActionPackages().addAll((Collection<? extends AssuranceCaseActionPackage>)newValue);
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				getArgumentationActionPackages().clear();
				getArgumentationActionPackages().addAll((Collection<? extends ArgumentationActionPackage>)newValue);
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				getTerminologyActionPackages().clear();
				getTerminologyActionPackages().addAll((Collection<? extends TerminologyActionPackage>)newValue);
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
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
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS:
				getActions().clear();
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES:
				getAssuranceCaseActionPackages().clear();
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				getArgumentationActionPackages().clear();
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				getTerminologyActionPackages().clear();
				return;
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
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
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ASSURANCE_CASE_ACTION_PACKAGES:
				return assuranceCaseActionPackages != null && !assuranceCaseActionPackages.isEmpty();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARGUMENTATION_ACTION_PACKAGES:
				return argumentationActionPackages != null && !argumentationActionPackages.isEmpty();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__TERMINOLOGY_ACTION_PACKAGES:
				return terminologyActionPackages != null && !terminologyActionPackages.isEmpty();
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE__ARTIFACT_ACTION_PACKAGES:
				return artifactActionPackages != null && !artifactActionPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssuranceCaseActionPackageImpl
