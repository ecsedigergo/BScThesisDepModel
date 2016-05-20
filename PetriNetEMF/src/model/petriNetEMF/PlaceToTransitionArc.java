/**
 */
package model.petriNetEMF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place To Transition Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.PlaceToTransitionArc#getTo <em>To</em>}</li>
 *   <li>{@link model.petriNetEMF.PlaceToTransitionArc#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see model.petriNetEMF.PetriNetEMFPackage#getPlaceToTransitionArc()
 * @model
 * @generated
 */
public interface PlaceToTransitionArc extends Arc {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.Transition#getIncomingArcs <em>Incoming Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Transition)
	 * @see model.petriNetEMF.PetriNetEMFPackage#getPlaceToTransitionArc_To()
	 * @see model.petriNetEMF.Transition#getIncomingArcs
	 * @model opposite="incomingArcs" required="true"
	 * @generated
	 */
	Transition getTo();

	/**
	 * Sets the value of the '{@link model.petriNetEMF.PlaceToTransitionArc#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Transition value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.Place#getOutgoingArcs <em>Outgoing Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Place)
	 * @see model.petriNetEMF.PetriNetEMFPackage#getPlaceToTransitionArc_From()
	 * @see model.petriNetEMF.Place#getOutgoingArcs
	 * @model opposite="outgoingArcs" required="true"
	 * @generated
	 */
	Place getFrom();

	/**
	 * Sets the value of the '{@link model.petriNetEMF.PlaceToTransitionArc#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Place value);

} // PlaceToTransitionArc
