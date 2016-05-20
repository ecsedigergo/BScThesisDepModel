package hu.bme.mit.depmodeltogpsn.util;

import hu.bme.mit.depModel.AbstractElement;
import hu.bme.mit.depmodeltogpsn.DepToGSPNMatch;
import model.petriNetEMF.Identification;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import viatraTraceability.DepToGSPN;
import viatraTraceability.DepToGSPNTrace;

/**
 * A match processor tailored for the hu.bme.mit.depmodeltogpsn.depToGSPN pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DepToGSPNProcessor implements IMatchProcessor<DepToGSPNMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDeptogspn the value of pattern parameter deptogspn in the currently processed match
   * @param pTrace the value of pattern parameter trace in the currently processed match
   * @param pDepElement the value of pattern parameter depElement in the currently processed match
   * @param pPetriElement the value of pattern parameter petriElement in the currently processed match
   * 
   */
  public abstract void process(final DepToGSPN pDeptogspn, final DepToGSPNTrace pTrace, final AbstractElement pDepElement, final Identification pPetriElement);
  
  @Override
  public void process(final DepToGSPNMatch match) {
    process(match.getDeptogspn(), match.getTrace(), match.getDepElement(), match.getPetriElement());
  }
}
