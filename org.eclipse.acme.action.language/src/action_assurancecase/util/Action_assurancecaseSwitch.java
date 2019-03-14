/**
 */
package action_assurancecase.util;

import action_assurancecase.*;

import action_base.Action;
import action_base.ActionElement;
import action_base.Create;
import action_base.CreateArtifactElement;
import action_base.Delete;
import action_base.RererenceAction;
import action_base.Update;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see action_assurancecase.Action_assurancecasePackage
 * @generated
 */
public class Action_assurancecaseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_assurancecasePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_assurancecaseSwitch() {
		if (modelPackage == null) {
			modelPackage = Action_assurancecasePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE: {
				AssuranceCaseActionPackage assuranceCaseActionPackage = (AssuranceCaseActionPackage)theEObject;
				T result = caseAssuranceCaseActionPackage(assuranceCaseActionPackage);
				if (result == null) result = caseActionElement(assuranceCaseActionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_assurancecasePackage.CREATE_ASSURANCE_CASE_PACKAGE: {
				CreateAssuranceCasePackage createAssuranceCasePackage = (CreateAssuranceCasePackage)theEObject;
				T result = caseCreateAssuranceCasePackage(createAssuranceCasePackage);
				if (result == null) result = caseCreateArtifactElement(createAssuranceCasePackage);
				if (result == null) result = caseCreate(createAssuranceCasePackage);
				if (result == null) result = caseAction(createAssuranceCasePackage);
				if (result == null) result = caseActionElement(createAssuranceCasePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_assurancecasePackage.CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE: {
				CreateAssuranceCasePackageInterface createAssuranceCasePackageInterface = (CreateAssuranceCasePackageInterface)theEObject;
				T result = caseCreateAssuranceCasePackageInterface(createAssuranceCasePackageInterface);
				if (result == null) result = caseCreateArtifactElement(createAssuranceCasePackageInterface);
				if (result == null) result = caseCreate(createAssuranceCasePackageInterface);
				if (result == null) result = caseAction(createAssuranceCasePackageInterface);
				if (result == null) result = caseActionElement(createAssuranceCasePackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_assurancecasePackage.CREATE_ASSURANCE_CASE_PACKAGE_BINDING: {
				CreateAssuranceCasePackageBinding createAssuranceCasePackageBinding = (CreateAssuranceCasePackageBinding)theEObject;
				T result = caseCreateAssuranceCasePackageBinding(createAssuranceCasePackageBinding);
				if (result == null) result = caseCreateArtifactElement(createAssuranceCasePackageBinding);
				if (result == null) result = caseCreate(createAssuranceCasePackageBinding);
				if (result == null) result = caseAction(createAssuranceCasePackageBinding);
				if (result == null) result = caseActionElement(createAssuranceCasePackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_assurancecasePackage.UPDATE_ASSURANCE_CASE_ELEMENT: {
				UpdateAssuranceCaseElement updateAssuranceCaseElement = (UpdateAssuranceCaseElement)theEObject;
				T result = caseUpdateAssuranceCaseElement(updateAssuranceCaseElement);
				if (result == null) result = caseUpdate(updateAssuranceCaseElement);
				if (result == null) result = caseRererenceAction(updateAssuranceCaseElement);
				if (result == null) result = caseAction(updateAssuranceCaseElement);
				if (result == null) result = caseActionElement(updateAssuranceCaseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT: {
				DeleteAssuranceCaseElement deleteAssuranceCaseElement = (DeleteAssuranceCaseElement)theEObject;
				T result = caseDeleteAssuranceCaseElement(deleteAssuranceCaseElement);
				if (result == null) result = caseDelete(deleteAssuranceCaseElement);
				if (result == null) result = caseRererenceAction(deleteAssuranceCaseElement);
				if (result == null) result = caseAction(deleteAssuranceCaseElement);
				if (result == null) result = caseActionElement(deleteAssuranceCaseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assurance Case Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assurance Case Action Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssuranceCaseActionPackage(AssuranceCaseActionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Assurance Case Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Assurance Case Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssuranceCasePackage(CreateAssuranceCasePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Assurance Case Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Assurance Case Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssuranceCasePackageInterface(CreateAssuranceCasePackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Assurance Case Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Assurance Case Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateAssuranceCasePackageBinding(CreateAssuranceCasePackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Assurance Case Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Assurance Case Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateAssuranceCaseElement(UpdateAssuranceCaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Assurance Case Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Assurance Case Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteAssuranceCaseElement(DeleteAssuranceCaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionElement(ActionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateArtifactElement(CreateArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rererence Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rererence Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRererenceAction(RererenceAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdate(Update object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Action_assurancecaseSwitch
