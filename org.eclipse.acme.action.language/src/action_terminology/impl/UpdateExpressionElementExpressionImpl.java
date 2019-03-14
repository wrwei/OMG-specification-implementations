/**
 */
package action_terminology.impl;

import action_base.impl.UpdateImpl;

import action_terminology.Action_terminologyPackage;
import action_terminology.UpdateExpressionElementExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import terminology.ExpressionElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Expression Element Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_terminology.impl.UpdateExpressionElementExpressionImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateExpressionElementExpressionImpl extends UpdateImpl implements UpdateExpressionElementExpression {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected ExpressionElement element;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateExpressionElementExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_terminologyPackage.Literals.UPDATE_EXPRESSION_ELEMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionElement getElement() {
		if (element != null && element.eIsProxy()) {
			InternalEObject oldElement = (InternalEObject)element;
			element = (ExpressionElement)eResolveProxy(oldElement);
			if (element != oldElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT, oldElement, element));
			}
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionElement basicGetElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ExpressionElement newElement) {
		ExpressionElement oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT:
				if (resolve) return getElement();
				return basicGetElement();
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
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT:
				setElement((ExpressionElement)newValue);
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
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT:
				setElement((ExpressionElement)null);
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
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION__ELEMENT:
				return element != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateExpressionElementExpressionImpl
