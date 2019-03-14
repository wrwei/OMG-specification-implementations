/**
 */
package action_base.util;

import action_base.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see action_base.Action_basePackage
 * @generated
 */
public class Action_baseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_basePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_baseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Action_basePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Action_baseSwitch<Adapter> modelSwitch =
		new Action_baseSwitch<Adapter>() {
			@Override
			public Adapter caseActionElement(ActionElement object) {
				return createActionElementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseRererenceAction(RererenceAction object) {
				return createRererenceActionAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseRead(Read object) {
				return createReadAdapter();
			}
			@Override
			public Adapter caseUpdate(Update object) {
				return createUpdateAdapter();
			}
			@Override
			public Adapter caseDelete(Delete object) {
				return createDeleteAdapter();
			}
			@Override
			public Adapter caseUpdateGID(UpdateGID object) {
				return createUpdateGIDAdapter();
			}
			@Override
			public Adapter caseUpdateName(UpdateName object) {
				return createUpdateNameAdapter();
			}
			@Override
			public Adapter caseUpdateDescription(UpdateDescription object) {
				return createUpdateDescriptionAdapter();
			}
			@Override
			public Adapter caseUpdateImplementationConstraint(UpdateImplementationConstraint object) {
				return createUpdateImplementationConstraintAdapter();
			}
			@Override
			public Adapter caseDeleteImplementationConstraint(DeleteImplementationConstraint object) {
				return createDeleteImplementationConstraintAdapter();
			}
			@Override
			public Adapter caseAttachNote(AttachNote object) {
				return createAttachNoteAdapter();
			}
			@Override
			public Adapter caseDeleteNote(DeleteNote object) {
				return createDeleteNoteAdapter();
			}
			@Override
			public Adapter caseAddTaggedValue(AddTaggedValue object) {
				return createAddTaggedValueAdapter();
			}
			@Override
			public Adapter caseUpdateTaggedValue(UpdateTaggedValue object) {
				return createUpdateTaggedValueAdapter();
			}
			@Override
			public Adapter caseDeleteTaggedValue(DeleteTaggedValue object) {
				return createDeleteTaggedValueAdapter();
			}
			@Override
			public Adapter caseMakeAbstract(MakeAbstract object) {
				return createMakeAbstractAdapter();
			}
			@Override
			public Adapter caseMakeCitation(MakeCitation object) {
				return createMakeCitationAdapter();
			}
			@Override
			public Adapter caseCite(Cite object) {
				return createCiteAdapter();
			}
			@Override
			public Adapter caseCreateArtifactElement(CreateArtifactElement object) {
				return createCreateArtifactElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link action_base.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.ActionElement
	 * @generated
	 */
	public Adapter createActionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.RererenceAction <em>Rererence Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.RererenceAction
	 * @generated
	 */
	public Adapter createRererenceActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Read
	 * @generated
	 */
	public Adapter createReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Update <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Update
	 * @generated
	 */
	public Adapter createUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Delete
	 * @generated
	 */
	public Adapter createDeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.UpdateGID <em>Update GID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.UpdateGID
	 * @generated
	 */
	public Adapter createUpdateGIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.UpdateName <em>Update Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.UpdateName
	 * @generated
	 */
	public Adapter createUpdateNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.UpdateDescription <em>Update Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.UpdateDescription
	 * @generated
	 */
	public Adapter createUpdateDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.UpdateImplementationConstraint <em>Update Implementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.UpdateImplementationConstraint
	 * @generated
	 */
	public Adapter createUpdateImplementationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.DeleteImplementationConstraint <em>Delete Implementation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.DeleteImplementationConstraint
	 * @generated
	 */
	public Adapter createDeleteImplementationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.AttachNote <em>Attach Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.AttachNote
	 * @generated
	 */
	public Adapter createAttachNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.DeleteNote <em>Delete Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.DeleteNote
	 * @generated
	 */
	public Adapter createDeleteNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.AddTaggedValue <em>Add Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.AddTaggedValue
	 * @generated
	 */
	public Adapter createAddTaggedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.UpdateTaggedValue <em>Update Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.UpdateTaggedValue
	 * @generated
	 */
	public Adapter createUpdateTaggedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.DeleteTaggedValue <em>Delete Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.DeleteTaggedValue
	 * @generated
	 */
	public Adapter createDeleteTaggedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.MakeAbstract <em>Make Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.MakeAbstract
	 * @generated
	 */
	public Adapter createMakeAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.MakeCitation <em>Make Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.MakeCitation
	 * @generated
	 */
	public Adapter createMakeCitationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.Cite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.Cite
	 * @generated
	 */
	public Adapter createCiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_base.CreateArtifactElement <em>Create Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_base.CreateArtifactElement
	 * @generated
	 */
	public Adapter createCreateArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Action_baseAdapterFactory
