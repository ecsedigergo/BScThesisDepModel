/**
 */
package viatraTraceability.impl;

import hu.bme.mit.depModel.DepModel;

import java.util.Collection;

import model.petriNetEMF.PetriNet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import viatraTraceability.DepToGSPN;
import viatraTraceability.DepToGSPNTrace;
import viatraTraceability.ViatraTraceabilityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dep To GSPN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link viatraTraceability.impl.DepToGSPNImpl#getPetrinet <em>Petrinet</em>}</li>
 *   <li>{@link viatraTraceability.impl.DepToGSPNImpl#getDepmodel <em>Depmodel</em>}</li>
 *   <li>{@link viatraTraceability.impl.DepToGSPNImpl#getDeptogspntrace <em>Deptogspntrace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepToGSPNImpl extends MinimalEObjectImpl.Container implements DepToGSPN {
	/**
	 * The cached value of the '{@link #getPetrinet() <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetrinet()
	 * @generated
	 * @ordered
	 */
	protected PetriNet petrinet;

	/**
	 * The cached value of the '{@link #getDepmodel() <em>Depmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepmodel()
	 * @generated
	 * @ordered
	 */
	protected DepModel depmodel;

	/**
	 * The cached value of the '{@link #getDeptogspntrace() <em>Deptogspntrace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeptogspntrace()
	 * @generated
	 * @ordered
	 */
	protected EList<DepToGSPNTrace> deptogspntrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepToGSPNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViatraTraceabilityPackage.Literals.DEP_TO_GSPN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getPetrinet() {
		if (petrinet != null && petrinet.eIsProxy()) {
			InternalEObject oldPetrinet = (InternalEObject)petrinet;
			petrinet = (PetriNet)eResolveProxy(oldPetrinet);
			if (petrinet != oldPetrinet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViatraTraceabilityPackage.DEP_TO_GSPN__PETRINET, oldPetrinet, petrinet));
			}
		}
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet basicGetPetrinet() {
		return petrinet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetrinet(PetriNet newPetrinet) {
		PetriNet oldPetrinet = petrinet;
		petrinet = newPetrinet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViatraTraceabilityPackage.DEP_TO_GSPN__PETRINET, oldPetrinet, petrinet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepModel getDepmodel() {
		if (depmodel != null && depmodel.eIsProxy()) {
			InternalEObject oldDepmodel = (InternalEObject)depmodel;
			depmodel = (DepModel)eResolveProxy(oldDepmodel);
			if (depmodel != oldDepmodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViatraTraceabilityPackage.DEP_TO_GSPN__DEPMODEL, oldDepmodel, depmodel));
			}
		}
		return depmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepModel basicGetDepmodel() {
		return depmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepmodel(DepModel newDepmodel) {
		DepModel oldDepmodel = depmodel;
		depmodel = newDepmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViatraTraceabilityPackage.DEP_TO_GSPN__DEPMODEL, oldDepmodel, depmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DepToGSPNTrace> getDeptogspntrace() {
		if (deptogspntrace == null) {
			deptogspntrace = new EObjectContainmentEList<DepToGSPNTrace>(DepToGSPNTrace.class, this, ViatraTraceabilityPackage.DEP_TO_GSPN__DEPTOGSPNTRACE);
		}
		return deptogspntrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPTOGSPNTRACE:
				return ((InternalEList<?>)getDeptogspntrace()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViatraTraceabilityPackage.DEP_TO_GSPN__PETRINET:
				if (resolve) return getPetrinet();
				return basicGetPetrinet();
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPMODEL:
				if (resolve) return getDepmodel();
				return basicGetDepmodel();
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPTOGSPNTRACE:
				return getDeptogspntrace();
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
			case ViatraTraceabilityPackage.DEP_TO_GSPN__PETRINET:
				setPetrinet((PetriNet)newValue);
				return;
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPMODEL:
				setDepmodel((DepModel)newValue);
				return;
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPTOGSPNTRACE:
				getDeptogspntrace().clear();
				getDeptogspntrace().addAll((Collection<? extends DepToGSPNTrace>)newValue);
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
			case ViatraTraceabilityPackage.DEP_TO_GSPN__PETRINET:
				setPetrinet((PetriNet)null);
				return;
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPMODEL:
				setDepmodel((DepModel)null);
				return;
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPTOGSPNTRACE:
				getDeptogspntrace().clear();
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
			case ViatraTraceabilityPackage.DEP_TO_GSPN__PETRINET:
				return petrinet != null;
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPMODEL:
				return depmodel != null;
			case ViatraTraceabilityPackage.DEP_TO_GSPN__DEPTOGSPNTRACE:
				return deptogspntrace != null && !deptogspntrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DepToGSPNImpl
