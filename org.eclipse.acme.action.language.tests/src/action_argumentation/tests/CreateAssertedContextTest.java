/**
 */
package action_argumentation.tests;

import action_argumentation.Action_argumentationFactory;
import action_argumentation.CreateAssertedContext;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Asserted Context</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateAssertedContextTest extends CreateAssertedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateAssertedContextTest.class);
	}

	/**
	 * Constructs a new Create Asserted Context test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateAssertedContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Asserted Context test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateAssertedContext getFixture() {
		return (CreateAssertedContext)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_argumentationFactory.eINSTANCE.createCreateAssertedContext());
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

} //CreateAssertedContextTest
