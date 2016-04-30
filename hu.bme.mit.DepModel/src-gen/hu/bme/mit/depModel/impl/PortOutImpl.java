/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.PortOut;
import hu.bme.mit.depModel.PortType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.PortOutImpl#getPortOutSuperType <em>Port Out Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortOutImpl extends PortDecImpl implements PortOut
{
  /**
   * The cached value of the '{@link #getPortOutSuperType() <em>Port Out Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortOutSuperType()
   * @generated
   * @ordered
   */
  protected PortType portOutSuperType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortOutImpl()
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
    return DepModelPackage.Literals.PORT_OUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType getPortOutSuperType()
  {
    if (portOutSuperType != null && portOutSuperType.eIsProxy())
    {
      InternalEObject oldPortOutSuperType = (InternalEObject)portOutSuperType;
      portOutSuperType = (PortType)eResolveProxy(oldPortOutSuperType);
      if (portOutSuperType != oldPortOutSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.PORT_OUT__PORT_OUT_SUPER_TYPE, oldPortOutSuperType, portOutSuperType));
      }
    }
    return portOutSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType basicGetPortOutSuperType()
  {
    return portOutSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortOutSuperType(PortType newPortOutSuperType)
  {
    PortType oldPortOutSuperType = portOutSuperType;
    portOutSuperType = newPortOutSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.PORT_OUT__PORT_OUT_SUPER_TYPE, oldPortOutSuperType, portOutSuperType));
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
      case DepModelPackage.PORT_OUT__PORT_OUT_SUPER_TYPE:
        if (resolve) return getPortOutSuperType();
        return basicGetPortOutSuperType();
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
      case DepModelPackage.PORT_OUT__PORT_OUT_SUPER_TYPE:
        setPortOutSuperType((PortType)newValue);
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
      case DepModelPackage.PORT_OUT__PORT_OUT_SUPER_TYPE:
        setPortOutSuperType((PortType)null);
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
      case DepModelPackage.PORT_OUT__PORT_OUT_SUPER_TYPE:
        return portOutSuperType != null;
    }
    return super.eIsSet(featureID);
  }

} //PortOutImpl
