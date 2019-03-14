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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see action_terminology.Action_terminologyPackage
 * @generated
 */
public class Action_terminologyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Action_terminologyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_terminologyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Action_terminologyPackage.eINSTANCE;
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
	protected Action_terminologySwitch<Adapter> modelSwitch =
		new Action_terminologySwitch<Adapter>() {
			@Override
			public Adapter caseTerminologyActionPackage(TerminologyActionPackage object) {
				return createTerminologyActionPackageAdapter();
			}
			@Override
			public Adapter caseCreateTerminologyPackage(CreateTerminologyPackage object) {
				return createCreateTerminologyPackageAdapter();
			}
			@Override
			public Adapter caseCreateTerminologyPackageInterface(CreateTerminologyPackageInterface object) {
				return createCreateTerminologyPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseCreateTerminologyPackageBinding(CreateTerminologyPackageBinding object) {
				return createCreateTerminologyPackageBindingAdapter();
			}
			@Override
			public Adapter caseCreateTerminologyPackageGroup(CreateTerminologyPackageGroup object) {
				return createCreateTerminologyPackageGroupAdapter();
			}
			@Override
			public Adapter caseUpdateArtifactElement(UpdateArtifactElement object) {
				return createUpdateArtifactElementAdapter();
			}
			@Override
			public Adapter caseDeleteArtifactElement(DeleteArtifactElement object) {
				return createDeleteArtifactElementAdapter();
			}
			@Override
			public Adapter caseCreateTerminologyAsset(CreateTerminologyAsset object) {
				return createCreateTerminologyAssetAdapter();
			}
			@Override
			public Adapter caseCreateCategory(CreateCategory object) {
				return createCreateCategoryAdapter();
			}
			@Override
			public Adapter caseCreateExpressionElement(CreateExpressionElement object) {
				return createCreateExpressionElementAdapter();
			}
			@Override
			public Adapter caseCreateExpression(CreateExpression object) {
				return createCreateExpressionAdapter();
			}
			@Override
			public Adapter caseCreateTerm(CreateTerm object) {
				return createCreateTermAdapter();
			}
			@Override
			public Adapter caseUpdateExpressionElementCategory(UpdateExpressionElementCategory object) {
				return createUpdateExpressionElementCategoryAdapter();
			}
			@Override
			public Adapter caseUpdateExpressionElementValue(UpdateExpressionElementValue object) {
				return createUpdateExpressionElementValueAdapter();
			}
			@Override
			public Adapter caseUpdateExpressionElementExpression(UpdateExpressionElementExpression object) {
				return createUpdateExpressionElementExpressionAdapter();
			}
			@Override
			public Adapter caseupdateTermExternalReference(updateTermExternalReference object) {
				return createupdateTermExternalReferenceAdapter();
			}
			@Override
			public Adapter caseUpdateTermOrigin(UpdateTermOrigin object) {
				return createUpdateTermOriginAdapter();
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
	 * Creates a new adapter for an object of class '{@link action_terminology.TerminologyActionPackage <em>Terminology Action Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.TerminologyActionPackage
	 * @generated
	 */
	public Adapter createTerminologyActionPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateTerminologyPackage <em>Create Terminology Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateTerminologyPackage
	 * @generated
	 */
	public Adapter createCreateTerminologyPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateTerminologyPackageInterface <em>Create Terminology Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateTerminologyPackageInterface
	 * @generated
	 */
	public Adapter createCreateTerminologyPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateTerminologyPackageBinding <em>Create Terminology Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateTerminologyPackageBinding
	 * @generated
	 */
	public Adapter createCreateTerminologyPackageBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateTerminologyPackageGroup <em>Create Terminology Package Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateTerminologyPackageGroup
	 * @generated
	 */
	public Adapter createCreateTerminologyPackageGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.UpdateArtifactElement <em>Update Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.UpdateArtifactElement
	 * @generated
	 */
	public Adapter createUpdateArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.DeleteArtifactElement <em>Delete Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.DeleteArtifactElement
	 * @generated
	 */
	public Adapter createDeleteArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateTerminologyAsset <em>Create Terminology Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateTerminologyAsset
	 * @generated
	 */
	public Adapter createCreateTerminologyAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateCategory <em>Create Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateCategory
	 * @generated
	 */
	public Adapter createCreateCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateExpressionElement <em>Create Expression Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateExpressionElement
	 * @generated
	 */
	public Adapter createCreateExpressionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateExpression <em>Create Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateExpression
	 * @generated
	 */
	public Adapter createCreateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.CreateTerm <em>Create Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.CreateTerm
	 * @generated
	 */
	public Adapter createCreateTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.UpdateExpressionElementCategory <em>Update Expression Element Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.UpdateExpressionElementCategory
	 * @generated
	 */
	public Adapter createUpdateExpressionElementCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.UpdateExpressionElementValue <em>Update Expression Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.UpdateExpressionElementValue
	 * @generated
	 */
	public Adapter createUpdateExpressionElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.UpdateExpressionElementExpression <em>Update Expression Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.UpdateExpressionElementExpression
	 * @generated
	 */
	public Adapter createUpdateExpressionElementExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.updateTermExternalReference <em>update Term External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.updateTermExternalReference
	 * @generated
	 */
	public Adapter createupdateTermExternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link action_terminology.UpdateTermOrigin <em>Update Term Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see action_terminology.UpdateTermOrigin
	 * @generated
	 */
	public Adapter createUpdateTermOriginAdapter() {
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

} //Action_terminologyAdapterFactory
