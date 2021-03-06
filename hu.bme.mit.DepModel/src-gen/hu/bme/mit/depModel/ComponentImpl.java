/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.ComponentImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see hu.bme.mit.depModel.DepModelPackage#getComponentImpl()
 * @model
 * @generated
 */
public interface ComponentImpl extends SysFeaturesDec
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(ComponentType)
   * @see hu.bme.mit.depModel.DepModelPackage#getComponentImpl_SuperType()
   * @model
   * @generated
   */
  ComponentType getSuperType();

  /**
   * Sets the value of the '{@link hu.bme.mit.depModel.ComponentImpl#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(ComponentType value);

} // ComponentImpl
