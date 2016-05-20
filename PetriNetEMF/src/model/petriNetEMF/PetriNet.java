/**
 */
package model.petriNetEMF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.petriNetEMF.PetriNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link model.petriNetEMF.PetriNet#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link model.petriNetEMF.PetriNet#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see model.petriNetEMF.PetriNetEMFPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends Identification {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link model.petriNetEMF.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see model.petriNetEMF.PetriNetEMFPackage#getPetriNet_Places()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link model.petriNetEMF.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see model.petriNetEMF.PetriNetEMFPackage#getPetriNet_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link model.petriNetEMF.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see model.petriNetEMF.PetriNetEMFPackage#getPetriNet_Arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

} // PetriNet
