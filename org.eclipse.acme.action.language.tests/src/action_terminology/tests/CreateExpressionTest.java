/**
 */
package action_terminology.tests;

import action_terminology.Action_terminologyFactory;
import action_terminology.CreateExpression;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateExpressionTest extends CreateTerminologyAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateExpressionTest.class);
	}

	/**
	 * Constructs a new Create Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateExpression getFixture() {
		return (CreateExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_terminologyFactory.eINSTANCE.createCreateExpression());
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

} //CreateExpressionTest
