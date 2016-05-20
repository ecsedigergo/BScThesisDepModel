/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.Action;
import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.ErrorModes;
import hu.bme.mit.depModel.PortOut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.ActionImpl#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.ActionImpl#getErrorMode <em>Error Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends TransitionFeatureDecImpl implements Action
{
  /**
   * The cached value of the '{@link #getPortInstance() <em>Port Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortInstance()
   * @generated
   * @ordered
   */
  protected PortOut portInstance;

  /**
   * The cached value of the '{@link #getErrorMode() <em>Error Mode</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorMode()
   * @generated
   * @ordered
   */
  protected ErrorModes errorMode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return DepModelPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortOut getPortInstance()
  {
    if (portInstance != null && portInstance.eIsProxy())
    {
      InternalEObject oldPortInstance = (InternalEObject)portInstance;
      portInstance = (PortOut)eResolveProxy(oldPortInstance);
      if (portInstance != oldPortInstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.ACTION__PORT_INSTANCE, oldPortInstance, portInstance));
      }
    }
    return portInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortOut basicGetPortInstance()
  {
    return portInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortInstance(PortOut newPortInstance)
  {
    PortOut oldPortInstance = portInstance;
    portInstance = newPortInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.ACTION__PORT_INSTANCE, oldPortInstance, portInstance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModes getErrorMode()
  {
    if (errorMode != null && errorMode.eIsProxy())
    {
      InternalEObject oldErrorMode = (InternalEObject)errorMode;
      errorMode = (ErrorModes)eResolveProxy(oldErrorMode);
      if (errorMode != oldErrorMode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.ACTION__ERROR_MODE, oldErrorMode, errorMode));
      }
    }
    return errorMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModes basicGetErrorMode()
  {
    return errorMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorMode(ErrorModes newErrorMode)
  {
    ErrorModes oldErrorMode = errorMode;
    errorMode = newErrorMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.ACTION__ERROR_MODE, oldErrorMode, errorMode));
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
      case DepModelPackage.ACTION__PORT_INSTANCE:
        if (resolve) return getPortInstance();
        return basicGetPortInstance();
      case DepModelPackage.ACTION__ERROR_MODE:
        if (resolve) return getErrorMode();
        return basicGetErrorMode();
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
      case DepModelPackage.ACTION__PORT_INSTANCE:
        setPortInstance((PortOut)newValue);
        return;
      case DepModelPackage.ACTION__ERROR_MODE:
        setErrorMode((ErrorModes)newValue);
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
      case DepModelPackage.ACTION__PORT_INSTANCE:
        setPortInstance((PortOut)null);
        return;
      case DepModelPackage.ACTION__ERROR_MODE:
        setErrorMode((ErrorModes)null);
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
      case DepModelPackage.ACTION__PORT_INSTANCE:
        return portInstance != null;
      case DepModelPackage.ACTION__ERROR_MODE:
        return errorMode != null;
    }
    return super.eIsSet(featureID);
  }

} //ActionImpl
