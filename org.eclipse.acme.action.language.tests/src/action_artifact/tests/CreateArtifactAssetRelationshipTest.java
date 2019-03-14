/**
 */
package action_artifact.tests;

import action_artifact.Action_artifactFactory;
import action_artifact.CreateArtifactAssetRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Artifact Asset Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateArtifactAssetRelationshipTest extends CreateArtifactAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateArtifactAssetRelationshipTest.class);
	}

	/**
	 * Constructs a new Create Artifact Asset Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactAssetRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Artifact Asset Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateArtifactAssetRelationship getFixture() {
		return (CreateArtifactAssetRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_artifactFactory.eINSTANCE.createCreateArtifactAssetRelationship());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //CreateArtifactAssetRelationshipTest
