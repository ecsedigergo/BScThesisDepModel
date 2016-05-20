/**
 */
package model.petriNetEMF.impl;

import java.util.Collection;

import model.petriNetEMF.PetriNetEMFPackage;
import model.petriNetEMF.PlaceToTransitionArc;
import model.petriNetEMF.Transition;
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
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.impl.TransitionImpl#getID <em>ID</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.TransitionImpl#getOutgoingArcs <em>Outgoing Arcs</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.TransitionImpl#getIncomingArcs <em>Incoming Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	protected EList<TransitionToPlaceArc> outgoingArcs;

	/**
	 * The cached value of the '{@link #getIncomingArcs() <em>Incoming Arcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<PlaceToTransitionArc> incomingArcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetEMFPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.TRANSITION__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionToPlaceArc> getOutgoingArcs() {
		if (outgoingArcs == null) {
			outgoingArcs = new EObjectWithInverseResolvingEList<TransitionToPlaceArc>(TransitionToPlaceArc.class, this, PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM);
		}
		return outgoingArcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlaceToTransitionArc> getIncomingArcs() {
		if (incomingArcs == null) {
			incomingArcs = new EObjectWithInverseResolvingEList<PlaceToTransitionArc>(PlaceToTransitionArc.class, this, PetriNetEMFPackage.TRANSITION__INCOMING_ARCS, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO);
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.TRANSITION__NAME, oldName, name));
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
			case PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingArcs()).basicAdd(otherEnd, msgs);
			case PetriNetEMFPackage.TRANSITION__INCOMING_ARCS:
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
			case PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS:
				return ((InternalEList<?>)getOutgoingArcs()).basicRemove(otherEnd, msgs);
			case PetriNetEMFPackage.TRANSITION__INCOMING_ARCS:
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
			case PetriNetEMFPackage.TRANSITION__ID:
				return getID();
			case PetriNetEMFPackage.TRANSITION__NAME:
				return getName();
			case PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS:
				return getOutgoingArcs();
			case PetriNetEMFPackage.TRANSITION__INCOMING_ARCS:
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
			case PetriNetEMFPackage.TRANSITION__ID:
				setID((String)newValue);
				return;
			case PetriNetEMFPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS:
				getOutgoingArcs().clear();
				getOutgoingArcs().addAll((Collection<? extends TransitionToPlaceArc>)newValue);
				return;
			case PetriNetEMFPackage.TRANSITION__INCOMING_ARCS:
				getIncomingArcs().clear();
				getIncomingArcs().addAll((Collection<? extends PlaceToTransitionArc>)newValue);
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
			case PetriNetEMFPackage.TRANSITION__ID:
				setID(ID_EDEFAULT);
				return;
			case PetriNetEMFPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS:
				getOutgoingArcs().clear();
				return;
			case PetriNetEMFPackage.TRANSITION__INCOMING_ARCS:
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
			case PetriNetEMFPackage.TRANSITION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PetriNetEMFPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS:
				return outgoingArcs != null && !outgoingArcs.isEmpty();
			case PetriNetEMFPackage.TRANSITION__INCOMING_ARCS:
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

} //TransitionImpl
