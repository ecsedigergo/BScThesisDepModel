/**
 */
package model.petriNetEMF.impl;

import model.petriNetEMF.Arc;
import model.petriNetEMF.Identification;
import model.petriNetEMF.PetriNet;
import model.petriNetEMF.PetriNetEMFFactory;
import model.petriNetEMF.PetriNetEMFPackage;
import model.petriNetEMF.Place;
import model.petriNetEMF.PlaceToTransitionArc;
import model.petriNetEMF.Transition;
import model.petriNetEMF.TransitionToPlaceArc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetEMFPackageImpl extends EPackageImpl implements PetriNetEMFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass petriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeToTransitionArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionToPlaceArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.petriNetEMF.PetriNetEMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PetriNetEMFPackageImpl() {
		super(eNS_URI, PetriNetEMFFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PetriNetEMFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PetriNetEMFPackage init() {
		if (isInited) return (PetriNetEMFPackage)EPackage.Registry.INSTANCE.getEPackage(PetriNetEMFPackage.eNS_URI);

		// Obtain or create and register package
		PetriNetEMFPackageImpl thePetriNetEMFPackage = (PetriNetEMFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PetriNetEMFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PetriNetEMFPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePetriNetEMFPackage.createPackageContents();

		// Initialize created meta-data
		thePetriNetEMFPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePetriNetEMFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PetriNetEMFPackage.eNS_URI, thePetriNetEMFPackage);
		return thePetriNetEMFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPetriNet() {
		return petriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Places() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Transitions() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPetriNet_Arcs() {
		return (EReference)petriNetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_OutgoingArcs() {
		return (EReference)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_IncomingArcs() {
		return (EReference)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_OutgoingArcs() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_IncomingArcs() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceToTransitionArc() {
		return placeToTransitionArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceToTransitionArc_To() {
		return (EReference)placeToTransitionArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceToTransitionArc_From() {
		return (EReference)placeToTransitionArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionToPlaceArc() {
		return transitionToPlaceArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionToPlaceArc_From() {
		return (EReference)transitionToPlaceArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionToPlaceArc_To() {
		return (EReference)transitionToPlaceArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentification() {
		return identificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentification_ID() {
		return (EAttribute)identificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentification_Name() {
		return (EAttribute)identificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArc() {
		return arcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetEMFFactory getPetriNetEMFFactory() {
		return (PetriNetEMFFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		petriNetEClass = createEClass(PETRI_NET);
		createEReference(petriNetEClass, PETRI_NET__PLACES);
		createEReference(petriNetEClass, PETRI_NET__TRANSITIONS);
		createEReference(petriNetEClass, PETRI_NET__ARCS);

		placeEClass = createEClass(PLACE);
		createEReference(placeEClass, PLACE__OUTGOING_ARCS);
		createEReference(placeEClass, PLACE__INCOMING_ARCS);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__OUTGOING_ARCS);
		createEReference(transitionEClass, TRANSITION__INCOMING_ARCS);

		placeToTransitionArcEClass = createEClass(PLACE_TO_TRANSITION_ARC);
		createEReference(placeToTransitionArcEClass, PLACE_TO_TRANSITION_ARC__TO);
		createEReference(placeToTransitionArcEClass, PLACE_TO_TRANSITION_ARC__FROM);

		transitionToPlaceArcEClass = createEClass(TRANSITION_TO_PLACE_ARC);
		createEReference(transitionToPlaceArcEClass, TRANSITION_TO_PLACE_ARC__FROM);
		createEReference(transitionToPlaceArcEClass, TRANSITION_TO_PLACE_ARC__TO);

		identificationEClass = createEClass(IDENTIFICATION);
		createEAttribute(identificationEClass, IDENTIFICATION__ID);
		createEAttribute(identificationEClass, IDENTIFICATION__NAME);

		arcEClass = createEClass(ARC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		petriNetEClass.getESuperTypes().add(this.getIdentification());
		placeEClass.getESuperTypes().add(this.getIdentification());
		transitionEClass.getESuperTypes().add(this.getIdentification());
		placeToTransitionArcEClass.getESuperTypes().add(this.getArc());
		transitionToPlaceArcEClass.getESuperTypes().add(this.getArc());
		arcEClass.getESuperTypes().add(this.getIdentification());

		// Initialize classes, features, and operations; add parameters
		initEClass(petriNetEClass, PetriNet.class, "PetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPetriNet_Places(), this.getPlace(), null, "Places", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_Transitions(), this.getTransition(), null, "Transitions", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPetriNet_Arcs(), this.getArc(), null, "Arcs", null, 0, -1, PetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlace_OutgoingArcs(), this.getPlaceToTransitionArc(), this.getPlaceToTransitionArc_From(), "outgoingArcs", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_IncomingArcs(), this.getTransitionToPlaceArc(), this.getTransitionToPlaceArc_To(), "incomingArcs", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_OutgoingArcs(), this.getTransitionToPlaceArc(), this.getTransitionToPlaceArc_From(), "outgoingArcs", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_IncomingArcs(), this.getPlaceToTransitionArc(), this.getPlaceToTransitionArc_To(), "incomingArcs", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeToTransitionArcEClass, PlaceToTransitionArc.class, "PlaceToTransitionArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlaceToTransitionArc_To(), this.getTransition(), this.getTransition_IncomingArcs(), "to", null, 1, 1, PlaceToTransitionArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceToTransitionArc_From(), this.getPlace(), this.getPlace_OutgoingArcs(), "from", null, 1, 1, PlaceToTransitionArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionToPlaceArcEClass, TransitionToPlaceArc.class, "TransitionToPlaceArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransitionToPlaceArc_From(), this.getTransition(), this.getTransition_OutgoingArcs(), "from", null, 1, 1, TransitionToPlaceArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionToPlaceArc_To(), this.getPlace(), this.getPlace_IncomingArcs(), "to", null, 1, 1, TransitionToPlaceArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identificationEClass, Identification.class, "Identification", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentification_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentification_Name(), ecorePackage.getEString(), "name", null, 1, 1, Identification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(arcEClass, Arc.class, "Arc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PetriNetEMFPackageImpl
