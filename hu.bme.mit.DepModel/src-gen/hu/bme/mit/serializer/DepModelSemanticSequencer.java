/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.serializer;

import com.google.inject.Inject;
import hu.bme.mit.depModel.ComponentConnDec;
import hu.bme.mit.depModel.ComponentImpl;
import hu.bme.mit.depModel.ComponentType;
import hu.bme.mit.depModel.DepModel;
import hu.bme.mit.depModel.DepModelPackage;
import hu.bme.mit.depModel.ErrorModelDec;
import hu.bme.mit.depModel.ErrorModes;
import hu.bme.mit.depModel.Occurrence;
import hu.bme.mit.depModel.PortIn;
import hu.bme.mit.depModel.PortOut;
import hu.bme.mit.depModel.PortType;
import hu.bme.mit.depModel.State;
import hu.bme.mit.depModel.SystemConnDec;
import hu.bme.mit.depModel.SystemDec;
import hu.bme.mit.depModel.SystemPortIn;
import hu.bme.mit.depModel.SystemPortOut;
import hu.bme.mit.depModel.TransitionDec;
import hu.bme.mit.depModel.TransitionState;
import hu.bme.mit.depModel.Trigger;
import hu.bme.mit.services.DepModelGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DepModelSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DepModelGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DepModelPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DepModelPackage.ACTION:
				sequence_Action(context, (hu.bme.mit.depModel.Action) semanticObject); 
				return; 
			case DepModelPackage.COMPONENT_CONN_DEC:
				sequence_ComponentConnDec(context, (ComponentConnDec) semanticObject); 
				return; 
			case DepModelPackage.COMPONENT_IMPL:
				sequence_ComponentImpl(context, (ComponentImpl) semanticObject); 
				return; 
			case DepModelPackage.COMPONENT_TYPE:
				sequence_ComponentType(context, (ComponentType) semanticObject); 
				return; 
			case DepModelPackage.DEP_MODEL:
				sequence_DepModel(context, (DepModel) semanticObject); 
				return; 
			case DepModelPackage.ERROR_MODEL_DEC:
				sequence_ErrorModelDec(context, (ErrorModelDec) semanticObject); 
				return; 
			case DepModelPackage.ERROR_MODES:
				sequence_ErrorModes(context, (ErrorModes) semanticObject); 
				return; 
			case DepModelPackage.OCCURRENCE:
				sequence_TransitionFeatureDec(context, (Occurrence) semanticObject); 
				return; 
			case DepModelPackage.PORT_IN:
				sequence_PortIn(context, (PortIn) semanticObject); 
				return; 
			case DepModelPackage.PORT_OUT:
				sequence_PortOut(context, (PortOut) semanticObject); 
				return; 
			case DepModelPackage.PORT_TYPE:
				sequence_PortType(context, (PortType) semanticObject); 
				return; 
			case DepModelPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case DepModelPackage.SYSTEM_CONN_DEC:
				sequence_SystemConnDec(context, (SystemConnDec) semanticObject); 
				return; 
			case DepModelPackage.SYSTEM_DEC:
				sequence_SystemDec(context, (SystemDec) semanticObject); 
				return; 
			case DepModelPackage.SYSTEM_PORT_IN:
				sequence_SystemPortIn(context, (SystemPortIn) semanticObject); 
				return; 
			case DepModelPackage.SYSTEM_PORT_OUT:
				sequence_SystemPortOut(context, (SystemPortOut) semanticObject); 
				return; 
			case DepModelPackage.TRANSITION_DEC:
				sequence_TransitionDec(context, (TransitionDec) semanticObject); 
				return; 
			case DepModelPackage.TRANSITION_STATE:
				sequence_TransitionState(context, (TransitionState) semanticObject); 
				return; 
			case DepModelPackage.TRIGGER:
				sequence_Trigger(context, (Trigger) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TransitionFeatureDec returns Action
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (portInstance=[PortOut|ID] errorMode=[ErrorModes|ID])
	 */
	protected void sequence_Action(ISerializationContext context, hu.bme.mit.depModel.Action semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.ACTION__PORT_INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.ACTION__PORT_INSTANCE));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.ACTION__ERROR_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.ACTION__ERROR_MODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionAccess().getPortInstancePortOutIDTerminalRuleCall_1_0_1(), semanticObject.getPortInstance());
		feeder.accept(grammarAccess.getActionAccess().getErrorModeErrorModesIDTerminalRuleCall_3_0_1(), semanticObject.getErrorMode());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SysFeaturesDec returns ComponentConnDec
	 *     ComponentConnDec returns ComponentConnDec
	 *
	 * Constraint:
	 *     (name=QualifiedName sourceComp=[ComponentImpl|ID] sourcePort=[PortOut|ID] targetComp=[ComponentImpl|ID] targetPort=[PortIn|ID])
	 */
	protected void sequence_ComponentConnDec(ISerializationContext context, ComponentConnDec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__SOURCE_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__SOURCE_COMP));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__SOURCE_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__SOURCE_PORT));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__TARGET_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__TARGET_COMP));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__TARGET_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.COMPONENT_CONN_DEC__TARGET_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentConnDecAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentConnDecAccess().getSourceCompComponentImplIDTerminalRuleCall_3_0_1(), semanticObject.getSourceComp());
		feeder.accept(grammarAccess.getComponentConnDecAccess().getSourcePortPortOutIDTerminalRuleCall_5_0_1(), semanticObject.getSourcePort());
		feeder.accept(grammarAccess.getComponentConnDecAccess().getTargetCompComponentImplIDTerminalRuleCall_7_0_1(), semanticObject.getTargetComp());
		feeder.accept(grammarAccess.getComponentConnDecAccess().getTargetPortPortInIDTerminalRuleCall_9_0_1(), semanticObject.getTargetPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SysFeaturesDec returns ComponentImpl
	 *     ComponentImpl returns ComponentImpl
	 *
	 * Constraint:
	 *     (name=QualifiedName superType=[ComponentType|ID])
	 */
	protected void sequence_ComponentImpl(ISerializationContext context, ComponentImpl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.COMPONENT_IMPL__SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.COMPONENT_IMPL__SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeIDTerminalRuleCall_3_0_1(), semanticObject.getSuperType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns ComponentType
	 *     ComponentType returns ComponentType
	 *
	 * Constraint:
	 *     (name=QualifiedName componentFeatures+=ComponentFeaturesDec*)
	 */
	protected void sequence_ComponentType(ISerializationContext context, ComponentType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DepModel returns DepModel
	 *
	 * Constraint:
	 *     elements+=AbstractElement+
	 */
	protected void sequence_DepModel(ISerializationContext context, DepModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ComponentFeaturesDec returns ErrorModelDec
	 *     ErrorModelDec returns ErrorModelDec
	 *
	 * Constraint:
	 *     (name=QualifiedName emodelElements+=ErrorModelElement*)
	 */
	protected void sequence_ErrorModelDec(ISerializationContext context, ErrorModelDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ErrorModes returns ErrorModes
	 *
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_ErrorModes(ISerializationContext context, ErrorModes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.ERROR_MODES__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.ERROR_MODES__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentFeaturesDec returns PortIn
	 *     PortDec returns PortIn
	 *     PortIn returns PortIn
	 *
	 * Constraint:
	 *     (name=QualifiedName PortInSuperType=[PortType|ID])
	 */
	protected void sequence_PortIn(ISerializationContext context, PortIn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.COMPONENT_FEATURES_DEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.COMPONENT_FEATURES_DEC__NAME));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.PORT_IN__PORT_IN_SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.PORT_IN__PORT_IN_SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortInAccess().getNameQualifiedNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPortInAccess().getPortInSuperTypePortTypeIDTerminalRuleCall_4_0_1(), semanticObject.getPortInSuperType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComponentFeaturesDec returns PortOut
	 *     PortDec returns PortOut
	 *     PortOut returns PortOut
	 *
	 * Constraint:
	 *     (name=QualifiedName PortOutSuperType=[PortType|ID])
	 */
	protected void sequence_PortOut(ISerializationContext context, PortOut semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.COMPONENT_FEATURES_DEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.COMPONENT_FEATURES_DEC__NAME));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.PORT_OUT__PORT_OUT_SUPER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.PORT_OUT__PORT_OUT_SUPER_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPortOutAccess().getNameQualifiedNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPortOutAccess().getPortOutSuperTypePortTypeIDTerminalRuleCall_4_0_1(), semanticObject.getPortOutSuperType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns PortType
	 *     PortType returns PortType
	 *
	 * Constraint:
	 *     (name=QualifiedName eModes+=ErrorModes+)
	 */
	protected void sequence_PortType(ISerializationContext context, PortType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ErrorModelElement returns State
	 *     State returns State
	 *
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.ERROR_MODEL_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.ERROR_MODEL_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameQualifiedNameParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns SystemConnDec
	 *     ComponentModelDec returns SystemConnDec
	 *     SystemConnDec returns SystemConnDec
	 *
	 * Constraint:
	 *     (name=QualifiedName sourceSystem=[SystemDec|ID] sourcePort=[SystemPortOut|ID] targetSystem=[SystemDec|ID] targetPort=[SystemPortIn|ID])
	 */
	protected void sequence_SystemConnDec(ISerializationContext context, SystemConnDec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.ABSTRACT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.ABSTRACT_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_SYSTEM));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__SOURCE_PORT));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_SYSTEM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_SYSTEM));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_CONN_DEC__TARGET_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecIDTerminalRuleCall_3_0_1(), semanticObject.getSourceSystem());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortOutIDTerminalRuleCall_5_0_1(), semanticObject.getSourcePort());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecIDTerminalRuleCall_7_0_1(), semanticObject.getTargetSystem());
		feeder.accept(grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortInIDTerminalRuleCall_9_0_1(), semanticObject.getTargetPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns SystemDec
	 *     ComponentModelDec returns SystemDec
	 *     SystemDec returns SystemDec
	 *
	 * Constraint:
	 *     (name=QualifiedName sysFeatures+=SysFeaturesDec*)
	 */
	protected void sequence_SystemDec(ISerializationContext context, SystemDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SysFeaturesDec returns SystemPortIn
	 *     SystemPortDec returns SystemPortIn
	 *     SystemPortIn returns SystemPortIn
	 *
	 * Constraint:
	 *     (name=QualifiedName inComp=[ComponentImpl|ID] inPort=[PortIn|ID])
	 */
	protected void sequence_SystemPortIn(ISerializationContext context, SystemPortIn semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_IN__IN_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_IN__IN_COMP));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_IN__IN_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_IN__IN_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemPortInAccess().getInCompComponentImplIDTerminalRuleCall_5_0_1(), semanticObject.getInComp());
		feeder.accept(grammarAccess.getSystemPortInAccess().getInPortPortInIDTerminalRuleCall_7_0_1(), semanticObject.getInPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SysFeaturesDec returns SystemPortOut
	 *     SystemPortDec returns SystemPortOut
	 *     SystemPortOut returns SystemPortOut
	 *
	 * Constraint:
	 *     (name=QualifiedName outComp=[ComponentImpl|ID] outPort=[PortOut|ID])
	 */
	protected void sequence_SystemPortOut(ISerializationContext context, SystemPortOut semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYS_FEATURES_DEC__NAME));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_OUT__OUT_COMP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_OUT__OUT_COMP));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_OUT__OUT_PORT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.SYSTEM_PORT_OUT__OUT_PORT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemPortOutAccess().getOutCompComponentImplIDTerminalRuleCall_5_0_1(), semanticObject.getOutComp());
		feeder.accept(grammarAccess.getSystemPortOutAccess().getOutPortPortOutIDTerminalRuleCall_7_0_1(), semanticObject.getOutPort());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ErrorModelElement returns TransitionDec
	 *     TransitionDec returns TransitionDec
	 *
	 * Constraint:
	 *     (name=QualifiedName transFeatures+=TransitionFeatureDec*)
	 */
	protected void sequence_TransitionDec(ISerializationContext context, TransitionDec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionFeatureDec returns Occurrence
	 *
	 * Constraint:
	 *     {Occurrence}
	 */
	protected void sequence_TransitionFeatureDec(ISerializationContext context, Occurrence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TransitionFeatureDec returns TransitionState
	 *     TransitionState returns TransitionState
	 *
	 * Constraint:
	 *     (sourceState=[State|ID] targetState=[State|ID])
	 */
	protected void sequence_TransitionState(ISerializationContext context, TransitionState semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.TRANSITION_STATE__SOURCE_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.TRANSITION_STATE__SOURCE_STATE));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.TRANSITION_STATE__TARGET_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.TRANSITION_STATE__TARGET_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTransitionStateAccess().getSourceStateStateIDTerminalRuleCall_1_0_1(), semanticObject.getSourceState());
		feeder.accept(grammarAccess.getTransitionStateAccess().getTargetStateStateIDTerminalRuleCall_3_0_1(), semanticObject.getTargetState());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TransitionFeatureDec returns Trigger
	 *     Trigger returns Trigger
	 *
	 * Constraint:
	 *     (portInstance=[PortIn|ID] errorMode=[ErrorModes|ID])
	 */
	protected void sequence_Trigger(ISerializationContext context, Trigger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.TRIGGER__PORT_INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.TRIGGER__PORT_INSTANCE));
			if (transientValues.isValueTransient(semanticObject, DepModelPackage.Literals.TRIGGER__ERROR_MODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DepModelPackage.Literals.TRIGGER__ERROR_MODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTriggerAccess().getPortInstancePortInIDTerminalRuleCall_1_0_1(), semanticObject.getPortInstance());
		feeder.accept(grammarAccess.getTriggerAccess().getErrorModeErrorModesIDTerminalRuleCall_3_0_1(), semanticObject.getErrorMode());
		feeder.finish();
	}
	
	
}
