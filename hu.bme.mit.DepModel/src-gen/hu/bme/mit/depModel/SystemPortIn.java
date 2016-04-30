/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Port In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.SystemPortIn#getSysPortInName <em>Sys Port In Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.SystemPortIn#getInComp <em>In Comp</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.SystemPortIn#getInPort <em>In Port</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.depModel.DepModelPackage#getSystemPortIn()
 * @model
 * @generated
 */
public interface SystemPortIn extends SystemPortDec
{
  /**
   * Returns the value of the '<em><b>Sys Port In Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sys Port In Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sys Port In Name</em>' attribute.
   * @see #setSysPortInName(String)
   * @see hu.bme.mit.depModel.DepModelPackage#getSystemPortIn_SysPortInName()
   * @model
   * @generated
   */
  String getSysPortInName();

  /**
   * Sets the value of the '{@link hu.bme.mit.depModel.SystemPortIn#getSysPortInName <em>Sys Port In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sys Port In Name</em>' attribute.
   * @see #getSysPortInName()
   * @generated
   */
  void setSysPortInName(String value);

  /**
   * Returns the value of the '<em><b>In Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Comp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Comp</em>' reference.
   * @see #setInComp(ComponentImpl)
   * @see hu.bme.mit.depModel.DepModelPackage#getSystemPortIn_InComp()
   * @model
   * @generated
   */
  ComponentImpl getInComp();

  /**
   * Sets the value of the '{@link hu.bme.mit.depModel.SystemPortIn#getInComp <em>In Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Comp</em>' reference.
   * @see #getInComp()
   * @generated
   */
  void setInComp(ComponentImpl value);

  /**
   * Returns the value of the '<em><b>In Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Port</em>' reference.
   * @see #setInPort(PortIn)
   * @see hu.bme.mit.depModel.DepModelPackage#getSystemPortIn_InPort()
   * @model
   * @generated
   */
  PortIn getInPort();

  /**
   * Sets the value of the '{@link hu.bme.mit.depModel.SystemPortIn#getInPort <em>In Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Port</em>' reference.
   * @see #getInPort()
   * @generated
   */
  void setInPort(PortIn value);

} // SystemPortIn
