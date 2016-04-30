/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Dec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.TransitionDec#getEventName <em>Event Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.TransitionDec#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.depModel.DepModelPackage#getTransitionDec()
 * @model
 * @generated
 */
public interface TransitionDec extends ErrorModelElement
{
  /**
   * Returns the value of the '<em><b>Event Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event Name</em>' attribute.
   * @see #setEventName(String)
   * @see hu.bme.mit.depModel.DepModelPackage#getTransitionDec_EventName()
   * @model
   * @generated
   */
  String getEventName();

  /**
   * Sets the value of the '{@link hu.bme.mit.depModel.TransitionDec#getEventName <em>Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event Name</em>' attribute.
   * @see #getEventName()
   * @generated
   */
  void setEventName(String value);

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.depModel.TransitionFeatureDec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see hu.bme.mit.depModel.DepModelPackage#getTransitionDec_Features()
   * @model containment="true"
   * @generated
   */
  EList<TransitionFeatureDec> getFeatures();

} // TransitionDec
