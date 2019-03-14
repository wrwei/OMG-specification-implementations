/**
 */
package action_terminology.impl;

import action_terminology.*;

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
public class Action_terminologyFactoryImpl extends EFactoryImpl implements Action_terminologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action_terminologyFactory init() {
		try {
			Action_terminologyFactory theAction_terminologyFactory = (Action_terminologyFactory)EPackage.Registry.INSTANCE.getEFactory(Action_terminologyPackage.eNS_URI);
			if (theAction_terminologyFactory != null) {
				return theAction_terminologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Action_terminologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_terminologyFactoryImpl() {
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
			case Action_terminologyPackage.TERMINOLOGY_ACTION_PACKAGE: return createTerminologyActionPackage();
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE: return createCreateTerminologyPackage();
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE_INTERFACE: return createCreateTerminologyPackageInterface();
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE_BINDING: return createCreateTerminologyPackageBinding();
			case Action_terminologyPackage.CREATE_TERMINOLOGY_PACKAGE_GROUP: return createCreateTerminologyPackageGroup();
			case Action_terminologyPackage.UPDATE_ARTIFACT_ELEMENT: return createUpdateArtifactElement();
			case Action_terminologyPackage.DELETE_ARTIFACT_ELEMENT: return createDeleteArtifactElement();
			case Action_terminologyPackage.CREATE_CATEGORY: return createCreateCategory();
			case Action_terminologyPackage.CREATE_EXPRESSION: return createCreateExpression();
			case Action_terminologyPackage.CREATE_TERM: return createCreateTerm();
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_CATEGORY: return createUpdateExpressionElementCategory();
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_VALUE: return createUpdateExpressionElementValue();
			case Action_terminologyPackage.UPDATE_EXPRESSION_ELEMENT_EXPRESSION: return createUpdateExpressionElementExpression();
			case Action_terminologyPackage.UPDATE_TERM_EXTERNAL_REFERENCE: return createupdateTermExternalReference();
			case Action_terminologyPackage.UPDATE_TERM_ORIGIN: return createUpdateTermOrigin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminologyActionPackage createTerminologyActionPackage() {
		TerminologyActionPackageImpl terminologyActionPackage = new TerminologyActionPackageImpl();
		return terminologyActionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTerminologyPackage createCreateTerminologyPackage() {
		CreateTerminologyPackageImpl createTerminologyPackage = new CreateTerminologyPackageImpl();
		return createTerminologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTerminologyPackageInterface createCreateTerminologyPackageInterface() {
		CreateTerminologyPackageInterfaceImpl createTerminologyPackageInterface = new CreateTerminologyPackageInterfaceImpl();
		return createTerminologyPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTerminologyPackageBinding createCreateTerminologyPackageBinding() {
		CreateTerminologyPackageBindingImpl createTerminologyPackageBinding = new CreateTerminologyPackageBindingImpl();
		return createTerminologyPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTerminologyPackageGroup createCreateTerminologyPackageGroup() {
		CreateTerminologyPackageGroupImpl createTerminologyPackageGroup = new CreateTerminologyPackageGroupImpl();
		return createTerminologyPackageGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactElement createUpdateArtifactElement() {
		UpdateArtifactElementImpl updateArtifactElement = new UpdateArtifactElementImpl();
		return updateArtifactElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteArtifactElement createDeleteArtifactElement() {
		DeleteArtifactElementImpl deleteArtifactElement = new DeleteArtifactElementImpl();
		return deleteArtifactElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateCategory createCreateCategory() {
		CreateCategoryImpl createCategory = new CreateCategoryImpl();
		return createCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateExpression createCreateExpression() {
		CreateExpressionImpl createExpression = new CreateExpressionImpl();
		return createExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTerm createCreateTerm() {
		CreateTermImpl createTerm = new CreateTermImpl();
		return createTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateExpressionElementCategory createUpdateExpressionElementCategory() {
		UpdateExpressionElementCategoryImpl updateExpressionElementCategory = new UpdateExpressionElementCategoryImpl();
		return updateExpressionElementCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateExpressionElementValue createUpdateExpressionElementValue() {
		UpdateExpressionElementValueImpl updateExpressionElementValue = new UpdateExpressionElementValueImpl();
		return updateExpressionElementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateExpressionElementExpression createUpdateExpressionElementExpression() {
		UpdateExpressionElementExpressionImpl updateExpressionElementExpression = new UpdateExpressionElementExpressionImpl();
		return updateExpressionElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public updateTermExternalReference createupdateTermExternalReference() {
		updateTermExternalReferenceImpl updateTermExternalReference = new updateTermExternalReferenceImpl();
		return updateTermExternalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTermOrigin createUpdateTermOrigin() {
		UpdateTermOriginImpl updateTermOrigin = new UpdateTermOriginImpl();
		return updateTermOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_terminologyPackage getAction_terminologyPackage() {
		return (Action_terminologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Action_terminologyPackage getPackage() {
		return Action_terminologyPackage.eINSTANCE;
	}

} //Action_terminologyFactoryImpl
