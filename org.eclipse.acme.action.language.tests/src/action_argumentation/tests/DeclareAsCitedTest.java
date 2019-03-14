/**
 */
package action_argumentation.tests;

import action_argumentation.Action_argumentationFactory;
import action_argumentation.DeclareAsCited;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Declare As Cited</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclareAsCitedTest extends UpdateAssertionDeclarationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeclareAsCitedTest.class);
	}

	/**
	 * Constructs a new Declare As Cited test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareAsCitedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Declare As Cited test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeclareAsCited getFixture() {
		return (DeclareAsCited)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_argumentationFactory.eINSTANCE.createDeclareAsCited());
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

} //DeclareAsCitedTest
