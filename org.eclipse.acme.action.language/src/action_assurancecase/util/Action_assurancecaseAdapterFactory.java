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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see action_assurancecase.Action_assurancecasePackage
 * @generated
 */
public class Action_assurancecaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_assurancecasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_assurancecaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Action_assurancecasePackage.eINSTANCE;
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
	protected Action_assurancecaseSwitch<Adapter> modelSwitch =
		new Action_assurancecaseSwitch<Adapter>() {
			@Override
			public Adapter caseAssuranceCaseActionPackage(AssuranceCaseActionPackage object) {
				return createAssuranceCaseActionPackageAdapter();
			}
			@Override
			public Adapter caseCreateAssuranceCasePackage(CreateAssuranceCasePackage object) {
				return createCreateAssuranceCasePackageAdapter();
			}
			@Override
			public Adapter caseCreateAssuranceCasePackageInterface(CreateAssuranceCasePackageInterface object) {
				return createCreateAssuranceCasePackageInterfaceAdapter();
			}
			@Override
			public Adapter caseCreateAssuranceCasePackageBinding(CreateAssuranceCasePackageBinding object) {
				return createCreateAssuranceCasePackageBindingAdapter();
			}
			@Override
			public Adapter caseUpdateAssuranceCaseElement(UpdateAssuranceCaseElement object) {
				return createUpdateAssuranceCaseElementAdapter();
			}
			@Override
			public Adapter caseDeleteAssuranceCaseElement(DeleteAssuranceCaseElement object) {
				return createDeleteAssuranceCaseElementAdapter();
			}
			@Override
			public Adapter caseActionElement(ActionElement object) {
				return createActionElementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseCreateArtifactElement(CreateArtifactElement object) {
				return createCreateArtifactElementAdapter();
			}
			@Override
			public Adapter caseRererenceAction(RererenceAction object) {
				return createRererenceActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link action_assurancecase.AssuranceCaseActionPackage <em>Assurance Case Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_assurancecase.AssuranceCaseActionPackage
	 * @generated
	 */
	public Adapter createAssuranceCaseActionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_assurancecase.CreateAssuranceCasePackage <em>Create Assurance Case Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_assurancecase.CreateAssuranceCasePackage
	 * @generated
	 */
	public Adapter createCreateAssuranceCasePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_assurancecase.CreateAssuranceCasePackageInterface <em>Create Assurance Case Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_assurancecase.CreateAssuranceCasePackageInterface
	 * @generated
	 */
	public Adapter createCreateAssuranceCasePackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_assurancecase.CreateAssuranceCasePackageBinding <em>Create Assurance Case Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_assurancecase.CreateAssuranceCasePackageBinding
	 * @generated
	 */
	public Adapter createCreateAssuranceCasePackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_assurancecase.UpdateAssuranceCaseElement <em>Update Assurance Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_assurancecase.UpdateAssuranceCaseElement
	 * @generated
	 */
	public Adapter createUpdateAssuranceCaseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_assurancecase.DeleteAssuranceCaseElement <em>Delete Assurance Case Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_assurancecase.DeleteAssuranceCaseElement
	 * @generated
	 */
	public Adapter createDeleteAssuranceCaseElementAdapter() {
		return null;
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

} //Action_assurancecaseAdapterFactory
