/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Port Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.ErrorPortOut#getErrorPortOutName <em>Error Port Out Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.ErrorPortOut#getErrorPortOutSuperType <em>Error Port Out Super Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.depModel.DepModelPackage#getErrorPortOut()
 * @model
 * @generated
 */
public interface ErrorPortOut extends ErrorPortDec
{
  /**
   * Returns the value of the '<em><b>Error Port Out Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Port Out Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Port Out Name</em>' attribute.
   * @see #setErrorPortOutName(String)
   * @see hu.bme.mit.depModel.DepModelPackage#getErrorPortOut_ErrorPortOutName()
   * @model
   * @generated
   */
  String getErrorPortOutName();

  /**
   * Sets the value of the '{@link hu.bme.mit.depModel.ErrorPortOut#getErrorPortOutName <em>Error Port Out Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Port Out Name</em>' attribute.
   * @see #getErrorPortOutName()
   * @generated
   */
  void setErrorPortOutName(String value);

  /**
   * Returns the value of the '<em><b>Error Port Out Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Error Port Out Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Error Port Out Super Type</em>' reference.
   * @see #setErrorPortOutSuperType(PortType)
   * @see hu.bme.mit.depModel.DepModelPackage#getErrorPortOut_ErrorPortOutSuperType()
   * @model
   * @generated
   */
  PortType getErrorPortOutSuperType();

  /**
   * Sets the value of the '{@link hu.bme.mit.depModel.ErrorPortOut#getErrorPortOutSuperType <em>Error Port Out Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Error Port Out Super Type</em>' reference.
   * @see #getErrorPortOutSuperType()
   * @generated
   */
  void setErrorPortOutSuperType(PortType value);

} // ErrorPortOut
