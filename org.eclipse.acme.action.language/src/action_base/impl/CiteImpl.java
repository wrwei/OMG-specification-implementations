/**
 */
package action_base.impl;

import action_base.Action_basePackage;
import action_base.Cite;

import base.ModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_base.impl.CiteImpl#getCited <em>Cited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CiteImpl extends UpdateImpl implements Cite {
	/**
	 * The cached value of the '{@link #getCited() <em>Cited</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCited()
	 * @generated
	 * @ordered
	 */
	protected ModelElement cited;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_basePackage.Literals.CITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getCited() {
		if (cited != null && cited.eIsProxy()) {
			InternalEObject oldCited = (InternalEObject)cited;
			cited = (ModelElement)eResolveProxy(oldCited);
			if (cited != oldCited) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_basePackage.CITE__CITED, oldCited, cited));
			}
		}
		return cited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetCited() {
		return cited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCited(ModelElement newCited) {
		ModelElement oldCited = cited;
		cited = newCited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_basePackage.CITE__CITED, oldCited, cited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_basePackage.CITE__CITED:
				if (resolve) return getCited();
				return basicGetCited();
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
			case Action_basePackage.CITE__CITED:
				setCited((ModelElement)newValue);
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
			case Action_basePackage.CITE__CITED:
				setCited((ModelElement)null);
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
			case Action_basePackage.CITE__CITED:
				return cited != null;
		}
		return super.eIsSet(featureID);
	}

} //CiteImpl
