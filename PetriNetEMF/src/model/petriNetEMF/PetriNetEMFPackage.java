/**
 */
package model.petriNetEMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.petriNetEMF.PetriNetEMFFactory
 * @model kind="package"
 * @generated
 */
public interface PetriNetEMFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petriNetEMF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/petriNetEMF";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petriNetEMF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriNetEMFPackage eINSTANCE = model.petriNetEMF.impl.PetriNetEMFPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.petriNetEMF.Identification <em>Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.petriNetEMF.Identification
	 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getIdentification()
	 * @generated
	 */
	int IDENTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.petriNetEMF.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.petriNetEMF.impl.PetriNetImpl
	 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ID = IDENTIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAME = IDENTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Places</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__PLACES = IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TRANSITIONS = IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ARCS = IDENTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = IDENTIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_OPERATION_COUNT = IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.petriNetEMF.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.petriNetEMF.impl.PlaceImpl
	 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = IDENTIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = IDENTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUTGOING_ARCS = IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INCOMING_ARCS = IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = IDENTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_OPERATION_COUNT = IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.petriNetEMF.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.petriNetEMF.impl.TransitionImpl
	 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = IDENTIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = IDENTIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Outgoing Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTGOING_ARCS = IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Arcs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INCOMING_ARCS = IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = IDENTIFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.petriNetEMF.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.petriNetEMF.impl.ArcImpl
	 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ID = IDENTIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__NAME = IDENTIFICATION__NAME;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.petriNetEMF.impl.PlaceToTransitionArcImpl <em>Place To Transition Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.petriNetEMF.impl.PlaceToTransitionArcImpl
	 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getPlaceToTransitionArc()
	 * @generated
	 */
	int PLACE_TO_TRANSITION_ARC = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION_ARC__ID = ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION_ARC__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION_ARC__TO = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION_ARC__FROM = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Place To Transition Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Place To Transition Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.petriNetEMF.impl.TransitionToPlaceArcImpl <em>Transition To Place Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.petriNetEMF.impl.TransitionToPlaceArcImpl
	 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getTransitionToPlaceArc()
	 * @generated
	 */
	int TRANSITION_TO_PLACE_ARC = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE_ARC__ID = ARC__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE_ARC__NAME = ARC__NAME;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE_ARC__FROM = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE_ARC__TO = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition To Place Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transition To Place Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE_ARC_OPERATION_COUNT = ARC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link model.petriNetEMF.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see model.petriNetEMF.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link model.petriNetEMF.PetriNet#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Places</em>'.
	 * @see model.petriNetEMF.PetriNet#getPlaces()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Places();

	/**
	 * Returns the meta object for the containment reference list '{@link model.petriNetEMF.PetriNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see model.petriNetEMF.PetriNet#getTransitions()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link model.petriNetEMF.PetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see model.petriNetEMF.PetriNet#getArcs()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Arcs();

	/**
	 * Returns the meta object for class '{@link model.petriNetEMF.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see model.petriNetEMF.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the reference list '{@link model.petriNetEMF.Place#getOutgoingArcs <em>Outgoing Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Arcs</em>'.
	 * @see model.petriNetEMF.Place#getOutgoingArcs()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_OutgoingArcs();

	/**
	 * Returns the meta object for the reference list '{@link model.petriNetEMF.Place#getIncomingArcs <em>Incoming Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Arcs</em>'.
	 * @see model.petriNetEMF.Place#getIncomingArcs()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_IncomingArcs();

	/**
	 * Returns the meta object for class '{@link model.petriNetEMF.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see model.petriNetEMF.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link model.petriNetEMF.Transition#getOutgoingArcs <em>Outgoing Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Arcs</em>'.
	 * @see model.petriNetEMF.Transition#getOutgoingArcs()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_OutgoingArcs();

	/**
	 * Returns the meta object for the reference list '{@link model.petriNetEMF.Transition#getIncomingArcs <em>Incoming Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Arcs</em>'.
	 * @see model.petriNetEMF.Transition#getIncomingArcs()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_IncomingArcs();

	/**
	 * Returns the meta object for class '{@link model.petriNetEMF.PlaceToTransitionArc <em>Place To Transition Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place To Transition Arc</em>'.
	 * @see model.petriNetEMF.PlaceToTransitionArc
	 * @generated
	 */
	EClass getPlaceToTransitionArc();

	/**
	 * Returns the meta object for the reference '{@link model.petriNetEMF.PlaceToTransitionArc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see model.petriNetEMF.PlaceToTransitionArc#getTo()
	 * @see #getPlaceToTransitionArc()
	 * @generated
	 */
	EReference getPlaceToTransitionArc_To();

	/**
	 * Returns the meta object for the reference '{@link model.petriNetEMF.PlaceToTransitionArc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see model.petriNetEMF.PlaceToTransitionArc#getFrom()
	 * @see #getPlaceToTransitionArc()
	 * @generated
	 */
	EReference getPlaceToTransitionArc_From();

	/**
	 * Returns the meta object for class '{@link model.petriNetEMF.TransitionToPlaceArc <em>Transition To Place Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition To Place Arc</em>'.
	 * @see model.petriNetEMF.TransitionToPlaceArc
	 * @generated
	 */
	EClass getTransitionToPlaceArc();

	/**
	 * Returns the meta object for the reference '{@link model.petriNetEMF.TransitionToPlaceArc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see model.petriNetEMF.TransitionToPlaceArc#getFrom()
	 * @see #getTransitionToPlaceArc()
	 * @generated
	 */
	EReference getTransitionToPlaceArc_From();

	/**
	 * Returns the meta object for the reference '{@link model.petriNetEMF.TransitionToPlaceArc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see model.petriNetEMF.TransitionToPlaceArc#getTo()
	 * @see #getTransitionToPlaceArc()
	 * @generated
	 */
	EReference getTransitionToPlaceArc_To();

	/**
	 * Returns the meta object for class '{@link model.petriNetEMF.Identification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identification</em>'.
	 * @see model.petriNetEMF.Identification
	 * @generated
	 */
	EClass getIdentification();

	/**
	 * Returns the meta object for the attribute '{@link model.petriNetEMF.Identification#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see model.petriNetEMF.Identification#getID()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_ID();

	/**
	 * Returns the meta object for the attribute '{@link model.petriNetEMF.Identification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.petriNetEMF.Identification#getName()
	 * @see #getIdentification()
	 * @generated
	 */
	EAttribute getIdentification_Name();

	/**
	 * Returns the meta object for class '{@link model.petriNetEMF.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see model.petriNetEMF.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriNetEMFFactory getPetriNetEMFFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link model.petriNetEMF.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.petriNetEMF.impl.PetriNetImpl
		 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__PLACES = eINSTANCE.getPetriNet_Places();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TRANSITIONS = eINSTANCE.getPetriNet_Transitions();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__ARCS = eINSTANCE.getPetriNet_Arcs();

		/**
		 * The meta object literal for the '{@link model.petriNetEMF.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.petriNetEMF.impl.PlaceImpl
		 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Outgoing Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__OUTGOING_ARCS = eINSTANCE.getPlace_OutgoingArcs();

		/**
		 * The meta object literal for the '<em><b>Incoming Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INCOMING_ARCS = eINSTANCE.getPlace_IncomingArcs();

		/**
		 * The meta object literal for the '{@link model.petriNetEMF.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.petriNetEMF.impl.TransitionImpl
		 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Outgoing Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTGOING_ARCS = eINSTANCE.getTransition_OutgoingArcs();

		/**
		 * The meta object literal for the '<em><b>Incoming Arcs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INCOMING_ARCS = eINSTANCE.getTransition_IncomingArcs();

		/**
		 * The meta object literal for the '{@link model.petriNetEMF.impl.PlaceToTransitionArcImpl <em>Place To Transition Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.petriNetEMF.impl.PlaceToTransitionArcImpl
		 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getPlaceToTransitionArc()
		 * @generated
		 */
		EClass PLACE_TO_TRANSITION_ARC = eINSTANCE.getPlaceToTransitionArc();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TO_TRANSITION_ARC__TO = eINSTANCE.getPlaceToTransitionArc_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TO_TRANSITION_ARC__FROM = eINSTANCE.getPlaceToTransitionArc_From();

		/**
		 * The meta object literal for the '{@link model.petriNetEMF.impl.TransitionToPlaceArcImpl <em>Transition To Place Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.petriNetEMF.impl.TransitionToPlaceArcImpl
		 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getTransitionToPlaceArc()
		 * @generated
		 */
		EClass TRANSITION_TO_PLACE_ARC = eINSTANCE.getTransitionToPlaceArc();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TO_PLACE_ARC__FROM = eINSTANCE.getTransitionToPlaceArc_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TO_PLACE_ARC__TO = eINSTANCE.getTransitionToPlaceArc_To();

		/**
		 * The meta object literal for the '{@link model.petriNetEMF.Identification <em>Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.petriNetEMF.Identification
		 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getIdentification()
		 * @generated
		 */
		EClass IDENTIFICATION = eINSTANCE.getIdentification();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__ID = eINSTANCE.getIdentification_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFICATION__NAME = eINSTANCE.getIdentification_Name();

		/**
		 * The meta object literal for the '{@link model.petriNetEMF.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.petriNetEMF.impl.ArcImpl
		 * @see model.petriNetEMF.impl.PetriNetEMFPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

	}

} //PetriNetEMFPackage
