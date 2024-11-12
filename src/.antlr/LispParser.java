// Generated from c:/Aya/University/University work/Programming/compiler/compiler/src/LispParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFVAR=1, SETQ=2, LET=3, LET_STAR=4, IF=5, COND=6, LAMBDA=7, FUNCALL=8, 
		DEFUN=9, DOTIMES=10, DOLIST=11, PRINT=12, FORMAT=13, SPECIAL_IDENTIFIER=14, 
		TERMINAL=15, ID=16, TRUE=17, FALSE=18, ATOMIC_SYMBOL=19, STRING=20, NUMBER=21, 
		LPAREN=22, RPAREN=23, WS=24, COMMENT=25, MULTI_LINE_COMMENT=26, ADD=27, 
		SUB=28, MUL=29, DIV=30, AND=31, OR=32, NOT=33, EQUAL=34, NOTEQUAL=35, 
		LT=36, GT=37, LE=38, GE=39;
	public static final int
		RULE_lisp_ = 0, RULE_expression = 1, RULE_function = 2, RULE_variableDeclaration = 3, 
		RULE_conditional = 4, RULE_condClause = 5, RULE_loop = 6, RULE_call = 7, 
		RULE_atom = 8, RULE_arithmetic = 9, RULE_logical = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"lisp_", "expression", "function", "variableDeclaration", "conditional", 
			"condClause", "loop", "call", "atom", "arithmetic", "logical"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'defvar'", "'setq'", "'let'", "'let*'", "'if'", "'cond'", "'lambda'", 
			"'funcall'", "'defun'", "'dotimes'", "'dolist'", "'print'", "'format'", 
			null, "'t'", null, "'T'", "'nil'", null, null, null, "'('", "')'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'and'", "'or'", "'not'", "'='", 
			"'/='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFVAR", "SETQ", "LET", "LET_STAR", "IF", "COND", "LAMBDA", "FUNCALL", 
			"DEFUN", "DOTIMES", "DOLIST", "PRINT", "FORMAT", "SPECIAL_IDENTIFIER", 
			"TERMINAL", "ID", "TRUE", "FALSE", "ATOMIC_SYMBOL", "STRING", "NUMBER", 
			"LPAREN", "RPAREN", "WS", "COMMENT", "MULTI_LINE_COMMENT", "ADD", "SUB", 
			"MUL", "DIV", "AND", "OR", "NOT", "EQUAL", "NOTEQUAL", "LT", "GT", "LE", 
			"GE"
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
	public String getGrammarFileName() { return "LispParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lisp_Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Lisp_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lisp_; }
	}

	public final Lisp_Context lisp_() throws RecognitionException {
		Lisp_Context _localctx = new Lisp_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_lisp_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				expression();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7798784L) != 0) );
			setState(27);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				atom();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(LispParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(LispParser.LPAREN, i);
		}
		public TerminalNode DEFUN() { return getToken(LispParser.DEFUN, 0); }
		public List<TerminalNode> ID() { return getTokens(LispParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LispParser.ID, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(LispParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LispParser.RPAREN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LPAREN);
			setState(38);
			match(DEFUN);
			setState(39);
			match(ID);
			setState(40);
			match(LPAREN);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(41);
				match(ID);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(RPAREN);
			setState(48);
			expression();
			setState(49);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode DEFVAR() { return getToken(LispParser.DEFVAR, 0); }
		public TerminalNode SETQ() { return getToken(LispParser.SETQ, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LPAREN);
			setState(52);
			_la = _input.LA(1);
			if ( !(_la==DEFVAR || _la==SETQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
			match(ID);
			setState(54);
			expression();
			setState(55);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(LispParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(LispParser.LPAREN, i);
		}
		public TerminalNode IF() { return getToken(LispParser.IF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(LispParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LispParser.RPAREN, i);
		}
		public TerminalNode COND() { return getToken(LispParser.COND, 0); }
		public List<CondClauseContext> condClause() {
			return getRuleContexts(CondClauseContext.class);
		}
		public CondClauseContext condClause(int i) {
			return getRuleContext(CondClauseContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditional);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(LPAREN);
				setState(58);
				match(IF);
				setState(59);
				expression();
				setState(60);
				expression();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7798784L) != 0)) {
					{
					setState(61);
					expression();
					}
				}

				setState(64);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(LPAREN);
				setState(67);
				match(COND);
				setState(68);
				match(LPAREN);
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69);
					condClause();
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(74);
				match(RPAREN);
				setState(75);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondClauseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public CondClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condClause; }
	}

	public final CondClauseContext condClause() throws RecognitionException {
		CondClauseContext _localctx = new CondClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LPAREN);
			setState(80);
			expression();
			setState(81);
			expression();
			setState(82);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(LispParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(LispParser.LPAREN, i);
		}
		public TerminalNode DOTIMES() { return getToken(LispParser.DOTIMES, 0); }
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(LispParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LispParser.RPAREN, i);
		}
		public TerminalNode DOLIST() { return getToken(LispParser.DOLIST, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(LPAREN);
				setState(85);
				match(DOTIMES);
				setState(86);
				match(LPAREN);
				setState(87);
				match(ID);
				setState(88);
				expression();
				setState(89);
				match(RPAREN);
				setState(90);
				expression();
				setState(91);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(LPAREN);
				setState(94);
				match(DOLIST);
				setState(95);
				match(LPAREN);
				setState(96);
				match(ID);
				setState(97);
				expression();
				setState(98);
				match(RPAREN);
				setState(99);
				expression();
				setState(100);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LPAREN);
			setState(105);
			match(ID);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7798784L) != 0)) {
				{
				{
				setState(106);
				expression();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LispParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(LispParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LispParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(LispParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LispParser.STRING, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3604480L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode ADD() { return getToken(LispParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LispParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(LispParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LispParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LPAREN);
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				expression();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7798784L) != 0) );
			setState(123);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public TerminalNode AND() { return getToken(LispParser.AND, 0); }
		public TerminalNode OR() { return getToken(LispParser.OR, 0); }
		public TerminalNode NOT() { return getToken(LispParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical; }
	}

	public final LogicalContext logical() throws RecognitionException {
		LogicalContext _localctx = new LogicalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LPAREN);
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				expression();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7798784L) != 0) );
			setState(132);
			match(RPAREN);
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
		"\u0004\u0001\'\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002+\b\u0002\n\u0002\f\u0002.\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004?\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004G\b\u0004\u000b\u0004"+
		"\f\u0004H\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006g\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007l\b\u0007\n\u0007"+
		"\f\u0007o\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0004\tx\b\t\u000b\t\f\ty\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u0081\b\n\u000b\n\f\n\u0082\u0001\n\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0004"+
		"\u0001\u0000\u0001\u0002\u0002\u0000\u0010\u0012\u0014\u0015\u0001\u0000"+
		"\u001b\u001e\u0001\u0000\u001f!\u0089\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0002#\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u00063"+
		"\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000"+
		"\u0000\ff\u0001\u0000\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010"+
		"r\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000\u0014}\u0001"+
		"\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d$\u0003\u0004\u0002\u0000\u001e$\u0003\u0006\u0003"+
		"\u0000\u001f$\u0003\b\u0004\u0000 $\u0003\f\u0006\u0000!$\u0003\u000e"+
		"\u0007\u0000\"$\u0003\u0010\b\u0000#\u001d\u0001\u0000\u0000\u0000#\u001e"+
		"\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000# \u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000$\u0003"+
		"\u0001\u0000\u0000\u0000%&\u0005\u0016\u0000\u0000&\'\u0005\t\u0000\u0000"+
		"\'(\u0005\u0010\u0000\u0000(,\u0005\u0016\u0000\u0000)+\u0005\u0010\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0017\u0000\u000001\u0003\u0002\u0001\u0000"+
		"12\u0005\u0017\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005\u0016"+
		"\u0000\u000045\u0007\u0000\u0000\u000056\u0005\u0010\u0000\u000067\u0003"+
		"\u0002\u0001\u000078\u0005\u0017\u0000\u00008\u0007\u0001\u0000\u0000"+
		"\u00009:\u0005\u0016\u0000\u0000:;\u0005\u0005\u0000\u0000;<\u0003\u0002"+
		"\u0001\u0000<>\u0003\u0002\u0001\u0000=?\u0003\u0002\u0001\u0000>=\u0001"+
		"\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0017\u0000\u0000AN\u0001\u0000\u0000\u0000BC\u0005\u0016\u0000"+
		"\u0000CD\u0005\u0006\u0000\u0000DF\u0005\u0016\u0000\u0000EG\u0003\n\u0005"+
		"\u0000FE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005"+
		"\u0017\u0000\u0000KL\u0005\u0017\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"M9\u0001\u0000\u0000\u0000MB\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000"+
		"\u0000OP\u0005\u0016\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0003\u0002"+
		"\u0001\u0000RS\u0005\u0017\u0000\u0000S\u000b\u0001\u0000\u0000\u0000"+
		"TU\u0005\u0016\u0000\u0000UV\u0005\n\u0000\u0000VW\u0005\u0016\u0000\u0000"+
		"WX\u0005\u0010\u0000\u0000XY\u0003\u0002\u0001\u0000YZ\u0005\u0017\u0000"+
		"\u0000Z[\u0003\u0002\u0001\u0000[\\\u0005\u0017\u0000\u0000\\g\u0001\u0000"+
		"\u0000\u0000]^\u0005\u0016\u0000\u0000^_\u0005\u000b\u0000\u0000_`\u0005"+
		"\u0016\u0000\u0000`a\u0005\u0010\u0000\u0000ab\u0003\u0002\u0001\u0000"+
		"bc\u0005\u0017\u0000\u0000cd\u0003\u0002\u0001\u0000de\u0005\u0017\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fT\u0001\u0000\u0000\u0000f]\u0001\u0000"+
		"\u0000\u0000g\r\u0001\u0000\u0000\u0000hi\u0005\u0016\u0000\u0000im\u0005"+
		"\u0010\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0017"+
		"\u0000\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0007\u0001\u0000\u0000"+
		"s\u0011\u0001\u0000\u0000\u0000tu\u0005\u0016\u0000\u0000uw\u0007\u0002"+
		"\u0000\u0000vx\u0003\u0002\u0001\u0000wv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{|\u0005\u0017\u0000\u0000|\u0013\u0001\u0000"+
		"\u0000\u0000}~\u0005\u0016\u0000\u0000~\u0080\u0007\u0003\u0000\u0000"+
		"\u007f\u0081\u0003\u0002\u0001\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\u0017\u0000\u0000\u0085\u0015\u0001\u0000\u0000\u0000"+
		"\n\u0019#,>HMfmy\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}