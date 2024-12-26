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
		TERMINAL=54, IDENTIFIER=55, LPAREN=56, RPAREN=57, INTEGER=58, REAL=59, 
		RATIONAL=60, COMPLEX=61, WS=62, COMMENT=63, MULTI_LINE_COMMENT=64, ADD=65, 
		SUB=66, MUL=67, DIV=68, CONCATENATE=69, NOTEQUAL=70, LT=71, GT=72, LE=73, 
		GE=74, EQ=75, EQUAL=76, EQL=77, NUM_EQ=78, SORT=79, STABLE_SORT=80, MAKE_ARRAY=81, 
		AREF=82, DEFSTRUCT=83, MAKE_STRUCT=84, FIELD_ACCESS=85, DEFPARAMETER=86, 
		ATOMIC_SYMBOL=87, STRING_START=88, ERROR_CHAR=89, FORMAT_CONTENT=90, FORMAT_DIRECTIVE_T=91, 
		FORMAT_DIRECTIVE_S=92, FORMAT_DIRECTIVE_A=93, FORMAT_DIRECTIVE_D=94, FORMAT_DIRECTIVE_F=95, 
		FORMAT_DIRECTIVE_E=96, FORMAT_DIRECTIVE_G=97, FORMAT_DIRECTIVE_L=98, FORMAT_DIRECTIVE_R=99, 
		FORMAT_NEWLINE=100, ESCAPED_CHARS=101, FORMAT_END=102, FORMAT_ERROR_CHAR=103, 
		STRING_CONTENT=104, ESCAPED_CHAR=105, STRING_ERROR_CHAR=106, STRING_END=107;
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
			null, null, null, null, null, null, "'t'", null, "'('", null, null, null, 
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", null, "'/='", 
			"'<'", "'>'", "'<='", "'>='", null, null, null, "'='"
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
			"PUSH", "POP", "KEYWORD", "SPECIAL_IDENTIFIER", "TERMINAL", "IDENTIFIER", 
			"LPAREN", "RPAREN", "INTEGER", "REAL", "RATIONAL", "COMPLEX", "WS", "COMMENT", 
			"MULTI_LINE_COMMENT", "ADD", "SUB", "MUL", "DIV", "CONCATENATE", "NOTEQUAL", 
			"LT", "GT", "LE", "GE", "EQ", "EQUAL", "EQL", "NUM_EQ", "SORT", "STABLE_SORT", 
			"MAKE_ARRAY", "AREF", "DEFSTRUCT", "MAKE_STRUCT", "FIELD_ACCESS", "DEFPARAMETER", 
			"ATOMIC_SYMBOL", "STRING_START", "ERROR_CHAR", "FORMAT_CONTENT", "FORMAT_DIRECTIVE_T", 
			"FORMAT_DIRECTIVE_S", "FORMAT_DIRECTIVE_A", "FORMAT_DIRECTIVE_D", "FORMAT_DIRECTIVE_F", 
			"FORMAT_DIRECTIVE_E", "FORMAT_DIRECTIVE_G", "FORMAT_DIRECTIVE_L", "FORMAT_DIRECTIVE_R", 
			"FORMAT_NEWLINE", "ESCAPED_CHARS", "FORMAT_END", "FORMAT_ERROR_CHAR", 
			"STRING_CONTENT", "ESCAPED_CHAR", "STRING_ERROR_CHAR", "STRING_END"
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
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842679L) != 0)) {
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				match(IDENTIFIER);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
			setState(65);
			match(LPAREN);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842679L) != 0)) {
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(66);
					statement();
					}
					break;
				case 2:
					{
					setState(67);
					expression();
					}
					break;
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
			setState(75);
			match(LPAREN);
			setState(76);
			match(IF);
			setState(77);
			condition();
			setState(78);
			expression();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842679L) != 0)) {
				{
				setState(79);
				expression();
				}
			}

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
			setState(84);
			match(LPAREN);
			setState(85);
			match(DOTIMES);
			setState(86);
			match(LPAREN);
			setState(87);
			match(IDENTIFIER);
			setState(88);
			expression();
			setState(89);
			match(RPAREN);
			setState(90);
			block();
			setState(91);
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
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
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
			setState(99);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842675L) != 0)) ) {
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
			setState(101);
			match(LPAREN);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842679L) != 0)) {
				{
				{
				setState(102);
				expression();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
			setState(110);
			match(LPAREN);
			setState(111);
			operator();
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				expression();
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842679L) != 0) );
			setState(117);
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
			setState(119);
			match(LPAREN);
			setState(120);
			match(FUNCALL);
			setState(121);
			match(IDENTIFIER);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842679L) != 0)) {
				{
				{
				setState(122);
				expression();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
			setState(130);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 3285381545991L) != 0)) ) {
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
			setState(132);
			match(LPAREN);
			setState(133);
			operator();
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				expression();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 1125899906842679L) != 0) );
			setState(139);
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
		"\u0004\u0001k\u008e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004>\b\u0004"+
		"\u000b\u0004\f\u0004?\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006Q\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bb\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005"+
		"\nh\b\n\n\n\f\nk\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000br\b\u000b\u000b\u000b\f\u000bs\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f|\b\f\n\f\f\f\u007f\t\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0088"+
		"\b\u000e\u000b\u000e\f\u000e\u0089\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0002\u0003\u000067:;hh\u0004\u0000%\'"+
		"ADGLNN\u008e\u0000!\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000"+
		"\u0004-\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b=\u0001"+
		"\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000"+
		"\u000eT\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012c"+
		"\u0001\u0000\u0000\u0000\u0014e\u0001\u0000\u0000\u0000\u0016n\u0001\u0000"+
		"\u0000\u0000\u0018w\u0001\u0000\u0000\u0000\u001a\u0082\u0001\u0000\u0000"+
		"\u0000\u001c\u0084\u0001\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000"+
		"\u001f\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f"+
		"\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000$%\u0005\u0000\u0000\u0001%\u0001\u0001"+
		"\u0000\u0000\u0000&,\u0003\u0004\u0002\u0000\',\u0003\u0006\u0003\u0000"+
		"(,\u0003\f\u0006\u0000),\u0003\u000e\u0007\u0000*,\u0003\u0010\b\u0000"+
		"+&\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,\u0003\u0001"+
		"\u0000\u0000\u0000-.\u00058\u0000\u0000./\u0005\u0002\u0000\u0000/0\u0005"+
		"7\u0000\u000001\u0003\u0010\b\u000012\u00059\u0000\u00002\u0005\u0001"+
		"\u0000\u0000\u000034\u00058\u0000\u000045\u0005\t\u0000\u000056\u0005"+
		"7\u0000\u000067\u00058\u0000\u000078\u0003\b\u0004\u000089\u00059\u0000"+
		"\u00009:\u0003\n\u0005\u0000:;\u00059\u0000\u0000;\u0007\u0001\u0000\u0000"+
		"\u0000<>\u00057\u0000\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\t\u0001\u0000"+
		"\u0000\u0000AF\u00058\u0000\u0000BE\u0003\u0002\u0001\u0000CE\u0003\u0010"+
		"\b\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001"+
		"\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IJ\u00059\u0000\u0000J\u000b"+
		"\u0001\u0000\u0000\u0000KL\u00058\u0000\u0000LM\u0005\u0005\u0000\u0000"+
		"MN\u0003\u001c\u000e\u0000NP\u0003\u0010\b\u0000OQ\u0003\u0010\b\u0000"+
		"PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u00059\u0000\u0000S\r\u0001\u0000\u0000\u0000TU\u00058\u0000"+
		"\u0000UV\u0005\n\u0000\u0000VW\u00058\u0000\u0000WX\u00057\u0000\u0000"+
		"XY\u0003\u0010\b\u0000YZ\u00059\u0000\u0000Z[\u0003\n\u0005\u0000[\\\u0005"+
		"9\u0000\u0000\\\u000f\u0001\u0000\u0000\u0000]b\u0003\u0012\t\u0000^b"+
		"\u0003\u0014\n\u0000_b\u0003\u0016\u000b\u0000`b\u0003\u0018\f\u0000a"+
		"]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000a`\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0007"+
		"\u0000\u0000\u0000d\u0013\u0001\u0000\u0000\u0000ei\u00058\u0000\u0000"+
		"fh\u0003\u0010\b\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000lm\u00059\u0000\u0000m\u0015\u0001\u0000"+
		"\u0000\u0000no\u00058\u0000\u0000oq\u0003\u001a\r\u0000pr\u0003\u0010"+
		"\b\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0005"+
		"9\u0000\u0000v\u0017\u0001\u0000\u0000\u0000wx\u00058\u0000\u0000xy\u0005"+
		"\b\u0000\u0000y}\u00057\u0000\u0000z|\u0003\u0010\b\u0000{z\u0001\u0000"+
		"\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u00059\u0000\u0000\u0081\u0019\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0007\u0001\u0000\u0000\u0083\u001b\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u00058\u0000\u0000\u0085\u0087\u0003\u001a\r"+
		"\u0000\u0086\u0088\u0003\u0010\b\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u00059\u0000\u0000\u008c\u001d\u0001\u0000\u0000\u0000\u000b"+
		"!+?DFPais}\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}