package hu.bme.mit.depmodeltogpsn.util;

import com.google.common.collect.Sets;
import hu.bme.mit.depmodeltogpsn.DepToGSPNMatch;
import hu.bme.mit.depmodeltogpsn.DepToGSPNMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DepToGSPNMatcher in a type-safe way.
 * 
 * @see DepToGSPNMatcher
 * @see DepToGSPNMatch
 * 
 */
@SuppressWarnings("all")
public final class DepToGSPNQuerySpecification extends BaseGeneratedEMFQuerySpecification<DepToGSPNMatcher> {
  private DepToGSPNQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static DepToGSPNQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DepToGSPNMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return DepToGSPNMatcher.on(engine);
  }
  
  @Override
  public DepToGSPNMatch newEmptyMatch() {
    return DepToGSPNMatch.newEmptyMatch();
  }
  
  @Override
  public DepToGSPNMatch newMatch(final Object... parameters) {
    return DepToGSPNMatch.newMatch((viatraTraceability.DepToGSPN) parameters[0], (viatraTraceability.DepToGSPNTrace) parameters[1], (hu.bme.mit.depModel.AbstractElement) parameters[2], (model.petriNetEMF.Identification) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link DepToGSPNQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link DepToGSPNQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DepToGSPNQuerySpecification INSTANCE = new DepToGSPNQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DepToGSPNQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.depmodeltogpsn.depToGSPN";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("deptogspn","trace","depElement","petriElement");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(
      			 new PParameter("deptogspn", "viatraTraceability.DepToGSPN", null),
      			 new PParameter("trace", "viatraTraceability.DepToGSPNTrace", null),
      			 new PParameter("depElement", "hu.bme.mit.depModel.AbstractElement", null),
      			 new PParameter("petriElement", "model.petriNetEMF.Identification", null)
      			);
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_deptogspn = body.getOrCreateVariableByName("deptogspn");
      		PVariable var_trace = body.getOrCreateVariableByName("trace");
      		PVariable var_depElement = body.getOrCreateVariableByName("depElement");
      		PVariable var_petriElement = body.getOrCreateVariableByName("petriElement");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_deptogspn, "deptogspn"),
      		   new ExportedParameter(body, var_trace, "trace"),
      		   new ExportedParameter(body, var_depElement, "depElement"),
      		   new ExportedParameter(body, var_petriElement, "petriElement")
      		));
      		// 	DepToGSPN.deptogspntrace(deptogspn, trace)
      		new TypeConstraint(body, new FlatTuple(var_deptogspn), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/viatraTraceability", "DepToGSPN")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_deptogspn, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/viatraTraceability", "DepToGSPN", "deptogspntrace")));
      		new Equality(body, var__virtual_0_, var_trace);
      		// 	DepToGSPNTrace.abstractelement(trace, depElement)
      		new TypeConstraint(body, new FlatTuple(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/viatraTraceability", "DepToGSPNTrace")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_trace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/viatraTraceability", "DepToGSPNTrace", "abstractelement")));
      		new Equality(body, var__virtual_1_, var_depElement);
      		// 	DepToGSPNTrace.identification(trace, petriElement)
      		new TypeConstraint(body, new FlatTuple(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/viatraTraceability", "DepToGSPNTrace")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_trace, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/viatraTraceability", "DepToGSPNTrace", "identification")));
      		new Equality(body, var__virtual_2_, var_petriElement);
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
