/**
 */
package viatraTraceability;

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
 * @see viatraTraceability.ViatraTraceabilityFactory
 * @model kind="package"
 * @generated
 */
public interface ViatraTraceabilityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "viatraTraceability";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/viatraTraceability";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "viatraTraceability";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViatraTraceabilityPackage eINSTANCE = viatraTraceability.impl.ViatraTraceabilityPackageImpl.init();

	/**
	 * The meta object id for the '{@link viatraTraceability.impl.DepToGSPNImpl <em>Dep To GSPN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viatraTraceability.impl.DepToGSPNImpl
	 * @see viatraTraceability.impl.ViatraTraceabilityPackageImpl#getDepToGSPN()
	 * @generated
	 */
	int DEP_TO_GSPN = 0;

	/**
	 * The feature id for the '<em><b>Petrinet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN__PETRINET = 0;

	/**
	 * The feature id for the '<em><b>Depmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN__DEPMODEL = 1;

	/**
	 * The feature id for the '<em><b>Deptogspntrace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN__DEPTOGSPNTRACE = 2;

	/**
	 * The number of structural features of the '<em>Dep To GSPN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dep To GSPN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link viatraTraceability.impl.DepToGSPNTraceImpl <em>Dep To GSPN Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see viatraTraceability.impl.DepToGSPNTraceImpl
	 * @see viatraTraceability.impl.ViatraTraceabilityPackageImpl#getDepToGSPNTrace()
	 * @generated
	 */
	int DEP_TO_GSPN_TRACE = 1;

	/**
	 * The feature id for the '<em><b>Abstractelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN_TRACE__ABSTRACTELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN_TRACE__IDENTIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Dep To GSPN Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN_TRACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dep To GSPN Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_TO_GSPN_TRACE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link viatraTraceability.DepToGSPN <em>Dep To GSPN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dep To GSPN</em>'.
	 * @see viatraTraceability.DepToGSPN
	 * @generated
	 */
	EClass getDepToGSPN();

	/**
	 * Returns the meta object for the reference '{@link viatraTraceability.DepToGSPN#getPetrinet <em>Petrinet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Petrinet</em>'.
	 * @see viatraTraceability.DepToGSPN#getPetrinet()
	 * @see #getDepToGSPN()
	 * @generated
	 */
	EReference getDepToGSPN_Petrinet();

	/**
	 * Returns the meta object for the reference '{@link viatraTraceability.DepToGSPN#getDepmodel <em>Depmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depmodel</em>'.
	 * @see viatraTraceability.DepToGSPN#getDepmodel()
	 * @see #getDepToGSPN()
	 * @generated
	 */
	EReference getDepToGSPN_Depmodel();

	/**
	 * Returns the meta object for the containment reference list '{@link viatraTraceability.DepToGSPN#getDeptogspntrace <em>Deptogspntrace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deptogspntrace</em>'.
	 * @see viatraTraceability.DepToGSPN#getDeptogspntrace()
	 * @see #getDepToGSPN()
	 * @generated
	 */
	EReference getDepToGSPN_Deptogspntrace();

	/**
	 * Returns the meta object for class '{@link viatraTraceability.DepToGSPNTrace <em>Dep To GSPN Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dep To GSPN Trace</em>'.
	 * @see viatraTraceability.DepToGSPNTrace
	 * @generated
	 */
	EClass getDepToGSPNTrace();

	/**
	 * Returns the meta object for the reference list '{@link viatraTraceability.DepToGSPNTrace#getAbstractelement <em>Abstractelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstractelement</em>'.
	 * @see viatraTraceability.DepToGSPNTrace#getAbstractelement()
	 * @see #getDepToGSPNTrace()
	 * @generated
	 */
	EReference getDepToGSPNTrace_Abstractelement();

	/**
	 * Returns the meta object for the reference list '{@link viatraTraceability.DepToGSPNTrace#getIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identification</em>'.
	 * @see viatraTraceability.DepToGSPNTrace#getIdentification()
	 * @see #getDepToGSPNTrace()
	 * @generated
	 */
	EReference getDepToGSPNTrace_Identification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViatraTraceabilityFactory getViatraTraceabilityFactory();

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
		 * The meta object literal for the '{@link viatraTraceability.impl.DepToGSPNImpl <em>Dep To GSPN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viatraTraceability.impl.DepToGSPNImpl
		 * @see viatraTraceability.impl.ViatraTraceabilityPackageImpl#getDepToGSPN()
		 * @generated
		 */
		EClass DEP_TO_GSPN = eINSTANCE.getDepToGSPN();

		/**
		 * The meta object literal for the '<em><b>Petrinet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEP_TO_GSPN__PETRINET = eINSTANCE.getDepToGSPN_Petrinet();

		/**
		 * The meta object literal for the '<em><b>Depmodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEP_TO_GSPN__DEPMODEL = eINSTANCE.getDepToGSPN_Depmodel();

		/**
		 * The meta object literal for the '<em><b>Deptogspntrace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEP_TO_GSPN__DEPTOGSPNTRACE = eINSTANCE.getDepToGSPN_Deptogspntrace();

		/**
		 * The meta object literal for the '{@link viatraTraceability.impl.DepToGSPNTraceImpl <em>Dep To GSPN Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see viatraTraceability.impl.DepToGSPNTraceImpl
		 * @see viatraTraceability.impl.ViatraTraceabilityPackageImpl#getDepToGSPNTrace()
		 * @generated
		 */
		EClass DEP_TO_GSPN_TRACE = eINSTANCE.getDepToGSPNTrace();

		/**
		 * The meta object literal for the '<em><b>Abstractelement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEP_TO_GSPN_TRACE__ABSTRACTELEMENT = eINSTANCE.getDepToGSPNTrace_Abstractelement();

		/**
		 * The meta object literal for the '<em><b>Identification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEP_TO_GSPN_TRACE__IDENTIFICATION = eINSTANCE.getDepToGSPNTrace_Identification();

	}

} //ViatraTraceabilityPackage
