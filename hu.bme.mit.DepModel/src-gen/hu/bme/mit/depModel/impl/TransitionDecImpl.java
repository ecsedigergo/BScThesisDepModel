/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.TransitionDec;
import hu.bme.mit.depModel.TransitionFeatureDec;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.depModel.impl.TransitionDecImpl#getTransFeatures <em>Trans Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionDecImpl extends ErrorModelElementImpl implements TransitionDec
{
  /**
   * The cached value of the '{@link #getTransFeatures() <em>Trans Features</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransFeatures()
   * @generated
   * @ordered
   */
  protected EList<TransitionFeatureDec> transFeatures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionDecImpl()
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
    return DepModelPackage.Literals.TRANSITION_DEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TransitionFeatureDec> getTransFeatures()
  {
    if (transFeatures == null)
    {
      transFeatures = new EObjectContainmentEList<TransitionFeatureDec>(TransitionFeatureDec.class, this, DepModelPackage.TRANSITION_DEC__TRANS_FEATURES);
    }
    return transFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DepModelPackage.TRANSITION_DEC__TRANS_FEATURES:
        return ((InternalEList<?>)getTransFeatures()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DepModelPackage.TRANSITION_DEC__TRANS_FEATURES:
        return getTransFeatures();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DepModelPackage.TRANSITION_DEC__TRANS_FEATURES:
        getTransFeatures().clear();
        getTransFeatures().addAll((Collection<? extends TransitionFeatureDec>)newValue);
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
      case DepModelPackage.TRANSITION_DEC__TRANS_FEATURES:
        getTransFeatures().clear();
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
      case DepModelPackage.TRANSITION_DEC__TRANS_FEATURES:
        return transFeatures != null && !transFeatures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransitionDecImpl
