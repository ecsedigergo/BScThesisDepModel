/**
 */
package model.petriNetEMF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.Place#getOutgoingArcs <em>Outgoing Arcs</em>}</li>
 *   <li>{@link model.petriNetEMF.Place#getIncomingArcs <em>Incoming Arcs</em>}</li>
 * </ul>
 *
 * @see model.petriNetEMF.PetriNetEMFPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends Identification {
	/**
	 * Returns the value of the '<em><b>Outgoing Arcs</b></em>' reference list.
	 * The list contents are of type {@link model.petriNetEMF.PlaceToTransitionArc}.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.PlaceToTransitionArc#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Arcs</em>' reference list.
	 * @see model.petriNetEMF.PetriNetEMFPackage#getPlace_OutgoingArcs()
	 * @see model.petriNetEMF.PlaceToTransitionArc#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<PlaceToTransitionArc> getOutgoingArcs();

	/**
	 * Returns the value of the '<em><b>Incoming Arcs</b></em>' reference list.
	 * The list contents are of type {@link model.petriNetEMF.TransitionToPlaceArc}.
	 * It is bidirectional and its opposite is '{@link model.petriNetEMF.TransitionToPlaceArc#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Arcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Arcs</em>' reference list.
	 * @see model.petriNetEMF.PetriNetEMFPackage#getPlace_IncomingArcs()
	 * @see model.petriNetEMF.TransitionToPlaceArc#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<TransitionToPlaceArc> getIncomingArcs();

} // Place
