/**
 */
package action_base.impl;

import action_base.*;

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
public class Action_baseFactoryImpl extends EFactoryImpl implements Action_baseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Action_baseFactory init() {
		try {
			Action_baseFactory theAction_baseFactory = (Action_baseFactory)EPackage.Registry.INSTANCE.getEFactory(Action_basePackage.eNS_URI);
			if (theAction_baseFactory != null) {
				return theAction_baseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Action_baseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_baseFactoryImpl() {
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
			case Action_basePackage.READ: return createRead();
			case Action_basePackage.DELETE: return createDelete();
			case Action_basePackage.UPDATE_GID: return createUpdateGID();
			case Action_basePackage.UPDATE_NAME: return createUpdateName();
			case Action_basePackage.UPDATE_DESCRIPTION: return createUpdateDescription();
			case Action_basePackage.UPDATE_IMPLEMENTATION_CONSTRAINT: return createUpdateImplementationConstraint();
			case Action_basePackage.DELETE_IMPLEMENTATION_CONSTRAINT: return createDeleteImplementationConstraint();
			case Action_basePackage.ATTACH_NOTE: return createAttachNote();
			case Action_basePackage.DELETE_NOTE: return createDeleteNote();
			case Action_basePackage.ADD_TAGGED_VALUE: return createAddTaggedValue();
			case Action_basePackage.UPDATE_TAGGED_VALUE: return createUpdateTaggedValue();
			case Action_basePackage.DELETE_TAGGED_VALUE: return createDeleteTaggedValue();
			case Action_basePackage.MAKE_ABSTRACT: return createMakeAbstract();
			case Action_basePackage.MAKE_CITATION: return createMakeCitation();
			case Action_basePackage.CITE: return createCite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateGID createUpdateGID() {
		UpdateGIDImpl updateGID = new UpdateGIDImpl();
		return updateGID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateName createUpdateName() {
		UpdateNameImpl updateName = new UpdateNameImpl();
		return updateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateDescription createUpdateDescription() {
		UpdateDescriptionImpl updateDescription = new UpdateDescriptionImpl();
		return updateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateImplementationConstraint createUpdateImplementationConstraint() {
		UpdateImplementationConstraintImpl updateImplementationConstraint = new UpdateImplementationConstraintImpl();
		return updateImplementationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteImplementationConstraint createDeleteImplementationConstraint() {
		DeleteImplementationConstraintImpl deleteImplementationConstraint = new DeleteImplementationConstraintImpl();
		return deleteImplementationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachNote createAttachNote() {
		AttachNoteImpl attachNote = new AttachNoteImpl();
		return attachNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteNote createDeleteNote() {
		DeleteNoteImpl deleteNote = new DeleteNoteImpl();
		return deleteNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddTaggedValue createAddTaggedValue() {
		AddTaggedValueImpl addTaggedValue = new AddTaggedValueImpl();
		return addTaggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTaggedValue createUpdateTaggedValue() {
		UpdateTaggedValueImpl updateTaggedValue = new UpdateTaggedValueImpl();
		return updateTaggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteTaggedValue createDeleteTaggedValue() {
		DeleteTaggedValueImpl deleteTaggedValue = new DeleteTaggedValueImpl();
		return deleteTaggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeAbstract createMakeAbstract() {
		MakeAbstractImpl makeAbstract = new MakeAbstractImpl();
		return makeAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeCitation createMakeCitation() {
		MakeCitationImpl makeCitation = new MakeCitationImpl();
		return makeCitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cite createCite() {
		CiteImpl cite = new CiteImpl();
		return cite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action_basePackage getAction_basePackage() {
		return (Action_basePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Action_basePackage getPackage() {
		return Action_basePackage.eINSTANCE;
	}

} //Action_baseFactoryImpl
