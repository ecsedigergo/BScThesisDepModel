/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.PortIn;
import hu.bme.mit.depModel.PortType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.PortInImpl#getPortInSuperType <em>Port In Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortInImpl extends PortDecImpl implements PortIn
{
  /**
   * The cached value of the '{@link #getPortInSuperType() <em>Port In Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortInSuperType()
   * @generated
   * @ordered
   */
  protected PortType portInSuperType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortInImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DepModelPackage.Literals.PORT_IN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType getPortInSuperType()
  {
    if (portInSuperType != null && portInSuperType.eIsProxy())
    {
      InternalEObject oldPortInSuperType = (InternalEObject)portInSuperType;
      portInSuperType = (PortType)eResolveProxy(oldPortInSuperType);
      if (portInSuperType != oldPortInSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.PORT_IN__PORT_IN_SUPER_TYPE, oldPortInSuperType, portInSuperType));
      }
    }
    return portInSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType basicGetPortInSuperType()
  {
    return portInSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortInSuperType(PortType newPortInSuperType)
  {
    PortType oldPortInSuperType = portInSuperType;
    portInSuperType = newPortInSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.PORT_IN__PORT_IN_SUPER_TYPE, oldPortInSuperType, portInSuperType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DepModelPackage.PORT_IN__PORT_IN_SUPER_TYPE:
        if (resolve) return getPortInSuperType();
        return basicGetPortInSuperType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DepModelPackage.PORT_IN__PORT_IN_SUPER_TYPE:
        setPortInSuperType((PortType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DepModelPackage.PORT_IN__PORT_IN_SUPER_TYPE:
        setPortInSuperType((PortType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DepModelPackage.PORT_IN__PORT_IN_SUPER_TYPE:
        return portInSuperType != null;
    }
    return super.eIsSet(featureID);
  }

} //PortInImpl
