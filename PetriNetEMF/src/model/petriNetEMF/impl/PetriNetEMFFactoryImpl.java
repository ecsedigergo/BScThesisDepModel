/**
 */
package model.petriNetEMF.impl;

import model.petriNetEMF.*;

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
public class PetriNetEMFFactoryImpl extends EFactoryImpl implements PetriNetEMFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetriNetEMFFactory init() {
		try {
			PetriNetEMFFactory thePetriNetEMFFactory = (PetriNetEMFFactory)EPackage.Registry.INSTANCE.getEFactory(PetriNetEMFPackage.eNS_URI);
			if (thePetriNetEMFFactory != null) {
				return thePetriNetEMFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetriNetEMFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetEMFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PetriNetEMFPackage.PETRI_NET: return createPetriNet();
			case PetriNetEMFPackage.PLACE: return createPlace();
			case PetriNetEMFPackage.TRANSITION: return createTransition();
			case PetriNetEMFPackage.PLACE_TO_TRANSITION_ARC: return createPlaceToTransitionArc();
			case PetriNetEMFPackage.TRANSITION_TO_PLACE_ARC: return createTransitionToPlaceArc();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet createPetriNet() {
		PetriNetImpl petriNet = new PetriNetImpl();
		return petriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place createPlace() {
		PlaceImpl place = new PlaceImpl();
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceToTransitionArc createPlaceToTransitionArc() {
		PlaceToTransitionArcImpl placeToTransitionArc = new PlaceToTransitionArcImpl();
		return placeToTransitionArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionToPlaceArc createTransitionToPlaceArc() {
		TransitionToPlaceArcImpl transitionToPlaceArc = new TransitionToPlaceArcImpl();
		return transitionToPlaceArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetEMFPackage getPetriNetEMFPackage() {
		return (PetriNetEMFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetriNetEMFPackage getPackage() {
		return PetriNetEMFPackage.eINSTANCE;
	}

} //PetriNetEMFFactoryImpl
