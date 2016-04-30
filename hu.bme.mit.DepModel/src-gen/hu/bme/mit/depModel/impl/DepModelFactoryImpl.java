/**
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.depModel.impl;

import hu.bme.mit.depModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DepModelFactoryImpl extends EFactoryImpl implements DepModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DepModelFactory init()
  {
    try
    {
      DepModelFactory theDepModelFactory = (DepModelFactory)EPackage.Registry.INSTANCE.getEFactory(DepModelPackage.eNS_URI);
      if (theDepModelFactory != null)
      {
        return theDepModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DepModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DepModelPackage.DEP_MODEL: return createDepModel();
      case DepModelPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case DepModelPackage.PORT_TYPE: return createPortType();
      case DepModelPackage.ERROR_MODES: return createErrorModes();
      case DepModelPackage.COMPONENT_MODEL_DEC: return createComponentModelDec();
      case DepModelPackage.SYSTEM_CONN_DEC: return createSystemConnDec();
      case DepModelPackage.SYSTEM_DEC: return createSystemDec();
      case DepModelPackage.SYS_FEATURES_DEC: return createSysFeaturesDec();
      case DepModelPackage.SYSTEM_PORT_DEC: return createSystemPortDec();
      case DepModelPackage.SYSTEM_PORT_IN: return createSystemPortIn();
      case DepModelPackage.SYSTEM_PORT_OUT: return createSystemPortOut();
      case DepModelPackage.COMPONENT_CONN_DEC: return createComponentConnDec();
      case DepModelPackage.COMPONENT_IMPL: return createComponentImpl();
      case DepModelPackage.COMPONENT_TYPE: return createComponentType();
      case DepModelPackage.COMPONENT_FEATURES_DEC: return createComponentFeaturesDec();
      case DepModelPackage.PORT_DEC: return createPortDec();
      case DepModelPackage.PORT_IN: return createPortIn();
      case DepModelPackage.PORT_OUT: return createPortOut();
      case DepModelPackage.ERROR_MODEL_DEC: return createErrorModelDec();
      case DepModelPackage.ERROR_MODEL_ELEMENT: return createErrorModelElement();
      case DepModelPackage.ERROR_PORT_DEC: return createErrorPortDec();
      case DepModelPackage.ERROR_PORT_IN: return createErrorPortIn();
      case DepModelPackage.ERROR_PORT_OUT: return createErrorPortOut();
      case DepModelPackage.STATE_DEC: return createStateDec();
      case DepModelPackage.TRANSITION_DEC: return createTransitionDec();
      case DepModelPackage.TRANSITION_FEATURE_DEC: return createTransitionFeatureDec();
      case DepModelPackage.TRANSITION_STATE: return createTransitionState();
      case DepModelPackage.TRIGGER_DEC: return createTriggerDec();
      case DepModelPackage.ACTION_DEC: return createActionDec();
      case DepModelPackage.OCCURRENCE_DEC: return createOccurrenceDec();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepModel createDepModel()
  {
    DepModelImpl depModel = new DepModelImpl();
    return depModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortType createPortType()
  {
    PortTypeImpl portType = new PortTypeImpl();
    return portType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModes createErrorModes()
  {
    ErrorModesImpl errorModes = new ErrorModesImpl();
    return errorModes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentModelDec createComponentModelDec()
  {
    ComponentModelDecImpl componentModelDec = new ComponentModelDecImpl();
    return componentModelDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemConnDec createSystemConnDec()
  {
    SystemConnDecImpl systemConnDec = new SystemConnDecImpl();
    return systemConnDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDec createSystemDec()
  {
    SystemDecImpl systemDec = new SystemDecImpl();
    return systemDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SysFeaturesDec createSysFeaturesDec()
  {
    SysFeaturesDecImpl sysFeaturesDec = new SysFeaturesDecImpl();
    return sysFeaturesDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemPortDec createSystemPortDec()
  {
    SystemPortDecImpl systemPortDec = new SystemPortDecImpl();
    return systemPortDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemPortIn createSystemPortIn()
  {
    SystemPortInImpl systemPortIn = new SystemPortInImpl();
    return systemPortIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemPortOut createSystemPortOut()
  {
    SystemPortOutImpl systemPortOut = new SystemPortOutImpl();
    return systemPortOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentConnDec createComponentConnDec()
  {
    ComponentConnDecImpl componentConnDec = new ComponentConnDecImpl();
    return componentConnDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentImpl createComponentImpl()
  {
    ComponentImplImpl componentImpl = new ComponentImplImpl();
    return componentImpl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentType createComponentType()
  {
    ComponentTypeImpl componentType = new ComponentTypeImpl();
    return componentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComponentFeaturesDec createComponentFeaturesDec()
  {
    ComponentFeaturesDecImpl componentFeaturesDec = new ComponentFeaturesDecImpl();
    return componentFeaturesDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortDec createPortDec()
  {
    PortDecImpl portDec = new PortDecImpl();
    return portDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortIn createPortIn()
  {
    PortInImpl portIn = new PortInImpl();
    return portIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PortOut createPortOut()
  {
    PortOutImpl portOut = new PortOutImpl();
    return portOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelDec createErrorModelDec()
  {
    ErrorModelDecImpl errorModelDec = new ErrorModelDecImpl();
    return errorModelDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelElement createErrorModelElement()
  {
    ErrorModelElementImpl errorModelElement = new ErrorModelElementImpl();
    return errorModelElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorPortDec createErrorPortDec()
  {
    ErrorPortDecImpl errorPortDec = new ErrorPortDecImpl();
    return errorPortDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorPortIn createErrorPortIn()
  {
    ErrorPortInImpl errorPortIn = new ErrorPortInImpl();
    return errorPortIn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorPortOut createErrorPortOut()
  {
    ErrorPortOutImpl errorPortOut = new ErrorPortOutImpl();
    return errorPortOut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDec createStateDec()
  {
    StateDecImpl stateDec = new StateDecImpl();
    return stateDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionDec createTransitionDec()
  {
    TransitionDecImpl transitionDec = new TransitionDecImpl();
    return transitionDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionFeatureDec createTransitionFeatureDec()
  {
    TransitionFeatureDecImpl transitionFeatureDec = new TransitionFeatureDecImpl();
    return transitionFeatureDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionState createTransitionState()
  {
    TransitionStateImpl transitionState = new TransitionStateImpl();
    return transitionState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerDec createTriggerDec()
  {
    TriggerDecImpl triggerDec = new TriggerDecImpl();
    return triggerDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionDec createActionDec()
  {
    ActionDecImpl actionDec = new ActionDecImpl();
    return actionDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OccurrenceDec createOccurrenceDec()
  {
    OccurrenceDecImpl occurrenceDec = new OccurrenceDecImpl();
    return occurrenceDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DepModelPackage getDepModelPackage()
  {
    return (DepModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DepModelPackage getPackage()
  {
    return DepModelPackage.eINSTANCE;
  }

} //DepModelFactoryImpl
