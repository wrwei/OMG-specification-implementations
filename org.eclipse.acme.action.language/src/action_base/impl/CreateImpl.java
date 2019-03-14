/**
 */
package action_base.impl;

import action_base.Action_basePackage;
import action_base.Create;

import base.ModelElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_base.impl.CreateImpl#getCreatedElement <em>Created Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CreateImpl extends ActionImpl implements Create {
	/**
	 * The cached value of the '{@link #getCreatedElement() <em>Created Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedElement()
	 * @generated
	 * @ordered
	 */
	protected ModelElement createdElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_basePackage.Literals.CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getCreatedElement() {
		return createdElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreatedElement(ModelElement newCreatedElement, NotificationChain msgs) {
		ModelElement oldCreatedElement = createdElement;
		createdElement = newCreatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Action_basePackage.CREATE__CREATED_ELEMENT, oldCreatedElement, newCreatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedElement(ModelElement newCreatedElement) {
		if (newCreatedElement != createdElement) {
			NotificationChain msgs = null;
			if (createdElement != null)
				msgs = ((InternalEObject)createdElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Action_basePackage.CREATE__CREATED_ELEMENT, null, msgs);
			if (newCreatedElement != null)
				msgs = ((InternalEObject)newCreatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Action_basePackage.CREATE__CREATED_ELEMENT, null, msgs);
			msgs = basicSetCreatedElement(newCreatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_basePackage.CREATE__CREATED_ELEMENT, newCreatedElement, newCreatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Action_basePackage.CREATE__CREATED_ELEMENT:
				return basicSetCreatedElement(null, msgs);
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
			case Action_basePackage.CREATE__CREATED_ELEMENT:
				return getCreatedElement();
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
			case Action_basePackage.CREATE__CREATED_ELEMENT:
				setCreatedElement((ModelElement)newValue);
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
			case Action_basePackage.CREATE__CREATED_ELEMENT:
				setCreatedElement((ModelElement)null);
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
			case Action_basePackage.CREATE__CREATED_ELEMENT:
				return createdElement != null;
		}
		return super.eIsSet(featureID);
	}

} //CreateImpl
