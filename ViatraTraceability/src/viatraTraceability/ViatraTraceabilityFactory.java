/**
 */
package viatraTraceability;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see viatraTraceability.ViatraTraceabilityPackage
 * @generated
 */
public interface ViatraTraceabilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViatraTraceabilityFactory eINSTANCE = viatraTraceability.impl.ViatraTraceabilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dep To GSPN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dep To GSPN</em>'.
	 * @generated
	 */
	DepToGSPN createDepToGSPN();

	/**
	 * Returns a new object of class '<em>Dep To GSPN Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dep To GSPN Trace</em>'.
	 * @generated
	 */
	DepToGSPNTrace createDepToGSPNTrace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViatraTraceabilityPackage getViatraTraceabilityPackage();

} //ViatraTraceabilityFactory
