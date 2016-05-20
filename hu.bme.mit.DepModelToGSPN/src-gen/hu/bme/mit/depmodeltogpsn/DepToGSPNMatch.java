package hu.bme.mit.depmodeltogpsn;

import hu.bme.mit.depModel.AbstractElement;
import hu.bme.mit.depmodeltogpsn.util.DepToGSPNQuerySpecification;
import java.util.Arrays;
import java.util.List;
import model.petriNetEMF.Identification;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import viatraTraceability.DepToGSPN;
import viatraTraceability.DepToGSPNTrace;

/**
 * Pattern-specific match representation of the hu.bme.mit.depmodeltogpsn.depToGSPN pattern,
 * to be used in conjunction with {@link DepToGSPNMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DepToGSPNMatcher
 * @see DepToGSPNProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DepToGSPNMatch extends BasePatternMatch {
  private DepToGSPN fDeptogspn;
  
  private DepToGSPNTrace fTrace;
  
  private AbstractElement fDepElement;
  
  private Identification fPetriElement;
  
  private static List<String> parameterNames = makeImmutableList("deptogspn", "trace", "depElement", "petriElement");
  
  private DepToGSPNMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    this.fDeptogspn = pDeptogspn;
    this.fTrace = pTrace;
    this.fDepElement = pDepElement;
    this.fPetriElement = pPetriElement;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("deptogspn".equals(parameterName)) return this.fDeptogspn;
    if ("trace".equals(parameterName)) return this.fTrace;
    if ("depElement".equals(parameterName)) return this.fDepElement;
    if ("petriElement".equals(parameterName)) return this.fPetriElement;
    return null;
  }
  
  public DepToGSPN getDeptogspn() {
    return this.fDeptogspn;
  }
  
  public DepToGSPNTrace getTrace() {
    return this.fTrace;
  }
  
  public AbstractElement getDepElement() {
    return this.fDepElement;
  }
  
  public Identification getPetriElement() {
    return this.fPetriElement;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("deptogspn".equals(parameterName) ) {
    	this.fDeptogspn = (DepToGSPN) newValue;
    	return true;
    }
    if ("trace".equals(parameterName) ) {
    	this.fTrace = (DepToGSPNTrace) newValue;
    	return true;
    }
    if ("depElement".equals(parameterName) ) {
    	this.fDepElement = (AbstractElement) newValue;
    	return true;
    }
    if ("petriElement".equals(parameterName) ) {
    	this.fPetriElement = (Identification) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDeptogspn(final DepToGSPN pDeptogspn) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDeptogspn = pDeptogspn;
  }
  
  public void setTrace(final DepToGSPNTrace pTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrace = pTrace;
  }
  
  public void setDepElement(final AbstractElement pDepElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDepElement = pDepElement;
  }
  
  public void setPetriElement(final Identification pPetriElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPetriElement = pPetriElement;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.depmodeltogpsn.depToGSPN";
  }
  
  @Override
  public List<String> parameterNames() {
    return DepToGSPNMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDeptogspn, fTrace, fDepElement, fPetriElement};
  }
  
  @Override
  public DepToGSPNMatch toImmutable() {
    return isMutable() ? newMatch(fDeptogspn, fTrace, fDepElement, fPetriElement) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"deptogspn\"=" + prettyPrintValue(fDeptogspn) + ", ");
    
    result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
    
    result.append("\"depElement\"=" + prettyPrintValue(fDepElement) + ", ");
    
    result.append("\"petriElement\"=" + prettyPrintValue(fPetriElement)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDeptogspn == null) ? 0 : fDeptogspn.hashCode());
    result = prime * result + ((fTrace == null) ? 0 : fTrace.hashCode());
    result = prime * result + ((fDepElement == null) ? 0 : fDepElement.hashCode());
    result = prime * result + ((fPetriElement == null) ? 0 : fPetriElement.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DepToGSPNMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    DepToGSPNMatch other = (DepToGSPNMatch) obj;
    if (fDeptogspn == null) {if (other.fDeptogspn != null) return false;}
    else if (!fDeptogspn.equals(other.fDeptogspn)) return false;
    if (fTrace == null) {if (other.fTrace != null) return false;}
    else if (!fTrace.equals(other.fTrace)) return false;
    if (fDepElement == null) {if (other.fDepElement != null) return false;}
    else if (!fDepElement.equals(other.fDepElement)) return false;
    if (fPetriElement == null) {if (other.fPetriElement != null) return false;}
    else if (!fPetriElement.equals(other.fPetriElement)) return false;
    return true;
  }
  
  @Override
  public DepToGSPNQuerySpecification specification() {
    try {
    	return DepToGSPNQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static DepToGSPNMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDeptogspn the fixed value of pattern parameter deptogspn, or null if not bound.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pDepElement the fixed value of pattern parameter depElement, or null if not bound.
   * @param pPetriElement the fixed value of pattern parameter petriElement, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DepToGSPNMatch newMutableMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return new Mutable(pDeptogspn, pTrace, pDepElement, pPetriElement);
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
  public static DepToGSPNMatch newMatch(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
    return new Immutable(pDeptogspn, pTrace, pDepElement, pPetriElement);
  }
  
  private static final class Mutable extends DepToGSPNMatch {
    Mutable(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
      super(pDeptogspn, pTrace, pDepElement, pPetriElement);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DepToGSPNMatch {
    Immutable(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement) {
      super(pDeptogspn, pTrace, pDepElement, pPetriElement);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
