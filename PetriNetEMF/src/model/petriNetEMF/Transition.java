/**
 */
package model.petriNetEMF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.Transition#getOutgoingArcs <em>Outgoing Arcs</em>}</li>
 *   <li>{@link model.petriNetEMF.Transition#getIncomingArcs <em>Incoming Arcs</em>}</li>
 * </ul>
 *
 * @see model.petriNetEMF.PetriNetEMFPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Identification {
	/**
	 * Returns the value of the '<em><b>Outgoing Arcs</b></em>' reference list.
	 * The list contents are of type {@link model.petriNetEMF.TransitionToPlaceArc}.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.TransitionToPlaceArc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Arcs</em>' reference list.
	 * @see model.petriNetEMF.PetriNetEMFPackage#getTransition_OutgoingArcs()
	 * @see model.petriNetEMF.TransitionToPlaceArc#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<TransitionToPlaceArc> getOutgoingArcs();

	/**
	 * Returns the value of the '<em><b>Incoming Arcs</b></em>' reference list.
	 * The list contents are of type {@link model.petriNetEMF.PlaceToTransitionArc}.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.PlaceToTransitionArc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Arcs</em>' reference list.
	 * @see model.petriNetEMF.PetriNetEMFPackage#getTransition_IncomingArcs()
	 * @see model.petriNetEMF.PlaceToTransitionArc#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<PlaceToTransitionArc> getIncomingArcs();

} // Transition
