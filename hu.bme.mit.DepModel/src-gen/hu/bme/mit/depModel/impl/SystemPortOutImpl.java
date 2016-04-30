/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.ComponentImpl;
import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.PortOut;
import hu.bme.mit.depModel.SystemPortOut;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Port Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.SystemPortOutImpl#getSysPortOutName <em>Sys Port Out Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.SystemPortOutImpl#getOutComp <em>Out Comp</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.SystemPortOutImpl#getOutPort <em>Out Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemPortOutImpl extends SystemPortDecImpl implements SystemPortOut
{
  /**
   * The default value of the '{@link #getSysPortOutName() <em>Sys Port Out Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSysPortOutName()
   * @generated
   * @ordered
   */
  protected static final String SYS_PORT_OUT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSysPortOutName() <em>Sys Port Out Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSysPortOutName()
   * @generated
   * @ordered
   */
  protected String sysPortOutName = SYS_PORT_OUT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getOutComp() <em>Out Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutComp()
   * @generated
   * @ordered
   */
  protected ComponentImpl outComp;

  /**
   * The cached value of the '{@link #getOutPort() <em>Out Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutPort()
   * @generated
   * @ordered
   */
  protected PortOut outPort;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemPortOutImpl()
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
    return DepModelPackage.Literals.SYSTEM_PORT_OUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSysPortOutName()
  {
    return sysPortOutName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSysPortOutName(String newSysPortOutName)
  {
    String oldSysPortOutName = sysPortOutName;
    sysPortOutName = newSysPortOutName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.SYSTEM_PORT_OUT__SYS_PORT_OUT_NAME, oldSysPortOutName, sysPortOutName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImpl getOutComp()
  {
    if (outComp != null && outComp.eIsProxy())
    {
      InternalEObject oldOutComp = (InternalEObject)outComp;
      outComp = (ComponentImpl)eResolveProxy(oldOutComp);
      if (outComp != oldOutComp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.SYSTEM_PORT_OUT__OUT_COMP, oldOutComp, outComp));
      }
    }
    return outComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImpl basicGetOutComp()
  {
    return outComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutComp(ComponentImpl newOutComp)
  {
    ComponentImpl oldOutComp = outComp;
    outComp = newOutComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.SYSTEM_PORT_OUT__OUT_COMP, oldOutComp, outComp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortOut getOutPort()
  {
    if (outPort != null && outPort.eIsProxy())
    {
      InternalEObject oldOutPort = (InternalEObject)outPort;
      outPort = (PortOut)eResolveProxy(oldOutPort);
      if (outPort != oldOutPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.SYSTEM_PORT_OUT__OUT_PORT, oldOutPort, outPort));
      }
    }
    return outPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortOut basicGetOutPort()
  {
    return outPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutPort(PortOut newOutPort)
  {
    PortOut oldOutPort = outPort;
    outPort = newOutPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.SYSTEM_PORT_OUT__OUT_PORT, oldOutPort, outPort));
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
      case DepModelPackage.SYSTEM_PORT_OUT__SYS_PORT_OUT_NAME:
        return getSysPortOutName();
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_COMP:
        if (resolve) return getOutComp();
        return basicGetOutComp();
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_PORT:
        if (resolve) return getOutPort();
        return basicGetOutPort();
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
      case DepModelPackage.SYSTEM_PORT_OUT__SYS_PORT_OUT_NAME:
        setSysPortOutName((String)newValue);
        return;
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_COMP:
        setOutComp((ComponentImpl)newValue);
        return;
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_PORT:
        setOutPort((PortOut)newValue);
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
      case DepModelPackage.SYSTEM_PORT_OUT__SYS_PORT_OUT_NAME:
        setSysPortOutName(SYS_PORT_OUT_NAME_EDEFAULT);
        return;
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_COMP:
        setOutComp((ComponentImpl)null);
        return;
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_PORT:
        setOutPort((PortOut)null);
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
      case DepModelPackage.SYSTEM_PORT_OUT__SYS_PORT_OUT_NAME:
        return SYS_PORT_OUT_NAME_EDEFAULT == null ? sysPortOutName != null : !SYS_PORT_OUT_NAME_EDEFAULT.equals(sysPortOutName);
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_COMP:
        return outComp != null;
      case DepModelPackage.SYSTEM_PORT_OUT__OUT_PORT:
        return outPort != null;
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
    result.append(" (SysPortOutName: ");
    result.append(sysPortOutName);
    result.append(')');
    return result.toString();
  }

} //SystemPortOutImpl
