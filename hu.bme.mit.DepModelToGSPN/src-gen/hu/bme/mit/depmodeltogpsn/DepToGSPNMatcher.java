package hu.bme.mit.depmodeltogpsn;

import hu.bme.mit.depModel.AbstractElement;
import hu.bme.mit.depmodeltogpsn.DepToGSPNMatch;
import hu.bme.mit.depmodeltogpsn.util.DepToGSPNQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import model.petriNetEMF.Identification;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import viatraTraceability.DepToGSPN;
import viatraTraceability.DepToGSPNTrace;

/**
 * Generated pattern matcher API of the hu.bme.mit.depmodeltogpsn.depToGSPN pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DepToGSPNMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern depToGSPN(deptogspn, trace, depElement, petriElement) {
 * 	DepToGSPN.deptogspntrace(deptogspn, trace);
 * 	DepToGSPNTrace.abstractelement(trace, depElement);
 * 	DepToGSPNTrace.identification(trace, petriElement);
 * 
 * }
 * </pre></code>
 * 
 * @see DepToGSPNMatch
 * @see DepToGSPNProcessor
 * @see DepToGSPNQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DepToGSPNMatcher extends BaseMatcher<DepToGSPNMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DepToGSPNMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    DepToGSPNMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new DepToGSPNMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DEPTOGSPN = 0;
  
  private final static int POSITION_TRACE = 1;
  
  private final static int POSITION_DEPELEMENT = 2;
  
  private final static int POSITION_PETRIELEMENT = 3;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DepToGSPNMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private DepToGSPNMatcher(final ViatraQueryEngine engine) throws ViatraQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @return matches represented as a DepToGSPNMatch object.
   * 
   */
  public Collection<DepToGSPNMatch> getAllMatches(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return rawGetAllMatches(new Object[]{pDeptogspn, pTrace, pDepElement, pPetriElement});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @return a match represented as a DepToGSPNMatch object, or null if no match is found.
   * 
   */
  public DepToGSPNMatch getOneArbitraryMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return rawGetOneArbitraryMatch(new Object[]{pDeptogspn, pTrace, pDepElement, pPetriElement});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return rawHasMatch(new Object[]{pDeptogspn, pTrace, pDepElement, pPetriElement});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return rawCountMatches(new Object[]{pDeptogspn, pTrace, pDepElement, pPetriElement});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement, final IMatchProcessor<? super DepToGSPNMatch> processor) {
    rawForEachMatch(new Object[]{pDeptogspn, pTrace, pDepElement, pPetriElement}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement, final IMatchProcessor<? super DepToGSPNMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDeptogspn, pTrace, pDepElement, pPetriElement}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DepToGSPNMatch newMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return DepToGSPNMatch.newMatch(pDeptogspn, pTrace, pDepElement, pPetriElement);
  }
  
  /**
   * Retrieve the set of values that occur in matches for deptogspn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DepToGSPN> rawAccumulateAllValuesOfdeptogspn(final Object[] parameters) {
    Set<DepToGSPN> results = new HashSet<DepToGSPN>();
    rawAccumulateAllValues(POSITION_DEPTOGSPN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for deptogspn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DepToGSPN> getAllValuesOfdeptogspn() {
    return rawAccumulateAllValuesOfdeptogspn(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deptogspn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DepToGSPN> getAllValuesOfdeptogspn(final DepToGSPNMatch partialMatch) {
    return rawAccumulateAllValuesOfdeptogspn(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for deptogspn.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DepToGSPN> getAllValuesOfdeptogspn(final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return rawAccumulateAllValuesOfdeptogspn(new Object[]{
    null, 
    pTrace, 
    pDepElement, 
    pPetriElement
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DepToGSPNTrace> rawAccumulateAllValuesOftrace(final Object[] parameters) {
    Set<DepToGSPNTrace> results = new HashSet<DepToGSPNTrace>();
    rawAccumulateAllValues(POSITION_TRACE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DepToGSPNTrace> getAllValuesOftrace() {
    return rawAccumulateAllValuesOftrace(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DepToGSPNTrace> getAllValuesOftrace(final DepToGSPNMatch partialMatch) {
    return rawAccumulateAllValuesOftrace(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DepToGSPNTrace> getAllValuesOftrace(final DepToGSPN pDeptogspn, final AbstractElement pDepElement, final Identification pPetriElement) {
    return rawAccumulateAllValuesOftrace(new Object[]{
    pDeptogspn, 
    null, 
    pDepElement, 
    pPetriElement
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for depElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<AbstractElement> rawAccumulateAllValuesOfdepElement(final Object[] parameters) {
    Set<AbstractElement> results = new HashSet<AbstractElement>();
    rawAccumulateAllValues(POSITION_DEPELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for depElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AbstractElement> getAllValuesOfdepElement() {
    return rawAccumulateAllValuesOfdepElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AbstractElement> getAllValuesOfdepElement(final DepToGSPNMatch partialMatch) {
    return rawAccumulateAllValuesOfdepElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for depElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<AbstractElement> getAllValuesOfdepElement(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final Identification pPetriElement) {
    return rawAccumulateAllValuesOfdepElement(new Object[]{
    pDeptogspn, 
    pTrace, 
    null, 
    pPetriElement
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for petriElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Identification> rawAccumulateAllValuesOfpetriElement(final Object[] parameters) {
    Set<Identification> results = new HashSet<Identification>();
    rawAccumulateAllValues(POSITION_PETRIELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for petriElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Identification> getAllValuesOfpetriElement() {
    return rawAccumulateAllValuesOfpetriElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for petriElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Identification> getAllValuesOfpetriElement(final DepToGSPNMatch partialMatch) {
    return rawAccumulateAllValuesOfpetriElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for petriElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Identification> getAllValuesOfpetriElement(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement) {
    return rawAccumulateAllValuesOfpetriElement(new Object[]{
    pDeptogspn, 
    pTrace, 
    pDepElement, 
    null
    });
  }
  
  @Override
  protected DepToGSPNMatch tupleToMatch(final Tuple t) {
    try {
    	return DepToGSPNMatch.newMatch((DepToGSPN) t.get(POSITION_DEPTOGSPN), (DepToGSPNTrace) t.get(POSITION_TRACE), (AbstractElement) t.get(POSITION_DEPELEMENT), (Identification) t.get(POSITION_PETRIELEMENT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DepToGSPNMatch arrayToMatch(final Object[] match) {
    try {
    	return DepToGSPNMatch.newMatch((DepToGSPN) match[POSITION_DEPTOGSPN], (DepToGSPNTrace) match[POSITION_TRACE], (AbstractElement) match[POSITION_DEPELEMENT], (Identification) match[POSITION_PETRIELEMENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DepToGSPNMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DepToGSPNMatch.newMutableMatch((DepToGSPN) match[POSITION_DEPTOGSPN], (DepToGSPNTrace) match[POSITION_TRACE], (AbstractElement) match[POSITION_DEPELEMENT], (Identification) match[POSITION_PETRIELEMENT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<DepToGSPNMatcher> querySpecification() throws ViatraQueryException {
    return DepToGSPNQuerySpecification.instance();
  }
}
