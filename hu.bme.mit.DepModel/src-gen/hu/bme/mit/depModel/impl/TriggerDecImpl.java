/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.ErrorModes;
import hu.bme.mit.depModel.PortDec;
import hu.bme.mit.depModel.TriggerDec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.TriggerDecImpl#getTriggerName <em>Trigger Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.TriggerDecImpl#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.TriggerDecImpl#getErrorMode <em>Error Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerDecImpl extends TransitionFeatureDecImpl implements TriggerDec
{
  /**
   * The default value of the '{@link #getTriggerName() <em>Trigger Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggerName()
   * @generated
   * @ordered
   */
  protected static final String TRIGGER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTriggerName() <em>Trigger Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggerName()
   * @generated
   * @ordered
   */
  protected String triggerName = TRIGGER_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPortInstance() <em>Port Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortInstance()
   * @generated
   * @ordered
   */
  protected PortDec portInstance;

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
  protected TriggerDecImpl()
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
    return DepModelPackage.Literals.TRIGGER_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTriggerName()
  {
    return triggerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTriggerName(String newTriggerName)
  {
    String oldTriggerName = triggerName;
    triggerName = newTriggerName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.TRIGGER_DEC__TRIGGER_NAME, oldTriggerName, triggerName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortDec getPortInstance()
  {
    if (portInstance != null && portInstance.eIsProxy())
    {
      InternalEObject oldPortInstance = (InternalEObject)portInstance;
      portInstance = (PortDec)eResolveProxy(oldPortInstance);
      if (portInstance != oldPortInstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.TRIGGER_DEC__PORT_INSTANCE, oldPortInstance, portInstance));
      }
    }
    return portInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortDec basicGetPortInstance()
  {
    return portInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortInstance(PortDec newPortInstance)
  {
    PortDec oldPortInstance = portInstance;
    portInstance = newPortInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.TRIGGER_DEC__PORT_INSTANCE, oldPortInstance, portInstance));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.TRIGGER_DEC__ERROR_MODE, oldErrorMode, errorMode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.TRIGGER_DEC__ERROR_MODE, oldErrorMode, errorMode));
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
      case DepModelPackage.TRIGGER_DEC__TRIGGER_NAME:
        return getTriggerName();
      case DepModelPackage.TRIGGER_DEC__PORT_INSTANCE:
        if (resolve) return getPortInstance();
        return basicGetPortInstance();
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
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
      case DepModelPackage.TRIGGER_DEC__TRIGGER_NAME:
        setTriggerName((String)newValue);
        return;
      case DepModelPackage.TRIGGER_DEC__PORT_INSTANCE:
        setPortInstance((PortDec)newValue);
        return;
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
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
      case DepModelPackage.TRIGGER_DEC__TRIGGER_NAME:
        setTriggerName(TRIGGER_NAME_EDEFAULT);
        return;
      case DepModelPackage.TRIGGER_DEC__PORT_INSTANCE:
        setPortInstance((PortDec)null);
        return;
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
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
      case DepModelPackage.TRIGGER_DEC__TRIGGER_NAME:
        return TRIGGER_NAME_EDEFAULT == null ? triggerName != null : !TRIGGER_NAME_EDEFAULT.equals(triggerName);
      case DepModelPackage.TRIGGER_DEC__PORT_INSTANCE:
        return portInstance != null;
      case DepModelPackage.TRIGGER_DEC__ERROR_MODE:
        return errorMode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (TriggerName: ");
    result.append(triggerName);
    result.append(')');
    return result.toString();
  }

} //TriggerDecImpl
