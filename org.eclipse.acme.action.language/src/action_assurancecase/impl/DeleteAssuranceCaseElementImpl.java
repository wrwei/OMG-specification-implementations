/**
 */
package action_assurancecase.impl;

import action_assurancecase.Action_assurancecasePackage;
import action_assurancecase.DeleteAssuranceCaseElement;

import action_base.impl.DeleteImpl;

import base.ArtifactElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Assurance Case Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link action_assurancecase.impl.DeleteAssuranceCaseElementImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link action_assurancecase.impl.DeleteAssuranceCaseElementImpl#getArgumentationElement <em>Argumentation Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteAssuranceCaseElementImpl extends DeleteImpl implements DeleteAssuranceCaseElement {
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
	 * The cached value of the '{@link #getArgumentationElement() <em>Argumentation Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentationElement()
	 * @generated
	 * @ordered
	 */
	protected ArtifactElement argumentationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteAssuranceCaseElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Action_assurancecasePackage.Literals.DELETE_ASSURANCE_CASE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactElement getArgumentationElement() {
		if (argumentationElement != null && argumentationElement.eIsProxy()) {
			InternalEObject oldArgumentationElement = (InternalEObject)argumentationElement;
			argumentationElement = (ArtifactElement)eResolveProxy(oldArgumentationElement);
			if (argumentationElement != oldArgumentationElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT, oldArgumentationElement, argumentationElement));
			}
		}
		return argumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactElement basicGetArgumentationElement() {
		return argumentationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgumentationElement(ArtifactElement newArgumentationElement) {
		ArtifactElement oldArgumentationElement = argumentationElement;
		argumentationElement = newArgumentationElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT, oldArgumentationElement, argumentationElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__INDEX:
				return getIndex();
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT:
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
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__INDEX:
				setIndex((Integer)newValue);
				return;
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT:
				setArgumentationElement((ArtifactElement)newValue);
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
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT:
				setArgumentationElement((ArtifactElement)null);
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
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__INDEX:
				return index != INDEX_EDEFAULT;
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT__ARGUMENTATION_ELEMENT:
				return argumentationElement != null;
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

} //DeleteAssuranceCaseElementImpl
