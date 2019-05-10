package de.fhdo.ewks.ml_example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fhdo.ewks.ml_example.services.DataStructureLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataStructureLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'boolean'", "'double'", "'float'", "'int'", "'string'", "'context'", "'{'", "'}'", "'structure'", "','"
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

    	public void setGrammarAccess(DataStructureLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleContext"
    // InternalDataStructureLanguage.g:53:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalDataStructureLanguage.g:54:1: ( ruleContext EOF )
            // InternalDataStructureLanguage.g:55:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalDataStructureLanguage.g:62:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:66:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalDataStructureLanguage.g:67:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalDataStructureLanguage.g:67:2: ( ( rule__Context__Group__0 ) )
            // InternalDataStructureLanguage.g:68:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalDataStructureLanguage.g:69:3: ( rule__Context__Group__0 )
            // InternalDataStructureLanguage.g:69:4: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleStructure"
    // InternalDataStructureLanguage.g:78:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // InternalDataStructureLanguage.g:79:1: ( ruleStructure EOF )
            // InternalDataStructureLanguage.g:80:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalDataStructureLanguage.g:87:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:91:2: ( ( ( rule__Structure__Group__0 ) ) )
            // InternalDataStructureLanguage.g:92:2: ( ( rule__Structure__Group__0 ) )
            {
            // InternalDataStructureLanguage.g:92:2: ( ( rule__Structure__Group__0 ) )
            // InternalDataStructureLanguage.g:93:3: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // InternalDataStructureLanguage.g:94:3: ( rule__Structure__Group__0 )
            // InternalDataStructureLanguage.g:94:4: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleAttribute"
    // InternalDataStructureLanguage.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDataStructureLanguage.g:104:1: ( ruleAttribute EOF )
            // InternalDataStructureLanguage.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDataStructureLanguage.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDataStructureLanguage.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDataStructureLanguage.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDataStructureLanguage.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDataStructureLanguage.g:119:3: ( rule__Attribute__Group__0 )
            // InternalDataStructureLanguage.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleType"
    // InternalDataStructureLanguage.g:128:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:132:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDataStructureLanguage.g:133:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDataStructureLanguage.g:133:2: ( ( rule__Type__Alternatives ) )
            // InternalDataStructureLanguage.g:134:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDataStructureLanguage.g:135:3: ( rule__Type__Alternatives )
            // InternalDataStructureLanguage.g:135:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDataStructureLanguage.g:143:1: rule__Type__Alternatives : ( ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'int' ) ) | ( ( 'string' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:147:1: ( ( ( 'boolean' ) ) | ( ( 'double' ) ) | ( ( 'float' ) ) | ( ( 'int' ) ) | ( ( 'string' ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDataStructureLanguage.g:148:2: ( ( 'boolean' ) )
                    {
                    // InternalDataStructureLanguage.g:148:2: ( ( 'boolean' ) )
                    // InternalDataStructureLanguage.g:149:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 
                    // InternalDataStructureLanguage.g:150:3: ( 'boolean' )
                    // InternalDataStructureLanguage.g:150:4: 'boolean'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataStructureLanguage.g:154:2: ( ( 'double' ) )
                    {
                    // InternalDataStructureLanguage.g:154:2: ( ( 'double' ) )
                    // InternalDataStructureLanguage.g:155:3: ( 'double' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 
                    // InternalDataStructureLanguage.g:156:3: ( 'double' )
                    // InternalDataStructureLanguage.g:156:4: 'double'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataStructureLanguage.g:160:2: ( ( 'float' ) )
                    {
                    // InternalDataStructureLanguage.g:160:2: ( ( 'float' ) )
                    // InternalDataStructureLanguage.g:161:3: ( 'float' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_2()); 
                    // InternalDataStructureLanguage.g:162:3: ( 'float' )
                    // InternalDataStructureLanguage.g:162:4: 'float'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataStructureLanguage.g:166:2: ( ( 'int' ) )
                    {
                    // InternalDataStructureLanguage.g:166:2: ( ( 'int' ) )
                    // InternalDataStructureLanguage.g:167:3: ( 'int' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 
                    // InternalDataStructureLanguage.g:168:3: ( 'int' )
                    // InternalDataStructureLanguage.g:168:4: 'int'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEGEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataStructureLanguage.g:172:2: ( ( 'string' ) )
                    {
                    // InternalDataStructureLanguage.g:172:2: ( ( 'string' ) )
                    // InternalDataStructureLanguage.g:173:3: ( 'string' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 
                    // InternalDataStructureLanguage.g:174:3: ( 'string' )
                    // InternalDataStructureLanguage.g:174:4: 'string'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Context__Group__0"
    // InternalDataStructureLanguage.g:182:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:186:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalDataStructureLanguage.g:187:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalDataStructureLanguage.g:194:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:198:1: ( ( 'context' ) )
            // InternalDataStructureLanguage.g:199:1: ( 'context' )
            {
            // InternalDataStructureLanguage.g:199:1: ( 'context' )
            // InternalDataStructureLanguage.g:200:2: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalDataStructureLanguage.g:209:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:213:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalDataStructureLanguage.g:214:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalDataStructureLanguage.g:221:1: rule__Context__Group__1__Impl : ( ( rule__Context__NameAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:225:1: ( ( ( rule__Context__NameAssignment_1 ) ) )
            // InternalDataStructureLanguage.g:226:1: ( ( rule__Context__NameAssignment_1 ) )
            {
            // InternalDataStructureLanguage.g:226:1: ( ( rule__Context__NameAssignment_1 ) )
            // InternalDataStructureLanguage.g:227:2: ( rule__Context__NameAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_1()); 
            // InternalDataStructureLanguage.g:228:2: ( rule__Context__NameAssignment_1 )
            // InternalDataStructureLanguage.g:228:3: rule__Context__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Context__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // InternalDataStructureLanguage.g:236:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:240:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalDataStructureLanguage.g:241:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // InternalDataStructureLanguage.g:248:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:252:1: ( ( '{' ) )
            // InternalDataStructureLanguage.g:253:1: ( '{' )
            {
            // InternalDataStructureLanguage.g:253:1: ( '{' )
            // InternalDataStructureLanguage.g:254:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // InternalDataStructureLanguage.g:263:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:267:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalDataStructureLanguage.g:268:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // InternalDataStructureLanguage.g:275:1: rule__Context__Group__3__Impl : ( ( ( rule__Context__StructuresAssignment_3 ) ) ( ( rule__Context__StructuresAssignment_3 )* ) ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:279:1: ( ( ( ( rule__Context__StructuresAssignment_3 ) ) ( ( rule__Context__StructuresAssignment_3 )* ) ) )
            // InternalDataStructureLanguage.g:280:1: ( ( ( rule__Context__StructuresAssignment_3 ) ) ( ( rule__Context__StructuresAssignment_3 )* ) )
            {
            // InternalDataStructureLanguage.g:280:1: ( ( ( rule__Context__StructuresAssignment_3 ) ) ( ( rule__Context__StructuresAssignment_3 )* ) )
            // InternalDataStructureLanguage.g:281:2: ( ( rule__Context__StructuresAssignment_3 ) ) ( ( rule__Context__StructuresAssignment_3 )* )
            {
            // InternalDataStructureLanguage.g:281:2: ( ( rule__Context__StructuresAssignment_3 ) )
            // InternalDataStructureLanguage.g:282:3: ( rule__Context__StructuresAssignment_3 )
            {
             before(grammarAccess.getContextAccess().getStructuresAssignment_3()); 
            // InternalDataStructureLanguage.g:283:3: ( rule__Context__StructuresAssignment_3 )
            // InternalDataStructureLanguage.g:283:4: rule__Context__StructuresAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Context__StructuresAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getStructuresAssignment_3()); 

            }

            // InternalDataStructureLanguage.g:286:2: ( ( rule__Context__StructuresAssignment_3 )* )
            // InternalDataStructureLanguage.g:287:3: ( rule__Context__StructuresAssignment_3 )*
            {
             before(grammarAccess.getContextAccess().getStructuresAssignment_3()); 
            // InternalDataStructureLanguage.g:288:3: ( rule__Context__StructuresAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDataStructureLanguage.g:288:4: rule__Context__StructuresAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Context__StructuresAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getStructuresAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // InternalDataStructureLanguage.g:297:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:301:1: ( rule__Context__Group__4__Impl )
            // InternalDataStructureLanguage.g:302:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // InternalDataStructureLanguage.g:308:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:312:1: ( ( '}' ) )
            // InternalDataStructureLanguage.g:313:1: ( '}' )
            {
            // InternalDataStructureLanguage.g:313:1: ( '}' )
            // InternalDataStructureLanguage.g:314:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__Structure__Group__0"
    // InternalDataStructureLanguage.g:324:1: rule__Structure__Group__0 : rule__Structure__Group__0__Impl rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:328:1: ( rule__Structure__Group__0__Impl rule__Structure__Group__1 )
            // InternalDataStructureLanguage.g:329:2: rule__Structure__Group__0__Impl rule__Structure__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Structure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__0"


    // $ANTLR start "rule__Structure__Group__0__Impl"
    // InternalDataStructureLanguage.g:336:1: rule__Structure__Group__0__Impl : ( 'structure' ) ;
    public final void rule__Structure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:340:1: ( ( 'structure' ) )
            // InternalDataStructureLanguage.g:341:1: ( 'structure' )
            {
            // InternalDataStructureLanguage.g:341:1: ( 'structure' )
            // InternalDataStructureLanguage.g:342:2: 'structure'
            {
             before(grammarAccess.getStructureAccess().getStructureKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getStructureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__0__Impl"


    // $ANTLR start "rule__Structure__Group__1"
    // InternalDataStructureLanguage.g:351:1: rule__Structure__Group__1 : rule__Structure__Group__1__Impl rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:355:1: ( rule__Structure__Group__1__Impl rule__Structure__Group__2 )
            // InternalDataStructureLanguage.g:356:2: rule__Structure__Group__1__Impl rule__Structure__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Structure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__1"


    // $ANTLR start "rule__Structure__Group__1__Impl"
    // InternalDataStructureLanguage.g:363:1: rule__Structure__Group__1__Impl : ( ( rule__Structure__NameAssignment_1 ) ) ;
    public final void rule__Structure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:367:1: ( ( ( rule__Structure__NameAssignment_1 ) ) )
            // InternalDataStructureLanguage.g:368:1: ( ( rule__Structure__NameAssignment_1 ) )
            {
            // InternalDataStructureLanguage.g:368:1: ( ( rule__Structure__NameAssignment_1 ) )
            // InternalDataStructureLanguage.g:369:2: ( rule__Structure__NameAssignment_1 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_1()); 
            // InternalDataStructureLanguage.g:370:2: ( rule__Structure__NameAssignment_1 )
            // InternalDataStructureLanguage.g:370:3: rule__Structure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Structure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__1__Impl"


    // $ANTLR start "rule__Structure__Group__2"
    // InternalDataStructureLanguage.g:378:1: rule__Structure__Group__2 : rule__Structure__Group__2__Impl rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:382:1: ( rule__Structure__Group__2__Impl rule__Structure__Group__3 )
            // InternalDataStructureLanguage.g:383:2: rule__Structure__Group__2__Impl rule__Structure__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Structure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__2"


    // $ANTLR start "rule__Structure__Group__2__Impl"
    // InternalDataStructureLanguage.g:390:1: rule__Structure__Group__2__Impl : ( '{' ) ;
    public final void rule__Structure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:394:1: ( ( '{' ) )
            // InternalDataStructureLanguage.g:395:1: ( '{' )
            {
            // InternalDataStructureLanguage.g:395:1: ( '{' )
            // InternalDataStructureLanguage.g:396:2: '{'
            {
             before(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__2__Impl"


    // $ANTLR start "rule__Structure__Group__3"
    // InternalDataStructureLanguage.g:405:1: rule__Structure__Group__3 : rule__Structure__Group__3__Impl rule__Structure__Group__4 ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:409:1: ( rule__Structure__Group__3__Impl rule__Structure__Group__4 )
            // InternalDataStructureLanguage.g:410:2: rule__Structure__Group__3__Impl rule__Structure__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Structure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__3"


    // $ANTLR start "rule__Structure__Group__3__Impl"
    // InternalDataStructureLanguage.g:417:1: rule__Structure__Group__3__Impl : ( ( rule__Structure__AttributesAssignment_3 ) ) ;
    public final void rule__Structure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:421:1: ( ( ( rule__Structure__AttributesAssignment_3 ) ) )
            // InternalDataStructureLanguage.g:422:1: ( ( rule__Structure__AttributesAssignment_3 ) )
            {
            // InternalDataStructureLanguage.g:422:1: ( ( rule__Structure__AttributesAssignment_3 ) )
            // InternalDataStructureLanguage.g:423:2: ( rule__Structure__AttributesAssignment_3 )
            {
             before(grammarAccess.getStructureAccess().getAttributesAssignment_3()); 
            // InternalDataStructureLanguage.g:424:2: ( rule__Structure__AttributesAssignment_3 )
            // InternalDataStructureLanguage.g:424:3: rule__Structure__AttributesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Structure__AttributesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__3__Impl"


    // $ANTLR start "rule__Structure__Group__4"
    // InternalDataStructureLanguage.g:432:1: rule__Structure__Group__4 : rule__Structure__Group__4__Impl rule__Structure__Group__5 ;
    public final void rule__Structure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:436:1: ( rule__Structure__Group__4__Impl rule__Structure__Group__5 )
            // InternalDataStructureLanguage.g:437:2: rule__Structure__Group__4__Impl rule__Structure__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Structure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__4"


    // $ANTLR start "rule__Structure__Group__4__Impl"
    // InternalDataStructureLanguage.g:444:1: rule__Structure__Group__4__Impl : ( ( rule__Structure__Group_4__0 )* ) ;
    public final void rule__Structure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:448:1: ( ( ( rule__Structure__Group_4__0 )* ) )
            // InternalDataStructureLanguage.g:449:1: ( ( rule__Structure__Group_4__0 )* )
            {
            // InternalDataStructureLanguage.g:449:1: ( ( rule__Structure__Group_4__0 )* )
            // InternalDataStructureLanguage.g:450:2: ( rule__Structure__Group_4__0 )*
            {
             before(grammarAccess.getStructureAccess().getGroup_4()); 
            // InternalDataStructureLanguage.g:451:2: ( rule__Structure__Group_4__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataStructureLanguage.g:451:3: rule__Structure__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Structure__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStructureAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__4__Impl"


    // $ANTLR start "rule__Structure__Group__5"
    // InternalDataStructureLanguage.g:459:1: rule__Structure__Group__5 : rule__Structure__Group__5__Impl ;
    public final void rule__Structure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:463:1: ( rule__Structure__Group__5__Impl )
            // InternalDataStructureLanguage.g:464:2: rule__Structure__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__5"


    // $ANTLR start "rule__Structure__Group__5__Impl"
    // InternalDataStructureLanguage.g:470:1: rule__Structure__Group__5__Impl : ( '}' ) ;
    public final void rule__Structure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:474:1: ( ( '}' ) )
            // InternalDataStructureLanguage.g:475:1: ( '}' )
            {
            // InternalDataStructureLanguage.g:475:1: ( '}' )
            // InternalDataStructureLanguage.g:476:2: '}'
            {
             before(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group__5__Impl"


    // $ANTLR start "rule__Structure__Group_4__0"
    // InternalDataStructureLanguage.g:486:1: rule__Structure__Group_4__0 : rule__Structure__Group_4__0__Impl rule__Structure__Group_4__1 ;
    public final void rule__Structure__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:490:1: ( rule__Structure__Group_4__0__Impl rule__Structure__Group_4__1 )
            // InternalDataStructureLanguage.g:491:2: rule__Structure__Group_4__0__Impl rule__Structure__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__Structure__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Structure__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group_4__0"


    // $ANTLR start "rule__Structure__Group_4__0__Impl"
    // InternalDataStructureLanguage.g:498:1: rule__Structure__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Structure__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:502:1: ( ( ',' ) )
            // InternalDataStructureLanguage.g:503:1: ( ',' )
            {
            // InternalDataStructureLanguage.g:503:1: ( ',' )
            // InternalDataStructureLanguage.g:504:2: ','
            {
             before(grammarAccess.getStructureAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group_4__0__Impl"


    // $ANTLR start "rule__Structure__Group_4__1"
    // InternalDataStructureLanguage.g:513:1: rule__Structure__Group_4__1 : rule__Structure__Group_4__1__Impl ;
    public final void rule__Structure__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:517:1: ( rule__Structure__Group_4__1__Impl )
            // InternalDataStructureLanguage.g:518:2: rule__Structure__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Structure__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group_4__1"


    // $ANTLR start "rule__Structure__Group_4__1__Impl"
    // InternalDataStructureLanguage.g:524:1: rule__Structure__Group_4__1__Impl : ( ( rule__Structure__AttributesAssignment_4_1 ) ) ;
    public final void rule__Structure__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:528:1: ( ( ( rule__Structure__AttributesAssignment_4_1 ) ) )
            // InternalDataStructureLanguage.g:529:1: ( ( rule__Structure__AttributesAssignment_4_1 ) )
            {
            // InternalDataStructureLanguage.g:529:1: ( ( rule__Structure__AttributesAssignment_4_1 ) )
            // InternalDataStructureLanguage.g:530:2: ( rule__Structure__AttributesAssignment_4_1 )
            {
             before(grammarAccess.getStructureAccess().getAttributesAssignment_4_1()); 
            // InternalDataStructureLanguage.g:531:2: ( rule__Structure__AttributesAssignment_4_1 )
            // InternalDataStructureLanguage.g:531:3: rule__Structure__AttributesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Structure__AttributesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStructureAccess().getAttributesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDataStructureLanguage.g:540:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:544:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDataStructureLanguage.g:545:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDataStructureLanguage.g:552:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__TypeAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:556:1: ( ( ( rule__Attribute__TypeAssignment_0 ) ) )
            // InternalDataStructureLanguage.g:557:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            {
            // InternalDataStructureLanguage.g:557:1: ( ( rule__Attribute__TypeAssignment_0 ) )
            // InternalDataStructureLanguage.g:558:2: ( rule__Attribute__TypeAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 
            // InternalDataStructureLanguage.g:559:2: ( rule__Attribute__TypeAssignment_0 )
            // InternalDataStructureLanguage.g:559:3: rule__Attribute__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDataStructureLanguage.g:567:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:571:1: ( rule__Attribute__Group__1__Impl )
            // InternalDataStructureLanguage.g:572:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDataStructureLanguage.g:578:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:582:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalDataStructureLanguage.g:583:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalDataStructureLanguage.g:583:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalDataStructureLanguage.g:584:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalDataStructureLanguage.g:585:2: ( rule__Attribute__NameAssignment_1 )
            // InternalDataStructureLanguage.g:585:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Context__NameAssignment_1"
    // InternalDataStructureLanguage.g:594:1: rule__Context__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:598:1: ( ( RULE_ID ) )
            // InternalDataStructureLanguage.g:599:2: ( RULE_ID )
            {
            // InternalDataStructureLanguage.g:599:2: ( RULE_ID )
            // InternalDataStructureLanguage.g:600:3: RULE_ID
            {
             before(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NameAssignment_1"


    // $ANTLR start "rule__Context__StructuresAssignment_3"
    // InternalDataStructureLanguage.g:609:1: rule__Context__StructuresAssignment_3 : ( ruleStructure ) ;
    public final void rule__Context__StructuresAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:613:1: ( ( ruleStructure ) )
            // InternalDataStructureLanguage.g:614:2: ( ruleStructure )
            {
            // InternalDataStructureLanguage.g:614:2: ( ruleStructure )
            // InternalDataStructureLanguage.g:615:3: ruleStructure
            {
             before(grammarAccess.getContextAccess().getStructuresStructureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStructure();

            state._fsp--;

             after(grammarAccess.getContextAccess().getStructuresStructureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__StructuresAssignment_3"


    // $ANTLR start "rule__Structure__NameAssignment_1"
    // InternalDataStructureLanguage.g:624:1: rule__Structure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Structure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:628:1: ( ( RULE_ID ) )
            // InternalDataStructureLanguage.g:629:2: ( RULE_ID )
            {
            // InternalDataStructureLanguage.g:629:2: ( RULE_ID )
            // InternalDataStructureLanguage.g:630:3: RULE_ID
            {
             before(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__NameAssignment_1"


    // $ANTLR start "rule__Structure__AttributesAssignment_3"
    // InternalDataStructureLanguage.g:639:1: rule__Structure__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Structure__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:643:1: ( ( ruleAttribute ) )
            // InternalDataStructureLanguage.g:644:2: ( ruleAttribute )
            {
            // InternalDataStructureLanguage.g:644:2: ( ruleAttribute )
            // InternalDataStructureLanguage.g:645:3: ruleAttribute
            {
             before(grammarAccess.getStructureAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getAttributesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__AttributesAssignment_3"


    // $ANTLR start "rule__Structure__AttributesAssignment_4_1"
    // InternalDataStructureLanguage.g:654:1: rule__Structure__AttributesAssignment_4_1 : ( ruleAttribute ) ;
    public final void rule__Structure__AttributesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:658:1: ( ( ruleAttribute ) )
            // InternalDataStructureLanguage.g:659:2: ( ruleAttribute )
            {
            // InternalDataStructureLanguage.g:659:2: ( ruleAttribute )
            // InternalDataStructureLanguage.g:660:3: ruleAttribute
            {
             before(grammarAccess.getStructureAccess().getAttributesAttributeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStructureAccess().getAttributesAttributeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Structure__AttributesAssignment_4_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_0"
    // InternalDataStructureLanguage.g:669:1: rule__Attribute__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:673:1: ( ( ruleType ) )
            // InternalDataStructureLanguage.g:674:2: ( ruleType )
            {
            // InternalDataStructureLanguage.g:674:2: ( ruleType )
            // InternalDataStructureLanguage.g:675:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalDataStructureLanguage.g:684:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataStructureLanguage.g:688:1: ( ( RULE_ID ) )
            // InternalDataStructureLanguage.g:689:2: ( RULE_ID )
            {
            // InternalDataStructureLanguage.g:689:2: ( RULE_ID )
            // InternalDataStructureLanguage.g:690:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});

}