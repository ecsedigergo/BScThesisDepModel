/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.serializer;

import com.google.inject.Inject;
import hu.bme.mit.services.DepModelGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DepModelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DepModelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_State_InitialKeyword_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DepModelGrammarAccess) access;
		match_State_InitialKeyword_0_q = new TokenAlias(false, true, grammarAccess.getStateAccess().getInitialKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDOUBLERule())
			return getDOUBLEToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * DOUBLE:
	 * 	INT '.' INT;
	 */
	protected String getDOUBLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_State_InitialKeyword_0_q.equals(syntax))
				emit_State_InitialKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'initial'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'error' 'state' name=QualifiedName
	 */
	protected void emit_State_InitialKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
