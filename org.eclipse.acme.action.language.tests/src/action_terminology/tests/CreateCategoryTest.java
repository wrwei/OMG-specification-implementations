/**
 */
package action_terminology.tests;

import action_terminology.Action_terminologyFactory;
import action_terminology.CreateCategory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Create Category</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreateCategoryTest extends CreateTerminologyAssetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreateCategoryTest.class);
	}

	/**
	 * Constructs a new Create Category test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateCategoryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Create Category test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CreateCategory getFixture() {
		return (CreateCategory)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_terminologyFactory.eINSTANCE.createCreateCategory());
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

} //CreateCategoryTest
