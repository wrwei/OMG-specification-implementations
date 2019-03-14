/**
 */
package action_argumentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see action_argumentation.Action_argumentationPackage
 * @generated
 */
public interface Action_argumentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Action_argumentationFactory eINSTANCE = action_argumentation.impl.Action_argumentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Argumentation Action Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argumentation Action Package</em>'.
	 * @generated
	 */
	ArgumentationActionPackage createArgumentationActionPackage();

	/**
	 * Returns a new object of class '<em>Create Argument Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Argument Package</em>'.
	 * @generated
	 */
	CreateArgumentPackage createCreateArgumentPackage();

	/**
	 * Returns a new object of class '<em>Create Argument Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Argument Package Interface</em>'.
	 * @generated
	 */
	CreateArgumentPackageInterface createCreateArgumentPackageInterface();

	/**
	 * Returns a new object of class '<em>Create Argument Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Argument Package Binding</em>'.
	 * @generated
	 */
	CreateArgumentPackageBinding createCreateArgumentPackageBinding();

	/**
	 * Returns a new object of class '<em>Create Argument Package Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Argument Package Group</em>'.
	 * @generated
	 */
	CreateArgumentPackageGroup createCreateArgumentPackageGroup();

	/**
	 * Returns a new object of class '<em>Update Argumentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Argumentation Element</em>'.
	 * @generated
	 */
	UpdateArgumentationElement createUpdateArgumentationElement();

	/**
	 * Returns a new object of class '<em>Delete Argumentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Argumentation Element</em>'.
	 * @generated
	 */
	DeleteArgumentationElement createDeleteArgumentationElement();

	/**
	 * Returns a new object of class '<em>Create Artifact Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Artifact Reference</em>'.
	 * @generated
	 */
	CreateArtifactReference createCreateArtifactReference();

	/**
	 * Returns a new object of class '<em>Refer To Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refer To Artifact</em>'.
	 * @generated
	 */
	ReferToArtifact createReferToArtifact();

	/**
	 * Returns a new object of class '<em>Declare Asserted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Asserted</em>'.
	 * @generated
	 */
	DeclareAsserted createDeclareAsserted();

	/**
	 * Returns a new object of class '<em>Declare Needs Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Needs Support</em>'.
	 * @generated
	 */
	DeclareNeedsSupport createDeclareNeedsSupport();

	/**
	 * Returns a new object of class '<em>Declare Assumed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Assumed</em>'.
	 * @generated
	 */
	DeclareAssumed createDeclareAssumed();

	/**
	 * Returns a new object of class '<em>Declare Axiomatic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Axiomatic</em>'.
	 * @generated
	 */
	DeclareAxiomatic createDeclareAxiomatic();

	/**
	 * Returns a new object of class '<em>Declare Defeated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare Defeated</em>'.
	 * @generated
	 */
	DeclareDefeated createDeclareDefeated();

	/**
	 * Returns a new object of class '<em>Declare As Cited</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declare As Cited</em>'.
	 * @generated
	 */
	DeclareAsCited createDeclareAsCited();

	/**
	 * Returns a new object of class '<em>Make Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Make Claim</em>'.
	 * @generated
	 */
	MakeClaim createMakeClaim();

	/**
	 * Returns a new object of class '<em>Create Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Argument Reasoning</em>'.
	 * @generated
	 */
	CreateArgumentReasoning createCreateArgumentReasoning();

	/**
	 * Returns a new object of class '<em>Create Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Asserted Context</em>'.
	 * @generated
	 */
	CreateAssertedContext createCreateAssertedContext();

	/**
	 * Returns a new object of class '<em>Create Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Asserted Evidence</em>'.
	 * @generated
	 */
	CreateAssertedEvidence createCreateAssertedEvidence();

	/**
	 * Returns a new object of class '<em>Create Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Asserted Inference</em>'.
	 * @generated
	 */
	CreateAssertedInference createCreateAssertedInference();

	/**
	 * Returns a new object of class '<em>Create Asserted Artifact Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Asserted Artifact Context</em>'.
	 * @generated
	 */
	CreateAssertedArtifactContext createCreateAssertedArtifactContext();

	/**
	 * Returns a new object of class '<em>Create Asserted Artifact Support</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Asserted Artifact Support</em>'.
	 * @generated
	 */
	CreateAssertedArtifactSupport createCreateAssertedArtifactSupport();

	/**
	 * Returns a new object of class '<em>Update Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Reasoning</em>'.
	 * @generated
	 */
	UpdateReasoning createUpdateReasoning();

	/**
	 * Returns a new object of class '<em>Update Meta Claim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Meta Claim</em>'.
	 * @generated
	 */
	UpdateMetaClaim createUpdateMetaClaim();

	/**
	 * Returns a new object of class '<em>Update Asserted Relationship Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Asserted Relationship Source</em>'.
	 * @generated
	 */
	UpdateAssertedRelationshipSource createUpdateAssertedRelationshipSource();

	/**
	 * Returns a new object of class '<em>Update Asserted Relationship Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Asserted Relationship Target</em>'.
	 * @generated
	 */
	UpdateAssertedRelationshipTarget createUpdateAssertedRelationshipTarget();

	/**
	 * Returns a new object of class '<em>Update Is Counter Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Is Counter Asserted Relationship</em>'.
	 * @generated
	 */
	UpdateIsCounterAssertedRelationship createUpdateIsCounterAssertedRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Action_argumentationPackage getAction_argumentationPackage();

} //Action_argumentationFactory
