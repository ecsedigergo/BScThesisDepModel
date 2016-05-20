package hu.bme.mit.depmodeltogpsn

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformationStatements
import viatraTraceability.DepToGSPN

class DepModelToGPSNTransformationViatra {
	// val DepModel sourceModel;
	// val PetriNet targetModel;
	extension TransformationPatterns transformationPattern = TransformationPatterns.instance
	extension TransformationRules transformationRules
	
	
	/* Transformation-related extensions */
	extension BatchTransformation transformation
	extension BatchTransformationStatements statements

	/* Transformation rule-related extensions */
	//extension BatchTransformationRuleFactory = new BatchTransformationRuleFactory
	//extension IModelManipulations manipulation

	DepToGSPN mapping		//CPSToDeployment mapping
	protected ViatraQueryEngine engine
//	protected Resource resource

	private var initialized = false;
	
	def initialize(DepToGSPN dep2gspn, ViatraQueryEngine engine) {
		if (!initialized) {
			this.mapping = dep2gspn 
			this.engine = engine
			transformationRules = new TransformationRules(engine, dep2gspn)

			transformation = BatchTransformation.forEngine(engine).build
			statements = transformation.transformationStatements
			
			initialized = true
		}

	}

	public def execute() {
//      Fire the defined rules here
		mapping.deptogspntrace.clear
		mapping.petrinet.arcs.clear
		
		errorModeRule.fireAllCurrent
		
		

	
		
	}

//	private def createTransformation() {
//		// Create VIATRA model manipulations
//		//this.manipulation = new SimpleModelManipulations(engine)
//		// Create VIATRA Batch transformation
//		transformation = BatchTransformation.forEngine(engine).build
//		// Initialize batch transformation statements
//		statements = transformation.transformationStatements
//	}
//
//  private def getExampleRule() {
//      if(exampleRule == null){
//          exampleRule = createRule.name("ExampleRule").precondition(ExampleMatcher.querySpecification).action [
//              Do Rule Actions here
//          ].build
//      }
//      return exampleRule
//  }
	def dispose() {
		if (transformation != null) {
			transformation.ruleEngine.dispose
		}
		transformation = null
		return
	}
}
