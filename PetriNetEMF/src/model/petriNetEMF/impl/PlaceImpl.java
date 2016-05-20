/**
 */
package model.petriNetEMF.impl;

import java.util.Collection;

import model.petriNetEMF.PetriNetEMFPackage;
import model.petriNetEMF.Place;
import model.petriNetEMF.PlaceToTransitionArc;
import model.petriNetEMF.TransitionToPlaceArc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.impl.PlaceImpl#getID <em>ID</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.PlaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.PlaceImpl#getOutgoingArcs <em>Outgoing Arcs</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.PlaceImpl#getIncomingArcs <em>Incoming Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends MinimalEObjectImpl.Container implements Place {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoingArcs() <em>Outgoing Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaceToTransitionArc> outgoingArcs;

	/**
	 * The cached value of the '{@link #getIncomingArcs() <em>Incoming Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionToPlaceArc> incomingArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetEMFPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.PLACE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceToTransitionArc> getOutgoingArcs() {
		if (outgoingArcs == null) {
			outgoingArcs = new EObjectWithInverseResolvingEList<PlaceToTransitionArc>(PlaceToTransitionArc.class, this, PetriNetEMFPackage.PLACE__OUTGOING_ARCS, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM);
		}
		return outgoingArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionToPlaceArc> getIncomingArcs() {
		if (incomingArcs == null) {
			incomingArcs = new EObjectWithInverseResolvingEList<TransitionToPlaceArc>(TransitionToPlaceArc.class, this, PetriNetEMFPackage.PLACE__INCOMING_ARCS, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO);
		}
		return incomingArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.PLACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetEMFPackage.PLACE__OUTGOING_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingArcs()).basicAdd(otherEnd, msgs);
			case PetriNetEMFPackage.PLACE__INCOMING_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingArcs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetEMFPackage.PLACE__OUTGOING_ARCS:
				return ((InternalEList<?>)getOutgoingArcs()).basicRemove(otherEnd, msgs);
			case PetriNetEMFPackage.PLACE__INCOMING_ARCS:
				return ((InternalEList<?>)getIncomingArcs()).basicRemove(otherEnd, msgs);
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
			case PetriNetEMFPackage.PLACE__ID:
				return getID();
			case PetriNetEMFPackage.PLACE__NAME:
				return getName();
			case PetriNetEMFPackage.PLACE__OUTGOING_ARCS:
				return getOutgoingArcs();
			case PetriNetEMFPackage.PLACE__INCOMING_ARCS:
				return getIncomingArcs();
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
			case PetriNetEMFPackage.PLACE__ID:
				setID((String)newValue);
				return;
			case PetriNetEMFPackage.PLACE__NAME:
				setName((String)newValue);
				return;
			case PetriNetEMFPackage.PLACE__OUTGOING_ARCS:
				getOutgoingArcs().clear();
				getOutgoingArcs().addAll((Collection<? extends PlaceToTransitionArc>)newValue);
				return;
			case PetriNetEMFPackage.PLACE__INCOMING_ARCS:
				getIncomingArcs().clear();
				getIncomingArcs().addAll((Collection<? extends TransitionToPlaceArc>)newValue);
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
			case PetriNetEMFPackage.PLACE__ID:
				setID(ID_EDEFAULT);
				return;
			case PetriNetEMFPackage.PLACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetriNetEMFPackage.PLACE__OUTGOING_ARCS:
				getOutgoingArcs().clear();
				return;
			case PetriNetEMFPackage.PLACE__INCOMING_ARCS:
				getIncomingArcs().clear();
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
			case PetriNetEMFPackage.PLACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PetriNetEMFPackage.PLACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetriNetEMFPackage.PLACE__OUTGOING_ARCS:
				return outgoingArcs != null && !outgoingArcs.isEmpty();
			case PetriNetEMFPackage.PLACE__INCOMING_ARCS:
				return incomingArcs != null && !incomingArcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
