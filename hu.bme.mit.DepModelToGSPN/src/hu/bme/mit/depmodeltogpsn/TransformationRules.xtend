package hu.bme.mit.depmodeltogpsn

import model.petriNetEMF.PetriNetEMFFactory
import org.eclipse.viatra.query.runtime.api.IPatternMatch
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.query.runtime.api.ViatraQueryMatcher
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory
import viatraTraceability.DepToGSPN
import viatraTraceability.ViatraTraceabilityFactory

class TransformationRules {
	/*Query Pattern Group */
	extension TransformationPatterns transformationPattern = TransformationPatterns.instance
	extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
	extension IModelManipulations manipulation
	/* EMF metamodels */
	protected extension PetriNetEMFFactory petriFactory = PetriNetEMFFactory.eINSTANCE
	protected extension ViatraTraceabilityFactory traceFactory = ViatraTraceabilityFactory.eINSTANCE
	
	protected ViatraQueryEngine engine
	DepToGSPN mapping
	
	public BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> errorModeRule
	public BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> stateRule
	public BatchTransformationRule<? extends IPatternMatch, ? extends ViatraQueryMatcher<?>> transitionRule
	
	new(ViatraQueryEngine engine, DepToGSPN petriNet){
		this.mapping = petriNet
		this.engine = engine
		manipulation = new SimpleModelManipulations(engine) 
	}
	

	public def geterrorModeRule(){
		if (errorModeRule == null) {
			errorModeRule = createRule.precondition(PortTypeMatcher.querySpecification).action[
				//val depPortType = it
				
			].build
			
		}
	}
	public def getstateRule(){
		if (stateRule == null) {
			stateRule = createRule.precondition(StateMatcher.querySpecification).action[
				val state = it.errorState
				//val name = it.errorState.name
				val place = createPlace => [
					name = state.name
				]
				mapping.petrinet.places += place
				mapping.deptogspntrace += createDepToGSPNTrace => [
					abstractelement += state
					identification += place
				]
				
			].build
			
		}
	}
	
	
}

