/**
 */
package viatraTraceability;

import hu.bme.mit.depModel.DepModel;

import model.petriNetEMF.PetriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep To GSPN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link viatraTraceability.DepToGSPN#getPetrinet <em>Petrinet</em>}</li>
 *   <li>{@link viatraTraceability.DepToGSPN#getDepmodel <em>Depmodel</em>}</li>
 *   <li>{@link viatraTraceability.DepToGSPN#getDeptogspntrace <em>Deptogspntrace</em>}</li>
 * </ul>
 *
 * @see viatraTraceability.ViatraTraceabilityPackage#getDepToGSPN()
 * @model
 * @generated
 */
public interface DepToGSPN extends EObject {
	/**
	 * Returns the value of the '<em><b>Petrinet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petrinet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petrinet</em>' reference.
	 * @see #setPetrinet(PetriNet)
	 * @see viatraTraceability.ViatraTraceabilityPackage#getDepToGSPN_Petrinet()
	 * @model
	 * @generated
	 */
	PetriNet getPetrinet();

	/**
	 * Sets the value of the '{@link viatraTraceability.DepToGSPN#getPetrinet <em>Petrinet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petrinet</em>' reference.
	 * @see #getPetrinet()
	 * @generated
	 */
	void setPetrinet(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Depmodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depmodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depmodel</em>' reference.
	 * @see #setDepmodel(DepModel)
	 * @see viatraTraceability.ViatraTraceabilityPackage#getDepToGSPN_Depmodel()
	 * @model
	 * @generated
	 */
	DepModel getDepmodel();

	/**
	 * Sets the value of the '{@link viatraTraceability.DepToGSPN#getDepmodel <em>Depmodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depmodel</em>' reference.
	 * @see #getDepmodel()
	 * @generated
	 */
	void setDepmodel(DepModel value);

	/**
	 * Returns the value of the '<em><b>Deptogspntrace</b></em>' containment reference list.
	 * The list contents are of type {@link viatraTraceability.DepToGSPNTrace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deptogspntrace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deptogspntrace</em>' containment reference list.
	 * @see viatraTraceability.ViatraTraceabilityPackage#getDepToGSPN_Deptogspntrace()
	 * @model containment="true"
	 * @generated
	 */
	EList<DepToGSPNTrace> getDeptogspntrace();

} // DepToGSPN
