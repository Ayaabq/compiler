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
		DEFUN=9, DOTIMES=10, DOLIST=11, PRINT=12, FORMAT=13, ID=14, T=15, NIL=16, 
		KEYWORD=17, SPECIAL_IDENTIFIER=18, TERMINAL=19, ATOMIC_SYMBOL=20, STRING=21, 
		INTEGER=22, REAL=23, RATIONAL=24, COMPLEX=25, LPAREN=26, RPAREN=27, WS=28, 
		COMMENT=29, MULTI_LINE_COMMENT=30, ADD=31, SUB=32, MUL=33, DIV=34, AND=35, 
		OR=36, NOT=37, EQUAL=38, NOTEQUAL=39, LT=40, GT=41, LE=42, GE=43;
	public static final int
		RULE_lisp_ = 0, RULE_expression = 1, RULE_function = 2, RULE_variableDeclaration = 3, 
		RULE_conditional = 4, RULE_condClause = 5, RULE_loop = 6, RULE_call = 7, 
		RULE_arithmetic = 8, RULE_logical = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"lisp_", "expression", "function", "variableDeclaration", "conditional", 
			"condClause", "loop", "call", "arithmetic", "logical"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'t'", null, null, null, null, 
			null, null, "'('", "')'", null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'and'", "'or'", "'not'", "'='", "'/='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFVAR", "SETQ", "LET", "LET_STAR", "IF", "COND", "LAMBDA", "FUNCALL", 
			"DEFUN", "DOTIMES", "DOLIST", "PRINT", "FORMAT", "ID", "T", "NIL", "KEYWORD", 
			"SPECIAL_IDENTIFIER", "TERMINAL", "ATOMIC_SYMBOL", "STRING", "INTEGER", 
			"REAL", "RATIONAL", "COMPLEX", "LPAREN", "RPAREN", "WS", "COMMENT", "MULTI_LINE_COMMENT", 
			"ADD", "SUB", "MUL", "DIV", "AND", "OR", "NOT", "EQUAL", "NOTEQUAL", 
			"LT", "GT", "LE", "GE"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				expression();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(25);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				call();
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
			setState(34);
			match(LPAREN);
			setState(35);
			match(DEFUN);
			setState(36);
			match(ID);
			setState(37);
			match(LPAREN);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(38);
				match(ID);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(RPAREN);
			setState(45);
			expression();
			setState(46);
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
			setState(48);
			match(LPAREN);
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==DEFVAR || _la==SETQ) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(50);
			match(ID);
			setState(51);
			expression();
			setState(52);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(LPAREN);
				setState(55);
				match(IF);
				setState(56);
				expression();
				setState(57);
				expression();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(58);
					expression();
					}
				}

				setState(61);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(LPAREN);
				setState(64);
				match(COND);
				setState(65);
				match(LPAREN);
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					condClause();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(71);
				match(RPAREN);
				setState(72);
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
			setState(76);
			match(LPAREN);
			setState(77);
			expression();
			setState(78);
			expression();
			setState(79);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(LPAREN);
				setState(82);
				match(DOTIMES);
				setState(83);
				match(LPAREN);
				setState(84);
				match(ID);
				setState(85);
				expression();
				setState(86);
				match(RPAREN);
				setState(87);
				expression();
				setState(88);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(LPAREN);
				setState(91);
				match(DOLIST);
				setState(92);
				match(LPAREN);
				setState(93);
				match(ID);
				setState(94);
				expression();
				setState(95);
				match(RPAREN);
				setState(96);
				expression();
				setState(97);
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
			setState(101);
			match(LPAREN);
			setState(102);
			match(ID);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(103);
				expression();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		enterRule(_localctx, 16, RULE_arithmetic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LPAREN);
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				expression();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(118);
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
		enterRule(_localctx, 18, RULE_logical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LPAREN);
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				expression();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(127);
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
		"\u0004\u0001+\u0082\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0004\u0000\u0016\b\u0000\u000b"+
		"\u0000\f\u0000\u0017\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002(\b\u0002\n\u0002"+
		"\f\u0002+\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004<\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0004\u0004D\b\u0004\u000b\u0004\f\u0004E\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004K\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006d\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007i\b\u0007\n\u0007\f\u0007l\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\bs\b\b\u000b\b\f\bt\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0004\t|\b\t\u000b\t\f\t}\u0001\t\u0001"+
		"\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0000\u0003\u0001\u0000\u0001\u0002\u0001\u0000\u001f\"\u0001\u0000#"+
		"%\u0084\u0000\u0015\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000"+
		"\u0004\"\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000\u0000\bJ\u0001"+
		"\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000"+
		"\u000ee\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012x"+
		"\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001"+
		"\u0001\u0000\u0000\u0000\u001b!\u0003\u0004\u0002\u0000\u001c!\u0003\u0006"+
		"\u0003\u0000\u001d!\u0003\b\u0004\u0000\u001e!\u0003\f\u0006\u0000\u001f"+
		"!\u0003\u000e\u0007\u0000 \u001b\u0001\u0000\u0000\u0000 \u001c\u0001"+
		"\u0000\u0000\u0000 \u001d\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 \u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\""+
		"#\u0005\u001a\u0000\u0000#$\u0005\t\u0000\u0000$%\u0005\u000e\u0000\u0000"+
		"%)\u0005\u001a\u0000\u0000&(\u0005\u000e\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005"+
		"\u001b\u0000\u0000-.\u0003\u0002\u0001\u0000./\u0005\u001b\u0000\u0000"+
		"/\u0005\u0001\u0000\u0000\u000001\u0005\u001a\u0000\u000012\u0007\u0000"+
		"\u0000\u000023\u0005\u000e\u0000\u000034\u0003\u0002\u0001\u000045\u0005"+
		"\u001b\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u0005\u001a\u0000"+
		"\u000078\u0005\u0005\u0000\u000089\u0003\u0002\u0001\u00009;\u0003\u0002"+
		"\u0001\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0005\u001b\u0000\u0000"+
		">K\u0001\u0000\u0000\u0000?@\u0005\u001a\u0000\u0000@A\u0005\u0006\u0000"+
		"\u0000AC\u0005\u001a\u0000\u0000BD\u0003\n\u0005\u0000CB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u001b\u0000\u0000HI\u0005"+
		"\u001b\u0000\u0000IK\u0001\u0000\u0000\u0000J6\u0001\u0000\u0000\u0000"+
		"J?\u0001\u0000\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u001a\u0000"+
		"\u0000MN\u0003\u0002\u0001\u0000NO\u0003\u0002\u0001\u0000OP\u0005\u001b"+
		"\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QR\u0005\u001a\u0000\u0000"+
		"RS\u0005\n\u0000\u0000ST\u0005\u001a\u0000\u0000TU\u0005\u000e\u0000\u0000"+
		"UV\u0003\u0002\u0001\u0000VW\u0005\u001b\u0000\u0000WX\u0003\u0002\u0001"+
		"\u0000XY\u0005\u001b\u0000\u0000Yd\u0001\u0000\u0000\u0000Z[\u0005\u001a"+
		"\u0000\u0000[\\\u0005\u000b\u0000\u0000\\]\u0005\u001a\u0000\u0000]^\u0005"+
		"\u000e\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0005\u001b\u0000\u0000"+
		"`a\u0003\u0002\u0001\u0000ab\u0005\u001b\u0000\u0000bd\u0001\u0000\u0000"+
		"\u0000cQ\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000d\r\u0001\u0000"+
		"\u0000\u0000ef\u0005\u001a\u0000\u0000fj\u0005\u000e\u0000\u0000gi\u0003"+
		"\u0002\u0001\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u001b\u0000\u0000n\u000f\u0001"+
		"\u0000\u0000\u0000op\u0005\u001a\u0000\u0000pr\u0007\u0001\u0000\u0000"+
		"qs\u0003\u0002\u0001\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0005\u001b\u0000\u0000w\u0011\u0001\u0000\u0000\u0000"+
		"xy\u0005\u001a\u0000\u0000y{\u0007\u0002\u0000\u0000z|\u0003\u0002\u0001"+
		"\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\u001b\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000"+
		"\n\u0017 );EJcjt}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}