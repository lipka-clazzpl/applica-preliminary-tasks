package pl.clazz.grammar;// Generated from ABCParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_PAREN=1, WS=2, TEXT=3, SLASH=4, CLOSE_PAREN=5, Name=6;
	public static final int
		RULE_text = 0, RULE_lvl0_chardata = 1, RULE_lvl0_elem = 2, RULE_lvl0_elem_chardata = 3, 
		RULE_content = 4, RULE_element = 5, RULE_chardata = 6;
	public static final String[] ruleNames = {
		"text", "lvl0_chardata", "lvl0_elem", "lvl0_elem_chardata", "content", 
		"element", "chardata"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", null, null, "'/'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN_PAREN", "WS", "TEXT", "SLASH", "CLOSE_PAREN", "Name"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ABCParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ABCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TextContext extends ParserRuleContext {
		public Lvl0_elem_chardataContext lvl0_elem_chardata() {
			return getRuleContext(Lvl0_elem_chardataContext.class,0);
		}
		public Lvl0_elemContext lvl0_elem() {
			return getRuleContext(Lvl0_elemContext.class,0);
		}
		public Lvl0_chardataContext lvl0_chardata() {
			return getRuleContext(Lvl0_chardataContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ABCParserVisitor ) return ((ABCParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		try {
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				lvl0_elem_chardata();
				 System.out.println("lvl0_elem_chardata"); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				lvl0_elem();
				 System.out.println("lvl0_elem"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				lvl0_chardata();
				 System.out.println("lvl0_chardata"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvl0_chardataContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public Lvl0_chardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvl0_chardata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ABCParserVisitor ) return ((ABCParserVisitor<? extends T>)visitor).visitLvl0_chardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvl0_chardataContext lvl0_chardata() throws RecognitionException {
		Lvl0_chardataContext _localctx = new Lvl0_chardataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lvl0_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS || _la==TEXT) {
				{
				{
				setState(25);
				chardata();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvl0_elemContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Lvl0_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvl0_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ABCParserVisitor ) return ((ABCParserVisitor<? extends T>)visitor).visitLvl0_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvl0_elemContext lvl0_elem() throws RecognitionException {
		Lvl0_elemContext _localctx = new Lvl0_elemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lvl0_elem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << WS) | (1L << TEXT))) != 0)) {
				{
				{
				setState(31);
				element();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvl0_elem_chardataContext extends ParserRuleContext {
		public ChardataContext cpre;
		public ChardataContext cpost;
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Lvl0_elem_chardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvl0_elem_chardata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ABCParserVisitor ) return ((ABCParserVisitor<? extends T>)visitor).visitLvl0_elem_chardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lvl0_elem_chardataContext lvl0_elem_chardata() throws RecognitionException {
		Lvl0_elem_chardataContext _localctx = new Lvl0_elem_chardataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lvl0_elem_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(37);
				((Lvl0_elem_chardataContext)_localctx).cpre = chardata();
				}
				break;
			}
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(40);
				element();
				}
				setState(42);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(41);
					((Lvl0_elem_chardataContext)_localctx).cpost = chardata();
					}
					break;
				}
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << WS) | (1L << TEXT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<ChardataContext> chardata() {
			return getRuleContexts(ChardataContext.class);
		}
		public ChardataContext chardata(int i) {
			return getRuleContext(ChardataContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ABCParserVisitor ) return ((ABCParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(48);
				chardata();
				}
				break;
			}
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(51);
					element();
					}
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(52);
						chardata();
						}
						break;
					}
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ABCParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ABCParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> Name() { return getTokens(ABCParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(ABCParser.Name, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ABCParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ABCParser.CLOSE_PAREN, i);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(ABCParser.SLASH, 0); }
		public ChardataContext chardata() {
			return getRuleContext(ChardataContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ABCParserVisitor ) return ((ABCParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_element);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(OPEN_PAREN);
				setState(61);
				match(Name);
				setState(62);
				match(CLOSE_PAREN);
				setState(63);
				content();
				setState(64);
				match(OPEN_PAREN);
				setState(65);
				match(SLASH);
				setState(66);
				match(Name);
				setState(67);
				match(CLOSE_PAREN);
				}
				break;
			case WS:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				chardata();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChardataContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ABCParser.TEXT, 0); }
		public TerminalNode WS() { return getToken(ABCParser.WS, 0); }
		public ChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chardata; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ABCParserVisitor ) return ((ABCParserVisitor<? extends T>)visitor).visitChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChardataContext chardata() throws RecognitionException {
		ChardataContext _localctx = new ChardataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\bM\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\4\7\4#\n\4\f\4\16"+
		"\4&\13\4\3\5\5\5)\n\5\3\5\3\5\5\5-\n\5\6\5/\n\5\r\5\16\5\60\3\6\5\6\64"+
		"\n\6\3\6\3\6\5\68\n\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\4\5"+
		"\2P\2\31\3\2\2\2\4\36\3\2\2\2\6$\3\2\2\2\b(\3\2\2\2\n\63\3\2\2\2\fH\3"+
		"\2\2\2\16J\3\2\2\2\20\21\5\b\5\2\21\22\b\2\1\2\22\32\3\2\2\2\23\24\5\6"+
		"\4\2\24\25\b\2\1\2\25\32\3\2\2\2\26\27\5\4\3\2\27\30\b\2\1\2\30\32\3\2"+
		"\2\2\31\20\3\2\2\2\31\23\3\2\2\2\31\26\3\2\2\2\32\3\3\2\2\2\33\35\5\16"+
		"\b\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2"+
		"\2 \36\3\2\2\2!#\5\f\7\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\7"+
		"\3\2\2\2&$\3\2\2\2\')\5\16\b\2(\'\3\2\2\2()\3\2\2\2).\3\2\2\2*,\5\f\7"+
		"\2+-\5\16\b\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.*\3\2\2\2/\60\3\2\2\2\60."+
		"\3\2\2\2\60\61\3\2\2\2\61\t\3\2\2\2\62\64\5\16\b\2\63\62\3\2\2\2\63\64"+
		"\3\2\2\2\64;\3\2\2\2\65\67\5\f\7\2\668\5\16\b\2\67\66\3\2\2\2\678\3\2"+
		"\2\28:\3\2\2\29\65\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3\2\2\2="+
		";\3\2\2\2>?\7\3\2\2?@\7\b\2\2@A\7\7\2\2AB\5\n\6\2BC\7\3\2\2CD\7\6\2\2"+
		"DE\7\b\2\2EF\7\7\2\2FI\3\2\2\2GI\5\16\b\2H>\3\2\2\2HG\3\2\2\2I\r\3\2\2"+
		"\2JK\t\2\2\2K\17\3\2\2\2\f\31\36$(,\60\63\67;H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}