/**
 */
package model.petriNetEMF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition To Place Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.TransitionToPlaceArc#getFrom <em>From</em>}</li>
 *   <li>{@link model.petriNetEMF.TransitionToPlaceArc#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see model.petriNetEMF.PetriNetEMFPackage#getTransitionToPlaceArc()
 * @model
 * @generated
 */
public interface TransitionToPlaceArc extends Arc {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.Transition#getOutgoingArcs <em>Outgoing Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Transition)
	 * @see model.petriNetEMF.PetriNetEMFPackage#getTransitionToPlaceArc_From()
	 * @see model.petriNetEMF.Transition#getOutgoingArcs
	 * @model opposite="outgoingArcs" required="true"
	 * @generated
	 */
	Transition getFrom();

	/**
	 * Sets the value of the '{@link model.petriNetEMF.TransitionToPlaceArc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Transition value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.Place#getIncomingArcs <em>Incoming Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Place)
	 * @see model.petriNetEMF.PetriNetEMFPackage#getTransitionToPlaceArc_To()
	 * @see model.petriNetEMF.Place#getIncomingArcs
	 * @model opposite="incomingArcs" required="true"
	 * @generated
	 */
	Place getTo();

	/**
	 * Sets the value of the '{@link model.petriNetEMF.TransitionToPlaceArc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Place value);

} // TransitionToPlaceArc
