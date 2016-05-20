/**
 */
package viatraTraceability.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import viatraTraceability.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViatraTraceabilityFactoryImpl extends EFactoryImpl implements ViatraTraceabilityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ViatraTraceabilityFactory init() {
		try {
			ViatraTraceabilityFactory theViatraTraceabilityFactory = (ViatraTraceabilityFactory)EPackage.Registry.INSTANCE.getEFactory(ViatraTraceabilityPackage.eNS_URI);
			if (theViatraTraceabilityFactory != null) {
				return theViatraTraceabilityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ViatraTraceabilityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViatraTraceabilityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ViatraTraceabilityPackage.DEP_TO_GSPN: return createDepToGSPN();
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE: return createDepToGSPNTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepToGSPN createDepToGSPN() {
		DepToGSPNImpl depToGSPN = new DepToGSPNImpl();
		return depToGSPN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepToGSPNTrace createDepToGSPNTrace() {
		DepToGSPNTraceImpl depToGSPNTrace = new DepToGSPNTraceImpl();
		return depToGSPNTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViatraTraceabilityPackage getViatraTraceabilityPackage() {
		return (ViatraTraceabilityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ViatraTraceabilityPackage getPackage() {
		return ViatraTraceabilityPackage.eINSTANCE;
	}

} //ViatraTraceabilityFactoryImpl
