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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'port'", "'type'", "'{'", "'}'", "'system'", "'connection'", "'from'", "'to'", "'declaration'", "'in'", "'out'", "'component'", "'implementation'", "':'", "'instance'", "'error'", "'model'", "'state'", "'transition'", "'occurrence'", "'states'", "'->'", "'trigger'", "'action'"
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

                if ( (LA1_0==12||LA1_0==16) ) {
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

            if ( (LA3_0==16) ) {
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
    // InternalDepModel.g:183:1: rulePortType returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'type' ( (lv_PortName_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject rulePortType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_PortName_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:189:2: ( (otherlv_0= 'port' otherlv_1= 'type' ( (lv_PortName_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // InternalDepModel.g:190:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_PortName_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // InternalDepModel.g:190:2: (otherlv_0= 'port' otherlv_1= 'type' ( (lv_PortName_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= '}' )
            // InternalDepModel.g:191:3: otherlv_0= 'port' otherlv_1= 'type' ( (lv_PortName_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getPortTypeAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPortTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:199:3: ( (lv_PortName_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:200:4: (lv_PortName_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:200:4: (lv_PortName_2_0= ruleQualifiedName )
            // InternalDepModel.g:201:5: lv_PortName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortTypeAccess().getPortNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_PortName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortTypeRule());
            					}
            					set(
            						current,
            						"PortName",
            						lv_PortName_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPortTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPortTypeAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleComponentModelDec"
    // InternalDepModel.g:230:1: entryRuleComponentModelDec returns [EObject current=null] : iv_ruleComponentModelDec= ruleComponentModelDec EOF ;
    public final EObject entryRuleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentModelDec = null;


        try {
            // InternalDepModel.g:230:58: (iv_ruleComponentModelDec= ruleComponentModelDec EOF )
            // InternalDepModel.g:231:2: iv_ruleComponentModelDec= ruleComponentModelDec EOF
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
    // InternalDepModel.g:237:1: ruleComponentModelDec returns [EObject current=null] : (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) ;
    public final EObject ruleComponentModelDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemConnDec_0 = null;

        EObject this_SystemDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:243:2: ( (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec ) )
            // InternalDepModel.g:244:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            {
            // InternalDepModel.g:244:2: (this_SystemConnDec_0= ruleSystemConnDec | this_SystemDec_1= ruleSystemDec )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=1;
                }
                else if ( (LA4_1==20) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDepModel.g:245:3: this_SystemConnDec_0= ruleSystemConnDec
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
                    // InternalDepModel.g:254:3: this_SystemDec_1= ruleSystemDec
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
    // InternalDepModel.g:266:1: entryRuleSystemConnDec returns [EObject current=null] : iv_ruleSystemConnDec= ruleSystemConnDec EOF ;
    public final EObject entryRuleSystemConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConnDec = null;


        try {
            // InternalDepModel.g:266:54: (iv_ruleSystemConnDec= ruleSystemConnDec EOF )
            // InternalDepModel.g:267:2: iv_ruleSystemConnDec= ruleSystemConnDec EOF
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
    // InternalDepModel.g:273:1: ruleSystemConnDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_SysConnName_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
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
        AntlrDatatypeRuleToken lv_SysConnName_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:279:2: ( (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_SysConnName_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalDepModel.g:280:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_SysConnName_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalDepModel.g:280:2: (otherlv_0= 'system' otherlv_1= 'connection' ( (lv_SysConnName_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalDepModel.g:281:3: otherlv_0= 'system' otherlv_1= 'connection' ( (lv_SysConnName_2_0= ruleQualifiedName ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemConnDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemConnDecAccess().getConnectionKeyword_1());
            		
            // InternalDepModel.g:289:3: ( (lv_SysConnName_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:290:4: (lv_SysConnName_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:290:4: (lv_SysConnName_2_0= ruleQualifiedName )
            // InternalDepModel.g:291:5: lv_SysConnName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemConnDecAccess().getSysConnNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_SysConnName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemConnDecRule());
            					}
            					set(
            						current,
            						"SysConnName",
            						lv_SysConnName_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemConnDecAccess().getFromKeyword_3());
            		
            // InternalDepModel.g:312:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:313:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:313:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:314:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getSystemConnDecAccess().getSourceSystemSystemDecCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_5());
            		
            // InternalDepModel.g:329:3: ( (otherlv_6= RULE_ID ) )
            // InternalDepModel.g:330:4: (otherlv_6= RULE_ID )
            {
            // InternalDepModel.g:330:4: (otherlv_6= RULE_ID )
            // InternalDepModel.g:331:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_6, grammarAccess.getSystemConnDecAccess().getSourcePortSystemPortDecCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getSystemConnDecAccess().getToKeyword_7());
            		
            // InternalDepModel.g:346:3: ( (otherlv_8= RULE_ID ) )
            // InternalDepModel.g:347:4: (otherlv_8= RULE_ID )
            {
            // InternalDepModel.g:347:4: (otherlv_8= RULE_ID )
            // InternalDepModel.g:348:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getSystemConnDecAccess().getTargetSystemSystemDecCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemConnDecAccess().getFullStopKeyword_9());
            		
            // InternalDepModel.g:363:3: ( (otherlv_10= RULE_ID ) )
            // InternalDepModel.g:364:4: (otherlv_10= RULE_ID )
            {
            // InternalDepModel.g:364:4: (otherlv_10= RULE_ID )
            // InternalDepModel.g:365:5: otherlv_10= RULE_ID
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
    // InternalDepModel.g:380:1: entryRuleSystemDec returns [EObject current=null] : iv_ruleSystemDec= ruleSystemDec EOF ;
    public final EObject entryRuleSystemDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDec = null;


        try {
            // InternalDepModel.g:380:50: (iv_ruleSystemDec= ruleSystemDec EOF )
            // InternalDepModel.g:381:2: iv_ruleSystemDec= ruleSystemDec EOF
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
    // InternalDepModel.g:387:1: ruleSystemDec returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_SysName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_SysName_2_0 = null;

        EObject lv_sysFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:393:2: ( (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_SysName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:394:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_SysName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:394:2: (otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_SysName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}' )
            // InternalDepModel.g:395:3: otherlv_0= 'system' otherlv_1= 'declaration' ( (lv_SysName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemDecAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemDecAccess().getDeclarationKeyword_1());
            		
            // InternalDepModel.g:403:3: ( (lv_SysName_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:404:4: (lv_SysName_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:404:4: (lv_SysName_2_0= ruleQualifiedName )
            // InternalDepModel.g:405:5: lv_SysName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemDecAccess().getSysNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_SysName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemDecRule());
            					}
            					set(
            						current,
            						"SysName",
            						lv_SysName_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSystemDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:426:3: ( (lv_sysFeatures_4_0= ruleSysFeaturesDec ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDepModel.g:427:4: (lv_sysFeatures_4_0= ruleSysFeaturesDec )
            	    {
            	    // InternalDepModel.g:427:4: (lv_sysFeatures_4_0= ruleSysFeaturesDec )
            	    // InternalDepModel.g:428:5: lv_sysFeatures_4_0= ruleSysFeaturesDec
            	    {

            	    					newCompositeNode(grammarAccess.getSystemDecAccess().getSysFeaturesSysFeaturesDecParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    break loop5;
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
    // InternalDepModel.g:453:1: entryRuleSysFeaturesDec returns [EObject current=null] : iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF ;
    public final EObject entryRuleSysFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSysFeaturesDec = null;


        try {
            // InternalDepModel.g:453:55: (iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF )
            // InternalDepModel.g:454:2: iv_ruleSysFeaturesDec= ruleSysFeaturesDec EOF
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
    // InternalDepModel.g:460:1: ruleSysFeaturesDec returns [EObject current=null] : (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl ) ;
    public final EObject ruleSysFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortDec_0 = null;

        EObject this_ComponentConnDec_1 = null;

        EObject this_ComponentType_2 = null;

        EObject this_ComponentImpl_3 = null;



        	enterRule();

        try {
            // InternalDepModel.g:466:2: ( (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl ) )
            // InternalDepModel.g:467:2: (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl )
            {
            // InternalDepModel.g:467:2: (this_SystemPortDec_0= ruleSystemPortDec | this_ComponentConnDec_1= ruleComponentConnDec | this_ComponentType_2= ruleComponentType | this_ComponentImpl_3= ruleComponentImpl )
            int alt6=4;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt6=4;
                    }
                    break;
                case 13:
                    {
                    alt6=3;
                    }
                    break;
                case 17:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDepModel.g:468:3: this_SystemPortDec_0= ruleSystemPortDec
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
                    // InternalDepModel.g:477:3: this_ComponentConnDec_1= ruleComponentConnDec
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
                    // InternalDepModel.g:486:3: this_ComponentType_2= ruleComponentType
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
                    // InternalDepModel.g:495:3: this_ComponentImpl_3= ruleComponentImpl
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
    // InternalDepModel.g:507:1: entryRuleSystemPortDec returns [EObject current=null] : iv_ruleSystemPortDec= ruleSystemPortDec EOF ;
    public final EObject entryRuleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortDec = null;


        try {
            // InternalDepModel.g:507:54: (iv_ruleSystemPortDec= ruleSystemPortDec EOF )
            // InternalDepModel.g:508:2: iv_ruleSystemPortDec= ruleSystemPortDec EOF
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
    // InternalDepModel.g:514:1: ruleSystemPortDec returns [EObject current=null] : (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) ;
    public final EObject ruleSystemPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_SystemPortIn_0 = null;

        EObject this_SystemPortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:520:2: ( (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut ) )
            // InternalDepModel.g:521:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            {
            // InternalDepModel.g:521:2: (this_SystemPortIn_0= ruleSystemPortIn | this_SystemPortOut_1= ruleSystemPortOut )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==12) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==21) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==22) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

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
                    // InternalDepModel.g:522:3: this_SystemPortIn_0= ruleSystemPortIn
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
                    // InternalDepModel.g:531:3: this_SystemPortOut_1= ruleSystemPortOut
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
    // InternalDepModel.g:543:1: entryRuleSystemPortIn returns [EObject current=null] : iv_ruleSystemPortIn= ruleSystemPortIn EOF ;
    public final EObject entryRuleSystemPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortIn = null;


        try {
            // InternalDepModel.g:543:53: (iv_ruleSystemPortIn= ruleSystemPortIn EOF )
            // InternalDepModel.g:544:2: iv_ruleSystemPortIn= ruleSystemPortIn EOF
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
    // InternalDepModel.g:550:1: ruleSystemPortIn returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_SysPortInName_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_SysPortInName_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:556:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_SysPortInName_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:557:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_SysPortInName_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:557:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_SysPortInName_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:558:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'in' ( (lv_SysPortInName_3_0= ruleQualifiedName ) ) otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortInAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortInAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortInAccess().getInKeyword_2());
            		
            // InternalDepModel.g:570:3: ( (lv_SysPortInName_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:571:4: (lv_SysPortInName_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:571:4: (lv_SysPortInName_3_0= ruleQualifiedName )
            // InternalDepModel.g:572:5: lv_SysPortInName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortInAccess().getSysPortInNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_SysPortInName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortInRule());
            					}
            					set(
            						current,
            						"SysPortInName",
            						lv_SysPortInName_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortInAccess().getToKeyword_4());
            		
            // InternalDepModel.g:593:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:594:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:594:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:595:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortInRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortInAccess().getInCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortInAccess().getFullStopKeyword_6());
            		
            // InternalDepModel.g:610:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:611:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:611:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:612:5: otherlv_7= RULE_ID
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
    // InternalDepModel.g:627:1: entryRuleSystemPortOut returns [EObject current=null] : iv_ruleSystemPortOut= ruleSystemPortOut EOF ;
    public final EObject entryRuleSystemPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPortOut = null;


        try {
            // InternalDepModel.g:627:54: (iv_ruleSystemPortOut= ruleSystemPortOut EOF )
            // InternalDepModel.g:628:2: iv_ruleSystemPortOut= ruleSystemPortOut EOF
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
    // InternalDepModel.g:634:1: ruleSystemPortOut returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_SysPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) ;
    public final EObject ruleSystemPortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_SysPortOutName_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:640:2: ( (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_SysPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) ) )
            // InternalDepModel.g:641:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_SysPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalDepModel.g:641:2: (otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_SysPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) )
            // InternalDepModel.g:642:3: otherlv_0= 'system' otherlv_1= 'port' otherlv_2= 'out' ( (lv_SysPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= 'from' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPortOutAccess().getSystemKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemPortOutAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemPortOutAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:654:3: ( (lv_SysPortOutName_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:655:4: (lv_SysPortOutName_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:655:4: (lv_SysPortOutName_3_0= ruleQualifiedName )
            // InternalDepModel.g:656:5: lv_SysPortOutName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSystemPortOutAccess().getSysPortOutNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_SysPortOutName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSystemPortOutRule());
            					}
            					set(
            						current,
            						"SysPortOutName",
            						lv_SysPortOutName_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSystemPortOutAccess().getFromKeyword_4());
            		
            // InternalDepModel.g:677:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:678:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:678:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:679:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPortOutRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_5, grammarAccess.getSystemPortOutAccess().getOutCompComponentImplCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getSystemPortOutAccess().getFullStopKeyword_6());
            		
            // InternalDepModel.g:694:3: ( (otherlv_7= RULE_ID ) )
            // InternalDepModel.g:695:4: (otherlv_7= RULE_ID )
            {
            // InternalDepModel.g:695:4: (otherlv_7= RULE_ID )
            // InternalDepModel.g:696:5: otherlv_7= RULE_ID
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
    // InternalDepModel.g:711:1: entryRuleComponentConnDec returns [EObject current=null] : iv_ruleComponentConnDec= ruleComponentConnDec EOF ;
    public final EObject entryRuleComponentConnDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentConnDec = null;


        try {
            // InternalDepModel.g:711:57: (iv_ruleComponentConnDec= ruleComponentConnDec EOF )
            // InternalDepModel.g:712:2: iv_ruleComponentConnDec= ruleComponentConnDec EOF
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
    // InternalDepModel.g:718:1: ruleComponentConnDec returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_CompConnName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) ;
    public final EObject ruleComponentConnDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_CompConnName_2_0=null;
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
            // InternalDepModel.g:724:2: ( (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_CompConnName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) ) )
            // InternalDepModel.g:725:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_CompConnName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            {
            // InternalDepModel.g:725:2: (otherlv_0= 'component' otherlv_1= 'connection' ( (lv_CompConnName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) ) )
            // InternalDepModel.g:726:3: otherlv_0= 'component' otherlv_1= 'connection' ( (lv_CompConnName_2_0= RULE_ID ) ) otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= '.' ( (otherlv_10= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentConnDecAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentConnDecAccess().getConnectionKeyword_1());
            		
            // InternalDepModel.g:734:3: ( (lv_CompConnName_2_0= RULE_ID ) )
            // InternalDepModel.g:735:4: (lv_CompConnName_2_0= RULE_ID )
            {
            // InternalDepModel.g:735:4: (lv_CompConnName_2_0= RULE_ID )
            // InternalDepModel.g:736:5: lv_CompConnName_2_0= RULE_ID
            {
            lv_CompConnName_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_CompConnName_2_0, grammarAccess.getComponentConnDecAccess().getCompConnNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            					setWithLastConsumed(
            						current,
            						"CompConnName",
            						lv_CompConnName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentConnDecAccess().getFromKeyword_3());
            		
            // InternalDepModel.g:756:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:757:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:757:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:758:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_4, grammarAccess.getComponentConnDecAccess().getSourceCompComponentImplCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentConnDecAccess().getFullStopKeyword_5());
            		
            // InternalDepModel.g:773:3: ( (otherlv_6= RULE_ID ) )
            // InternalDepModel.g:774:4: (otherlv_6= RULE_ID )
            {
            // InternalDepModel.g:774:4: (otherlv_6= RULE_ID )
            // InternalDepModel.g:775:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_6, grammarAccess.getComponentConnDecAccess().getSourcePortPortOutCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentConnDecAccess().getToKeyword_7());
            		
            // InternalDepModel.g:790:3: ( (otherlv_8= RULE_ID ) )
            // InternalDepModel.g:791:4: (otherlv_8= RULE_ID )
            {
            // InternalDepModel.g:791:4: (otherlv_8= RULE_ID )
            // InternalDepModel.g:792:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentConnDecRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getComponentConnDecAccess().getTargetCompComponentImplCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentConnDecAccess().getFullStopKeyword_9());
            		
            // InternalDepModel.g:807:3: ( (otherlv_10= RULE_ID ) )
            // InternalDepModel.g:808:4: (otherlv_10= RULE_ID )
            {
            // InternalDepModel.g:808:4: (otherlv_10= RULE_ID )
            // InternalDepModel.g:809:5: otherlv_10= RULE_ID
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
    // InternalDepModel.g:824:1: entryRuleComponentImpl returns [EObject current=null] : iv_ruleComponentImpl= ruleComponentImpl EOF ;
    public final EObject entryRuleComponentImpl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentImpl = null;


        try {
            // InternalDepModel.g:824:54: (iv_ruleComponentImpl= ruleComponentImpl EOF )
            // InternalDepModel.g:825:2: iv_ruleComponentImpl= ruleComponentImpl EOF
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
    // InternalDepModel.g:831:1: ruleComponentImpl returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_CompImplName_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleComponentImpl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_CompImplName_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:837:2: ( (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_CompImplName_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalDepModel.g:838:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_CompImplName_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalDepModel.g:838:2: (otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_CompImplName_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // InternalDepModel.g:839:3: otherlv_0= 'component' otherlv_1= 'implementation' ( (lv_CompImplName_2_0= ruleQualifiedName ) ) otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentImplAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentImplAccess().getImplementationKeyword_1());
            		
            // InternalDepModel.g:847:3: ( (lv_CompImplName_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:848:4: (lv_CompImplName_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:848:4: (lv_CompImplName_2_0= ruleQualifiedName )
            // InternalDepModel.g:849:5: lv_CompImplName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentImplAccess().getCompImplNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_CompImplName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentImplRule());
            					}
            					set(
            						current,
            						"CompImplName",
            						lv_CompImplName_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentImplAccess().getColonKeyword_3());
            		
            // InternalDepModel.g:870:3: ( (otherlv_4= RULE_ID ) )
            // InternalDepModel.g:871:4: (otherlv_4= RULE_ID )
            {
            // InternalDepModel.g:871:4: (otherlv_4= RULE_ID )
            // InternalDepModel.g:872:5: otherlv_4= RULE_ID
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
    // InternalDepModel.g:887:1: entryRuleComponentType returns [EObject current=null] : iv_ruleComponentType= ruleComponentType EOF ;
    public final EObject entryRuleComponentType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentType = null;


        try {
            // InternalDepModel.g:887:54: (iv_ruleComponentType= ruleComponentType EOF )
            // InternalDepModel.g:888:2: iv_ruleComponentType= ruleComponentType EOF
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
    // InternalDepModel.g:894:1: ruleComponentType returns [EObject current=null] : (otherlv_0= 'component' otherlv_1= 'type' ( (lv_CompTypeName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' ) ;
    public final EObject ruleComponentType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_CompTypeName_2_0 = null;

        EObject lv_componentFeatures_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:900:2: ( (otherlv_0= 'component' otherlv_1= 'type' ( (lv_CompTypeName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:901:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_CompTypeName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:901:2: (otherlv_0= 'component' otherlv_1= 'type' ( (lv_CompTypeName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}' )
            // InternalDepModel.g:902:3: otherlv_0= 'component' otherlv_1= 'type' ( (lv_CompTypeName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentTypeAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentTypeAccess().getTypeKeyword_1());
            		
            // InternalDepModel.g:910:3: ( (lv_CompTypeName_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:911:4: (lv_CompTypeName_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:911:4: (lv_CompTypeName_2_0= ruleQualifiedName )
            // InternalDepModel.g:912:5: lv_CompTypeName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getComponentTypeAccess().getCompTypeNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_CompTypeName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentTypeRule());
            					}
            					set(
            						current,
            						"CompTypeName",
            						lv_CompTypeName_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentTypeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:933:3: ( (lv_componentFeatures_4_0= ruleComponentFeaturesDec ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDepModel.g:934:4: (lv_componentFeatures_4_0= ruleComponentFeaturesDec )
            	    {
            	    // InternalDepModel.g:934:4: (lv_componentFeatures_4_0= ruleComponentFeaturesDec )
            	    // InternalDepModel.g:935:5: lv_componentFeatures_4_0= ruleComponentFeaturesDec
            	    {

            	    					newCompositeNode(grammarAccess.getComponentTypeAccess().getComponentFeaturesComponentFeaturesDecParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    break loop8;
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
    // InternalDepModel.g:960:1: entryRuleComponentFeaturesDec returns [EObject current=null] : iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF ;
    public final EObject entryRuleComponentFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentFeaturesDec = null;


        try {
            // InternalDepModel.g:960:61: (iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF )
            // InternalDepModel.g:961:2: iv_ruleComponentFeaturesDec= ruleComponentFeaturesDec EOF
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
    // InternalDepModel.g:967:1: ruleComponentFeaturesDec returns [EObject current=null] : (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec ) ;
    public final EObject ruleComponentFeaturesDec() throws RecognitionException {
        EObject current = null;

        EObject this_PortDec_0 = null;

        EObject this_ErrorModelDec_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:973:2: ( (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec ) )
            // InternalDepModel.g:974:2: (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec )
            {
            // InternalDepModel.g:974:2: (this_PortDec_0= rulePortDec | this_ErrorModelDec_1= ruleErrorModelDec )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDepModel.g:975:3: this_PortDec_0= rulePortDec
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
                    // InternalDepModel.g:984:3: this_ErrorModelDec_1= ruleErrorModelDec
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
    // InternalDepModel.g:996:1: entryRulePortDec returns [EObject current=null] : iv_rulePortDec= rulePortDec EOF ;
    public final EObject entryRulePortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortDec = null;


        try {
            // InternalDepModel.g:996:48: (iv_rulePortDec= rulePortDec EOF )
            // InternalDepModel.g:997:2: iv_rulePortDec= rulePortDec EOF
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
    // InternalDepModel.g:1003:1: rulePortDec returns [EObject current=null] : (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) ;
    public final EObject rulePortDec() throws RecognitionException {
        EObject current = null;

        EObject this_PortIn_0 = null;

        EObject this_PortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1009:2: ( (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut ) )
            // InternalDepModel.g:1010:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            {
            // InternalDepModel.g:1010:2: (this_PortIn_0= rulePortIn | this_PortOut_1= rulePortOut )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==26) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==22) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==21) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDepModel.g:1011:3: this_PortIn_0= rulePortIn
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
                    // InternalDepModel.g:1020:3: this_PortOut_1= rulePortOut
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
    // InternalDepModel.g:1032:1: entryRulePortIn returns [EObject current=null] : iv_rulePortIn= rulePortIn EOF ;
    public final EObject entryRulePortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortIn = null;


        try {
            // InternalDepModel.g:1032:47: (iv_rulePortIn= rulePortIn EOF )
            // InternalDepModel.g:1033:2: iv_rulePortIn= rulePortIn EOF
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
    // InternalDepModel.g:1039:1: rulePortIn returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_PortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject rulePortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_PortInName_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1045:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_PortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1046:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_PortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1046:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_PortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1047:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'in' ( (lv_PortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getPortInAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPortInAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPortInAccess().getInKeyword_2());
            		
            // InternalDepModel.g:1059:3: ( (lv_PortInName_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1060:4: (lv_PortInName_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1060:4: (lv_PortInName_3_0= ruleQualifiedName )
            // InternalDepModel.g:1061:5: lv_PortInName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortInAccess().getPortInNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_PortInName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortInRule());
            					}
            					set(
            						current,
            						"PortInName",
            						lv_PortInName_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getPortInAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1082:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1083:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1083:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1084:5: otherlv_5= RULE_ID
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
    // InternalDepModel.g:1099:1: entryRulePortOut returns [EObject current=null] : iv_rulePortOut= rulePortOut EOF ;
    public final EObject entryRulePortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortOut = null;


        try {
            // InternalDepModel.g:1099:48: (iv_rulePortOut= rulePortOut EOF )
            // InternalDepModel.g:1100:2: iv_rulePortOut= rulePortOut EOF
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
    // InternalDepModel.g:1106:1: rulePortOut returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_PortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject rulePortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_PortOutName_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1112:2: ( (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_PortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1113:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_PortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1113:2: (otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_PortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1114:3: otherlv_0= 'port' otherlv_1= 'instance' otherlv_2= 'out' ( (lv_PortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getPortOutAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getPortOutAccess().getInstanceKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPortOutAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:1126:3: ( (lv_PortOutName_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1127:4: (lv_PortOutName_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1127:4: (lv_PortOutName_3_0= ruleQualifiedName )
            // InternalDepModel.g:1128:5: lv_PortOutName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPortOutAccess().getPortOutNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_PortOutName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortOutRule());
            					}
            					set(
            						current,
            						"PortOutName",
            						lv_PortOutName_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getPortOutAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1149:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1150:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1150:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1151:5: otherlv_5= RULE_ID
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
    // InternalDepModel.g:1166:1: entryRuleErrorModelDec returns [EObject current=null] : iv_ruleErrorModelDec= ruleErrorModelDec EOF ;
    public final EObject entryRuleErrorModelDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModelDec = null;


        try {
            // InternalDepModel.g:1166:54: (iv_ruleErrorModelDec= ruleErrorModelDec EOF )
            // InternalDepModel.g:1167:2: iv_ruleErrorModelDec= ruleErrorModelDec EOF
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
    // InternalDepModel.g:1173:1: ruleErrorModelDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'model' ( (lv_ErrorModelName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleErrorModelDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ErrorModelName_2_0 = null;

        EObject lv_emodelElements_4_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1179:2: ( (otherlv_0= 'error' otherlv_1= 'model' ( (lv_ErrorModelName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' ) )
            // InternalDepModel.g:1180:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_ErrorModelName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' )
            {
            // InternalDepModel.g:1180:2: (otherlv_0= 'error' otherlv_1= 'model' ( (lv_ErrorModelName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}' )
            // InternalDepModel.g:1181:3: otherlv_0= 'error' otherlv_1= 'model' ( (lv_ErrorModelName_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_emodelElements_4_0= ruleErrorModelElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorModelDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorModelDecAccess().getModelKeyword_1());
            		
            // InternalDepModel.g:1189:3: ( (lv_ErrorModelName_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1190:4: (lv_ErrorModelName_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1190:4: (lv_ErrorModelName_2_0= ruleQualifiedName )
            // InternalDepModel.g:1191:5: lv_ErrorModelName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorModelDecAccess().getErrorModelNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_ErrorModelName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorModelDecRule());
            					}
            					set(
            						current,
            						"ErrorModelName",
            						lv_ErrorModelName_2_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getErrorModelDecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDepModel.g:1212:3: ( (lv_emodelElements_4_0= ruleErrorModelElement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27||LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDepModel.g:1213:4: (lv_emodelElements_4_0= ruleErrorModelElement )
            	    {
            	    // InternalDepModel.g:1213:4: (lv_emodelElements_4_0= ruleErrorModelElement )
            	    // InternalDepModel.g:1214:5: lv_emodelElements_4_0= ruleErrorModelElement
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
            	    break loop11;
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
    // InternalDepModel.g:1239:1: entryRuleErrorModelElement returns [EObject current=null] : iv_ruleErrorModelElement= ruleErrorModelElement EOF ;
    public final EObject entryRuleErrorModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorModelElement = null;


        try {
            // InternalDepModel.g:1239:58: (iv_ruleErrorModelElement= ruleErrorModelElement EOF )
            // InternalDepModel.g:1240:2: iv_ruleErrorModelElement= ruleErrorModelElement EOF
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
    // InternalDepModel.g:1246:1: ruleErrorModelElement returns [EObject current=null] : (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec ) ;
    public final EObject ruleErrorModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_StateDec_0 = null;

        EObject this_TransitionDec_1 = null;

        EObject this_ErrorPortDec_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1252:2: ( (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec ) )
            // InternalDepModel.g:1253:2: (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec )
            {
            // InternalDepModel.g:1253:2: (this_StateDec_0= ruleStateDec | this_TransitionDec_1= ruleTransitionDec | this_ErrorPortDec_2= ruleErrorPortDec )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==12) ) {
                    alt12=3;
                }
                else if ( (LA12_1==29) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDepModel.g:1254:3: this_StateDec_0= ruleStateDec
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
                    // InternalDepModel.g:1263:3: this_TransitionDec_1= ruleTransitionDec
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
                    // InternalDepModel.g:1272:3: this_ErrorPortDec_2= ruleErrorPortDec
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
    // InternalDepModel.g:1284:1: entryRuleErrorPortDec returns [EObject current=null] : iv_ruleErrorPortDec= ruleErrorPortDec EOF ;
    public final EObject entryRuleErrorPortDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPortDec = null;


        try {
            // InternalDepModel.g:1284:53: (iv_ruleErrorPortDec= ruleErrorPortDec EOF )
            // InternalDepModel.g:1285:2: iv_ruleErrorPortDec= ruleErrorPortDec EOF
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
    // InternalDepModel.g:1291:1: ruleErrorPortDec returns [EObject current=null] : (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut ) ;
    public final EObject ruleErrorPortDec() throws RecognitionException {
        EObject current = null;

        EObject this_ErrorPortIn_0 = null;

        EObject this_ErrorPortOut_1 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1297:2: ( (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut ) )
            // InternalDepModel.g:1298:2: (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut )
            {
            // InternalDepModel.g:1298:2: (this_ErrorPortIn_0= ruleErrorPortIn | this_ErrorPortOut_1= ruleErrorPortOut )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==12) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==22) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==21) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDepModel.g:1299:3: this_ErrorPortIn_0= ruleErrorPortIn
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
                    // InternalDepModel.g:1308:3: this_ErrorPortOut_1= ruleErrorPortOut
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
    // InternalDepModel.g:1320:1: entryRuleErrorPortIn returns [EObject current=null] : iv_ruleErrorPortIn= ruleErrorPortIn EOF ;
    public final EObject entryRuleErrorPortIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPortIn = null;


        try {
            // InternalDepModel.g:1320:52: (iv_ruleErrorPortIn= ruleErrorPortIn EOF )
            // InternalDepModel.g:1321:2: iv_ruleErrorPortIn= ruleErrorPortIn EOF
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
    // InternalDepModel.g:1327:1: ruleErrorPortIn returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_ErrorPortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleErrorPortIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ErrorPortInName_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1333:2: ( (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_ErrorPortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1334:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_ErrorPortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1334:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_ErrorPortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1335:3: otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'out' ( (lv_ErrorPortInName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorPortInAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorPortInAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getErrorPortInAccess().getOutKeyword_2());
            		
            // InternalDepModel.g:1347:3: ( (lv_ErrorPortInName_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1348:4: (lv_ErrorPortInName_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1348:4: (lv_ErrorPortInName_3_0= ruleQualifiedName )
            // InternalDepModel.g:1349:5: lv_ErrorPortInName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorPortInAccess().getErrorPortInNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_ErrorPortInName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorPortInRule());
            					}
            					set(
            						current,
            						"ErrorPortInName",
            						lv_ErrorPortInName_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getErrorPortInAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1370:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1371:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1371:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1372:5: otherlv_5= RULE_ID
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
    // InternalDepModel.g:1387:1: entryRuleErrorPortOut returns [EObject current=null] : iv_ruleErrorPortOut= ruleErrorPortOut EOF ;
    public final EObject entryRuleErrorPortOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorPortOut = null;


        try {
            // InternalDepModel.g:1387:53: (iv_ruleErrorPortOut= ruleErrorPortOut EOF )
            // InternalDepModel.g:1388:2: iv_ruleErrorPortOut= ruleErrorPortOut EOF
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
    // InternalDepModel.g:1394:1: ruleErrorPortOut returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_ErrorPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleErrorPortOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ErrorPortOutName_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1400:2: ( (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_ErrorPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1401:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_ErrorPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1401:2: (otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_ErrorPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1402:3: otherlv_0= 'error' otherlv_1= 'port' otherlv_2= 'in' ( (lv_ErrorPortOutName_3_0= ruleQualifiedName ) ) otherlv_4= ':' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getErrorPortOutAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorPortOutAccess().getPortKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getErrorPortOutAccess().getInKeyword_2());
            		
            // InternalDepModel.g:1414:3: ( (lv_ErrorPortOutName_3_0= ruleQualifiedName ) )
            // InternalDepModel.g:1415:4: (lv_ErrorPortOutName_3_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1415:4: (lv_ErrorPortOutName_3_0= ruleQualifiedName )
            // InternalDepModel.g:1416:5: lv_ErrorPortOutName_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getErrorPortOutAccess().getErrorPortOutNameQualifiedNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_ErrorPortOutName_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getErrorPortOutRule());
            					}
            					set(
            						current,
            						"ErrorPortOutName",
            						lv_ErrorPortOutName_3_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getErrorPortOutAccess().getColonKeyword_4());
            		
            // InternalDepModel.g:1437:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1438:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1438:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1439:5: otherlv_5= RULE_ID
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
    // InternalDepModel.g:1454:1: entryRuleStateDec returns [EObject current=null] : iv_ruleStateDec= ruleStateDec EOF ;
    public final EObject entryRuleStateDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDec = null;


        try {
            // InternalDepModel.g:1454:49: (iv_ruleStateDec= ruleStateDec EOF )
            // InternalDepModel.g:1455:2: iv_ruleStateDec= ruleStateDec EOF
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
    // InternalDepModel.g:1461:1: ruleStateDec returns [EObject current=null] : (otherlv_0= 'error' otherlv_1= 'state' ( (lv_StateName_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleStateDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_StateName_2_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1467:2: ( (otherlv_0= 'error' otherlv_1= 'state' ( (lv_StateName_2_0= ruleQualifiedName ) ) ) )
            // InternalDepModel.g:1468:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_StateName_2_0= ruleQualifiedName ) ) )
            {
            // InternalDepModel.g:1468:2: (otherlv_0= 'error' otherlv_1= 'state' ( (lv_StateName_2_0= ruleQualifiedName ) ) )
            // InternalDepModel.g:1469:3: otherlv_0= 'error' otherlv_1= 'state' ( (lv_StateName_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getStateDecAccess().getErrorKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStateDecAccess().getStateKeyword_1());
            		
            // InternalDepModel.g:1477:3: ( (lv_StateName_2_0= ruleQualifiedName ) )
            // InternalDepModel.g:1478:4: (lv_StateName_2_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1478:4: (lv_StateName_2_0= ruleQualifiedName )
            // InternalDepModel.g:1479:5: lv_StateName_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getStateDecAccess().getStateNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_StateName_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDecRule());
            					}
            					set(
            						current,
            						"StateName",
            						lv_StateName_2_0,
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
    // InternalDepModel.g:1500:1: entryRuleTransitionDec returns [EObject current=null] : iv_ruleTransitionDec= ruleTransitionDec EOF ;
    public final EObject entryRuleTransitionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionDec = null;


        try {
            // InternalDepModel.g:1500:54: (iv_ruleTransitionDec= ruleTransitionDec EOF )
            // InternalDepModel.g:1501:2: iv_ruleTransitionDec= ruleTransitionDec EOF
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
    // InternalDepModel.g:1507:1: ruleTransitionDec returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_EventName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransitionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_EventName_1_0 = null;

        EObject lv_Features_3_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1513:2: ( (otherlv_0= 'transition' ( (lv_EventName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' ) )
            // InternalDepModel.g:1514:2: (otherlv_0= 'transition' ( (lv_EventName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            {
            // InternalDepModel.g:1514:2: (otherlv_0= 'transition' ( (lv_EventName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}' )
            // InternalDepModel.g:1515:3: otherlv_0= 'transition' ( (lv_EventName_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleTransitionFeatureDec ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionDecAccess().getTransitionKeyword_0());
            		
            // InternalDepModel.g:1519:3: ( (lv_EventName_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:1520:4: (lv_EventName_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1520:4: (lv_EventName_1_0= ruleQualifiedName )
            // InternalDepModel.g:1521:5: lv_EventName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTransitionDecAccess().getEventNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_EventName_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionDecRule());
            					}
            					set(
            						current,
            						"EventName",
            						lv_EventName_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionDecAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDepModel.g:1542:3: ( (lv_Features_3_0= ruleTransitionFeatureDec ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=31 && LA14_0<=32)||(LA14_0>=34 && LA14_0<=35)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDepModel.g:1543:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    {
            	    // InternalDepModel.g:1543:4: (lv_Features_3_0= ruleTransitionFeatureDec )
            	    // InternalDepModel.g:1544:5: lv_Features_3_0= ruleTransitionFeatureDec
            	    {

            	    					newCompositeNode(grammarAccess.getTransitionDecAccess().getFeaturesTransitionFeatureDecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_25);
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
            	    break loop14;
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
    // InternalDepModel.g:1569:1: entryRuleTransitionFeatureDec returns [EObject current=null] : iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF ;
    public final EObject entryRuleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionFeatureDec = null;


        try {
            // InternalDepModel.g:1569:61: (iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF )
            // InternalDepModel.g:1570:2: iv_ruleTransitionFeatureDec= ruleTransitionFeatureDec EOF
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
    // InternalDepModel.g:1576:1: ruleTransitionFeatureDec returns [EObject current=null] : (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) ;
    public final EObject ruleTransitionFeatureDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TransitionState_0 = null;

        EObject this_TriggerDec_1 = null;

        EObject this_ActionDec_2 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1582:2: ( (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) ) )
            // InternalDepModel.g:1583:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            {
            // InternalDepModel.g:1583:2: (this_TransitionState_0= ruleTransitionState | this_TriggerDec_1= ruleTriggerDec | this_ActionDec_2= ruleActionDec | (otherlv_3= 'occurrence' () ruleDOUBLE ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDepModel.g:1584:3: this_TransitionState_0= ruleTransitionState
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
                    // InternalDepModel.g:1593:3: this_TriggerDec_1= ruleTriggerDec
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
                    // InternalDepModel.g:1602:3: this_ActionDec_2= ruleActionDec
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
                    // InternalDepModel.g:1611:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    {
                    // InternalDepModel.g:1611:3: (otherlv_3= 'occurrence' () ruleDOUBLE )
                    // InternalDepModel.g:1612:4: otherlv_3= 'occurrence' () ruleDOUBLE
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionFeatureDecAccess().getOccurrenceKeyword_3_0());
                    			
                    // InternalDepModel.g:1616:4: ()
                    // InternalDepModel.g:1617:5: 
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
    // InternalDepModel.g:1635:1: entryRuleTransitionState returns [EObject current=null] : iv_ruleTransitionState= ruleTransitionState EOF ;
    public final EObject entryRuleTransitionState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionState = null;


        try {
            // InternalDepModel.g:1635:56: (iv_ruleTransitionState= ruleTransitionState EOF )
            // InternalDepModel.g:1636:2: iv_ruleTransitionState= ruleTransitionState EOF
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
    // InternalDepModel.g:1642:1: ruleTransitionState returns [EObject current=null] : (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTransitionState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalDepModel.g:1648:2: ( (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalDepModel.g:1649:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalDepModel.g:1649:2: (otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // InternalDepModel.g:1650:3: otherlv_0= 'states' ( (otherlv_1= RULE_ID ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionStateAccess().getStatesKeyword_0());
            		
            // InternalDepModel.g:1654:3: ( (otherlv_1= RULE_ID ) )
            // InternalDepModel.g:1655:4: (otherlv_1= RULE_ID )
            {
            // InternalDepModel.g:1655:4: (otherlv_1= RULE_ID )
            // InternalDepModel.g:1656:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionStateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionStateAccess().getSourceStateStateDecCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionStateAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalDepModel.g:1671:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1672:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1672:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1673:5: otherlv_3= RULE_ID
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
    // InternalDepModel.g:1688:1: entryRuleTriggerDec returns [EObject current=null] : iv_ruleTriggerDec= ruleTriggerDec EOF ;
    public final EObject entryRuleTriggerDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerDec = null;


        try {
            // InternalDepModel.g:1688:51: (iv_ruleTriggerDec= ruleTriggerDec EOF )
            // InternalDepModel.g:1689:2: iv_ruleTriggerDec= ruleTriggerDec EOF
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
    // InternalDepModel.g:1695:1: ruleTriggerDec returns [EObject current=null] : (otherlv_0= 'trigger' ( (lv_TriggerName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTriggerDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_TriggerName_1_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1701:2: ( (otherlv_0= 'trigger' ( (lv_TriggerName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1702:2: (otherlv_0= 'trigger' ( (lv_TriggerName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1702:2: (otherlv_0= 'trigger' ( (lv_TriggerName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1703:3: otherlv_0= 'trigger' ( (lv_TriggerName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerDecAccess().getTriggerKeyword_0());
            		
            // InternalDepModel.g:1707:3: ( (lv_TriggerName_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:1708:4: (lv_TriggerName_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1708:4: (lv_TriggerName_1_0= ruleQualifiedName )
            // InternalDepModel.g:1709:5: lv_TriggerName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getTriggerDecAccess().getTriggerNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_TriggerName_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTriggerDecRule());
            					}
            					set(
            						current,
            						"TriggerName",
            						lv_TriggerName_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTriggerDecAccess().getColonKeyword_2());
            		
            // InternalDepModel.g:1730:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1731:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1731:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1732:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getTriggerDecAccess().getPortInstancePortDecCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTriggerDecAccess().getFullStopKeyword_4());
            		
            // InternalDepModel.g:1747:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1748:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1748:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1749:5: otherlv_5= RULE_ID
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
    // InternalDepModel.g:1764:1: entryRuleActionDec returns [EObject current=null] : iv_ruleActionDec= ruleActionDec EOF ;
    public final EObject entryRuleActionDec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDec = null;


        try {
            // InternalDepModel.g:1764:50: (iv_ruleActionDec= ruleActionDec EOF )
            // InternalDepModel.g:1765:2: iv_ruleActionDec= ruleActionDec EOF
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
    // InternalDepModel.g:1771:1: ruleActionDec returns [EObject current=null] : (otherlv_0= 'action' ( (lv_ActionName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleActionDec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ActionName_1_0 = null;



        	enterRule();

        try {
            // InternalDepModel.g:1777:2: ( (otherlv_0= 'action' ( (lv_ActionName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalDepModel.g:1778:2: (otherlv_0= 'action' ( (lv_ActionName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalDepModel.g:1778:2: (otherlv_0= 'action' ( (lv_ActionName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalDepModel.g:1779:3: otherlv_0= 'action' ( (lv_ActionName_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getActionDecAccess().getActionKeyword_0());
            		
            // InternalDepModel.g:1783:3: ( (lv_ActionName_1_0= ruleQualifiedName ) )
            // InternalDepModel.g:1784:4: (lv_ActionName_1_0= ruleQualifiedName )
            {
            // InternalDepModel.g:1784:4: (lv_ActionName_1_0= ruleQualifiedName )
            // InternalDepModel.g:1785:5: lv_ActionName_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getActionDecAccess().getActionNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_ActionName_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionDecRule());
            					}
            					set(
            						current,
            						"ActionName",
            						lv_ActionName_1_0,
            						"hu.bme.mit.DepModel.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionDecAccess().getColonKeyword_2());
            		
            // InternalDepModel.g:1806:3: ( (otherlv_3= RULE_ID ) )
            // InternalDepModel.g:1807:4: (otherlv_3= RULE_ID )
            {
            // InternalDepModel.g:1807:4: (otherlv_3= RULE_ID )
            // InternalDepModel.g:1808:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDecRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getActionDecAccess().getPortInstancePortDecCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActionDecAccess().getFullStopKeyword_4());
            		
            // InternalDepModel.g:1823:3: ( (otherlv_5= RULE_ID ) )
            // InternalDepModel.g:1824:4: (otherlv_5= RULE_ID )
            {
            // InternalDepModel.g:1824:4: (otherlv_5= RULE_ID )
            // InternalDepModel.g:1825:5: otherlv_5= RULE_ID
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
    // InternalDepModel.g:1840:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalDepModel.g:1840:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalDepModel.g:1841:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalDepModel.g:1847:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalDepModel.g:1853:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalDepModel.g:1854:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalDepModel.g:1854:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalDepModel.g:1855:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_26); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000011002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000818000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008009000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000048008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000D80008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});

}