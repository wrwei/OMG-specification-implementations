/**
 */
package action_argumentation.tests;

import action_argumentation.Action_argumentationFactory;
import action_argumentation.DeclareAssumed;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Declare Assumed</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclareAssumedTest extends UpdateAssertionDeclarationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeclareAssumedTest.class);
	}

	/**
	 * Constructs a new Declare Assumed test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareAssumedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Declare Assumed test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeclareAssumed getFixture() {
		return (DeclareAssumed)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_argumentationFactory.eINSTANCE.createDeclareAssumed());
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

} //DeclareAssumedTest
