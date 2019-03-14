/**
 */
package action_artifact.tests;

import action_artifact.Action_artifactFactory;
import action_artifact.CreateParticipant;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Participant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateParticipantTest extends CreateArtifactAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateParticipantTest.class);
	}

	/**
	 * Constructs a new Create Participant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateParticipantTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Participant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateParticipant getFixture() {
		return (CreateParticipant)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_artifactFactory.eINSTANCE.createCreateParticipant());
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

} //CreateParticipantTest
