package pl.clazz.grammar;// Generated from ABCLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_PAREN=1, WS=2, TEXT=3, SLASH=4, CLOSE_PAREN=5, Name=6;
	public static final int
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	public static final String[] ruleNames = {
		"OPEN_PAREN", "WS", "TEXT", "SLASH", "CLOSE_PAREN", "Name", "ABC"
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


	public ABCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b.\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3"+
		"\6\3\30\n\3\r\3\16\3\31\3\3\3\3\3\4\6\4\37\n\4\r\4\16\4 \3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\4\3\6\4\b\5\n\6\f\7\16\b\20\2"+
		"\4\2\3\7\4\2\13\f\17\17\3\2>>\4\2CCcc\4\2DDdd\4\2EEee\2-\2\4\3\2\2\2\2"+
		"\6\3\2\2\2\2\b\3\2\2\2\3\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\4\22\3\2\2"+
		"\2\6\27\3\2\2\2\b\36\3\2\2\2\n\"\3\2\2\2\f$\3\2\2\2\16(\3\2\2\2\20*\3"+
		"\2\2\2\22\23\7>\2\2\23\24\3\2\2\2\24\25\b\2\2\2\25\5\3\2\2\2\26\30\t\2"+
		"\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2"+
		"\2\2\33\34\b\3\3\2\34\7\3\2\2\2\35\37\n\3\2\2\36\35\3\2\2\2\37 \3\2\2"+
		"\2 \36\3\2\2\2 !\3\2\2\2!\t\3\2\2\2\"#\7\61\2\2#\13\3\2\2\2$%\7@\2\2%"+
		"&\3\2\2\2&\'\b\6\4\2\'\r\3\2\2\2()\5\20\b\2)\17\3\2\2\2*+\t\4\2\2+,\t"+
		"\5\2\2,-\t\6\2\2-\21\3\2\2\2\6\2\3\31 \5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}