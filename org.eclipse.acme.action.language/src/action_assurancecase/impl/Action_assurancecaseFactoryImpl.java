/**
 */
package action_assurancecase.impl;

import action_assurancecase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Action_assurancecaseFactoryImpl extends EFactoryImpl implements Action_assurancecaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action_assurancecaseFactory init() {
		try {
			Action_assurancecaseFactory theAction_assurancecaseFactory = (Action_assurancecaseFactory)EPackage.Registry.INSTANCE.getEFactory(Action_assurancecasePackage.eNS_URI);
			if (theAction_assurancecaseFactory != null) {
				return theAction_assurancecaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Action_assurancecaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_assurancecaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Action_assurancecasePackage.ASSURANCE_CASE_ACTION_PACKAGE: return createAssuranceCaseActionPackage();
			case Action_assurancecasePackage.CREATE_ASSURANCE_CASE_PACKAGE: return createCreateAssuranceCasePackage();
			case Action_assurancecasePackage.CREATE_ASSURANCE_CASE_PACKAGE_INTERFACE: return createCreateAssuranceCasePackageInterface();
			case Action_assurancecasePackage.CREATE_ASSURANCE_CASE_PACKAGE_BINDING: return createCreateAssuranceCasePackageBinding();
			case Action_assurancecasePackage.UPDATE_ASSURANCE_CASE_ELEMENT: return createUpdateAssuranceCaseElement();
			case Action_assurancecasePackage.DELETE_ASSURANCE_CASE_ELEMENT: return createDeleteAssuranceCaseElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssuranceCaseActionPackage createAssuranceCaseActionPackage() {
		AssuranceCaseActionPackageImpl assuranceCaseActionPackage = new AssuranceCaseActionPackageImpl();
		return assuranceCaseActionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssuranceCasePackage createCreateAssuranceCasePackage() {
		CreateAssuranceCasePackageImpl createAssuranceCasePackage = new CreateAssuranceCasePackageImpl();
		return createAssuranceCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssuranceCasePackageInterface createCreateAssuranceCasePackageInterface() {
		CreateAssuranceCasePackageInterfaceImpl createAssuranceCasePackageInterface = new CreateAssuranceCasePackageInterfaceImpl();
		return createAssuranceCasePackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssuranceCasePackageBinding createCreateAssuranceCasePackageBinding() {
		CreateAssuranceCasePackageBindingImpl createAssuranceCasePackageBinding = new CreateAssuranceCasePackageBindingImpl();
		return createAssuranceCasePackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAssuranceCaseElement createUpdateAssuranceCaseElement() {
		UpdateAssuranceCaseElementImpl updateAssuranceCaseElement = new UpdateAssuranceCaseElementImpl();
		return updateAssuranceCaseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteAssuranceCaseElement createDeleteAssuranceCaseElement() {
		DeleteAssuranceCaseElementImpl deleteAssuranceCaseElement = new DeleteAssuranceCaseElementImpl();
		return deleteAssuranceCaseElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_assurancecasePackage getAction_assurancecasePackage() {
		return (Action_assurancecasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Action_assurancecasePackage getPackage() {
		return Action_assurancecasePackage.eINSTANCE;
	}

} //Action_assurancecaseFactoryImpl
