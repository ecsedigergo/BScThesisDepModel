/**
 */
package viatraTraceability.impl;

import hu.bme.mit.depModel.DepModelPackage;

import model.petriNetEMF.PetriNetEMFPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import viatraTraceability.DepToGSPN;
import viatraTraceability.DepToGSPNTrace;
import viatraTraceability.ViatraTraceabilityFactory;
import viatraTraceability.ViatraTraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViatraTraceabilityPackageImpl extends EPackageImpl implements ViatraTraceabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depToGSPNEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depToGSPNTraceEClass = null;

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
	 * @see viatraTraceability.ViatraTraceabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViatraTraceabilityPackageImpl() {
		super(eNS_URI, ViatraTraceabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ViatraTraceabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViatraTraceabilityPackage init() {
		if (isInited) return (ViatraTraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ViatraTraceabilityPackage.eNS_URI);

		// Obtain or create and register package
		ViatraTraceabilityPackageImpl theViatraTraceabilityPackage = (ViatraTraceabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViatraTraceabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViatraTraceabilityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DepModelPackage.eINSTANCE.eClass();
		PetriNetEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViatraTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theViatraTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theViatraTraceabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViatraTraceabilityPackage.eNS_URI, theViatraTraceabilityPackage);
		return theViatraTraceabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepToGSPN() {
		return depToGSPNEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepToGSPN_Petrinet() {
		return (EReference)depToGSPNEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepToGSPN_Depmodel() {
		return (EReference)depToGSPNEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepToGSPN_Deptogspntrace() {
		return (EReference)depToGSPNEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepToGSPNTrace() {
		return depToGSPNTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepToGSPNTrace_Abstractelement() {
		return (EReference)depToGSPNTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepToGSPNTrace_Identification() {
		return (EReference)depToGSPNTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViatraTraceabilityFactory getViatraTraceabilityFactory() {
		return (ViatraTraceabilityFactory)getEFactoryInstance();
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
		depToGSPNEClass = createEClass(DEP_TO_GSPN);
		createEReference(depToGSPNEClass, DEP_TO_GSPN__PETRINET);
		createEReference(depToGSPNEClass, DEP_TO_GSPN__DEPMODEL);
		createEReference(depToGSPNEClass, DEP_TO_GSPN__DEPTOGSPNTRACE);

		depToGSPNTraceEClass = createEClass(DEP_TO_GSPN_TRACE);
		createEReference(depToGSPNTraceEClass, DEP_TO_GSPN_TRACE__ABSTRACTELEMENT);
		createEReference(depToGSPNTraceEClass, DEP_TO_GSPN_TRACE__IDENTIFICATION);
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

		// Obtain other dependent packages
		PetriNetEMFPackage thePetriNetEMFPackage = (PetriNetEMFPackage)EPackage.Registry.INSTANCE.getEPackage(PetriNetEMFPackage.eNS_URI);
		DepModelPackage theDepModelPackage = (DepModelPackage)EPackage.Registry.INSTANCE.getEPackage(DepModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(depToGSPNEClass, DepToGSPN.class, "DepToGSPN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepToGSPN_Petrinet(), thePetriNetEMFPackage.getPetriNet(), null, "petrinet", null, 0, 1, DepToGSPN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepToGSPN_Depmodel(), theDepModelPackage.getDepModel(), null, "depmodel", null, 0, 1, DepToGSPN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepToGSPN_Deptogspntrace(), this.getDepToGSPNTrace(), null, "deptogspntrace", null, 0, -1, DepToGSPN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(depToGSPNTraceEClass, DepToGSPNTrace.class, "DepToGSPNTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepToGSPNTrace_Abstractelement(), theDepModelPackage.getAbstractElement(), null, "abstractelement", null, 0, -1, DepToGSPNTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepToGSPNTrace_Identification(), thePetriNetEMFPackage.getIdentification(), null, "identification", null, 0, -1, DepToGSPNTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ViatraTraceabilityPackageImpl
