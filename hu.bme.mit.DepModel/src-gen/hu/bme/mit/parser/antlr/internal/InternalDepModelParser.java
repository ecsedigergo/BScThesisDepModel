package hu.bme.mit.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.services.DepModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDepModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'port'", "'type'", "'{'", "'}'", "'error'", "'mode'", "'system'", "'connection'", "'from'", "'to'", "'declaration'", "'in'", "'out'", "'component'", "'implementation'", "':'", "'instance'", "'model'", "'state'", "'transition'", "'occurrence'", "'states'", "'->'", "'trigger'", "'action'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDepModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDepModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDepModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDepModel.g"; }



     	private DepModelGrammarAccess grammarAccess;

        public InternalDepModelParser(TokenStream input, DepModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DepModel";
       	}

       	@Override
       	protected DepModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDepModel"
    // InternalDepModel.g:64:1: entryRuleDepModel returns [EObject current=null] : iv_ruleDepModel= ruleDepModel EOF ;
    public final EObject entryRuleDepModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepModel = null;


        try {
            // InternalDepModel.g:64:49: (iv_ruleDepModel= ruleDepModel EOF )
            // InternalDepModel.g:65:2: iv_ruleDepModel= ruleDepModel EOF
            {
             newCompositeNode(grammarAccess.getDepModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepModel=ruleDepModel();

            state._fsp--;

             current =iv_ruleDepModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDepModel"


    // $ANTLR start "ruleDepModel"
    // InternalDepModel.g:71:1: ruleDepModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleDepModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalDepModel.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalDepModel.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDepModel.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalDepModel.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalDepModel.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getDepModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDepModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"hu.bme.mit.DepModel.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDepModel"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDepModel.g:100:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDepModel.g:100:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDepModel.g:101:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDepModel.g:107:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDepModel.g:113:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDepModel.g:114:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDepModel.g:114:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDepModel.g:115:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDepModel.g:122:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDepModel.g:123:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDepModel.g:140:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDepModel.g:140:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDepModel.g:141:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDepModel.g:147:1: ruleAbstractElement returns [EObject current=null] : (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentModelDec_0 = null;

        EObject this_PortType_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:153:2: ( (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType ) )
            // InternalDepModel.g:154:2: (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType )
            {
            // InternalDepModel.g:154:2: (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDepModel.g:155:3: this_ComponentModelDec_0= ruleComponentModelDec
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getComponentModelDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentModelDec_0=ruleComponentModelDec();

                    state._fsp--;


                    			current = this_ComponentModelDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:164:3: this_PortType_1= rulePortType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getPortTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortType_1=rulePortType();

                    state._fsp--;


                    			current = this_PortType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePortType"
    // InternalDepModel.g:176:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalDepModel.g:176:49: (iv_rulePortType= rulePortType EOF )
            // InternalDepModel.g:177:2: iv_rulePortType= rulePortType EOF
            {
             newCompositeNode(grammarAccess.getPortTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortType=rulePortType();

            state._fsp--;

             current =iv_rulePortType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortType"


    // $ANTLR start "rulePortType"
    // InternalDepModel.g:183:1: rulePortType returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_eModes_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:189:2: ( (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:190:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:190:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}' )
            // InternalDepModel.g:191:3: otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPortTypeAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:199:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:200:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:200:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:201:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortTypeAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:222:3: ( (lv_eModes_4_0= ruleErrorModes ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDepModel.g:223:4: (lv_eModes_4_0= ruleErrorModes )
            	    {
            	    // InternalDepModel.g:223:4: (lv_eModes_4_0= ruleErrorModes )
            	    // InternalDepModel.g:224:5: lv_eModes_4_0= ruleErrorModes
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_eModes_4_0=ruleErrorModes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eModes",
            	    						lv_eModes_4_0,
            	    						"hu.bme.mit.DepModel.ErrorModes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortType"


    // $ANTLR start "entryRuleErrorModes"
    // InternalDepModel.g:249:1: entryRuleErrorModes returns [EObject current=null] : iv_ruleErrorModes= ruleErrorModes EOF ;
    public final EObject entryRuleErrorModes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModes = null;


        try {
            // InternalDepModel.g:249:51: (iv_ruleErrorModes= ruleErrorModes EOF )
            // InternalDepModel.g:250:2: iv_ruleErrorModes= ruleErrorModes EOF
            {
             newCompositeNode(grammarAccess.getErrorModesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorModes=ruleErrorModes();

            state._fsp--;

             current =iv_ruleErrorModes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorModes"


    // $ANTLR start "ruleErrorModes"
    // InternalDepModel.g:256:1: ruleErrorModes returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleErrorModes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:262:2: ( (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) ) )
            // InternalDepModel.g:263:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) )
            {
            // InternalDepModel.g:263:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) )
            // InternalDepModel.g:264:3: otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModesAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModesAccess().getModeKeyword_1());
            		
            // InternalDepModel.g:272:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:273:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:273:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:274:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorModesAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorModesRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorModes"


    // $ANTLR start "entryRuleComponentModelDec"
    // InternalDepModel.g:295:1: entryRuleComponentModelDec returns [EObject current=null] : iv_ruleComponentModelDec= ruleComponentModelDec EOF ;
    public final EObject entryRuleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModelDec = null;


        try {
            // InternalDepModel.g:295:58: (iv_ruleComponentModelDec= ruleComponentModelDec EOF )
            // InternalDepModel.g:296:2: iv_ruleComponentModelDec= ruleComponentModelDec EOF
            {
             newCompositeNode(grammarAccess.getComponentModelDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentModelDec=ruleComponentModelDec();

            state._fsp--;

             current =iv_ruleComponentModelDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentModelDec"


    // $ANTLR start "ruleComponentModelDec"
    // InternalDepModel.g:302:1: ruleComponentModelDec returns [EObject current=null] : (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) ;
    public final EObject ruleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemConnDec_0 = null;

        EObject this_SystemDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:308:2: ( (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) )
            // InternalDepModel.g:309:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            {
            // InternalDepModel.g:309:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==22) ) {
                    alt5=2;
                }
                else if ( (LA5_1==19) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDepModel.g:310:3: this_SystemConnDec_0= ruleSystemConnDec
                    {

                    			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemConnDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemConnDec_0=ruleSystemConnDec();

                    state._fsp--;


                    			current = this_SystemConnDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:319:3: this_SystemDec_1= ruleSystemDec
                    {

                    			newCompositeNode(grammarAccess.getComponentModelDecAccess().getSystemDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemDec_1=ruleSystemDec();

                    state._fsp--;


                    			current = this_SystemDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentModelDec"


    // $ANTLR start "entryRuleSystemConnDec"
    // InternalDepModel.g:331:1: entryRuleSystemConnDec returns [EObject current=null] : iv_ruleSystemConnDec= ruleSystemConnDec EOF ;
    public final EObject entryRuleSystemConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConnDec = null;


        try {
            // InternalDepModel.g:331:54: (iv_ruleSystemConnDec= ruleSystemConnDec EOF )
            // InternalDepModel.g:332:2: iv_ruleSystemConnDec= ruleSystemConnDec EOF
            {
             newCompositeNode(grammarAccess.getSystemConnDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemConnDec=ruleSystemConnDec();

            state._fsp--;

             current =iv_ruleSystemConnDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemConnDec"


    // $ANTLR start "ruleSystemConnDec"
    // InternalDepModel.g:338:1: ruleSystemConnDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleSystemConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:344:2: ( (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalDepModel.g:345:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalDepModel.g:345:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalDepModel.g:346:3: otherlv_0= 'system' otherlv_1= 'connection' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemConnDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemConnDecAccess().getConnectionKeyword_1());
            		
            // InternalDepModel.g:354:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:355:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:355:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:356:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemConnDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemConnDecAccess().getFromKeyword_3());
            		
            // InternalDepModel.g:377:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:378:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:378:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:379:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_5());
            		
            // InternalDepModel.g:394:3: ( (otherlv_6= RULE_ID ) )
            // InternalDepModel.g:395:4: (otherlv_6= RULE_ID )
            {
            // InternalDepModel.g:395:4: (otherlv_6= RULE_ID )
            // InternalDepModel.g:396:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemConnDecAccess().getToKeyword_7());
            		
            // InternalDepModel.g:411:3: ( (otherlv_8= RULE_ID ) )
            // InternalDepModel.g:412:4: (otherlv_8= RULE_ID )
            {
            // InternalDepModel.g:412:4: (otherlv_8= RULE_ID )
            // InternalDepModel.g:413:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_8, grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_9());
            		
            // InternalDepModel.g:428:3: ( (otherlv_10= RULE_ID ) )
            // InternalDepModel.g:429:4: (otherlv_10= RULE_ID )
            {
            // InternalDepModel.g:429:4: (otherlv_10= RULE_ID )
            // InternalDepModel.g:430:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortDecCrossReference_10_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemConnDec"


    // $ANTLR start "entryRuleSystemDec"
    // InternalDepModel.g:445:1: entryRuleSystemDec returns [EObject current=null] : iv_ruleSystemDec= ruleSystemDec EOF ;
    public final EObject entryRuleSystemDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDec = null;


        try {
            // InternalDepModel.g:445:50: (iv_ruleSystemDec= ruleSystemDec EOF )
            // InternalDepModel.g:446:2: iv_ruleSystemDec= ruleSystemDec EOF
            {
             newCompositeNode(grammarAccess.getSystemDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemDec=ruleSystemDec();

            state._fsp--;

             current =iv_ruleSystemDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemDec"


    // $ANTLR start "ruleSystemDec"
    // InternalDepModel.g:452:1: ruleSystemDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sysFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:458:2: ( (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:459:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:459:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' )
            // InternalDepModel.g:460:3: otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemDecAccess().getDeclarationKeyword_1());
            		
            // InternalDepModel.g:468:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:469:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:469:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:470:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:491:3: ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDepModel.g:492:4: (lv_sysFeatures_4_0= ruleSysFeaturesDec )
            	    {
            	    // InternalDepModel.g:492:4: (lv_sysFeatures_4_0= ruleSysFeaturesDec )
            	    // InternalDepModel.g:493:5: lv_sysFeatures_4_0= ruleSysFeaturesDec
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDecAccess().getSysFeaturesSysFeaturesDecParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_sysFeatures_4_0=ruleSysFeaturesDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sysFeatures",
            	    						lv_sysFeatures_4_0,
            	    						"hu.bme.mit.DepModel.SysFeaturesDec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemDec"


    // $ANTLR start "entryRuleSysFeaturesDec"
    // InternalDepModel.g:518:1: entryRuleSysFeaturesDec returns [EObject current=null] : iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF ;
    public final EObject entryRuleSysFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSysFeaturesDec = null;


        try {
            // InternalDepModel.g:518:55: (iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF )
            // InternalDepModel.g:519:2: iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF
            {
             newCompositeNode(grammarAccess.getSysFeaturesDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSysFeaturesDec=ruleSysFeaturesDec();

            state._fsp--;

             current =iv_ruleSysFeaturesDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSysFeaturesDec"


    // $ANTLR start "ruleSysFeaturesDec"
    // InternalDepModel.g:525:1: ruleSysFeaturesDec returns [EObject current=null] : (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl ) ;
    public final EObject ruleSysFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortDec_0 = null;

        EObject this_ComponentConnDec_1 = null;

        EObject this_ComponentType_2 = null;

        EObject this_ComponentImpl_3 = null;



        	enterRule();

        try {
            // InternalDepModel.g:531:2: ( (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl ) )
            // InternalDepModel.g:532:2: (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl )
            {
            // InternalDepModel.g:532:2: (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==25) ) {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt7=4;
                    }
                    break;
                case 13:
                    {
                    alt7=3;
                    }
                    break;
                case 19:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDepModel.g:533:3: this_SystemPortDec_0= ruleSystemPortDec
                    {

                    			newCompositeNode(grammarAccess.getSysFeaturesDecAccess().getSystemPortDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemPortDec_0=ruleSystemPortDec();

                    state._fsp--;


                    			current = this_SystemPortDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:542:3: this_ComponentConnDec_1= ruleComponentConnDec
                    {

                    			newCompositeNode(grammarAccess.getSysFeaturesDecAccess().getComponentConnDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentConnDec_1=ruleComponentConnDec();

                    state._fsp--;


                    			current = this_ComponentConnDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDepModel.g:551:3: this_ComponentType_2= ruleComponentType
                    {

                    			newCompositeNode(grammarAccess.getSysFeaturesDecAccess().getComponentTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentType_2=ruleComponentType();

                    state._fsp--;


                    			current = this_ComponentType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDepModel.g:560:3: this_ComponentImpl_3= ruleComponentImpl
                    {

                    			newCompositeNode(grammarAccess.getSysFeaturesDecAccess().getComponentImplParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentImpl_3=ruleComponentImpl();

                    state._fsp--;


                    			current = this_ComponentImpl_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSysFeaturesDec"


    // $ANTLR start "entryRuleSystemPortDec"
    // InternalDepModel.g:572:1: entryRuleSystemPortDec returns [EObject current=null] : iv_ruleSystemPortDec= ruleSystemPortDec EOF ;
    public final EObject entryRuleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortDec = null;


        try {
            // InternalDepModel.g:572:54: (iv_ruleSystemPortDec= ruleSystemPortDec EOF )
            // InternalDepModel.g:573:2: iv_ruleSystemPortDec= ruleSystemPortDec EOF
            {
             newCompositeNode(grammarAccess.getSystemPortDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemPortDec=ruleSystemPortDec();

            state._fsp--;

             current =iv_ruleSystemPortDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemPortDec"


    // $ANTLR start "ruleSystemPortDec"
    // InternalDepModel.g:579:1: ruleSystemPortDec returns [EObject current=null] : (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) ;
    public final EObject ruleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortIn_0 = null;

        EObject this_SystemPortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:585:2: ( (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) )
            // InternalDepModel.g:586:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            {
            // InternalDepModel.g:586:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==12) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==23) ) {
                        alt8=1;
                    }
                    else if ( (LA8_2==24) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDepModel.g:587:3: this_SystemPortIn_0= ruleSystemPortIn
                    {

                    			newCompositeNode(grammarAccess.getSystemPortDecAccess().getSystemPortInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemPortIn_0=ruleSystemPortIn();

                    state._fsp--;


                    			current = this_SystemPortIn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:596:3: this_SystemPortOut_1= ruleSystemPortOut
                    {

                    			newCompositeNode(grammarAccess.getSystemPortDecAccess().getSystemPortOutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SystemPortOut_1=ruleSystemPortOut();

                    state._fsp--;


                    			current = this_SystemPortOut_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemPortDec"


    // $ANTLR start "entryRuleSystemPortIn"
    // InternalDepModel.g:608:1: entryRuleSystemPortIn returns [EObject current=null] : iv_ruleSystemPortIn= ruleSystemPortIn EOF ;
    public final EObject entryRuleSystemPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortIn = null;


        try {
            // InternalDepModel.g:608:53: (iv_ruleSystemPortIn= ruleSystemPortIn EOF )
            // InternalDepModel.g:609:2: iv_ruleSystemPortIn= ruleSystemPortIn EOF
            {
             newCompositeNode(grammarAccess.getSystemPortInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemPortIn=ruleSystemPortIn();

            state._fsp--;

             current =iv_ruleSystemPortIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemPortIn"


    // $ANTLR start "ruleSystemPortIn"
    // InternalDepModel.g:615:1: ruleSystemPortIn returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:621:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:622:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:622:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:623:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortInAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortInAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortInAccess().getInKeyword_2());
            		
            // InternalDepModel.g:635:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:636:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:636:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:637:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortInAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortInAccess().getToKeyword_4());
            		
            // InternalDepModel.g:658:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:659:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:659:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:660:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortInAccess().getFullStopKeyword_6());
            		
            // InternalDepModel.g:675:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:676:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:676:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:677:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getSystemPortInAccess().getInPortPortInCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemPortIn"


    // $ANTLR start "entryRuleSystemPortOut"
    // InternalDepModel.g:692:1: entryRuleSystemPortOut returns [EObject current=null] : iv_ruleSystemPortOut= ruleSystemPortOut EOF ;
    public final EObject entryRuleSystemPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortOut = null;


        try {
            // InternalDepModel.g:692:54: (iv_ruleSystemPortOut= ruleSystemPortOut EOF )
            // InternalDepModel.g:693:2: iv_ruleSystemPortOut= ruleSystemPortOut EOF
            {
             newCompositeNode(grammarAccess.getSystemPortOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemPortOut=ruleSystemPortOut();

            state._fsp--;

             current =iv_ruleSystemPortOut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemPortOut"


    // $ANTLR start "ruleSystemPortOut"
    // InternalDepModel.g:699:1: ruleSystemPortOut returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:705:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:706:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:706:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:707:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortOutAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortOutAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortOutAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:719:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:720:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:720:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:721:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortOutAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortOutAccess().getFromKeyword_4());
            		
            // InternalDepModel.g:742:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:743:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:743:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:744:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortOutAccess().getFullStopKeyword_6());
            		
            // InternalDepModel.g:759:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:760:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:760:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:761:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getSystemPortOutAccess().getOutPortPortOutCrossReference_7_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemPortOut"


    // $ANTLR start "entryRuleComponentConnDec"
    // InternalDepModel.g:776:1: entryRuleComponentConnDec returns [EObject current=null] : iv_ruleComponentConnDec= ruleComponentConnDec EOF ;
    public final EObject entryRuleComponentConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConnDec = null;


        try {
            // InternalDepModel.g:776:57: (iv_ruleComponentConnDec= ruleComponentConnDec EOF )
            // InternalDepModel.g:777:2: iv_ruleComponentConnDec= ruleComponentConnDec EOF
            {
             newCompositeNode(grammarAccess.getComponentConnDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentConnDec=ruleComponentConnDec();

            state._fsp--;

             current =iv_ruleComponentConnDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentConnDec"


    // $ANTLR start "ruleComponentConnDec"
    // InternalDepModel.g:783:1: ruleComponentConnDec returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleComponentConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalDepModel.g:789:2: ( (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalDepModel.g:790:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalDepModel.g:790:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalDepModel.g:791:3: otherlv_0= 'component' otherlv_1= 'connection' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentConnDecAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentConnDecAccess().getConnectionKeyword_1());
            		
            // InternalDepModel.g:799:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDepModel.g:800:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDepModel.g:800:4: (lv_name_2_0= RULE_ID )
            // InternalDepModel.g:801:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getComponentConnDecAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentConnDecAccess().getFromKeyword_3());
            		
            // InternalDepModel.g:821:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:822:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:822:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:823:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_4, grammarAccess.getComponentConnDecAccess().getSourceCompComponentImplCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentConnDecAccess().getFullStopKeyword_5());
            		
            // InternalDepModel.g:838:3: ( (otherlv_6= RULE_ID ) )
            // InternalDepModel.g:839:4: (otherlv_6= RULE_ID )
            {
            // InternalDepModel.g:839:4: (otherlv_6= RULE_ID )
            // InternalDepModel.g:840:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getComponentConnDecAccess().getSourcePortPortOutCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentConnDecAccess().getToKeyword_7());
            		
            // InternalDepModel.g:855:3: ( (otherlv_8= RULE_ID ) )
            // InternalDepModel.g:856:4: (otherlv_8= RULE_ID )
            {
            // InternalDepModel.g:856:4: (otherlv_8= RULE_ID )
            // InternalDepModel.g:857:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_8, grammarAccess.getComponentConnDecAccess().getTargetCompComponentImplCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentConnDecAccess().getFullStopKeyword_9());
            		
            // InternalDepModel.g:872:3: ( (otherlv_10= RULE_ID ) )
            // InternalDepModel.g:873:4: (otherlv_10= RULE_ID )
            {
            // InternalDepModel.g:873:4: (otherlv_10= RULE_ID )
            // InternalDepModel.g:874:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_10, grammarAccess.getComponentConnDecAccess().getTargetPortPortInCrossReference_10_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentConnDec"


    // $ANTLR start "entryRuleComponentImpl"
    // InternalDepModel.g:889:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // InternalDepModel.g:889:54: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // InternalDepModel.g:890:2: iv_ruleComponentImpl= ruleComponentImpl EOF
            {
             newCompositeNode(grammarAccess.getComponentImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentImpl=ruleComponentImpl();

            state._fsp--;

             current =iv_ruleComponentImpl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentImpl"


    // $ANTLR start "ruleComponentImpl"
    // InternalDepModel.g:896:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:902:2: ( (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDepModel.g:903:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDepModel.g:903:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalDepModel.g:904:3: otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentImplAccess().getImplementationKeyword_1());
            		
            // InternalDepModel.g:912:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:913:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:913:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:914:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getColonKeyword_3());
            		
            // InternalDepModel.g:935:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:936:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:936:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:937:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentImplRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentImpl"


    // $ANTLR start "entryRuleComponentType"
    // InternalDepModel.g:952:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDepModel.g:952:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDepModel.g:953:2: iv_ruleComponentType= ruleComponentType EOF
            {
             newCompositeNode(grammarAccess.getComponentTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentType=ruleComponentType();

            state._fsp--;

             current =iv_ruleComponentType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentType"


    // $ANTLR start "ruleComponentType"
    // InternalDepModel.g:959:1: ruleComponentType returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_componentFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:965:2: ( (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:966:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:966:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' )
            // InternalDepModel.g:967:3: otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:975:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:976:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:976:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:977:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentTypeAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:998:3: ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12||LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDepModel.g:999:4: (lv_componentFeatures_4_0= ruleComponentFeaturesDec )
            	    {
            	    // InternalDepModel.g:999:4: (lv_componentFeatures_4_0= ruleComponentFeaturesDec )
            	    // InternalDepModel.g:1000:5: lv_componentFeatures_4_0= ruleComponentFeaturesDec
            	    {

            	    					newCompositeNode(grammarAccess.getComponentTypeAccess().getComponentFeaturesComponentFeaturesDecParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_componentFeatures_4_0=ruleComponentFeaturesDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"componentFeatures",
            	    						lv_componentFeatures_4_0,
            	    						"hu.bme.mit.DepModel.ComponentFeaturesDec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentType"


    // $ANTLR start "entryRuleComponentFeaturesDec"
    // InternalDepModel.g:1025:1: entryRuleComponentFeaturesDec returns [EObject current=null] : iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF ;
    public final EObject entryRuleComponentFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentFeaturesDec = null;


        try {
            // InternalDepModel.g:1025:61: (iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF )
            // InternalDepModel.g:1026:2: iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF
            {
             newCompositeNode(grammarAccess.getComponentFeaturesDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentFeaturesDec=ruleComponentFeaturesDec();

            state._fsp--;

             current =iv_ruleComponentFeaturesDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentFeaturesDec"


    // $ANTLR start "ruleComponentFeaturesDec"
    // InternalDepModel.g:1032:1: ruleComponentFeaturesDec returns [EObject current=null] : (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec ) ;
    public final EObject ruleComponentFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject this_PortDec_0 = null;

        EObject this_ErrorModelDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1038:2: ( (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec ) )
            // InternalDepModel.g:1039:2: (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec )
            {
            // InternalDepModel.g:1039:2: (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDepModel.g:1040:3: this_PortDec_0= rulePortDec
                    {

                    			newCompositeNode(grammarAccess.getComponentFeaturesDecAccess().getPortDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortDec_0=rulePortDec();

                    state._fsp--;


                    			current = this_PortDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1049:3: this_ErrorModelDec_1= ruleErrorModelDec
                    {

                    			newCompositeNode(grammarAccess.getComponentFeaturesDecAccess().getErrorModelDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorModelDec_1=ruleErrorModelDec();

                    state._fsp--;


                    			current = this_ErrorModelDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentFeaturesDec"


    // $ANTLR start "entryRulePortDec"
    // InternalDepModel.g:1061:1: entryRulePortDec returns [EObject current=null] : iv_rulePortDec= rulePortDec EOF ;
    public final EObject entryRulePortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortDec = null;


        try {
            // InternalDepModel.g:1061:48: (iv_rulePortDec= rulePortDec EOF )
            // InternalDepModel.g:1062:2: iv_rulePortDec= rulePortDec EOF
            {
             newCompositeNode(grammarAccess.getPortDecRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortDec=rulePortDec();

            state._fsp--;

             current =iv_rulePortDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortDec"


    // $ANTLR start "rulePortDec"
    // InternalDepModel.g:1068:1: rulePortDec returns [EObject current=null] : (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) ;
    public final EObject rulePortDec() throws RecognitionException {
        EObject current = null;

        EObject this_PortIn_0 = null;

        EObject this_PortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1074:2: ( (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) )
            // InternalDepModel.g:1075:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            {
            // InternalDepModel.g:1075:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==28) ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2==23) ) {
                        alt11=1;
                    }
                    else if ( (LA11_2==24) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDepModel.g:1076:3: this_PortIn_0= rulePortIn
                    {

                    			newCompositeNode(grammarAccess.getPortDecAccess().getPortInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortIn_0=rulePortIn();

                    state._fsp--;


                    			current = this_PortIn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1085:3: this_PortOut_1= rulePortOut
                    {

                    			newCompositeNode(grammarAccess.getPortDecAccess().getPortOutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortOut_1=rulePortOut();

                    state._fsp--;


                    			current = this_PortOut_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortDec"


    // $ANTLR start "entryRulePortIn"
    // InternalDepModel.g:1097:1: entryRulePortIn returns [EObject current=null] : iv_rulePortIn= rulePortIn EOF ;
    public final EObject entryRulePortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortIn = null;


        try {
            // InternalDepModel.g:1097:47: (iv_rulePortIn= rulePortIn EOF )
            // InternalDepModel.g:1098:2: iv_rulePortIn= rulePortIn EOF
            {
             newCompositeNode(grammarAccess.getPortInRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortIn=rulePortIn();

            state._fsp--;

             current =iv_rulePortIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortIn"


    // $ANTLR start "rulePortIn"
    // InternalDepModel.g:1104:1: rulePortIn returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject rulePortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1110:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1111:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1111:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1112:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPortInAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPortInAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPortInAccess().getInKeyword_2());
            		
            // InternalDepModel.g:1124:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1125:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1125:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:1126:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortInAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getPortInAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1147:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1148:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1148:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1149:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortInRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getPortInAccess().getPortInSuperTypePortTypeCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortIn"


    // $ANTLR start "entryRulePortOut"
    // InternalDepModel.g:1164:1: entryRulePortOut returns [EObject current=null] : iv_rulePortOut= rulePortOut EOF ;
    public final EObject entryRulePortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortOut = null;


        try {
            // InternalDepModel.g:1164:48: (iv_rulePortOut= rulePortOut EOF )
            // InternalDepModel.g:1165:2: iv_rulePortOut= rulePortOut EOF
            {
             newCompositeNode(grammarAccess.getPortOutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortOut=rulePortOut();

            state._fsp--;

             current =iv_rulePortOut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePortOut"


    // $ANTLR start "rulePortOut"
    // InternalDepModel.g:1171:1: rulePortOut returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject rulePortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1177:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1178:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1178:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1179:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getPortOutAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPortOutAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPortOutAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:1191:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1192:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1192:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:1193:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortOutAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getPortOutAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1214:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1215:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1215:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1216:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortOutRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getPortOutAccess().getPortOutSuperTypePortTypeCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePortOut"


    // $ANTLR start "entryRuleErrorModelDec"
    // InternalDepModel.g:1231:1: entryRuleErrorModelDec returns [EObject current=null] : iv_ruleErrorModelDec= ruleErrorModelDec EOF ;
    public final EObject entryRuleErrorModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModelDec = null;


        try {
            // InternalDepModel.g:1231:54: (iv_ruleErrorModelDec= ruleErrorModelDec EOF )
            // InternalDepModel.g:1232:2: iv_ruleErrorModelDec= ruleErrorModelDec EOF
            {
             newCompositeNode(grammarAccess.getErrorModelDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorModelDec=ruleErrorModelDec();

            state._fsp--;

             current =iv_ruleErrorModelDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorModelDec"


    // $ANTLR start "ruleErrorModelDec"
    // InternalDepModel.g:1238:1: ruleErrorModelDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleErrorModelDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_emodelElements_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1244:2: ( (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:1245:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:1245:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' )
            // InternalDepModel.g:1246:3: otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModelDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModelDecAccess().getModelKeyword_1());
            		
            // InternalDepModel.g:1254:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1255:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1255:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:1256:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorModelDecAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorModelDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getErrorModelDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:1277:3: ( (lv_emodelElements_4_0= ruleErrorModelElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16||LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDepModel.g:1278:4: (lv_emodelElements_4_0= ruleErrorModelElement )
            	    {
            	    // InternalDepModel.g:1278:4: (lv_emodelElements_4_0= ruleErrorModelElement )
            	    // InternalDepModel.g:1279:5: lv_emodelElements_4_0= ruleErrorModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getErrorModelDecAccess().getEmodelElementsErrorModelElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_emodelElements_4_0=ruleErrorModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getErrorModelDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"emodelElements",
            	    						lv_emodelElements_4_0,
            	    						"hu.bme.mit.DepModel.ErrorModelElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getErrorModelDecAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorModelDec"


    // $ANTLR start "entryRuleErrorModelElement"
    // InternalDepModel.g:1304:1: entryRuleErrorModelElement returns [EObject current=null] : iv_ruleErrorModelElement= ruleErrorModelElement EOF ;
    public final EObject entryRuleErrorModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModelElement = null;


        try {
            // InternalDepModel.g:1304:58: (iv_ruleErrorModelElement= ruleErrorModelElement EOF )
            // InternalDepModel.g:1305:2: iv_ruleErrorModelElement= ruleErrorModelElement EOF
            {
             newCompositeNode(grammarAccess.getErrorModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorModelElement=ruleErrorModelElement();

            state._fsp--;

             current =iv_ruleErrorModelElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorModelElement"


    // $ANTLR start "ruleErrorModelElement"
    // InternalDepModel.g:1311:1: ruleErrorModelElement returns [EObject current=null] : (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec ) ;
    public final EObject ruleErrorModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_StateDec_0 = null;

        EObject this_TransitionDec_1 = null;

        EObject this_ErrorPortDec_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1317:2: ( (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec ) )
            // InternalDepModel.g:1318:2: (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec )
            {
            // InternalDepModel.g:1318:2: (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==30) ) {
                    alt13=1;
                }
                else if ( (LA13_1==12) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDepModel.g:1319:3: this_StateDec_0= ruleStateDec
                    {

                    			newCompositeNode(grammarAccess.getErrorModelElementAccess().getStateDecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateDec_0=ruleStateDec();

                    state._fsp--;


                    			current = this_StateDec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1328:3: this_TransitionDec_1= ruleTransitionDec
                    {

                    			newCompositeNode(grammarAccess.getErrorModelElementAccess().getTransitionDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransitionDec_1=ruleTransitionDec();

                    state._fsp--;


                    			current = this_TransitionDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDepModel.g:1337:3: this_ErrorPortDec_2= ruleErrorPortDec
                    {

                    			newCompositeNode(grammarAccess.getErrorModelElementAccess().getErrorPortDecParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorPortDec_2=ruleErrorPortDec();

                    state._fsp--;


                    			current = this_ErrorPortDec_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorModelElement"


    // $ANTLR start "entryRuleErrorPortDec"
    // InternalDepModel.g:1349:1: entryRuleErrorPortDec returns [EObject current=null] : iv_ruleErrorPortDec= ruleErrorPortDec EOF ;
    public final EObject entryRuleErrorPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPortDec = null;


        try {
            // InternalDepModel.g:1349:53: (iv_ruleErrorPortDec= ruleErrorPortDec EOF )
            // InternalDepModel.g:1350:2: iv_ruleErrorPortDec= ruleErrorPortDec EOF
            {
             newCompositeNode(grammarAccess.getErrorPortDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorPortDec=ruleErrorPortDec();

            state._fsp--;

             current =iv_ruleErrorPortDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorPortDec"


    // $ANTLR start "ruleErrorPortDec"
    // InternalDepModel.g:1356:1: ruleErrorPortDec returns [EObject current=null] : (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut ) ;
    public final EObject ruleErrorPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_ErrorPortIn_0 = null;

        EObject this_ErrorPortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1362:2: ( (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut ) )
            // InternalDepModel.g:1363:2: (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut )
            {
            // InternalDepModel.g:1363:2: (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==12) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==23) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==24) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDepModel.g:1364:3: this_ErrorPortIn_0= ruleErrorPortIn
                    {

                    			newCompositeNode(grammarAccess.getErrorPortDecAccess().getErrorPortInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorPortIn_0=ruleErrorPortIn();

                    state._fsp--;


                    			current = this_ErrorPortIn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1373:3: this_ErrorPortOut_1= ruleErrorPortOut
                    {

                    			newCompositeNode(grammarAccess.getErrorPortDecAccess().getErrorPortOutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorPortOut_1=ruleErrorPortOut();

                    state._fsp--;


                    			current = this_ErrorPortOut_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorPortDec"


    // $ANTLR start "entryRuleErrorPortIn"
    // InternalDepModel.g:1385:1: entryRuleErrorPortIn returns [EObject current=null] : iv_ruleErrorPortIn= ruleErrorPortIn EOF ;
    public final EObject entryRuleErrorPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPortIn = null;


        try {
            // InternalDepModel.g:1385:52: (iv_ruleErrorPortIn= ruleErrorPortIn EOF )
            // InternalDepModel.g:1386:2: iv_ruleErrorPortIn= ruleErrorPortIn EOF
            {
             newCompositeNode(grammarAccess.getErrorPortInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorPortIn=ruleErrorPortIn();

            state._fsp--;

             current =iv_ruleErrorPortIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorPortIn"


    // $ANTLR start "ruleErrorPortIn"
    // InternalDepModel.g:1392:1: ruleErrorPortIn returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleErrorPortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1398:2: ( (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1399:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1399:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1400:3: otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorPortInAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorPortInAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getErrorPortInAccess().getInKeyword_2());
            		
            // InternalDepModel.g:1412:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1413:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1413:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:1414:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorPortInAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorPortInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getErrorPortInAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1435:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1436:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1436:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1437:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErrorPortInRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getErrorPortInAccess().getErrorPortInSuperTypePortTypeCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorPortIn"


    // $ANTLR start "entryRuleErrorPortOut"
    // InternalDepModel.g:1452:1: entryRuleErrorPortOut returns [EObject current=null] : iv_ruleErrorPortOut= ruleErrorPortOut EOF ;
    public final EObject entryRuleErrorPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPortOut = null;


        try {
            // InternalDepModel.g:1452:53: (iv_ruleErrorPortOut= ruleErrorPortOut EOF )
            // InternalDepModel.g:1453:2: iv_ruleErrorPortOut= ruleErrorPortOut EOF
            {
             newCompositeNode(grammarAccess.getErrorPortOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorPortOut=ruleErrorPortOut();

            state._fsp--;

             current =iv_ruleErrorPortOut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleErrorPortOut"


    // $ANTLR start "ruleErrorPortOut"
    // InternalDepModel.g:1459:1: ruleErrorPortOut returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleErrorPortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1465:2: ( (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1466:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1466:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1467:3: otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorPortOutAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorPortOutAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getErrorPortOutAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:1479:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1480:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1480:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:1481:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorPortOutAccess().getNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorPortOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getErrorPortOutAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1502:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1503:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1503:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1504:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getErrorPortOutRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getErrorPortOutAccess().getErrorPortOutSuperTypePortTypeCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleErrorPortOut"


    // $ANTLR start "entryRuleStateDec"
    // InternalDepModel.g:1519:1: entryRuleStateDec returns [EObject current=null] : iv_ruleStateDec= ruleStateDec EOF ;
    public final EObject entryRuleStateDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDec = null;


        try {
            // InternalDepModel.g:1519:49: (iv_ruleStateDec= ruleStateDec EOF )
            // InternalDepModel.g:1520:2: iv_ruleStateDec= ruleStateDec EOF
            {
             newCompositeNode(grammarAccess.getStateDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDec=ruleStateDec();

            state._fsp--;

             current =iv_ruleStateDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateDec"


    // $ANTLR start "ruleStateDec"
    // InternalDepModel.g:1526:1: ruleStateDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleStateDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1532:2: ( (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) ) )
            // InternalDepModel.g:1533:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) )
            {
            // InternalDepModel.g:1533:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) )
            // InternalDepModel.g:1534:3: otherlv_0= 'error' otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStateDecAccess().getStateKeyword_1());
            		
            // InternalDepModel.g:1542:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1543:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1543:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:1544:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getStateDecAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateDec"


    // $ANTLR start "entryRuleTransitionDec"
    // InternalDepModel.g:1565:1: entryRuleTransitionDec returns [EObject current=null] : iv_ruleTransitionDec= ruleTransitionDec EOF ;
    public final EObject entryRuleTransitionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDec = null;


        try {
            // InternalDepModel.g:1565:54: (iv_ruleTransitionDec= ruleTransitionDec EOF )
            // InternalDepModel.g:1566:2: iv_ruleTransitionDec= ruleTransitionDec EOF
            {
             newCompositeNode(grammarAccess.getTransitionDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionDec=ruleTransitionDec();

            state._fsp--;

             current =iv_ruleTransitionDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionDec"


    // $ANTLR start "ruleTransitionDec"
    // InternalDepModel.g:1572:1: ruleTransitionDec returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransitionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_Features_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1578:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) )
            // InternalDepModel.g:1579:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            {
            // InternalDepModel.g:1579:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            // InternalDepModel.g:1580:3: otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDecAccess().getTransitionKeyword_0());
            		
            // InternalDepModel.g:1584:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:1585:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1585:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:1586:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTransitionDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDepModel.g:1607:3: ( (lv_Features_3_0= ruleTransitionFeatureDec ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=32 && LA15_0<=33)||(LA15_0>=35 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDepModel.g:1608:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    {
            	    // InternalDepModel.g:1608:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    // InternalDepModel.g:1609:5: lv_Features_3_0= ruleTransitionFeatureDec
            	    {

            	    					newCompositeNode(grammarAccess.getTransitionDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_Features_3_0=ruleTransitionFeatureDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransitionDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Features",
            	    						lv_Features_3_0,
            	    						"hu.bme.mit.DepModel.TransitionFeatureDec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionDecAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionDec"


    // $ANTLR start "entryRuleTransitionFeatureDec"
    // InternalDepModel.g:1634:1: entryRuleTransitionFeatureDec returns [EObject current=null] : iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF ;
    public final EObject entryRuleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFeatureDec = null;


        try {
            // InternalDepModel.g:1634:61: (iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF )
            // InternalDepModel.g:1635:2: iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF
            {
             newCompositeNode(grammarAccess.getTransitionFeatureDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionFeatureDec=ruleTransitionFeatureDec();

            state._fsp--;

             current =iv_ruleTransitionFeatureDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionFeatureDec"


    // $ANTLR start "ruleTransitionFeatureDec"
    // InternalDepModel.g:1641:1: ruleTransitionFeatureDec returns [EObject current=null] : (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) ;
    public final EObject ruleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TransitionState_0 = null;

        EObject this_TriggerDec_1 = null;

        EObject this_ActionDec_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1647:2: ( (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) )
            // InternalDepModel.g:1648:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            {
            // InternalDepModel.g:1648:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 35:
                {
                alt16=2;
                }
                break;
            case 36:
                {
                alt16=3;
                }
                break;
            case 32:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDepModel.g:1649:3: this_TransitionState_0= ruleTransitionState
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getTransitionStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransitionState_0=ruleTransitionState();

                    state._fsp--;


                    			current = this_TransitionState_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1658:3: this_TriggerDec_1= ruleTriggerDec
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getTriggerDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TriggerDec_1=ruleTriggerDec();

                    state._fsp--;


                    			current = this_TriggerDec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDepModel.g:1667:3: this_ActionDec_2= ruleActionDec
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getActionDecParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionDec_2=ruleActionDec();

                    state._fsp--;


                    			current = this_ActionDec_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDepModel.g:1676:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    {
                    // InternalDepModel.g:1676:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    // InternalDepModel.g:1677:4: otherlv_3= 'occurrence' () ruleDOUBLE
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionFeatureDecAccess().getOccurrenceKeyword_3_0());
                    			
                    // InternalDepModel.g:1681:4: ()
                    // InternalDepModel.g:1682:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTransitionFeatureDecAccess().getOccurrenceDecAction_3_1(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getDOUBLEParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleDOUBLE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionFeatureDec"


    // $ANTLR start "entryRuleTransitionState"
    // InternalDepModel.g:1700:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalDepModel.g:1700:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalDepModel.g:1701:2: iv_ruleTransitionState= ruleTransitionState EOF
            {
             newCompositeNode(grammarAccess.getTransitionStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitionState=ruleTransitionState();

            state._fsp--;

             current =iv_ruleTransitionState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionState"


    // $ANTLR start "ruleTransitionState"
    // InternalDepModel.g:1707:1: ruleTransitionState returns [EObject current=null] : (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDepModel.g:1713:2: ( (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:1714:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:1714:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:1715:3: otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getStatesKeyword_0());
            		
            // InternalDepModel.g:1719:3: ( (otherlv_1= RULE_ID ) )
            // InternalDepModel.g:1720:4: (otherlv_1= RULE_ID )
            {
            // InternalDepModel.g:1720:4: (otherlv_1= RULE_ID )
            // InternalDepModel.g:1721:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalDepModel.g:1736:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1737:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1737:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1738:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionStateAccess().getTargetStateStateDecCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionState"


    // $ANTLR start "entryRuleTriggerDec"
    // InternalDepModel.g:1753:1: entryRuleTriggerDec returns [EObject current=null] : iv_ruleTriggerDec= ruleTriggerDec EOF ;
    public final EObject entryRuleTriggerDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDec = null;


        try {
            // InternalDepModel.g:1753:51: (iv_ruleTriggerDec= ruleTriggerDec EOF )
            // InternalDepModel.g:1754:2: iv_ruleTriggerDec= ruleTriggerDec EOF
            {
             newCompositeNode(grammarAccess.getTriggerDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTriggerDec=ruleTriggerDec();

            state._fsp--;

             current =iv_ruleTriggerDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerDec"


    // $ANTLR start "ruleTriggerDec"
    // InternalDepModel.g:1760:1: ruleTriggerDec returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTriggerDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1766:2: ( (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1767:2: (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1767:2: (otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1768:3: otherlv_0= 'trigger' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerDecAccess().getTriggerKeyword_0());
            		
            // InternalDepModel.g:1772:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:1773:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1773:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:1774:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTriggerDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTriggerDecAccess().getColonKeyword_2());
            		
            // InternalDepModel.g:1795:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1796:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1796:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1797:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getTriggerDecAccess().getPortInstancePortDecCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTriggerDecAccess().getFullStopKeyword_4());
            		
            // InternalDepModel.g:1812:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1813:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1813:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1814:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getTriggerDecAccess().getErrorModeErrorModesCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerDec"


    // $ANTLR start "entryRuleActionDec"
    // InternalDepModel.g:1829:1: entryRuleActionDec returns [EObject current=null] : iv_ruleActionDec= ruleActionDec EOF ;
    public final EObject entryRuleActionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDec = null;


        try {
            // InternalDepModel.g:1829:50: (iv_ruleActionDec= ruleActionDec EOF )
            // InternalDepModel.g:1830:2: iv_ruleActionDec= ruleActionDec EOF
            {
             newCompositeNode(grammarAccess.getActionDecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDec=ruleActionDec();

            state._fsp--;

             current =iv_ruleActionDec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionDec"


    // $ANTLR start "ruleActionDec"
    // InternalDepModel.g:1836:1: ruleActionDec returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleActionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1842:2: ( (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1843:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1843:2: (otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1844:3: otherlv_0= 'action' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDecAccess().getActionKeyword_0());
            		
            // InternalDepModel.g:1848:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:1849:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1849:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:1850:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getActionDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionDecAccess().getColonKeyword_2());
            		
            // InternalDepModel.g:1871:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1872:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1872:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1873:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getActionDecAccess().getPortInstancePortDecCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActionDecAccess().getFullStopKeyword_4());
            		
            // InternalDepModel.g:1888:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1889:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1889:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1890:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getActionDecAccess().getErrorModeErrorModesCrossReference_5_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionDec"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalDepModel.g:1905:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalDepModel.g:1905:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalDepModel.g:1906:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalDepModel.g:1912:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDepModel.g:1918:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDepModel.g:1919:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDepModel.g:1919:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDepModel.g:1920:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_27); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002048000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080018000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001B00008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});

}