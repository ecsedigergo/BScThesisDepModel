/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.ErrorPortIn;
import hu.bme.mit.depModel.PortType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Port In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.ErrorPortInImpl#getErrorPortInName <em>Error Port In Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.ErrorPortInImpl#getErrorPortInSuperType <em>Error Port In Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorPortInImpl extends ErrorPortDecImpl implements ErrorPortIn
{
  /**
   * The default value of the '{@link #getErrorPortInName() <em>Error Port In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorPortInName()
   * @generated
   * @ordered
   */
  protected static final String ERROR_PORT_IN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getErrorPortInName() <em>Error Port In Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorPortInName()
   * @generated
   * @ordered
   */
  protected String errorPortInName = ERROR_PORT_IN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getErrorPortInSuperType() <em>Error Port In Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getErrorPortInSuperType()
   * @generated
   * @ordered
   */
  protected PortType errorPortInSuperType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ErrorPortInImpl()
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
    return DepModelPackage.Literals.ERROR_PORT_IN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getErrorPortInName()
  {
    return errorPortInName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorPortInName(String newErrorPortInName)
  {
    String oldErrorPortInName = errorPortInName;
    errorPortInName = newErrorPortInName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_NAME, oldErrorPortInName, errorPortInName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType getErrorPortInSuperType()
  {
    if (errorPortInSuperType != null && errorPortInSuperType.eIsProxy())
    {
      InternalEObject oldErrorPortInSuperType = (InternalEObject)errorPortInSuperType;
      errorPortInSuperType = (PortType)eResolveProxy(oldErrorPortInSuperType);
      if (errorPortInSuperType != oldErrorPortInSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_SUPER_TYPE, oldErrorPortInSuperType, errorPortInSuperType));
      }
    }
    return errorPortInSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType basicGetErrorPortInSuperType()
  {
    return errorPortInSuperType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setErrorPortInSuperType(PortType newErrorPortInSuperType)
  {
    PortType oldErrorPortInSuperType = errorPortInSuperType;
    errorPortInSuperType = newErrorPortInSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_SUPER_TYPE, oldErrorPortInSuperType, errorPortInSuperType));
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
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_NAME:
        return getErrorPortInName();
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_SUPER_TYPE:
        if (resolve) return getErrorPortInSuperType();
        return basicGetErrorPortInSuperType();
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
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_NAME:
        setErrorPortInName((String)newValue);
        return;
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_SUPER_TYPE:
        setErrorPortInSuperType((PortType)newValue);
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
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_NAME:
        setErrorPortInName(ERROR_PORT_IN_NAME_EDEFAULT);
        return;
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_SUPER_TYPE:
        setErrorPortInSuperType((PortType)null);
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
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_NAME:
        return ERROR_PORT_IN_NAME_EDEFAULT == null ? errorPortInName != null : !ERROR_PORT_IN_NAME_EDEFAULT.equals(errorPortInName);
      case DepModelPackage.ERROR_PORT_IN__ERROR_PORT_IN_SUPER_TYPE:
        return errorPortInSuperType != null;
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
    result.append(" (ErrorPortInName: ");
    result.append(errorPortInName);
    result.append(')');
    return result.toString();
  }

} //ErrorPortInImpl
