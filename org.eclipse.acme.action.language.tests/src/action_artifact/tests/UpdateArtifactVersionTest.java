/**
 */
package action_artifact.tests;

import action_artifact.Action_artifactFactory;
import action_artifact.UpdateArtifactVersion;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Update Artifact Version</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateArtifactVersionTest extends TestCase {

	/**
	 * The fixture for this Update Artifact Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateArtifactVersion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpdateArtifactVersionTest.class);
	}

	/**
	 * Constructs a new Update Artifact Version test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateArtifactVersionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Update Artifact Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UpdateArtifactVersion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Update Artifact Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateArtifactVersion getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Action_artifactFactory.eINSTANCE.createUpdateArtifactVersion());
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

} //UpdateArtifactVersionTest
