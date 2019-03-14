/**
 */
package action_terminology.util;

import action_base.Action;
import action_base.ActionElement;
import action_base.Create;
import action_base.CreateArtifactElement;
import action_base.Delete;
import action_base.RererenceAction;
import action_base.Update;

import action_terminology.*;

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
 * @see action_terminology.Action_terminologyPackage
 * @generated
 */
public class Action_terminologySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_terminologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_terminologySwitch() {
		if (modelPackage == null) {
			modelPackage = Action_terminologyPackage.eINSTANCE;
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
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE: {
				TerminologyActionPackage terminologyActionPackage = (TerminologyActionPackage)theEObject;
				T result = caseTerminologyActionPackage(terminologyActionPackage);
				if (result == null) result = caseActionElement(terminologyActionPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE: {
				CreateTerminologyPackage createTerminologyPackage = (CreateTerminologyPackage)theEObject;
				T result = caseCreateTerminologyPackage(createTerminologyPackage);
				if (result == null) result = caseCreateArtifactElement(createTerminologyPackage);
				if (result == null) result = caseCreate(createTerminologyPackage);
				if (result == null) result = caseAction(createTerminologyPackage);
				if (result == null) result = caseActionElement(createTerminologyPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE_INTERFACE: {
				CreateTerminologyPackageInterface createTerminologyPackageInterface = (CreateTerminologyPackageInterface)theEObject;
				T result = caseCreateTerminologyPackageInterface(createTerminologyPackageInterface);
				if (result == null) result = caseCreateArtifactElement(createTerminologyPackageInterface);
				if (result == null) result = caseCreate(createTerminologyPackageInterface);
				if (result == null) result = caseAction(createTerminologyPackageInterface);
				if (result == null) result = caseActionElement(createTerminologyPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE_BINDING: {
				CreateTerminologyPackageBinding createTerminologyPackageBinding = (CreateTerminologyPackageBinding)theEObject;
				T result = caseCreateTerminologyPackageBinding(createTerminologyPackageBinding);
				if (result == null) result = caseCreateArtifactElement(createTerminologyPackageBinding);
				if (result == null) result = caseCreate(createTerminologyPackageBinding);
				if (result == null) result = caseAction(createTerminologyPackageBinding);
				if (result == null) result = caseActionElement(createTerminologyPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE_GROUP: {
				CreateTerminologyPackageGroup createTerminologyPackageGroup = (CreateTerminologyPackageGroup)theEObject;
				T result = caseCreateTerminologyPackageGroup(createTerminologyPackageGroup);
				if (result == null) result = caseCreateArtifactElement(createTerminologyPackageGroup);
				if (result == null) result = caseCreate(createTerminologyPackageGroup);
				if (result == null) result = caseAction(createTerminologyPackageGroup);
				if (result == null) result = caseActionElement(createTerminologyPackageGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.UPDATE_ARTIFACT_ELEMENT: {
				UpdateArtifactElement updateArtifactElement = (UpdateArtifactElement)theEObject;
				T result = caseUpdateArtifactElement(updateArtifactElement);
				if (result == null) result = caseUpdate(updateArtifactElement);
				if (result == null) result = caseRererenceAction(updateArtifactElement);
				if (result == null) result = caseAction(updateArtifactElement);
				if (result == null) result = caseActionElement(updateArtifactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.DELETE_ARTIFACT_ELEMENT: {
				DeleteArtifactElement deleteArtifactElement = (DeleteArtifactElement)theEObject;
				T result = caseDeleteArtifactElement(deleteArtifactElement);
				if (result == null) result = caseDelete(deleteArtifactElement);
				if (result == null) result = caseRererenceAction(deleteArtifactElement);
				if (result == null) result = caseAction(deleteArtifactElement);
				if (result == null) result = caseActionElement(deleteArtifactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_TERMINOLOGY_ASSET: {
				CreateTerminologyAsset createTerminologyAsset = (CreateTerminologyAsset)theEObject;
				T result = caseCreateTerminologyAsset(createTerminologyAsset);
				if (result == null) result = caseCreate(createTerminologyAsset);
				if (result == null) result = caseAction(createTerminologyAsset);
				if (result == null) result = caseActionElement(createTerminologyAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_CATEGORY: {
				CreateCategory createCategory = (CreateCategory)theEObject;
				T result = caseCreateCategory(createCategory);
				if (result == null) result = caseCreateTerminologyAsset(createCategory);
				if (result == null) result = caseCreate(createCategory);
				if (result == null) result = caseAction(createCategory);
				if (result == null) result = caseActionElement(createCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_EXPRESSION_ELEMENT: {
				CreateExpressionElement createExpressionElement = (CreateExpressionElement)theEObject;
				T result = caseCreateExpressionElement(createExpressionElement);
				if (result == null) result = caseCreate(createExpressionElement);
				if (result == null) result = caseAction(createExpressionElement);
				if (result == null) result = caseActionElement(createExpressionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_EXPRESSION: {
				CreateExpression createExpression = (CreateExpression)theEObject;
				T result = caseCreateExpression(createExpression);
				if (result == null) result = caseCreateTerminologyAsset(createExpression);
				if (result == null) result = caseCreate(createExpression);
				if (result == null) result = caseAction(createExpression);
				if (result == null) result = caseActionElement(createExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.CREATE_TERM: {
				CreateTerm createTerm = (CreateTerm)theEObject;
				T result = caseCreateTerm(createTerm);
				if (result == null) result = caseCreateTerminologyAsset(createTerm);
				if (result == null) result = caseCreate(createTerm);
				if (result == null) result = caseAction(createTerm);
				if (result == null) result = caseActionElement(createTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_CATEGORY: {
				UpdateExpressionElementCategory updateExpressionElementCategory = (UpdateExpressionElementCategory)theEObject;
				T result = caseUpdateExpressionElementCategory(updateExpressionElementCategory);
				if (result == null) result = caseUpdate(updateExpressionElementCategory);
				if (result == null) result = caseRererenceAction(updateExpressionElementCategory);
				if (result == null) result = caseAction(updateExpressionElementCategory);
				if (result == null) result = caseActionElement(updateExpressionElementCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_VALUE: {
				UpdateExpressionElementValue updateExpressionElementValue = (UpdateExpressionElementValue)theEObject;
				T result = caseUpdateExpressionElementValue(updateExpressionElementValue);
				if (result == null) result = caseUpdate(updateExpressionElementValue);
				if (result == null) result = caseRererenceAction(updateExpressionElementValue);
				if (result == null) result = caseAction(updateExpressionElementValue);
				if (result == null) result = caseActionElement(updateExpressionElementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION: {
				UpdateExpressionElementExpression updateExpressionElementExpression = (UpdateExpressionElementExpression)theEObject;
				T result = caseUpdateExpressionElementExpression(updateExpressionElementExpression);
				if (result == null) result = caseUpdate(updateExpressionElementExpression);
				if (result == null) result = caseRererenceAction(updateExpressionElementExpression);
				if (result == null) result = caseAction(updateExpressionElementExpression);
				if (result == null) result = caseActionElement(updateExpressionElementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.UPDATE_TERM_EXTERNAL_REFERENCE: {
				updateTermExternalReference updateTermExternalReference = (updateTermExternalReference)theEObject;
				T result = caseupdateTermExternalReference(updateTermExternalReference);
				if (result == null) result = caseUpdate(updateTermExternalReference);
				if (result == null) result = caseRererenceAction(updateTermExternalReference);
				if (result == null) result = caseAction(updateTermExternalReference);
				if (result == null) result = caseActionElement(updateTermExternalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_terminologyPackage.UPDATE_TERM_ORIGIN: {
				UpdateTermOrigin updateTermOrigin = (UpdateTermOrigin)theEObject;
				T result = caseUpdateTermOrigin(updateTermOrigin);
				if (result == null) result = caseUpdate(updateTermOrigin);
				if (result == null) result = caseRererenceAction(updateTermOrigin);
				if (result == null) result = caseAction(updateTermOrigin);
				if (result == null) result = caseActionElement(updateTermOrigin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Action Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyActionPackage(TerminologyActionPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Terminology Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Terminology Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTerminologyPackage(CreateTerminologyPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Terminology Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Terminology Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTerminologyPackageInterface(CreateTerminologyPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Terminology Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Terminology Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTerminologyPackageBinding(CreateTerminologyPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Terminology Package Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Terminology Package Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTerminologyPackageGroup(CreateTerminologyPackageGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateArtifactElement(UpdateArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteArtifactElement(DeleteArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Terminology Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Terminology Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTerminologyAsset(CreateTerminologyAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateCategory(CreateCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Expression Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Expression Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateExpressionElement(CreateExpressionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateExpression(CreateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateTerm(CreateTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Expression Element Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Expression Element Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateExpressionElementCategory(UpdateExpressionElementCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Expression Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Expression Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateExpressionElementValue(UpdateExpressionElementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Expression Element Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Expression Element Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateExpressionElementExpression(UpdateExpressionElementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>update Term External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>update Term External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseupdateTermExternalReference(updateTermExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Term Origin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Term Origin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateTermOrigin(UpdateTermOrigin object) {
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

} //Action_terminologySwitch
