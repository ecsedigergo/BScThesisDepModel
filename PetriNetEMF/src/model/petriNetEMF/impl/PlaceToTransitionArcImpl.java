/**
 */
package model.petriNetEMF.impl;

import model.petriNetEMF.PetriNetEMFPackage;
import model.petriNetEMF.Place;
import model.petriNetEMF.PlaceToTransitionArc;
import model.petriNetEMF.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place To Transition Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.impl.PlaceToTransitionArcImpl#getTo <em>To</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.PlaceToTransitionArcImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceToTransitionArcImpl extends ArcImpl implements PlaceToTransitionArc {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Transition to;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Place from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceToTransitionArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetEMFPackage.Literals.PLACE_TO_TRANSITION_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Transition)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Transition newTo, NotificationChain msgs) {
		Transition oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Transition newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, PetriNetEMFPackage.TRANSITION__INCOMING_ARCS, Transition.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, PetriNetEMFPackage.TRANSITION__INCOMING_ARCS, Transition.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Place)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Place newFrom, NotificationChain msgs) {
		Place oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Place newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, PetriNetEMFPackage.PLACE__OUTGOING_ARCS, Place.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, PetriNetEMFPackage.PLACE__OUTGOING_ARCS, Place.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, PetriNetEMFPackage.TRANSITION__INCOMING_ARCS, Transition.class, msgs);
				return basicSetTo((Transition)otherEnd, msgs);
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, PetriNetEMFPackage.PLACE__OUTGOING_ARCS, Place.class, msgs);
				return basicSetFrom((Place)otherEnd, msgs);
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
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO:
				return basicSetTo(null, msgs);
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM:
				return basicSetFrom(null, msgs);
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
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO:
				setTo((Transition)newValue);
				return;
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM:
				setFrom((Place)newValue);
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
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO:
				setTo((Transition)null);
				return;
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM:
				setFrom((Place)null);
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
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__TO:
				return to != null;
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC__FROM:
				return from != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceToTransitionArcImpl
