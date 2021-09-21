// Generated from WKSHT6.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WKSHT6Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, NUMBER=8, WS=9;
	public static final int
		RULE_object = 0, RULE_pair = 1, RULE_value = 2, RULE_array = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"object", "pair", "value", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "STRING", "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "WKSHT6.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WKSHT6Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
			setState(9);
			pair();
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(10);
				match(T__1);
				setState(11);
				pair();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(17);
			match(T__2);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WKSHT6Parser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(STRING);
			setState(20);
			match(T__3);
			setState(21);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(WKSHT6Parser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(WKSHT6Parser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(NUMBER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				array();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				match(T__1);
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WKSHT6Listener ) ((WKSHT6Listener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__4);
			setState(31);
			value();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(32);
				match(T__1);
				setState(33);
				value();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\7\2\17\n\2\f\2\16\2\22\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\5\7\5%\n"+
		"\5\f\5\16\5(\13\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2-\2\n\3\2\2\2\4\25\3"+
		"\2\2\2\6\36\3\2\2\2\b \3\2\2\2\n\13\7\3\2\2\13\20\5\4\3\2\f\r\7\4\2\2"+
		"\r\17\5\4\3\2\16\f\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21"+
		"\23\3\2\2\2\22\20\3\2\2\2\23\24\7\5\2\2\24\3\3\2\2\2\25\26\7\t\2\2\26"+
		"\27\7\6\2\2\27\30\5\6\4\2\30\5\3\2\2\2\31\37\7\t\2\2\32\37\7\n\2\2\33"+
		"\37\5\2\2\2\34\37\5\b\5\2\35\37\7\4\2\2\36\31\3\2\2\2\36\32\3\2\2\2\36"+
		"\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\7\3\2\2\2 !\7\7\2\2!&\5\6\4"+
		"\2\"#\7\4\2\2#%\5\6\4\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3"+
		"\2\2\2(&\3\2\2\2)*\7\b\2\2*\t\3\2\2\2\5\20\36&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}