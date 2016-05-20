/**
 */
package model.petriNetEMF.impl;

import model.petriNetEMF.PetriNetEMFPackage;
import model.petriNetEMF.Place;
import model.petriNetEMF.Transition;
import model.petriNetEMF.TransitionToPlaceArc;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition To Place Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.impl.TransitionToPlaceArcImpl#getFrom <em>From</em>}</li>
 *   <li>{@link model.petriNetEMF.impl.TransitionToPlaceArcImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionToPlaceArcImpl extends ArcImpl implements TransitionToPlaceArc {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Transition from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Place to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionToPlaceArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetEMFPackage.Literals.TRANSITION_TO_PLACE_ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Transition)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(Transition newFrom, NotificationChain msgs) {
		Transition oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Transition newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS, Transition.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS, Transition.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Place)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(Place newTo, NotificationChain msgs) {
		Place oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(Place newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, PetriNetEMFPackage.PLACE__INCOMING_ARCS, Place.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, PetriNetEMFPackage.PLACE__INCOMING_ARCS, Place.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, PetriNetEMFPackage.TRANSITION__OUTGOING_ARCS, Transition.class, msgs);
				return basicSetFrom((Transition)otherEnd, msgs);
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, PetriNetEMFPackage.PLACE__INCOMING_ARCS, Place.class, msgs);
				return basicSetTo((Place)otherEnd, msgs);
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
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM:
				return basicSetFrom(null, msgs);
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO:
				return basicSetTo(null, msgs);
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
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM:
				setFrom((Transition)newValue);
				return;
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO:
				setTo((Place)newValue);
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
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM:
				setFrom((Transition)null);
				return;
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO:
				setTo((Place)null);
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
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__FROM:
				return from != null;
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionToPlaceArcImpl
