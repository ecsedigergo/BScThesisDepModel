/**
 */
package viatraTraceability;

import hu.bme.mit.depModel.AbstractElement;
import model.petriNetEMF.Identification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep To GSPN Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link viatraTraceability.DepToGSPNTrace#getAbstractelement <em>Abstractelement</em>}</li>
 *   <li>{@link viatraTraceability.DepToGSPNTrace#getIdentification <em>Identification</em>}</li>
 * </ul>
 *
 * @see viatraTraceability.ViatraTraceabilityPackage#getDepToGSPNTrace()
 * @model
 * @generated
 */
public interface DepToGSPNTrace extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstractelement</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.depModel.AbstractElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstractelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstractelement</em>' reference list.
	 * @see viatraTraceability.ViatraTraceabilityPackage#getDepToGSPNTrace_Abstractelement()
	 * @model
	 * @generated
	 */
	EList<AbstractElement> getAbstractelement();

	/**
	 * Returns the value of the '<em><b>Identification</b></em>' reference list.
	 * The list contents are of type {@link model.petriNetEMF.Identification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification</em>' reference list.
	 * @see viatraTraceability.ViatraTraceabilityPackage#getDepToGSPNTrace_Identification()
	 * @model
	 * @generated
	 */
	EList<Identification> getIdentification();

} // DepToGSPNTrace
