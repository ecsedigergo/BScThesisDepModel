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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'port'", "'type'", "'{'", "'}'", "'error'", "'mode'", "'connection'", "'from'", "'to'", "'with'", "'system'", "'in'", "'out'", "'component'", "':'", "'model'", "'initial'", "'state'", "'transition'", "'occurrence'", "'states'", "'->'", "'trigger'", "'action'"
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

                if ( (LA1_0==12||LA1_0==18||LA1_0==22||LA1_0==25) ) {
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
    // InternalDepModel.g:147:1: ruleAbstractElement returns [EObject current=null] : (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType | this_ComponentType_2= ruleComponentType ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_ComponentModelDec_0 = null;

        EObject this_PortType_1 = null;

        EObject this_ComponentType_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:153:2: ( (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType | this_ComponentType_2= ruleComponentType ) )
            // InternalDepModel.g:154:2: (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType | this_ComponentType_2= ruleComponentType )
            {
            // InternalDepModel.g:154:2: (this_ComponentModelDec_0= ruleComponentModelDec | this_PortType_1= rulePortType | this_ComponentType_2= ruleComponentType )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
            case 22:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            default:
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
                case 3 :
                    // InternalDepModel.g:173:3: this_ComponentType_2= ruleComponentType
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getComponentTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentType_2=ruleComponentType();

                    state._fsp--;


                    			current = this_ComponentType_2;
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
    // InternalDepModel.g:185:1: entryRulePortType returns [EObject current=null] : iv_rulePortType= rulePortType EOF ;
    public final EObject entryRulePortType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortType = null;


        try {
            // InternalDepModel.g:185:49: (iv_rulePortType= rulePortType EOF )
            // InternalDepModel.g:186:2: iv_rulePortType= rulePortType EOF
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
    // InternalDepModel.g:192:1: rulePortType returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )+ otherlv_5= '}' ) ;
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
            // InternalDepModel.g:198:2: ( (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )+ otherlv_5= '}' ) )
            // InternalDepModel.g:199:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )+ otherlv_5= '}' )
            {
            // InternalDepModel.g:199:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )+ otherlv_5= '}' )
            // InternalDepModel.g:200:3: otherlv_0= 'port' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_eModes_4_0= ruleErrorModes ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPortTypeAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:208:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:209:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:209:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:210:5: lv_name_2_0= ruleQualifiedName
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
            		
            // InternalDepModel.g:231:3: ( (lv_eModes_4_0= ruleErrorModes ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDepModel.g:232:4: (lv_eModes_4_0= ruleErrorModes )
            	    {
            	    // InternalDepModel.g:232:4: (lv_eModes_4_0= ruleErrorModes )
            	    // InternalDepModel.g:233:5: lv_eModes_4_0= ruleErrorModes
            	    {

            	    					newCompositeNode(grammarAccess.getPortTypeAccess().getEModesErrorModesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalDepModel.g:258:1: entryRuleErrorModes returns [EObject current=null] : iv_ruleErrorModes= ruleErrorModes EOF ;
    public final EObject entryRuleErrorModes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModes = null;


        try {
            // InternalDepModel.g:258:51: (iv_ruleErrorModes= ruleErrorModes EOF )
            // InternalDepModel.g:259:2: iv_ruleErrorModes= ruleErrorModes EOF
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
    // InternalDepModel.g:265:1: ruleErrorModes returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleErrorModes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:271:2: ( (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) ) )
            // InternalDepModel.g:272:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) )
            {
            // InternalDepModel.g:272:2: (otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) ) )
            // InternalDepModel.g:273:3: otherlv_0= 'error' otherlv_1= 'mode' ( (lv_name_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModesAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModesAccess().getModeKeyword_1());
            		
            // InternalDepModel.g:281:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:282:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:282:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:283:5: lv_name_2_0= ruleQualifiedName
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
    // InternalDepModel.g:304:1: entryRuleComponentModelDec returns [EObject current=null] : iv_ruleComponentModelDec= ruleComponentModelDec EOF ;
    public final EObject entryRuleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModelDec = null;


        try {
            // InternalDepModel.g:304:58: (iv_ruleComponentModelDec= ruleComponentModelDec EOF )
            // InternalDepModel.g:305:2: iv_ruleComponentModelDec= ruleComponentModelDec EOF
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
    // InternalDepModel.g:311:1: ruleComponentModelDec returns [EObject current=null] : (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) ;
    public final EObject ruleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemConnDec_0 = null;

        EObject this_SystemDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:317:2: ( (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) )
            // InternalDepModel.g:318:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            {
            // InternalDepModel.g:318:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDepModel.g:319:3: this_SystemConnDec_0= ruleSystemConnDec
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
                    // InternalDepModel.g:328:3: this_SystemDec_1= ruleSystemDec
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
    // InternalDepModel.g:340:1: entryRuleSystemConnDec returns [EObject current=null] : iv_ruleSystemConnDec= ruleSystemConnDec EOF ;
    public final EObject entryRuleSystemConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConnDec = null;


        try {
            // InternalDepModel.g:340:54: (iv_ruleSystemConnDec= ruleSystemConnDec EOF )
            // InternalDepModel.g:341:2: iv_ruleSystemConnDec= ruleSystemConnDec EOF
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
    // InternalDepModel.g:347:1: ruleSystemConnDec returns [EObject current=null] : (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleSystemConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_prob_11_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:353:2: ( (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) ) )
            // InternalDepModel.g:354:2: (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) )
            {
            // InternalDepModel.g:354:2: (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) )
            // InternalDepModel.g:355:3: otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemConnDecAccess().getConnectionKeyword_0());
            		
            // InternalDepModel.g:359:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:360:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:360:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:361:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemConnDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemConnDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemConnDecAccess().getFromKeyword_2());
            		
            // InternalDepModel.g:382:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:383:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:383:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:384:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_4());
            		
            // InternalDepModel.g:399:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:400:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:400:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:401:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortOutCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemConnDecAccess().getToKeyword_6());
            		
            // InternalDepModel.g:416:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:417:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:417:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:418:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_7, grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_8());
            		
            // InternalDepModel.g:433:3: ( (otherlv_9= RULE_ID ) )
            // InternalDepModel.g:434:4: (otherlv_9= RULE_ID )
            {
            // InternalDepModel.g:434:4: (otherlv_9= RULE_ID )
            // InternalDepModel.g:435:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_9, grammarAccess.getSystemConnDecAccess().getTargetPortSystemPortInCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getSystemConnDecAccess().getWithKeyword_10());
            		
            // InternalDepModel.g:450:3: ( (lv_prob_11_0= ruleDOUBLE ) )
            // InternalDepModel.g:451:4: (lv_prob_11_0= ruleDOUBLE )
            {
            // InternalDepModel.g:451:4: (lv_prob_11_0= ruleDOUBLE )
            // InternalDepModel.g:452:5: lv_prob_11_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getSystemConnDecAccess().getProbDOUBLEParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_prob_11_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemConnDecRule());
            					}
            					set(
            						current,
            						"prob",
            						lv_prob_11_0,
            						"hu.bme.mit.DepModel.DOUBLE");
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
    // $ANTLR end "ruleSystemConnDec"


    // $ANTLR start "entryRuleSystemDec"
    // InternalDepModel.g:473:1: entryRuleSystemDec returns [EObject current=null] : iv_ruleSystemDec= ruleSystemDec EOF ;
    public final EObject entryRuleSystemDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDec = null;


        try {
            // InternalDepModel.g:473:50: (iv_ruleSystemDec= ruleSystemDec EOF )
            // InternalDepModel.g:474:2: iv_ruleSystemDec= ruleSystemDec EOF
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
    // InternalDepModel.g:480:1: ruleSystemDec returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleSysFeaturesDec ) )* otherlv_4= '}' ) ;
    public final EObject ruleSystemDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_sysFeatures_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:486:2: ( (otherlv_0= 'system' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleSysFeaturesDec ) )* otherlv_4= '}' ) )
            // InternalDepModel.g:487:2: (otherlv_0= 'system' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleSysFeaturesDec ) )* otherlv_4= '}' )
            {
            // InternalDepModel.g:487:2: (otherlv_0= 'system' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleSysFeaturesDec ) )* otherlv_4= '}' )
            // InternalDepModel.g:488:3: otherlv_0= 'system' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_sysFeatures_3_0= ruleSysFeaturesDec ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDecAccess().getSystemKeyword_0());
            		
            // InternalDepModel.g:492:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:493:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:493:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:494:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDepModel.g:515:3: ( (lv_sysFeatures_3_0= ruleSysFeaturesDec ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==22||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDepModel.g:516:4: (lv_sysFeatures_3_0= ruleSysFeaturesDec )
            	    {
            	    // InternalDepModel.g:516:4: (lv_sysFeatures_3_0= ruleSysFeaturesDec )
            	    // InternalDepModel.g:517:5: lv_sysFeatures_3_0= ruleSysFeaturesDec
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDecAccess().getSysFeaturesSysFeaturesDecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_sysFeatures_3_0=ruleSysFeaturesDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sysFeatures",
            	    						lv_sysFeatures_3_0,
            	    						"hu.bme.mit.DepModel.SysFeaturesDec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemDecAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalDepModel.g:542:1: entryRuleSysFeaturesDec returns [EObject current=null] : iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF ;
    public final EObject entryRuleSysFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSysFeaturesDec = null;


        try {
            // InternalDepModel.g:542:55: (iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF )
            // InternalDepModel.g:543:2: iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF
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
    // InternalDepModel.g:549:1: ruleSysFeaturesDec returns [EObject current=null] : (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentImpl_2= ruleComponentImpl ) ;
    public final EObject ruleSysFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortDec_0 = null;

        EObject this_ComponentConnDec_1 = null;

        EObject this_ComponentImpl_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:555:2: ( (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentImpl_2= ruleComponentImpl ) )
            // InternalDepModel.g:556:2: (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentImpl_2= ruleComponentImpl )
            {
            // InternalDepModel.g:556:2: (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentImpl_2= ruleComponentImpl )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDepModel.g:557:3: this_SystemPortDec_0= ruleSystemPortDec
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
                    // InternalDepModel.g:566:3: this_ComponentConnDec_1= ruleComponentConnDec
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
                    // InternalDepModel.g:575:3: this_ComponentImpl_2= ruleComponentImpl
                    {

                    			newCompositeNode(grammarAccess.getSysFeaturesDecAccess().getComponentImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentImpl_2=ruleComponentImpl();

                    state._fsp--;


                    			current = this_ComponentImpl_2;
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
    // InternalDepModel.g:587:1: entryRuleSystemPortDec returns [EObject current=null] : iv_ruleSystemPortDec= ruleSystemPortDec EOF ;
    public final EObject entryRuleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortDec = null;


        try {
            // InternalDepModel.g:587:54: (iv_ruleSystemPortDec= ruleSystemPortDec EOF )
            // InternalDepModel.g:588:2: iv_ruleSystemPortDec= ruleSystemPortDec EOF
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
    // InternalDepModel.g:594:1: ruleSystemPortDec returns [EObject current=null] : (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) ;
    public final EObject ruleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortIn_0 = null;

        EObject this_SystemPortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:600:2: ( (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) )
            // InternalDepModel.g:601:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            {
            // InternalDepModel.g:601:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
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
                    // InternalDepModel.g:602:3: this_SystemPortIn_0= ruleSystemPortIn
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
                    // InternalDepModel.g:611:3: this_SystemPortOut_1= ruleSystemPortOut
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
    // InternalDepModel.g:623:1: entryRuleSystemPortIn returns [EObject current=null] : iv_ruleSystemPortIn= ruleSystemPortIn EOF ;
    public final EObject entryRuleSystemPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortIn = null;


        try {
            // InternalDepModel.g:623:53: (iv_ruleSystemPortIn= ruleSystemPortIn EOF )
            // InternalDepModel.g:624:2: iv_ruleSystemPortIn= ruleSystemPortIn EOF
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
    // InternalDepModel.g:630:1: ruleSystemPortIn returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
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
            // InternalDepModel.g:636:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:637:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:637:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:638:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortInAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortInAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortInAccess().getInKeyword_2());
            		
            // InternalDepModel.g:650:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:651:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:651:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:652:5: lv_name_3_0= ruleQualifiedName
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

            otherlv_4=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortInAccess().getToKeyword_4());
            		
            // InternalDepModel.g:673:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:674:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:674:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:675:5: otherlv_5= RULE_ID
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
            		
            // InternalDepModel.g:690:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:691:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:691:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:692:5: otherlv_7= RULE_ID
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
    // InternalDepModel.g:707:1: entryRuleSystemPortOut returns [EObject current=null] : iv_ruleSystemPortOut= ruleSystemPortOut EOF ;
    public final EObject entryRuleSystemPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortOut = null;


        try {
            // InternalDepModel.g:707:54: (iv_ruleSystemPortOut= ruleSystemPortOut EOF )
            // InternalDepModel.g:708:2: iv_ruleSystemPortOut= ruleSystemPortOut EOF
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
    // InternalDepModel.g:714:1: ruleSystemPortOut returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
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
            // InternalDepModel.g:720:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:721:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:721:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:722:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortOutAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortOutAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortOutAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:734:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:735:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:735:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDepModel.g:736:5: lv_name_3_0= ruleQualifiedName
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

            otherlv_4=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortOutAccess().getFromKeyword_4());
            		
            // InternalDepModel.g:757:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:758:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:758:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:759:5: otherlv_5= RULE_ID
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
            		
            // InternalDepModel.g:774:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:775:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:775:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:776:5: otherlv_7= RULE_ID
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
    // InternalDepModel.g:791:1: entryRuleComponentConnDec returns [EObject current=null] : iv_ruleComponentConnDec= ruleComponentConnDec EOF ;
    public final EObject entryRuleComponentConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConnDec = null;


        try {
            // InternalDepModel.g:791:57: (iv_ruleComponentConnDec= ruleComponentConnDec EOF )
            // InternalDepModel.g:792:2: iv_ruleComponentConnDec= ruleComponentConnDec EOF
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
    // InternalDepModel.g:798:1: ruleComponentConnDec returns [EObject current=null] : (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) ) ;
    public final EObject ruleComponentConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_prob_11_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:804:2: ( (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) ) )
            // InternalDepModel.g:805:2: (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) )
            {
            // InternalDepModel.g:805:2: (otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) ) )
            // InternalDepModel.g:806:3: otherlv_0= 'connection' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'to' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= 'with' ( (lv_prob_11_0= ruleDOUBLE ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentConnDecAccess().getConnectionKeyword_0());
            		
            // InternalDepModel.g:810:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:811:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:811:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:812:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentConnDecAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentConnDecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentConnDecAccess().getFromKeyword_2());
            		
            // InternalDepModel.g:833:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:834:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:834:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:835:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getComponentConnDecAccess().getSourceCompComponentImplCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentConnDecAccess().getFullStopKeyword_4());
            		
            // InternalDepModel.g:850:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:851:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:851:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:852:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getComponentConnDecAccess().getSourcePortPortOutCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentConnDecAccess().getToKeyword_6());
            		
            // InternalDepModel.g:867:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:868:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:868:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:869:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_7, grammarAccess.getComponentConnDecAccess().getTargetCompComponentImplCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentConnDecAccess().getFullStopKeyword_8());
            		
            // InternalDepModel.g:884:3: ( (otherlv_9= RULE_ID ) )
            // InternalDepModel.g:885:4: (otherlv_9= RULE_ID )
            {
            // InternalDepModel.g:885:4: (otherlv_9= RULE_ID )
            // InternalDepModel.g:886:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_9, grammarAccess.getComponentConnDecAccess().getTargetPortPortInCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getComponentConnDecAccess().getWithKeyword_10());
            		
            // InternalDepModel.g:901:3: ( (lv_prob_11_0= ruleDOUBLE ) )
            // InternalDepModel.g:902:4: (lv_prob_11_0= ruleDOUBLE )
            {
            // InternalDepModel.g:902:4: (lv_prob_11_0= ruleDOUBLE )
            // InternalDepModel.g:903:5: lv_prob_11_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getComponentConnDecAccess().getProbDOUBLEParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_2);
            lv_prob_11_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentConnDecRule());
            					}
            					set(
            						current,
            						"prob",
            						lv_prob_11_0,
            						"hu.bme.mit.DepModel.DOUBLE");
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
    // $ANTLR end "ruleComponentConnDec"


    // $ANTLR start "entryRuleComponentImpl"
    // InternalDepModel.g:924:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // InternalDepModel.g:924:54: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // InternalDepModel.g:925:2: iv_ruleComponentImpl= ruleComponentImpl EOF
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
    // InternalDepModel.g:931:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:937:2: ( (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:938:2: (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:938:2: (otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:939:3: otherlv_0= 'component' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getComponentKeyword_0());
            		
            // InternalDepModel.g:943:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:944:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:944:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:945:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentImplAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentImplAccess().getColonKeyword_2());
            		
            // InternalDepModel.g:966:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:967:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:967:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:968:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentImplRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getSuperTypeComponentTypeCrossReference_3_0());
            				

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
    // InternalDepModel.g:983:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDepModel.g:983:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDepModel.g:984:2: iv_ruleComponentType= ruleComponentType EOF
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
    // InternalDepModel.g:990:1: ruleComponentType returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' ) ;
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
            // InternalDepModel.g:996:2: ( (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:997:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:997:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' )
            // InternalDepModel.g:998:3: otherlv_0= 'component' otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:1006:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1007:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1007:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:1008:5: lv_name_2_0= ruleQualifiedName
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
            		
            // InternalDepModel.g:1029:3: ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==12||LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDepModel.g:1030:4: (lv_componentFeatures_4_0= ruleComponentFeaturesDec )
            	    {
            	    // InternalDepModel.g:1030:4: (lv_componentFeatures_4_0= ruleComponentFeaturesDec )
            	    // InternalDepModel.g:1031:5: lv_componentFeatures_4_0= ruleComponentFeaturesDec
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
    // InternalDepModel.g:1056:1: entryRuleComponentFeaturesDec returns [EObject current=null] : iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF ;
    public final EObject entryRuleComponentFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentFeaturesDec = null;


        try {
            // InternalDepModel.g:1056:61: (iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF )
            // InternalDepModel.g:1057:2: iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF
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
    // InternalDepModel.g:1063:1: ruleComponentFeaturesDec returns [EObject current=null] : (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec ) ;
    public final EObject ruleComponentFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject this_PortDec_0 = null;

        EObject this_ErrorModelDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1069:2: ( (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec ) )
            // InternalDepModel.g:1070:2: (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec )
            {
            // InternalDepModel.g:1070:2: (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec )
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
                    // InternalDepModel.g:1071:3: this_PortDec_0= rulePortDec
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
                    // InternalDepModel.g:1080:3: this_ErrorModelDec_1= ruleErrorModelDec
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
    // InternalDepModel.g:1092:1: entryRulePortDec returns [EObject current=null] : iv_rulePortDec= rulePortDec EOF ;
    public final EObject entryRulePortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortDec = null;


        try {
            // InternalDepModel.g:1092:48: (iv_rulePortDec= rulePortDec EOF )
            // InternalDepModel.g:1093:2: iv_rulePortDec= rulePortDec EOF
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
    // InternalDepModel.g:1099:1: rulePortDec returns [EObject current=null] : (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) ;
    public final EObject rulePortDec() throws RecognitionException {
        EObject current = null;

        EObject this_PortIn_0 = null;

        EObject this_PortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1105:2: ( (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) )
            // InternalDepModel.g:1106:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            {
            // InternalDepModel.g:1106:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==23) ) {
                    alt11=1;
                }
                else if ( (LA11_1==24) ) {
                    alt11=2;
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
                    // InternalDepModel.g:1107:3: this_PortIn_0= rulePortIn
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
                    // InternalDepModel.g:1116:3: this_PortOut_1= rulePortOut
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
    // InternalDepModel.g:1128:1: entryRulePortIn returns [EObject current=null] : iv_rulePortIn= rulePortIn EOF ;
    public final EObject entryRulePortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortIn = null;


        try {
            // InternalDepModel.g:1128:47: (iv_rulePortIn= rulePortIn EOF )
            // InternalDepModel.g:1129:2: iv_rulePortIn= rulePortIn EOF
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
    // InternalDepModel.g:1135:1: rulePortIn returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'in' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1141:2: ( (otherlv_0= 'port' otherlv_1= 'in' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDepModel.g:1142:2: (otherlv_0= 'port' otherlv_1= 'in' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDepModel.g:1142:2: (otherlv_0= 'port' otherlv_1= 'in' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalDepModel.g:1143:3: otherlv_0= 'port' otherlv_1= 'in' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPortInAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortInAccess().getInKeyword_1());
            		
            // InternalDepModel.g:1151:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1152:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1152:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:1153:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortInAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortInRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPortInAccess().getColonKeyword_3());
            		
            // InternalDepModel.g:1174:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:1175:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:1175:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:1176:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortInRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getPortInAccess().getPortInSuperTypePortTypeCrossReference_4_0());
            				

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
    // InternalDepModel.g:1191:1: entryRulePortOut returns [EObject current=null] : iv_rulePortOut= rulePortOut EOF ;
    public final EObject entryRulePortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortOut = null;


        try {
            // InternalDepModel.g:1191:48: (iv_rulePortOut= rulePortOut EOF )
            // InternalDepModel.g:1192:2: iv_rulePortOut= rulePortOut EOF
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
    // InternalDepModel.g:1198:1: rulePortOut returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'out' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject rulePortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1204:2: ( (otherlv_0= 'port' otherlv_1= 'out' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDepModel.g:1205:2: (otherlv_0= 'port' otherlv_1= 'out' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDepModel.g:1205:2: (otherlv_0= 'port' otherlv_1= 'out' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalDepModel.g:1206:3: otherlv_0= 'port' otherlv_1= 'out' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getPortOutAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortOutAccess().getOutKeyword_1());
            		
            // InternalDepModel.g:1214:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1215:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1215:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:1216:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortOutAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortOutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPortOutAccess().getColonKeyword_3());
            		
            // InternalDepModel.g:1237:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:1238:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:1238:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:1239:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortOutRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getPortOutAccess().getPortOutSuperTypePortTypeCrossReference_4_0());
            				

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
    // InternalDepModel.g:1254:1: entryRuleErrorModelDec returns [EObject current=null] : iv_ruleErrorModelDec= ruleErrorModelDec EOF ;
    public final EObject entryRuleErrorModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModelDec = null;


        try {
            // InternalDepModel.g:1254:54: (iv_ruleErrorModelDec= ruleErrorModelDec EOF )
            // InternalDepModel.g:1255:2: iv_ruleErrorModelDec= ruleErrorModelDec EOF
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
    // InternalDepModel.g:1261:1: ruleErrorModelDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' ) ;
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
            // InternalDepModel.g:1267:2: ( (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:1268:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:1268:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' )
            // InternalDepModel.g:1269:3: otherlv_0= 'error' otherlv_1= 'model' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModelDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModelDecAccess().getModelKeyword_1());
            		
            // InternalDepModel.g:1277:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1278:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1278:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:1279:5: lv_name_2_0= ruleQualifiedName
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

            otherlv_3=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getErrorModelDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:1300:3: ( (lv_emodelElements_4_0= ruleErrorModelElement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=28 && LA12_0<=30)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDepModel.g:1301:4: (lv_emodelElements_4_0= ruleErrorModelElement )
            	    {
            	    // InternalDepModel.g:1301:4: (lv_emodelElements_4_0= ruleErrorModelElement )
            	    // InternalDepModel.g:1302:5: lv_emodelElements_4_0= ruleErrorModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getErrorModelDecAccess().getEmodelElementsErrorModelElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
    // InternalDepModel.g:1327:1: entryRuleErrorModelElement returns [EObject current=null] : iv_ruleErrorModelElement= ruleErrorModelElement EOF ;
    public final EObject entryRuleErrorModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModelElement = null;


        try {
            // InternalDepModel.g:1327:58: (iv_ruleErrorModelElement= ruleErrorModelElement EOF )
            // InternalDepModel.g:1328:2: iv_ruleErrorModelElement= ruleErrorModelElement EOF
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
    // InternalDepModel.g:1334:1: ruleErrorModelElement returns [EObject current=null] : (this_State_0= ruleState | this_TransitionDec_1= ruleTransitionDec ) ;
    public final EObject ruleErrorModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_TransitionDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1340:2: ( (this_State_0= ruleState | this_TransitionDec_1= ruleTransitionDec ) )
            // InternalDepModel.g:1341:2: (this_State_0= ruleState | this_TransitionDec_1= ruleTransitionDec )
            {
            // InternalDepModel.g:1341:2: (this_State_0= ruleState | this_TransitionDec_1= ruleTransitionDec )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                alt13=1;
            }
            else if ( (LA13_0==30) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDepModel.g:1342:3: this_State_0= ruleState
                    {

                    			newCompositeNode(grammarAccess.getErrorModelElementAccess().getStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_0=ruleState();

                    state._fsp--;


                    			current = this_State_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDepModel.g:1351:3: this_TransitionDec_1= ruleTransitionDec
                    {

                    			newCompositeNode(grammarAccess.getErrorModelElementAccess().getTransitionDecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TransitionDec_1=ruleTransitionDec();

                    state._fsp--;


                    			current = this_TransitionDec_1;
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


    // $ANTLR start "entryRuleState"
    // InternalDepModel.g:1363:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalDepModel.g:1363:46: (iv_ruleState= ruleState EOF )
            // InternalDepModel.g:1364:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalDepModel.g:1370:1: ruleState returns [EObject current=null] : ( (otherlv_0= 'initial' )? otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1376:2: ( ( (otherlv_0= 'initial' )? otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) ) )
            // InternalDepModel.g:1377:2: ( (otherlv_0= 'initial' )? otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) )
            {
            // InternalDepModel.g:1377:2: ( (otherlv_0= 'initial' )? otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) ) )
            // InternalDepModel.g:1378:3: (otherlv_0= 'initial' )? otherlv_1= 'state' ( (lv_name_2_0= ruleQualifiedName ) )
            {
            // InternalDepModel.g:1378:3: (otherlv_0= 'initial' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDepModel.g:1379:4: otherlv_0= 'initial'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getStateAccess().getInitialKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalDepModel.g:1388:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1389:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1389:4: (lv_name_2_0= ruleQualifiedName )
            // InternalDepModel.g:1390:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransitionDec"
    // InternalDepModel.g:1411:1: entryRuleTransitionDec returns [EObject current=null] : iv_ruleTransitionDec= ruleTransitionDec EOF ;
    public final EObject entryRuleTransitionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDec = null;


        try {
            // InternalDepModel.g:1411:54: (iv_ruleTransitionDec= ruleTransitionDec EOF )
            // InternalDepModel.g:1412:2: iv_ruleTransitionDec= ruleTransitionDec EOF
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
    // InternalDepModel.g:1418:1: ruleTransitionDec returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_transFeatures_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransitionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_transFeatures_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1424:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_transFeatures_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) )
            // InternalDepModel.g:1425:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_transFeatures_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            {
            // InternalDepModel.g:1425:2: (otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_transFeatures_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            // InternalDepModel.g:1426:3: otherlv_0= 'transition' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_transFeatures_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDecAccess().getTransitionKeyword_0());
            		
            // InternalDepModel.g:1430:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:1431:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1431:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDepModel.g:1432:5: lv_name_1_0= ruleQualifiedName
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

            otherlv_2=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDepModel.g:1453:3: ( (lv_transFeatures_3_0= ruleTransitionFeatureDec ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=32)||(LA15_0>=34 && LA15_0<=35)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDepModel.g:1454:4: (lv_transFeatures_3_0= ruleTransitionFeatureDec )
            	    {
            	    // InternalDepModel.g:1454:4: (lv_transFeatures_3_0= ruleTransitionFeatureDec )
            	    // InternalDepModel.g:1455:5: lv_transFeatures_3_0= ruleTransitionFeatureDec
            	    {

            	    					newCompositeNode(grammarAccess.getTransitionDecAccess().getTransFeaturesTransitionFeatureDecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_transFeatures_3_0=ruleTransitionFeatureDec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransitionDecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transFeatures",
            	    						lv_transFeatures_3_0,
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
    // InternalDepModel.g:1480:1: entryRuleTransitionFeatureDec returns [EObject current=null] : iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF ;
    public final EObject entryRuleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFeatureDec = null;


        try {
            // InternalDepModel.g:1480:61: (iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF )
            // InternalDepModel.g:1481:2: iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF
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
    // InternalDepModel.g:1487:1: ruleTransitionFeatureDec returns [EObject current=null] : (this_TransitionState_0= ruleTransitionState | this_Trigger_1= ruleTrigger | this_Action_2= ruleAction | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) ;
    public final EObject ruleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TransitionState_0 = null;

        EObject this_Trigger_1 = null;

        EObject this_Action_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1493:2: ( (this_TransitionState_0= ruleTransitionState | this_Trigger_1= ruleTrigger | this_Action_2= ruleAction | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) )
            // InternalDepModel.g:1494:2: (this_TransitionState_0= ruleTransitionState | this_Trigger_1= ruleTrigger | this_Action_2= ruleAction | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            {
            // InternalDepModel.g:1494:2: (this_TransitionState_0= ruleTransitionState | this_Trigger_1= ruleTrigger | this_Action_2= ruleAction | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 31:
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
                    // InternalDepModel.g:1495:3: this_TransitionState_0= ruleTransitionState
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
                    // InternalDepModel.g:1504:3: this_Trigger_1= ruleTrigger
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getTriggerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Trigger_1=ruleTrigger();

                    state._fsp--;


                    			current = this_Trigger_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDepModel.g:1513:3: this_Action_2= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getTransitionFeatureDecAccess().getActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_2=ruleAction();

                    state._fsp--;


                    			current = this_Action_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDepModel.g:1522:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    {
                    // InternalDepModel.g:1522:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    // InternalDepModel.g:1523:4: otherlv_3= 'occurrence' () ruleDOUBLE
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionFeatureDecAccess().getOccurrenceKeyword_3_0());
                    			
                    // InternalDepModel.g:1527:4: ()
                    // InternalDepModel.g:1528:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTransitionFeatureDecAccess().getOccurrenceAction_3_1(),
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
    // InternalDepModel.g:1546:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalDepModel.g:1546:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalDepModel.g:1547:2: iv_ruleTransitionState= ruleTransitionState EOF
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
    // InternalDepModel.g:1553:1: ruleTransitionState returns [EObject current=null] : (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDepModel.g:1559:2: ( (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:1560:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:1560:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:1561:3: otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getStatesKeyword_0());
            		
            // InternalDepModel.g:1565:3: ( (otherlv_1= RULE_ID ) )
            // InternalDepModel.g:1566:4: (otherlv_1= RULE_ID )
            {
            // InternalDepModel.g:1566:4: (otherlv_1= RULE_ID )
            // InternalDepModel.g:1567:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionStateAccess().getSourceStateStateCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalDepModel.g:1582:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1583:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1583:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1584:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionStateAccess().getTargetStateStateCrossReference_3_0());
            				

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


    // $ANTLR start "entryRuleTrigger"
    // InternalDepModel.g:1599:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalDepModel.g:1599:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalDepModel.g:1600:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalDepModel.g:1606:1: ruleTrigger returns [EObject current=null] : (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDepModel.g:1612:2: ( (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:1613:2: (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:1613:2: (otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:1614:3: otherlv_0= 'trigger' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getTriggerKeyword_0());
            		
            // InternalDepModel.g:1618:3: ( (otherlv_1= RULE_ID ) )
            // InternalDepModel.g:1619:4: (otherlv_1= RULE_ID )
            {
            // InternalDepModel.g:1619:4: (otherlv_1= RULE_ID )
            // InternalDepModel.g:1620:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getPortInstancePortInCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTriggerAccess().getFullStopKeyword_2());
            		
            // InternalDepModel.g:1635:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1636:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1636:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1637:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getErrorModeErrorModesCrossReference_3_0());
            				

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleAction"
    // InternalDepModel.g:1652:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalDepModel.g:1652:47: (iv_ruleAction= ruleAction EOF )
            // InternalDepModel.g:1653:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalDepModel.g:1659:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDepModel.g:1665:2: ( (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:1666:2: (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:1666:2: (otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:1667:3: otherlv_0= 'action' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalDepModel.g:1671:3: ( (otherlv_1= RULE_ID ) )
            // InternalDepModel.g:1672:4: (otherlv_1= RULE_ID )
            {
            // InternalDepModel.g:1672:4: (otherlv_1= RULE_ID )
            // InternalDepModel.g:1673:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getPortInstancePortOutCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getFullStopKeyword_2());
            		
            // InternalDepModel.g:1688:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1689:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1689:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1690:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getActionAccess().getErrorModeErrorModesCrossReference_3_0());
            				

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalDepModel.g:1705:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalDepModel.g:1705:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalDepModel.g:1706:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalDepModel.g:1712:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDepModel.g:1718:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDepModel.g:1719:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDepModel.g:1719:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDepModel.g:1720:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_15); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002441002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002448000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000019000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000070008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000D80008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});

}