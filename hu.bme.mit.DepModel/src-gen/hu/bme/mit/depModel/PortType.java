/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.PortType#getEModes <em>EModes</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.depModel.DepModelPackage#getPortType()
 * @model
 * @generated
 */
public interface PortType extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>EModes</b></em>' containment reference list.
   * The list contents are of type {@link hu.bme.mit.depModel.ErrorModes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EModes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EModes</em>' containment reference list.
   * @see hu.bme.mit.depModel.DepModelPackage#getPortType_EModes()
   * @model containment="true"
   * @generated
   */
  EList<ErrorModes> getEModes();

} // PortType
