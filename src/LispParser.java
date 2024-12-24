// Generated from C:/Users/ASUS/Desktop/compiler/src/LispParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFVAR=1, SETQ=2, LET=3, LET_STAR=4, IF=5, COND=6, LAMBDA=7, FUNCALL=8, 
		DEFUN=9, DOTIMES=10, DOLIST=11, PRINT=12, FORMAT=13, FORMAT_T=14, FORMAT_NIL=15, 
		OPTIONAL=16, REST=17, KEY=18, FLOOR=19, CEILING=20, MOD=21, SIN=22, COS=23, 
		TAN=24, SQRT=25, EXP=26, EXPT=27, CONS=28, CAR=29, CDR=30, SETF=31, WHEN=32, 
		UNLESS=33, CASE=34, OTHERWISE=35, PROGN=36, AND=37, OR=38, NOT=39, APPLY=40, 
		MAPCAR=41, RETURN_FROM=42, BLOCK=43, RETURN=44, ERROR=45, LOOP=46, DO=47, 
		DO_STAR=48, LIST=49, PUSH=50, POP=51, KEYWORD=52, SPECIAL_IDENTIFIER=53, 
		TERMINAL=54, LPAREN=55, RPAREN=56, INTEGER=57, REAL=58, RATIONAL=59, COMPLEX=60, 
		WS=61, COMMENT=62, MULTI_LINE_COMMENT=63, ADD=64, SUB=65, MUL=66, DIV=67, 
		CONCATENATE=68, NOTEQUAL=69, LT=70, GT=71, LE=72, GE=73, EQ=74, EQUAL=75, 
		EQL=76, NUM_EQ=77, SORT=78, STABLE_SORT=79, QUOTE=80, FUNCTION=81, SPECIAL_VARIABLE=82, 
		MAKE_ARRAY=83, AREF=84, DEFSTRUCT=85, MAKE_STRUCT=86, FIELD_ACCESS=87, 
		DEFPARAMETER=88, ATOMIC_SYMBOL=89, STRING_START=90, ERROR_CHAR=91, FORMAT_CONTENT=92, 
		FORMAT_DIRECTIVE_T=93, FORMAT_DIRECTIVE_S=94, FORMAT_DIRECTIVE_A=95, FORMAT_DIRECTIVE_D=96, 
		FORMAT_DIRECTIVE_F=97, FORMAT_DIRECTIVE_E=98, FORMAT_DIRECTIVE_G=99, FORMAT_DIRECTIVE_L=100, 
		FORMAT_DIRECTIVE_R=101, FORMAT_NEWLINE=102, ESCAPED_CHARS=103, FORMAT_END=104, 
		FORMAT_ERROR_CHAR=105, STRING_CONTENT=106, ESCAPED_CHAR=107, STRING_ERROR_CHAR=108, 
		STRING_END=109, IDENTIFIER=110;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variable_definition = 2, RULE_function_definition = 3, 
		RULE_parameter_list = 4, RULE_block = 5, RULE_conditional = 6, RULE_loop = 7, 
		RULE_expression = 8, RULE_atom = 9, RULE_list = 10, RULE_operation = 11, 
		RULE_function_call = 12, RULE_operator = 13, RULE_condition = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variable_definition", "function_definition", 
			"parameter_list", "block", "conditional", "loop", "expression", "atom", 
			"list", "operation", "function_call", "operator", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'t'", "'('", null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", null, "'/='", "'<'", 
			"'>'", "'<='", "'>='", null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFVAR", "SETQ", "LET", "LET_STAR", "IF", "COND", "LAMBDA", "FUNCALL", 
			"DEFUN", "DOTIMES", "DOLIST", "PRINT", "FORMAT", "FORMAT_T", "FORMAT_NIL", 
			"OPTIONAL", "REST", "KEY", "FLOOR", "CEILING", "MOD", "SIN", "COS", "TAN", 
			"SQRT", "EXP", "EXPT", "CONS", "CAR", "CDR", "SETF", "WHEN", "UNLESS", 
			"CASE", "OTHERWISE", "PROGN", "AND", "OR", "NOT", "APPLY", "MAPCAR", 
			"RETURN_FROM", "BLOCK", "RETURN", "ERROR", "LOOP", "DO", "DO_STAR", "LIST", 
			"PUSH", "POP", "KEYWORD", "SPECIAL_IDENTIFIER", "TERMINAL", "LPAREN", 
			"RPAREN", "INTEGER", "REAL", "RATIONAL", "COMPLEX", "WS", "COMMENT", 
			"MULTI_LINE_COMMENT", "ADD", "SUB", "MUL", "DIV", "CONCATENATE", "NOTEQUAL", 
			"LT", "GT", "LE", "GE", "EQ", "EQUAL", "EQL", "NUM_EQ", "SORT", "STABLE_SORT", 
			"QUOTE", "FUNCTION", "SPECIAL_VARIABLE", "MAKE_ARRAY", "AREF", "DEFSTRUCT", 
			"MAKE_STRUCT", "FIELD_ACCESS", "DEFPARAMETER", "ATOMIC_SYMBOL", "STRING_START", 
			"ERROR_CHAR", "FORMAT_CONTENT", "FORMAT_DIRECTIVE_T", "FORMAT_DIRECTIVE_S", 
			"FORMAT_DIRECTIVE_A", "FORMAT_DIRECTIVE_D", "FORMAT_DIRECTIVE_F", "FORMAT_DIRECTIVE_E", 
			"FORMAT_DIRECTIVE_G", "FORMAT_DIRECTIVE_L", "FORMAT_DIRECTIVE_R", "FORMAT_NEWLINE", 
			"ESCAPED_CHARS", "FORMAT_END", "FORMAT_ERROR_CHAR", "STRING_CONTENT", 
			"ESCAPED_CHAR", "STRING_ERROR_CHAR", "STRING_END", "IDENTIFIER"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LispParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298459L) != 0)) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
	public static class StatementContext extends ParserRuleContext {
		public Variable_definitionContext variable_definition() {
			return getRuleContext(Variable_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				variable_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				function_definition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				conditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				expression();
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
	public static class Variable_definitionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode SETQ() { return getToken(LispParser.SETQ, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public Variable_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_definition; }
	}

	public final Variable_definitionContext variable_definition() throws RecognitionException {
		Variable_definitionContext _localctx = new Variable_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(LPAREN);
			setState(46);
			match(SETQ);
			setState(47);
			match(IDENTIFIER);
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
	public static class Function_definitionContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(LispParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(LispParser.LPAREN, i);
		}
		public TerminalNode DEFUN() { return getToken(LispParser.DEFUN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(LispParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LispParser.RPAREN, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LPAREN);
			setState(52);
			match(DEFUN);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(LPAREN);
			setState(55);
			parameter_list();
			setState(56);
			match(RPAREN);
			setState(57);
			block();
			setState(58);
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
	public static class Parameter_listContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LispParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LispParser.IDENTIFIER, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(60);
				match(IDENTIFIER);
				}
				}
				setState(65);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(LPAREN);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298459L) != 0)) {
				{
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(67);
					statement();
					}
					break;
				case 2:
					{
					setState(68);
					expression();
					}
					break;
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode IF() { return getToken(LispParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LPAREN);
			setState(77);
			match(IF);
			setState(78);
			condition();
			setState(79);
			expression();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298459L) != 0)) {
				{
				setState(80);
				expression();
				}
			}

			setState(83);
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
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(LispParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LispParser.RPAREN, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LPAREN);
			setState(86);
			match(DOTIMES);
			setState(87);
			match(LPAREN);
			setState(88);
			match(IDENTIFIER);
			setState(89);
			expression();
			setState(90);
			match(RPAREN);
			setState(91);
			block();
			setState(92);
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
	public static class ExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				function_call();
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(LispParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(LispParser.REAL, 0); }
		public TerminalNode STRING_CONTENT() { return getToken(LispParser.STRING_CONTENT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public TerminalNode TERMINAL() { return getToken(LispParser.TERMINAL, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298457L) != 0)) ) {
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
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(LPAREN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298459L) != 0)) {
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
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LPAREN);
			setState(112);
			operator();
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
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298459L) != 0) );
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public TerminalNode FUNCALL() { return getToken(LispParser.FUNCALL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LispParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LPAREN);
			setState(121);
			match(FUNCALL);
			setState(122);
			match(IDENTIFIER);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298459L) != 0)) {
				{
				{
				setState(123);
				expression();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LispParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LispParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(LispParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LispParser.DIV, 0); }
		public TerminalNode AND() { return getToken(LispParser.AND, 0); }
		public TerminalNode OR() { return getToken(LispParser.OR, 0); }
		public TerminalNode NOT() { return getToken(LispParser.NOT, 0); }
		public TerminalNode LT() { return getToken(LispParser.LT, 0); }
		public TerminalNode GT() { return getToken(LispParser.GT, 0); }
		public TerminalNode LE() { return getToken(LispParser.LE, 0); }
		public TerminalNode GE() { return getToken(LispParser.GE, 0); }
		public TerminalNode EQ() { return getToken(LispParser.EQ, 0); }
		public TerminalNode EQUAL() { return getToken(LispParser.EQUAL, 0); }
		public TerminalNode NUM_EQ() { return getToken(LispParser.NUM_EQ, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 1642690772999L) != 0)) ) {
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
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LispParser.LPAREN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LispParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LPAREN);
			setState(134);
			operator();
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				expression();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 76561193665298459L) != 0) );
			setState(140);
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
		"\u0004\u0001n\u008f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004>\b\u0004"+
		"\n\u0004\f\u0004A\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"F\b\u0005\n\u0005\f\u0005I\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006R\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\ni\b\n\n\n\f\nl\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000bs\b\u000b\u000b\u000b\f\u000bt\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f}\b\f\n\f\f\f\u0080\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0089"+
		"\b\u000e\u000b\u000e\f\u000e\u008a\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0002\u0004\u0000669:jjnn\u0004\u0000%"+
		"\'@CFKMM\u008f\u0000!\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000"+
		"\u0000\u0004-\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b"+
		"?\u0001\u0000\u0000\u0000\nB\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000"+
		"\u0000\u000eU\u0001\u0000\u0000\u0000\u0010b\u0001\u0000\u0000\u0000\u0012"+
		"d\u0001\u0000\u0000\u0000\u0014f\u0001\u0000\u0000\u0000\u0016o\u0001"+
		"\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001a\u0083\u0001\u0000"+
		"\u0000\u0000\u001c\u0085\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001"+
		"\u0000\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000"+
		"\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001"+
		"\u0001\u0000\u0000\u0000&,\u0003\u0004\u0002\u0000\',\u0003\u0006\u0003"+
		"\u0000(,\u0003\f\u0006\u0000),\u0003\u000e\u0007\u0000*,\u0003\u0010\b"+
		"\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0003"+
		"\u0001\u0000\u0000\u0000-.\u00057\u0000\u0000./\u0005\u0002\u0000\u0000"+
		"/0\u0005n\u0000\u000001\u0003\u0010\b\u000012\u00058\u0000\u00002\u0005"+
		"\u0001\u0000\u0000\u000034\u00057\u0000\u000045\u0005\t\u0000\u000056"+
		"\u0005n\u0000\u000067\u00057\u0000\u000078\u0003\b\u0004\u000089\u0005"+
		"8\u0000\u00009:\u0003\n\u0005\u0000:;\u00058\u0000\u0000;\u0007\u0001"+
		"\u0000\u0000\u0000<>\u0005n\u0000\u0000=<\u0001\u0000\u0000\u0000>A\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@\t\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BG\u00057\u0000\u0000"+
		"CF\u0003\u0002\u0001\u0000DF\u0003\u0010\b\u0000EC\u0001\u0000\u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JK\u00058\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0005"+
		"7\u0000\u0000MN\u0005\u0005\u0000\u0000NO\u0003\u001c\u000e\u0000OQ\u0003"+
		"\u0010\b\u0000PR\u0003\u0010\b\u0000QP\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u00058\u0000\u0000T\r\u0001"+
		"\u0000\u0000\u0000UV\u00057\u0000\u0000VW\u0005\n\u0000\u0000WX\u0005"+
		"7\u0000\u0000XY\u0005n\u0000\u0000YZ\u0003\u0010\b\u0000Z[\u00058\u0000"+
		"\u0000[\\\u0003\n\u0005\u0000\\]\u00058\u0000\u0000]\u000f\u0001\u0000"+
		"\u0000\u0000^c\u0003\u0012\t\u0000_c\u0003\u0014\n\u0000`c\u0003\u0016"+
		"\u000b\u0000ac\u0003\u0018\f\u0000b^\u0001\u0000\u0000\u0000b_\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u0011"+
		"\u0001\u0000\u0000\u0000de\u0007\u0000\u0000\u0000e\u0013\u0001\u0000"+
		"\u0000\u0000fj\u00057\u0000\u0000gi\u0003\u0010\b\u0000hg\u0001\u0000"+
		"\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"mn\u00058\u0000\u0000n\u0015\u0001\u0000\u0000\u0000op\u00057\u0000\u0000"+
		"pr\u0003\u001a\r\u0000qs\u0003\u0010\b\u0000rq\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vw\u00058\u0000\u0000w\u0017\u0001\u0000"+
		"\u0000\u0000xy\u00057\u0000\u0000yz\u0005\b\u0000\u0000z~\u0005n\u0000"+
		"\u0000{}\u0003\u0010\b\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u00058\u0000\u0000\u0082\u0019\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0007\u0001\u0000\u0000\u0084\u001b\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u00057\u0000\u0000\u0086\u0088\u0003\u001a\r\u0000\u0087\u0089\u0003"+
		"\u0010\b\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u00058\u0000"+
		"\u0000\u008d\u001d\u0001\u0000\u0000\u0000\u000b!+?EGQbjt~\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}