/**
 */
package action_base.util;

import action_base.*;

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
 * @see action_base.Action_basePackage
 * @generated
 */
public class Action_baseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_basePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_baseSwitch() {
		if (modelPackage == null) {
			modelPackage = Action_basePackage.eINSTANCE;
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
			case Action_basePackage.ACTION_ELEMENT: {
				ActionElement actionElement = (ActionElement)theEObject;
				T result = caseActionElement(actionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseActionElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.RERERENCE_ACTION: {
				RererenceAction rererenceAction = (RererenceAction)theEObject;
				T result = caseRererenceAction(rererenceAction);
				if (result == null) result = caseAction(rererenceAction);
				if (result == null) result = caseActionElement(rererenceAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseAction(create);
				if (result == null) result = caseActionElement(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.READ: {
				Read read = (Read)theEObject;
				T result = caseRead(read);
				if (result == null) result = caseRererenceAction(read);
				if (result == null) result = caseAction(read);
				if (result == null) result = caseActionElement(read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.UPDATE: {
				Update update = (Update)theEObject;
				T result = caseUpdate(update);
				if (result == null) result = caseRererenceAction(update);
				if (result == null) result = caseAction(update);
				if (result == null) result = caseActionElement(update);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseRererenceAction(delete);
				if (result == null) result = caseAction(delete);
				if (result == null) result = caseActionElement(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.UPDATE_GID: {
				UpdateGID updateGID = (UpdateGID)theEObject;
				T result = caseUpdateGID(updateGID);
				if (result == null) result = caseUpdate(updateGID);
				if (result == null) result = caseRererenceAction(updateGID);
				if (result == null) result = caseAction(updateGID);
				if (result == null) result = caseActionElement(updateGID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.UPDATE_NAME: {
				UpdateName updateName = (UpdateName)theEObject;
				T result = caseUpdateName(updateName);
				if (result == null) result = caseUpdate(updateName);
				if (result == null) result = caseRererenceAction(updateName);
				if (result == null) result = caseAction(updateName);
				if (result == null) result = caseActionElement(updateName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.UPDATE_DESCRIPTION: {
				UpdateDescription updateDescription = (UpdateDescription)theEObject;
				T result = caseUpdateDescription(updateDescription);
				if (result == null) result = caseUpdate(updateDescription);
				if (result == null) result = caseRererenceAction(updateDescription);
				if (result == null) result = caseAction(updateDescription);
				if (result == null) result = caseActionElement(updateDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.UPDATE_IMPLEMENTATION_CONSTRAINT: {
				UpdateImplementationConstraint updateImplementationConstraint = (UpdateImplementationConstraint)theEObject;
				T result = caseUpdateImplementationConstraint(updateImplementationConstraint);
				if (result == null) result = caseUpdate(updateImplementationConstraint);
				if (result == null) result = caseRererenceAction(updateImplementationConstraint);
				if (result == null) result = caseAction(updateImplementationConstraint);
				if (result == null) result = caseActionElement(updateImplementationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.DELETE_IMPLEMENTATION_CONSTRAINT: {
				DeleteImplementationConstraint deleteImplementationConstraint = (DeleteImplementationConstraint)theEObject;
				T result = caseDeleteImplementationConstraint(deleteImplementationConstraint);
				if (result == null) result = caseDelete(deleteImplementationConstraint);
				if (result == null) result = caseRererenceAction(deleteImplementationConstraint);
				if (result == null) result = caseAction(deleteImplementationConstraint);
				if (result == null) result = caseActionElement(deleteImplementationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.ATTACH_NOTE: {
				AttachNote attachNote = (AttachNote)theEObject;
				T result = caseAttachNote(attachNote);
				if (result == null) result = caseUpdate(attachNote);
				if (result == null) result = caseRererenceAction(attachNote);
				if (result == null) result = caseAction(attachNote);
				if (result == null) result = caseActionElement(attachNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.DELETE_NOTE: {
				DeleteNote deleteNote = (DeleteNote)theEObject;
				T result = caseDeleteNote(deleteNote);
				if (result == null) result = caseDelete(deleteNote);
				if (result == null) result = caseRererenceAction(deleteNote);
				if (result == null) result = caseAction(deleteNote);
				if (result == null) result = caseActionElement(deleteNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.ADD_TAGGED_VALUE: {
				AddTaggedValue addTaggedValue = (AddTaggedValue)theEObject;
				T result = caseAddTaggedValue(addTaggedValue);
				if (result == null) result = caseUpdate(addTaggedValue);
				if (result == null) result = caseRererenceAction(addTaggedValue);
				if (result == null) result = caseAction(addTaggedValue);
				if (result == null) result = caseActionElement(addTaggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.UPDATE_TAGGED_VALUE: {
				UpdateTaggedValue updateTaggedValue = (UpdateTaggedValue)theEObject;
				T result = caseUpdateTaggedValue(updateTaggedValue);
				if (result == null) result = caseUpdate(updateTaggedValue);
				if (result == null) result = caseRererenceAction(updateTaggedValue);
				if (result == null) result = caseAction(updateTaggedValue);
				if (result == null) result = caseActionElement(updateTaggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.DELETE_TAGGED_VALUE: {
				DeleteTaggedValue deleteTaggedValue = (DeleteTaggedValue)theEObject;
				T result = caseDeleteTaggedValue(deleteTaggedValue);
				if (result == null) result = caseUpdate(deleteTaggedValue);
				if (result == null) result = caseRererenceAction(deleteTaggedValue);
				if (result == null) result = caseAction(deleteTaggedValue);
				if (result == null) result = caseActionElement(deleteTaggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.MAKE_ABSTRACT: {
				MakeAbstract makeAbstract = (MakeAbstract)theEObject;
				T result = caseMakeAbstract(makeAbstract);
				if (result == null) result = caseUpdate(makeAbstract);
				if (result == null) result = caseRererenceAction(makeAbstract);
				if (result == null) result = caseAction(makeAbstract);
				if (result == null) result = caseActionElement(makeAbstract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.MAKE_CITATION: {
				MakeCitation makeCitation = (MakeCitation)theEObject;
				T result = caseMakeCitation(makeCitation);
				if (result == null) result = caseUpdate(makeCitation);
				if (result == null) result = caseRererenceAction(makeCitation);
				if (result == null) result = caseAction(makeCitation);
				if (result == null) result = caseActionElement(makeCitation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.CITE: {
				Cite cite = (Cite)theEObject;
				T result = caseCite(cite);
				if (result == null) result = caseUpdate(cite);
				if (result == null) result = caseRererenceAction(cite);
				if (result == null) result = caseAction(cite);
				if (result == null) result = caseActionElement(cite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Action_basePackage.CREATE_ARTIFACT_ELEMENT: {
				CreateArtifactElement createArtifactElement = (CreateArtifactElement)theEObject;
				T result = caseCreateArtifactElement(createArtifactElement);
				if (result == null) result = caseCreate(createArtifactElement);
				if (result == null) result = caseAction(createArtifactElement);
				if (result == null) result = caseActionElement(createArtifactElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRead(Read object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Update GID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update GID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateGID(UpdateGID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateName(UpdateName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateDescription(UpdateDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Implementation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Implementation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateImplementationConstraint(UpdateImplementationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Implementation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Implementation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteImplementationConstraint(DeleteImplementationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachNote(AttachNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteNote(DeleteNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddTaggedValue(AddTaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateTaggedValue(UpdateTaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteTaggedValue(DeleteTaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make Abstract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make Abstract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMakeAbstract(MakeAbstract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make Citation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make Citation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMakeCitation(MakeCitation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCite(Cite object) {
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

} //Action_baseSwitch
