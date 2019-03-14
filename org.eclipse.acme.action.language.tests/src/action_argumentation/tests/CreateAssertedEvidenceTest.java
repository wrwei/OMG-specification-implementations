/**
 */
package action_argumentation.tests;

import action_argumentation.Action_argumentationFactory;
import action_argumentation.CreateAssertedEvidence;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Asserted Evidence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateAssertedEvidenceTest extends CreateAssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateAssertedEvidenceTest.class);
	}

	/**
	 * Constructs a new Create Asserted Evidence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssertedEvidenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Asserted Evidence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateAssertedEvidence getFixture() {
		return (CreateAssertedEvidence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_argumentationFactory.eINSTANCE.createCreateAssertedEvidence());
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

} //CreateAssertedEvidenceTest
