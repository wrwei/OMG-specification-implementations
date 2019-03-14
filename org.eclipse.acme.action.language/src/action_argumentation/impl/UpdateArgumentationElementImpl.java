/**
 */
package action_argumentation.impl;

import action_argumentation.Action_argumentationPackage;
import action_argumentation.UpdateArgumentationElement;

import action_base.impl.UpdateImpl;

import argumentation.ArgumentationElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Argumentation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_argumentation.impl.UpdateArgumentationElementImpl#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateArgumentationElementImpl extends UpdateImpl implements UpdateArgumentationElement {
	/**
	 * The cached value of the '{@link #getArgumentationElement() <em>Argumentation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentationElement()
	 * @generated
	 * @ordered
	 */
	protected ArgumentationElement argumentationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateArgumentationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_argumentationPackage.Literals.UPDATE_ARGUMENTATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationElement getArgumentationElement() {
		if (argumentationElement != null && argumentationElement.eIsProxy()) {
			InternalEObject oldArgumentationElement = (InternalEObject)argumentationElement;
			argumentationElement = (ArgumentationElement)eResolveProxy(oldArgumentationElement);
			if (argumentationElement != oldArgumentationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT, oldArgumentationElement, argumentationElement));
			}
		}
		return argumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationElement basicGetArgumentationElement() {
		return argumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentationElement(ArgumentationElement newArgumentationElement) {
		ArgumentationElement oldArgumentationElement = argumentationElement;
		argumentationElement = newArgumentationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT, oldArgumentationElement, argumentationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT:
				if (resolve) return getArgumentationElement();
				return basicGetArgumentationElement();
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
			case Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT:
				setArgumentationElement((ArgumentationElement)newValue);
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
			case Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT:
				setArgumentationElement((ArgumentationElement)null);
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
			case Action_argumentationPackage.UPDATE_ARGUMENTATION_ELEMENT__ARGUMENTATION_ELEMENT:
				return argumentationElement != null;
		}
		return super.eIsSet(featureID);
	}

} //UpdateArgumentationElementImpl
