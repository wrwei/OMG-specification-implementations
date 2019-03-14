/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationPackage;
import action_argumentation.UpdateAssertedRelationshipTarget;

import action_base.impl.UpdateImpl;

import base.ModelElement;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Asserted Relationship Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.impl.UpdateAssertedRelationshipTargetImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateAssertedRelationshipTargetImpl extends UpdateImpl implements UpdateAssertedRelationshipTarget {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateAssertedRelationshipTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_argumentationPackage.Literals.UPDATE_ASSERTED_RELATIONSHIP_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET:
				return getTarget();
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
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ModelElement>)newValue);
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
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET:
				getTarget().clear();
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
			case Action_argumentationPackage.UPDATE_ASSERTED_RELATIONSHIP_TARGET__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UpdateAssertedRelationshipTargetImpl
