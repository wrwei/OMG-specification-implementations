/**
 */
package action_argumentation.tests;

import action_argumentation.Action_argumentationFactory;
import action_argumentation.CreateArtifactReference;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Artifact Reference</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateArtifactReferenceTest extends CreateArgumentAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateArtifactReferenceTest.class);
	}

	/**
	 * Constructs a new Create Artifact Reference test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateArtifactReferenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Artifact Reference test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateArtifactReference getFixture() {
		return (CreateArtifactReference)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_argumentationFactory.eINSTANCE.createCreateArtifactReference());
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

} //CreateArtifactReferenceTest
