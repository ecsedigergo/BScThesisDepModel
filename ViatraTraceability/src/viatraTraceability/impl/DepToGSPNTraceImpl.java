/**
 */
package viatraTraceability.impl;

import hu.bme.mit.depModel.AbstractElement;

import java.util.Collection;
import model.petriNetEMF.Identification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import viatraTraceability.DepToGSPNTrace;
import viatraTraceability.ViatraTraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dep To GSPN Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link viatraTraceability.impl.DepToGSPNTraceImpl#getAbstractelement <em>Abstractelement</em>}</li>
 *   <li>{@link viatraTraceability.impl.DepToGSPNTraceImpl#getIdentification <em>Identification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepToGSPNTraceImpl extends MinimalEObjectImpl.Container implements DepToGSPNTrace {
	/**
	 * The cached value of the '{@link #getAbstractelement() <em>Abstractelement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractelement()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractElement> abstractelement;

	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<Identification> identification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepToGSPNTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViatraTraceabilityPackage.Literals.DEP_TO_GSPN_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractElement> getAbstractelement() {
		if (abstractelement == null) {
			abstractelement = new EObjectResolvingEList<AbstractElement>(AbstractElement.class, this, ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__ABSTRACTELEMENT);
		}
		return abstractelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identification> getIdentification() {
		if (identification == null) {
			identification = new EObjectResolvingEList<Identification>(Identification.class, this, ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__IDENTIFICATION);
		}
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__ABSTRACTELEMENT:
				return getAbstractelement();
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__IDENTIFICATION:
				return getIdentification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__ABSTRACTELEMENT:
				getAbstractelement().clear();
				getAbstractelement().addAll((Collection<? extends AbstractElement>)newValue);
				return;
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__IDENTIFICATION:
				getIdentification().clear();
				getIdentification().addAll((Collection<? extends Identification>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__ABSTRACTELEMENT:
				getAbstractelement().clear();
				return;
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__IDENTIFICATION:
				getIdentification().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__ABSTRACTELEMENT:
				return abstractelement != null && !abstractelement.isEmpty();
			case ViatraTraceabilityPackage.DEP_TO_GSPN_TRACE__IDENTIFICATION:
				return identification != null && !identification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DepToGSPNTraceImpl
