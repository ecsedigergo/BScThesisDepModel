/**
 */
package model.petriNetEMF.tests;

import junit.textui.TestRunner;

import model.petriNetEMF.PetriNetEMFFactory;
import model.petriNetEMF.TransitionToPlaceArc;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition To Place Arc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionToPlaceArcTest extends ArcTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionToPlaceArcTest.class);
	}

	/**
	 * Constructs a new Transition To Place Arc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionToPlaceArcTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transition To Place Arc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TransitionToPlaceArc getFixture() {
		return (TransitionToPlaceArc)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PetriNetEMFFactory.eINSTANCE.createTransitionToPlaceArc());
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

} //TransitionToPlaceArcTest
