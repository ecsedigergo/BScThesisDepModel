/**
 */
package model.petriNetEMF.tests;

import junit.textui.TestRunner;

import model.petriNetEMF.PetriNetEMFFactory;
import model.petriNetEMF.PlaceToTransitionArc;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Place To Transition Arc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlaceToTransitionArcTest extends ArcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlaceToTransitionArcTest.class);
	}

	/**
	 * Constructs a new Place To Transition Arc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceToTransitionArcTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Place To Transition Arc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PlaceToTransitionArc getFixture() {
		return (PlaceToTransitionArc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetriNetEMFFactory.eINSTANCE.createPlaceToTransitionArc());
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

} //PlaceToTransitionArcTest
