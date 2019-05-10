package de.fhdo.ewks.ml_example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fhdo.ewks.ml_example.services.DataStructureLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataStructureLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'context'", "'{'", "'}'", "'structure'", "','", "'boolean'", "'double'", "'float'", "'int'", "'string'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalDataStructureLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataStructureLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataStructureLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataStructureLanguage.g"; }



     	private DataStructureLanguageGrammarAccess grammarAccess;

        public InternalDataStructureLanguageParser(TokenStream input, DataStructureLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Context";
       	}

       	@Override
       	protected DataStructureLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContext"
    // InternalDataStructureLanguage.g:65:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalDataStructureLanguage.g:65:48: (iv_ruleContext= ruleContext EOF )
            // InternalDataStructureLanguage.g:66:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalDataStructureLanguage.g:72:1: ruleContext returns [EObject current=null] : (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_structures_3_0= ruleStructure ) )+ otherlv_4= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_structures_3_0 = null;



        	enterRule();

        try {
            // InternalDataStructureLanguage.g:78:2: ( (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_structures_3_0= ruleStructure ) )+ otherlv_4= '}' ) )
            // InternalDataStructureLanguage.g:79:2: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_structures_3_0= ruleStructure ) )+ otherlv_4= '}' )
            {
            // InternalDataStructureLanguage.g:79:2: (otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_structures_3_0= ruleStructure ) )+ otherlv_4= '}' )
            // InternalDataStructureLanguage.g:80:3: otherlv_0= 'context' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_structures_3_0= ruleStructure ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextAccess().getContextKeyword_0());
            		
            // InternalDataStructureLanguage.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataStructureLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataStructureLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalDataStructureLanguage.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataStructureLanguage.g:106:3: ( (lv_structures_3_0= ruleStructure ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDataStructureLanguage.g:107:4: (lv_structures_3_0= ruleStructure )
            	    {
            	    // InternalDataStructureLanguage.g:107:4: (lv_structures_3_0= ruleStructure )
            	    // InternalDataStructureLanguage.g:108:5: lv_structures_3_0= ruleStructure
            	    {

            	    					newCompositeNode(grammarAccess.getContextAccess().getStructuresStructureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_structures_3_0=ruleStructure();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"structures",
            	    						lv_structures_3_0,
            	    						"de.fhdo.ewks.ml_example.DataStructureLanguage.Structure");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleStructure"
    // InternalDataStructureLanguage.g:133:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalDataStructureLanguage.g:133:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalDataStructureLanguage.g:134:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalDataStructureLanguage.g:140:1: ruleStructure returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalDataStructureLanguage.g:146:2: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= '}' ) )
            // InternalDataStructureLanguage.g:147:2: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= '}' )
            {
            // InternalDataStructureLanguage.g:147:2: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= '}' )
            // InternalDataStructureLanguage.g:148:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStructureAccess().getStructureKeyword_0());
            		
            // InternalDataStructureLanguage.g:152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataStructureLanguage.g:153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataStructureLanguage.g:153:4: (lv_name_1_0= RULE_ID )
            // InternalDataStructureLanguage.g:154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataStructureLanguage.g:174:3: ( (lv_attributes_3_0= ruleAttribute ) )
            // InternalDataStructureLanguage.g:175:4: (lv_attributes_3_0= ruleAttribute )
            {
            // InternalDataStructureLanguage.g:175:4: (lv_attributes_3_0= ruleAttribute )
            // InternalDataStructureLanguage.g:176:5: lv_attributes_3_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getStructureAccess().getAttributesAttributeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_attributes_3_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructureRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_3_0,
            						"de.fhdo.ewks.ml_example.DataStructureLanguage.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataStructureLanguage.g:193:3: (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDataStructureLanguage.g:194:4: otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStructureAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDataStructureLanguage.g:198:4: ( (lv_attributes_5_0= ruleAttribute ) )
            	    // InternalDataStructureLanguage.g:199:5: (lv_attributes_5_0= ruleAttribute )
            	    {
            	    // InternalDataStructureLanguage.g:199:5: (lv_attributes_5_0= ruleAttribute )
            	    // InternalDataStructureLanguage.g:200:6: lv_attributes_5_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getStructureAccess().getAttributesAttributeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_5_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStructureRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_5_0,
            	    							"de.fhdo.ewks.ml_example.DataStructureLanguage.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleAttribute"
    // InternalDataStructureLanguage.g:226:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDataStructureLanguage.g:226:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDataStructureLanguage.g:227:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDataStructureLanguage.g:233:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalDataStructureLanguage.g:239:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDataStructureLanguage.g:240:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDataStructureLanguage.g:240:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDataStructureLanguage.g:241:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalDataStructureLanguage.g:241:3: ( (lv_type_0_0= ruleType ) )
            // InternalDataStructureLanguage.g:242:4: (lv_type_0_0= ruleType )
            {
            // InternalDataStructureLanguage.g:242:4: (lv_type_0_0= ruleType )
            // InternalDataStructureLanguage.g:243:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"de.fhdo.ewks.ml_example.DataStructureLanguage.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataStructureLanguage.g:260:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataStructureLanguage.g:261:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataStructureLanguage.g:261:4: (lv_name_1_0= RULE_ID )
            // InternalDataStructureLanguage.g:262:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleType"
    // InternalDataStructureLanguage.g:282:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'string' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDataStructureLanguage.g:288:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'string' ) ) )
            // InternalDataStructureLanguage.g:289:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'string' ) )
            {
            // InternalDataStructureLanguage.g:289:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'double' ) | (enumLiteral_2= 'float' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'string' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDataStructureLanguage.g:290:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalDataStructureLanguage.g:290:3: (enumLiteral_0= 'boolean' )
                    // InternalDataStructureLanguage.g:291:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataStructureLanguage.g:298:3: (enumLiteral_1= 'double' )
                    {
                    // InternalDataStructureLanguage.g:298:3: (enumLiteral_1= 'double' )
                    // InternalDataStructureLanguage.g:299:4: enumLiteral_1= 'double'
                    {
                    enumLiteral_1=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataStructureLanguage.g:306:3: (enumLiteral_2= 'float' )
                    {
                    // InternalDataStructureLanguage.g:306:3: (enumLiteral_2= 'float' )
                    // InternalDataStructureLanguage.g:307:4: enumLiteral_2= 'float'
                    {
                    enumLiteral_2=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataStructureLanguage.g:314:3: (enumLiteral_3= 'int' )
                    {
                    // InternalDataStructureLanguage.g:314:3: (enumLiteral_3= 'int' )
                    // InternalDataStructureLanguage.g:315:4: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataStructureLanguage.g:322:3: (enumLiteral_4= 'string' )
                    {
                    // InternalDataStructureLanguage.g:322:3: (enumLiteral_4= 'string' )
                    // InternalDataStructureLanguage.g:323:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});

}