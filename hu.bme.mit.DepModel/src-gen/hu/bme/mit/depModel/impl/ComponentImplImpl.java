/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.ComponentImpl;
import hu.bme.mit.depModel.ComponentType;
import hu.bme.mit.depModel.DepModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.ComponentImplImpl#getCompImplName <em>Comp Impl Name</em>}</li>
 *   <li>{@link hu.bme.mit.depModel.impl.ComponentImplImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImplImpl extends SysFeaturesDecImpl implements ComponentImpl
{
  /**
   * The default value of the '{@link #getCompImplName() <em>Comp Impl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompImplName()
   * @generated
   * @ordered
   */
  protected static final String COMP_IMPL_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCompImplName() <em>Comp Impl Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompImplName()
   * @generated
   * @ordered
   */
  protected String compImplName = COMP_IMPL_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected ComponentType superType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentImplImpl()
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
    return DepModelPackage.Literals.COMPONENT_IMPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCompImplName()
  {
    return compImplName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompImplName(String newCompImplName)
  {
    String oldCompImplName = compImplName;
    compImplName = newCompImplName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.COMPONENT_IMPL__COMP_IMPL_NAME, oldCompImplName, compImplName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentType getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (ComponentType)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DepModelPackage.COMPONENT_IMPL__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentType basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(ComponentType newSuperType)
  {
    ComponentType oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DepModelPackage.COMPONENT_IMPL__SUPER_TYPE, oldSuperType, superType));
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
      case DepModelPackage.COMPONENT_IMPL__COMP_IMPL_NAME:
        return getCompImplName();
      case DepModelPackage.COMPONENT_IMPL__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
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
      case DepModelPackage.COMPONENT_IMPL__COMP_IMPL_NAME:
        setCompImplName((String)newValue);
        return;
      case DepModelPackage.COMPONENT_IMPL__SUPER_TYPE:
        setSuperType((ComponentType)newValue);
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
      case DepModelPackage.COMPONENT_IMPL__COMP_IMPL_NAME:
        setCompImplName(COMP_IMPL_NAME_EDEFAULT);
        return;
      case DepModelPackage.COMPONENT_IMPL__SUPER_TYPE:
        setSuperType((ComponentType)null);
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
      case DepModelPackage.COMPONENT_IMPL__COMP_IMPL_NAME:
        return COMP_IMPL_NAME_EDEFAULT == null ? compImplName != null : !COMP_IMPL_NAME_EDEFAULT.equals(compImplName);
      case DepModelPackage.COMPONENT_IMPL__SUPER_TYPE:
        return superType != null;
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
    result.append(" (CompImplName: ");
    result.append(compImplName);
    result.append(')');
    return result.toString();
  }

} //ComponentImplImpl
