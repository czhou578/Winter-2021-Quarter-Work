// Generated from c:\Users\mycol\Winter Quarter 2021\CS 320 Prog. Lang\Work\src\Assignment2\test\Assig.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OPERATIONS=15, STRING=16, 
		NUMBER=17, WS=18;
	public static final int
		RULE_start = 0, RULE_task = 1, RULE_parameter = 2, RULE_function = 3, 
		RULE_call = 4, RULE_value = 5, RULE_loop = 6, RULE_compare = 7, RULE_action = 8, 
		RULE_assignment = 9, RULE_operate = 10, RULE_result = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "task", "parameter", "function", "call", "value", "loop", "compare", 
			"action", "assignment", "operate", "result"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'<-'", "'function'", "'('", "')'", "'{'", "'}'", "'print'", 
			"'Sys'", "'.'", "'sleep'", "'while'", "'!='", "'return('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OPERATIONS", "STRING", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "Assig.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				task();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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

	public static class TaskContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_task);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			function();
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

	public static class ParameterContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			value();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(32);
				match(T__0);
				setState(33);
				value();
				}
				}
				setState(38);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AssigParser.STRING, 0); }
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(STRING);
			setState(40);
			match(T__1);
			setState(41);
			match(T__2);
			setState(42);
			match(T__3);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				parameter();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==NUMBER );
			setState(48);
			match(T__4);
			setState(49);
			match(T__5);
			setState(50);
			action();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__13) | (1L << STRING))) != 0)) {
				{
				setState(51);
				action();
				}
			}

			setState(54);
			match(T__6);
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

	public static class CallContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(57);
				match(T__9);
				}
			}

			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(60);
				match(T__10);
				}
			}

			setState(63);
			match(T__3);
			setState(64);
			parameter();
			setState(65);
			match(T__4);
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
		public TerminalNode STRING() { return getToken(AssigParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(AssigParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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

	public static class LoopContext extends ParserRuleContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__11);
			setState(70);
			match(T__3);
			setState(71);
			compare();
			setState(72);
			match(T__4);
			setState(73);
			match(T__5);
			setState(74);
			action();
			setState(75);
			action();
			setState(76);
			action();
			setState(77);
			match(T__6);
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

	public static class CompareContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			value();
			setState(80);
			match(T__12);
			setState(81);
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

	public static class ActionContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public OperateContext operate() {
			return getRuleContext(OperateContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_action);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				operate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AssigParser.STRING, 0); }
		public OperateContext operate() {
			return getRuleContext(OperateContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(STRING);
			setState(91);
			match(T__1);
			setState(92);
			operate();
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

	public static class OperateContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(AssigParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AssigParser.STRING, i);
		}
		public TerminalNode OPERATIONS() { return getToken(AssigParser.OPERATIONS, 0); }
		public TerminalNode NUMBER() { return getToken(AssigParser.NUMBER, 0); }
		public OperateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operate; }
	}

	public final OperateContext operate() throws RecognitionException {
		OperateContext _localctx = new OperateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(STRING);
			setState(95);
			match(OPERATIONS);
			setState(96);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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

	public static class ResultContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__13);
			setState(99);
			action();
			setState(100);
			match(T__4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\4\3\4\3\4\7\4%\n\4"+
		"\f\4\16\4(\13\4\3\5\3\5\3\5\3\5\3\5\6\5/\n\5\r\5\16\5\60\3\5\3\5\3\5\3"+
		"\5\5\5\67\n\5\3\5\3\5\3\6\3\6\5\6=\n\6\3\6\5\6@\n\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\5\n[\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\n\13\3\2\22\23\2"+
		"f\2\33\3\2\2\2\4\37\3\2\2\2\6!\3\2\2\2\b)\3\2\2\2\n:\3\2\2\2\fE\3\2\2"+
		"\2\16G\3\2\2\2\20Q\3\2\2\2\22Z\3\2\2\2\24\\\3\2\2\2\26`\3\2\2\2\30d\3"+
		"\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36\3\3\2\2\2\37 \5\b\5\2 \5\3\2\2\2!&\5\f\7\2\"#\7\3\2\2#%\5\f"+
		"\7\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2)"+
		"*\7\22\2\2*+\7\4\2\2+,\7\5\2\2,.\7\6\2\2-/\5\6\4\2.-\3\2\2\2/\60\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\7\2\2\63\64\7\b\2\2"+
		"\64\66\5\22\n\2\65\67\5\22\n\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3\2\2\2"+
		"89\7\t\2\29\t\3\2\2\2:<\t\2\2\2;=\7\f\2\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2"+
		"\2>@\7\r\2\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\6\2\2BC\5\6\4\2CD\7\7\2"+
		"\2D\13\3\2\2\2EF\t\3\2\2F\r\3\2\2\2GH\7\16\2\2HI\7\6\2\2IJ\5\20\t\2JK"+
		"\7\7\2\2KL\7\b\2\2LM\5\22\n\2MN\5\22\n\2NO\5\22\n\2OP\7\t\2\2P\17\3\2"+
		"\2\2QR\5\f\7\2RS\7\17\2\2ST\5\f\7\2T\21\3\2\2\2U[\5\30\r\2V[\5\26\f\2"+
		"W[\5\n\6\2X[\5\16\b\2Y[\5\24\13\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2"+
		"\2\2ZY\3\2\2\2[\23\3\2\2\2\\]\7\22\2\2]^\7\4\2\2^_\5\26\f\2_\25\3\2\2"+
		"\2`a\7\22\2\2ab\7\21\2\2bc\t\3\2\2c\27\3\2\2\2de\7\20\2\2ef\5\22\n\2f"+
		"g\7\7\2\2g\31\3\2\2\2\t\35&\60\66<?Z";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}