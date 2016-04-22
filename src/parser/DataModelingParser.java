// Generated from DataModeling.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataModelingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, IDNAME=68;
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_databaseexpression = 2, RULE_createclause = 3, 
		RULE_createtableclause = 4, RULE_createtablecolumns = 5, RULE_createtableaddition = 6, 
		RULE_fieldtype = 7, RULE_width = 8, RULE_widthinteger = 9, RULE_widthdecimal = 10, 
		RULE_decimaloption = 11, RULE_dateclause = 12, RULE_nullclause = 13, RULE_databaseortable = 14, 
		RULE_name = 15, RULE_onerelationexpression = 16, RULE_oldnonterminals = 17, 
		RULE_wselecting = 18, RULE_wselectoptional = 19, RULE_selectexpression = 20, 
		RULE_selectclause = 21, RULE_joinaggregategrouping = 22, RULE_setsrollupcube = 23, 
		RULE_aggregategrouping = 24, RULE_derivedtable = 25, RULE_parenthesisfieldgroup = 26, 
		RULE_parenthesisfieldmultiple = 27, RULE_groupbyclause = 28, RULE_havingclause = 29, 
		RULE_selectionone = 30, RULE_allclause = 31, RULE_distinctclause = 32, 
		RULE_selectiontwo = 33, RULE_selectionthree = 34, RULE_selectionthreeclause = 35, 
		RULE_aggregate = 36, RULE_aggregatefield = 37, RULE_table = 38, RULE_tableclause = 39, 
		RULE_tableaddition = 40, RULE_updating = 41, RULE_updateclause = 42, RULE_updateaddition = 43, 
		RULE_wupdateclause = 44, RULE_wupdateexpressionaddition = 45, RULE_optionaldate = 46, 
		RULE_whereclause = 47, RULE_insertion = 48, RULE_fieldparenthesis = 49, 
		RULE_field = 50, RULE_multiplefieldschoice = 51, RULE_multiplefields = 52, 
		RULE_literal = 53, RULE_literalclause = 54, RULE_deletion = 55, RULE_deleteaddition = 56, 
		RULE_renaming = 57, RULE_term = 58, RULE_restriction = 59, RULE_projection = 60, 
		RULE_attributecommalist = 61, RULE_attributecommalistaddition = 62, RULE_tworelationexpression = 63, 
		RULE_binaryoperation = 64, RULE_comparison = 65, RULE_compare = 66, RULE_number = 67, 
		RULE_numberclause = 68, RULE_val = 69, RULE_attribute = 70, RULE_relation = 71;
	public static final String[] ruleNames = {
		"start", "expression", "databaseexpression", "createclause", "createtableclause", 
		"createtablecolumns", "createtableaddition", "fieldtype", "width", "widthinteger", 
		"widthdecimal", "decimaloption", "dateclause", "nullclause", "databaseortable", 
		"name", "onerelationexpression", "oldnonterminals", "wselecting", "wselectoptional", 
		"selectexpression", "selectclause", "joinaggregategrouping", "setsrollupcube", 
		"aggregategrouping", "derivedtable", "parenthesisfieldgroup", "parenthesisfieldmultiple", 
		"groupbyclause", "havingclause", "selectionone", "allclause", "distinctclause", 
		"selectiontwo", "selectionthree", "selectionthreeclause", "aggregate", 
		"aggregatefield", "table", "tableclause", "tableaddition", "updating", 
		"updateclause", "updateaddition", "wupdateclause", "wupdateexpressionaddition", 
		"optionaldate", "whereclause", "insertion", "fieldparenthesis", "field", 
		"multiplefieldschoice", "multiplefields", "literal", "literalclause", 
		"deletion", "deleteaddition", "renaming", "term", "restriction", "projection", 
		"attributecommalist", "attributecommalistaddition", "tworelationexpression", 
		"binaryoperation", "comparison", "compare", "number", "numberclause", 
		"val", "attribute", "relation"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'SAVE'", "'COMMIT'", "'LOAD'", "'DATABASE'", "'CREATE'", 
		"'DROP'", "'TABLE'", "'('", "')'", "','", "'INTEGER'", "'NUMBER'", "'CHARACTER'", 
		"'DATE'", "'/'", "'NOT'", "'NULL'", "'/* empty */'", "'WSELECT'", "'FROM'", 
		"'*'", "'SELECT'", "'SUM'", "'AS'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", 
		"'ROLLUP'", "'CUBE'", "'HAVING'", "'ALL'", "'DISTINCT'", "'COUNT'", "'AVG'", 
		"'MIN'", "'MAX'", "'UPDATE'", "'SET'", "'WUPDATE'", "'='", "':'", "'TIME'", 
		"'WHERE'", "'INSERT'", "'INTO'", "'VALUES'", "'DELETE'", "'RENAME'", "'+'", 
		"'-'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'0'", "'1'", "'2'", "'3'", 
		"'4'", "'5'", "'6'", "'7'", "'8'", "'9'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "IDNAME"
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
	public String getGrammarFileName() { return "DataModeling.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DataModelingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			expression();
			setState(145);
			match(T__0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public OnerelationexpressionContext onerelationexpression() {
			return getRuleContext(OnerelationexpressionContext.class,0);
		}
		public TworelationexpressionContext tworelationexpression() {
			return getRuleContext(TworelationexpressionContext.class,0);
		}
		public DatabaseexpressionContext databaseexpression() {
			return getRuleContext(DatabaseexpressionContext.class,0);
		}
		public SelectexpressionContext selectexpression() {
			return getRuleContext(SelectexpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				onerelationexpression();
				setState(148);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				tworelationexpression();
				setState(151);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				databaseexpression();
				setState(154);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				selectexpression();
				setState(157);
				match(T__0);
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

	public static class DatabaseexpressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CreateclauseContext createclause() {
			return getRuleContext(CreateclauseContext.class,0);
		}
		public DatabaseortableContext databaseortable() {
			return getRuleContext(DatabaseortableContext.class,0);
		}
		public DatabaseexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDatabaseexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDatabaseexpression(this);
		}
	}

	public final DatabaseexpressionContext databaseexpression() throws RecognitionException {
		DatabaseexpressionContext _localctx = new DatabaseexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_databaseexpression);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(T__3);
				setState(164);
				match(T__4);
				setState(165);
				name();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(T__5);
				setState(167);
				createclause();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(T__6);
				setState(169);
				databaseortable();
				setState(170);
				name();
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

	public static class CreateclauseContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public CreatetableclauseContext createtableclause() {
			return getRuleContext(CreatetableclauseContext.class,0);
		}
		public CreateclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterCreateclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitCreateclause(this);
		}
	}

	public final CreateclauseContext createclause() throws RecognitionException {
		CreateclauseContext _localctx = new CreateclauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createclause);
		try {
			setState(180);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__4);
				setState(175);
				name();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__7);
				setState(177);
				name();
				setState(178);
				createtableclause();
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

	public static class CreatetableclauseContext extends ParserRuleContext {
		public CreatetablecolumnsContext createtablecolumns() {
			return getRuleContext(CreatetablecolumnsContext.class,0);
		}
		public CreatetableclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createtableclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterCreatetableclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitCreatetableclause(this);
		}
	}

	public final CreatetableclauseContext createtableclause() throws RecognitionException {
		CreatetableclauseContext _localctx = new CreatetableclauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createtableclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__8);
			setState(183);
			createtablecolumns();
			setState(184);
			match(T__9);
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

	public static class CreatetablecolumnsContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FieldtypeContext fieldtype() {
			return getRuleContext(FieldtypeContext.class,0);
		}
		public NullclauseContext nullclause() {
			return getRuleContext(NullclauseContext.class,0);
		}
		public CreatetableadditionContext createtableaddition() {
			return getRuleContext(CreatetableadditionContext.class,0);
		}
		public CreatetablecolumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createtablecolumns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterCreatetablecolumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitCreatetablecolumns(this);
		}
	}

	public final CreatetablecolumnsContext createtablecolumns() throws RecognitionException {
		CreatetablecolumnsContext _localctx = new CreatetablecolumnsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createtablecolumns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			name();
			setState(187);
			fieldtype();
			setState(188);
			nullclause();
			setState(189);
			createtableaddition();
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

	public static class CreatetableadditionContext extends ParserRuleContext {
		public CreatetablecolumnsContext createtablecolumns() {
			return getRuleContext(CreatetablecolumnsContext.class,0);
		}
		public CreatetableadditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createtableaddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterCreatetableaddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitCreatetableaddition(this);
		}
	}

	public final CreatetableadditionContext createtableaddition() throws RecognitionException {
		CreatetableadditionContext _localctx = new CreatetableadditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createtableaddition);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__10);
				setState(192);
				createtablecolumns();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FieldtypeContext extends ParserRuleContext {
		public WidthintegerContext widthinteger() {
			return getRuleContext(WidthintegerContext.class,0);
		}
		public WidthdecimalContext widthdecimal() {
			return getRuleContext(WidthdecimalContext.class,0);
		}
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public DateclauseContext dateclause() {
			return getRuleContext(DateclauseContext.class,0);
		}
		public FieldtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterFieldtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitFieldtype(this);
		}
	}

	public final FieldtypeContext fieldtype() throws RecognitionException {
		FieldtypeContext _localctx = new FieldtypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldtype);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__11);
				setState(197);
				widthinteger();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(T__12);
				setState(199);
				widthdecimal();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__13);
				setState(201);
				width();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(T__14);
				setState(203);
				dateclause();
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

	public static class WidthContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWidth(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__8);
			setState(207);
			number();
			setState(208);
			match(T__9);
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

	public static class WidthintegerContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WidthintegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthinteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWidthinteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWidthinteger(this);
		}
	}

	public final WidthintegerContext widthinteger() throws RecognitionException {
		WidthintegerContext _localctx = new WidthintegerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_widthinteger);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__8);
				setState(211);
				number();
				setState(212);
				match(T__9);
				}
				break;
			case T__16:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class WidthdecimalContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DecimaloptionContext decimaloption() {
			return getRuleContext(DecimaloptionContext.class,0);
		}
		public WidthdecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthdecimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWidthdecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWidthdecimal(this);
		}
	}

	public final WidthdecimalContext widthdecimal() throws RecognitionException {
		WidthdecimalContext _localctx = new WidthdecimalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_widthdecimal);
		try {
			setState(223);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__8);
				setState(218);
				number();
				setState(219);
				decimaloption();
				setState(220);
				match(T__9);
				}
				break;
			case T__16:
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DecimaloptionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DecimaloptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimaloption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDecimaloption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDecimaloption(this);
		}
	}

	public final DecimaloptionContext decimaloption() throws RecognitionException {
		DecimaloptionContext _localctx = new DecimaloptionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decimaloption);
		try {
			setState(228);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__10);
				setState(226);
				number();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DateclauseContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public DateclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDateclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDateclause(this);
		}
	}

	public final DateclauseContext dateclause() throws RecognitionException {
		DateclauseContext _localctx = new DateclauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dateclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__8);
			setState(231);
			number();
			setState(232);
			match(T__15);
			setState(233);
			number();
			setState(234);
			match(T__15);
			setState(235);
			number();
			setState(236);
			match(T__9);
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

	public static class NullclauseContext extends ParserRuleContext {
		public NullclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterNullclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitNullclause(this);
		}
	}

	public final NullclauseContext nullclause() throws RecognitionException {
		NullclauseContext _localctx = new NullclauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nullclause);
		try {
			setState(241);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__16);
				setState(239);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__18);
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

	public static class DatabaseortableContext extends ParserRuleContext {
		public DatabaseortableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseortable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDatabaseortable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDatabaseortable(this);
		}
	}

	public final DatabaseortableContext databaseortable() throws RecognitionException {
		DatabaseortableContext _localctx = new DatabaseortableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_databaseortable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDNAME() { return getToken(DataModelingParser.IDNAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(IDNAME);
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

	public static class OnerelationexpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OldnonterminalsContext oldnonterminals() {
			return getRuleContext(OldnonterminalsContext.class,0);
		}
		public DeletionContext deletion() {
			return getRuleContext(DeletionContext.class,0);
		}
		public InsertionContext insertion() {
			return getRuleContext(InsertionContext.class,0);
		}
		public UpdatingContext updating() {
			return getRuleContext(UpdatingContext.class,0);
		}
		public WselectingContext wselecting() {
			return getRuleContext(WselectingContext.class,0);
		}
		public OnerelationexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onerelationexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterOnerelationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitOnerelationexpression(this);
		}
	}

	public final OnerelationexpressionContext onerelationexpression() throws RecognitionException {
		OnerelationexpressionContext _localctx = new OnerelationexpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_onerelationexpression);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case T__8:
			case IDNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				term();
				setState(248);
				oldnonterminals();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				deletion();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				insertion();
				}
				break;
			case T__38:
			case T__40:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				updating();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				wselecting();
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

	public static class OldnonterminalsContext extends ParserRuleContext {
		public RenamingContext renaming() {
			return getRuleContext(RenamingContext.class,0);
		}
		public RestrictionContext restriction() {
			return getRuleContext(RestrictionContext.class,0);
		}
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public OldnonterminalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldnonterminals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterOldnonterminals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitOldnonterminals(this);
		}
	}

	public final OldnonterminalsContext oldnonterminals() throws RecognitionException {
		OldnonterminalsContext _localctx = new OldnonterminalsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_oldnonterminals);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				renaming();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				restriction();
				}
				break;
			case T__0:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				projection();
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

	public static class WselectingContext extends ParserRuleContext {
		public WselectoptionalContext wselectoptional() {
			return getRuleContext(WselectoptionalContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public WhereclauseContext whereclause() {
			return getRuleContext(WhereclauseContext.class,0);
		}
		public WselectingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wselecting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWselecting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWselecting(this);
		}
	}

	public final WselectingContext wselecting() throws RecognitionException {
		WselectingContext _localctx = new WselectingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_wselecting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__19);
			setState(262);
			wselectoptional();
			setState(263);
			match(T__20);
			setState(264);
			name();
			setState(265);
			whereclause();
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

	public static class WselectoptionalContext extends ParserRuleContext {
		public FieldparenthesisContext fieldparenthesis() {
			return getRuleContext(FieldparenthesisContext.class,0);
		}
		public WselectoptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wselectoptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWselectoptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWselectoptional(this);
		}
	}

	public final WselectoptionalContext wselectoptional() throws RecognitionException {
		WselectoptionalContext _localctx = new WselectoptionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_wselectoptional);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case T__8:
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				fieldparenthesis();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(T__21);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(T__18);
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

	public static class SelectexpressionContext extends ParserRuleContext {
		public SelectclauseContext selectclause() {
			return getRuleContext(SelectclauseContext.class,0);
		}
		public SelectexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterSelectexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitSelectexpression(this);
		}
	}

	public final SelectexpressionContext selectexpression() throws RecognitionException {
		SelectexpressionContext _localctx = new SelectexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__22);
			setState(273);
			selectclause();
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

	public static class SelectclauseContext extends ParserRuleContext {
		public SelectiononeContext selectionone() {
			return getRuleContext(SelectiononeContext.class,0);
		}
		public SelectiontwoContext selectiontwo() {
			return getRuleContext(SelectiontwoContext.class,0);
		}
		public JoinaggregategroupingContext joinaggregategrouping() {
			return getRuleContext(JoinaggregategroupingContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public SetsrollupcubeContext setsrollupcube() {
			return getRuleContext(SetsrollupcubeContext.class,0);
		}
		public SelectclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterSelectclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitSelectclause(this);
		}
	}

	public final SelectclauseContext selectclause() throws RecognitionException {
		SelectclauseContext _localctx = new SelectclauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectclause);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				selectionone();
				setState(276);
				selectiontwo();
				setState(277);
				joinaggregategrouping();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				field();
				setState(280);
				match(T__23);
				setState(281);
				match(T__8);
				setState(282);
				attribute();
				setState(283);
				match(T__9);
				setState(284);
				match(T__24);
				setState(285);
				name();
				setState(286);
				match(T__20);
				setState(287);
				name();
				setState(288);
				match(T__25);
				setState(289);
				match(T__26);
				setState(290);
				setsrollupcube();
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

	public static class JoinaggregategroupingContext extends ParserRuleContext {
		public DerivedtableContext derivedtable() {
			return getRuleContext(DerivedtableContext.class,0);
		}
		public WhereclauseContext whereclause() {
			return getRuleContext(WhereclauseContext.class,0);
		}
		public SelectionthreeContext selectionthree() {
			return getRuleContext(SelectionthreeContext.class,0);
		}
		public AggregategroupingContext aggregategrouping() {
			return getRuleContext(AggregategroupingContext.class,0);
		}
		public JoinaggregategroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinaggregategrouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterJoinaggregategrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitJoinaggregategrouping(this);
		}
	}

	public final JoinaggregategroupingContext joinaggregategrouping() throws RecognitionException {
		JoinaggregategroupingContext _localctx = new JoinaggregategroupingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_joinaggregategrouping);
		try {
			setState(303);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__20);
				setState(295);
				derivedtable();
				setState(296);
				whereclause();
				}
				break;
			case T__23:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				selectionthree();
				setState(299);
				match(T__20);
				setState(300);
				derivedtable();
				setState(301);
				aggregategrouping();
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

	public static class SetsrollupcubeContext extends ParserRuleContext {
		public ParenthesisfieldgroupContext parenthesisfieldgroup() {
			return getRuleContext(ParenthesisfieldgroupContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public SetsrollupcubeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setsrollupcube; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterSetsrollupcube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitSetsrollupcube(this);
		}
	}

	public final SetsrollupcubeContext setsrollupcube() throws RecognitionException {
		SetsrollupcubeContext _localctx = new SetsrollupcubeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_setsrollupcube);
		try {
			setState(321);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(T__27);
				setState(306);
				match(T__28);
				setState(307);
				match(T__8);
				setState(308);
				parenthesisfieldgroup();
				setState(309);
				match(T__9);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__29);
				setState(312);
				match(T__8);
				setState(313);
				field();
				setState(314);
				match(T__9);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(T__30);
				setState(317);
				match(T__8);
				setState(318);
				field();
				setState(319);
				match(T__9);
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

	public static class AggregategroupingContext extends ParserRuleContext {
		public WhereclauseContext whereclause() {
			return getRuleContext(WhereclauseContext.class,0);
		}
		public GroupbyclauseContext groupbyclause() {
			return getRuleContext(GroupbyclauseContext.class,0);
		}
		public HavingclauseContext havingclause() {
			return getRuleContext(HavingclauseContext.class,0);
		}
		public AggregategroupingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregategrouping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterAggregategrouping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitAggregategrouping(this);
		}
	}

	public final AggregategroupingContext aggregategrouping() throws RecognitionException {
		AggregategroupingContext _localctx = new AggregategroupingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aggregategrouping);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				whereclause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				groupbyclause();
				setState(325);
				havingclause();
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

	public static class DerivedtableContext extends ParserRuleContext {
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public SelectexpressionContext selectexpression() {
			return getRuleContext(SelectexpressionContext.class,0);
		}
		public DerivedtableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedtable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDerivedtable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDerivedtable(this);
		}
	}

	public final DerivedtableContext derivedtable() throws RecognitionException {
		DerivedtableContext _localctx = new DerivedtableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_derivedtable);
		try {
			setState(331);
			switch (_input.LA(1)) {
			case T__0:
			case T__25:
			case T__31:
			case T__44:
			case IDNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				table();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				selectexpression();
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

	public static class ParenthesisfieldgroupContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public ParenthesisfieldmultipleContext parenthesisfieldmultiple() {
			return getRuleContext(ParenthesisfieldmultipleContext.class,0);
		}
		public ParenthesisfieldgroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisfieldgroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterParenthesisfieldgroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitParenthesisfieldgroup(this);
		}
	}

	public final ParenthesisfieldgroupContext parenthesisfieldgroup() throws RecognitionException {
		ParenthesisfieldgroupContext _localctx = new ParenthesisfieldgroupContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parenthesisfieldgroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__8);
			setState(334);
			field();
			setState(335);
			match(T__9);
			setState(336);
			parenthesisfieldmultiple();
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

	public static class ParenthesisfieldmultipleContext extends ParserRuleContext {
		public ParenthesisfieldgroupContext parenthesisfieldgroup() {
			return getRuleContext(ParenthesisfieldgroupContext.class,0);
		}
		public ParenthesisfieldmultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesisfieldmultiple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterParenthesisfieldmultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitParenthesisfieldmultiple(this);
		}
	}

	public final ParenthesisfieldmultipleContext parenthesisfieldmultiple() throws RecognitionException {
		ParenthesisfieldmultipleContext _localctx = new ParenthesisfieldmultipleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parenthesisfieldmultiple);
		try {
			setState(341);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(T__10);
				setState(339);
				parenthesisfieldgroup();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class GroupbyclauseContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public GroupbyclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupbyclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterGroupbyclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitGroupbyclause(this);
		}
	}

	public final GroupbyclauseContext groupbyclause() throws RecognitionException {
		GroupbyclauseContext _localctx = new GroupbyclauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_groupbyclause);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(T__25);
				setState(344);
				match(T__26);
				setState(345);
				field();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class HavingclauseContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public HavingclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterHavingclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitHavingclause(this);
		}
	}

	public final HavingclauseContext havingclause() throws RecognitionException {
		HavingclauseContext _localctx = new HavingclauseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_havingclause);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(T__31);
				setState(350);
				comparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SelectiononeContext extends ParserRuleContext {
		public AllclauseContext allclause() {
			return getRuleContext(AllclauseContext.class,0);
		}
		public DistinctclauseContext distinctclause() {
			return getRuleContext(DistinctclauseContext.class,0);
		}
		public SelectiononeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterSelectionone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitSelectionone(this);
		}
	}

	public final SelectiononeContext selectionone() throws RecognitionException {
		SelectiononeContext _localctx = new SelectiononeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selectionone);
		try {
			setState(359);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__32);
				setState(355);
				allclause();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(T__33);
				setState(357);
				distinctclause();
				}
				break;
			case T__21:
			case IDNAME:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AllclauseContext extends ParserRuleContext {
		public AllclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterAllclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitAllclause(this);
		}
	}

	public final AllclauseContext allclause() throws RecognitionException {
		AllclauseContext _localctx = new AllclauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_allclause);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(T__33);
				}
				break;
			case T__21:
			case IDNAME:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DistinctclauseContext extends ParserRuleContext {
		public DistinctclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDistinctclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDistinctclause(this);
		}
	}

	public final DistinctclauseContext distinctclause() throws RecognitionException {
		DistinctclauseContext _localctx = new DistinctclauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_distinctclause);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T__32);
				}
				break;
			case T__21:
			case IDNAME:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class SelectiontwoContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public SelectiontwoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectiontwo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterSelectiontwo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitSelectiontwo(this);
		}
	}

	public final SelectiontwoContext selectiontwo() throws RecognitionException {
		SelectiontwoContext _localctx = new SelectiontwoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_selectiontwo);
		try {
			setState(371);
			switch (_input.LA(1)) {
			case IDNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				field();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(T__21);
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

	public static class SelectionthreeContext extends ParserRuleContext {
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public AggregatefieldContext aggregatefield() {
			return getRuleContext(AggregatefieldContext.class,0);
		}
		public SelectionthreeclauseContext selectionthreeclause() {
			return getRuleContext(SelectionthreeclauseContext.class,0);
		}
		public SelectionthreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionthree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterSelectionthree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitSelectionthree(this);
		}
	}

	public final SelectionthreeContext selectionthree() throws RecognitionException {
		SelectionthreeContext _localctx = new SelectionthreeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectionthree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			aggregate();
			setState(374);
			match(T__8);
			setState(375);
			aggregatefield();
			setState(376);
			match(T__9);
			setState(377);
			selectionthreeclause();
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

	public static class SelectionthreeclauseContext extends ParserRuleContext {
		public SelectionthreeContext selectionthree() {
			return getRuleContext(SelectionthreeContext.class,0);
		}
		public SelectionthreeclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionthreeclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterSelectionthreeclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitSelectionthreeclause(this);
		}
	}

	public final SelectionthreeclauseContext selectionthreeclause() throws RecognitionException {
		SelectionthreeclauseContext _localctx = new SelectionthreeclauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_selectionthreeclause);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(T__10);
				setState(380);
				selectionthree();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AggregateContext extends ParserRuleContext {
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AggregatefieldContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AggregatefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregatefield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterAggregatefield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitAggregatefield(this);
		}
	}

	public final AggregatefieldContext aggregatefield() throws RecognitionException {
		AggregatefieldContext _localctx = new AggregatefieldContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_aggregatefield);
		try {
			setState(389);
			switch (_input.LA(1)) {
			case IDNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				name();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				match(T__21);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TableContext extends ParserRuleContext {
		public TableclauseContext tableclause() {
			return getRuleContext(TableclauseContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_table);
		try {
			setState(393);
			switch (_input.LA(1)) {
			case IDNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				tableclause();
				}
				break;
			case T__0:
			case T__25:
			case T__31:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TableclauseContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TableadditionContext tableaddition() {
			return getRuleContext(TableadditionContext.class,0);
		}
		public TableclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterTableclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitTableclause(this);
		}
	}

	public final TableclauseContext tableclause() throws RecognitionException {
		TableclauseContext _localctx = new TableclauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tableclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			name();
			setState(396);
			tableaddition();
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

	public static class TableadditionContext extends ParserRuleContext {
		public TableclauseContext tableclause() {
			return getRuleContext(TableclauseContext.class,0);
		}
		public TableadditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableaddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterTableaddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitTableaddition(this);
		}
	}

	public final TableadditionContext tableaddition() throws RecognitionException {
		TableadditionContext _localctx = new TableadditionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tableaddition);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(T__10);
				setState(399);
				tableclause();
				}
				break;
			case T__0:
			case T__25:
			case T__31:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class UpdatingContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public UpdateclauseContext updateclause() {
			return getRuleContext(UpdateclauseContext.class,0);
		}
		public WhereclauseContext whereclause() {
			return getRuleContext(WhereclauseContext.class,0);
		}
		public WupdateclauseContext wupdateclause() {
			return getRuleContext(WupdateclauseContext.class,0);
		}
		public UpdatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterUpdating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitUpdating(this);
		}
	}

	public final UpdatingContext updating() throws RecognitionException {
		UpdatingContext _localctx = new UpdatingContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_updating);
		try {
			setState(415);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(T__38);
				setState(404);
				name();
				setState(405);
				match(T__39);
				setState(406);
				updateclause();
				setState(407);
				whereclause();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(T__40);
				setState(410);
				name();
				setState(411);
				match(T__39);
				setState(412);
				wupdateclause();
				setState(413);
				whereclause();
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

	public static class UpdateclauseContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public UpdateadditionContext updateaddition() {
			return getRuleContext(UpdateadditionContext.class,0);
		}
		public UpdateclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterUpdateclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitUpdateclause(this);
		}
	}

	public final UpdateclauseContext updateclause() throws RecognitionException {
		UpdateclauseContext _localctx = new UpdateclauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_updateclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			name();
			setState(418);
			match(T__41);
			setState(419);
			name();
			setState(420);
			updateaddition();
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

	public static class UpdateadditionContext extends ParserRuleContext {
		public UpdateclauseContext updateclause() {
			return getRuleContext(UpdateclauseContext.class,0);
		}
		public UpdateadditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateaddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterUpdateaddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitUpdateaddition(this);
		}
	}

	public final UpdateadditionContext updateaddition() throws RecognitionException {
		UpdateadditionContext _localctx = new UpdateadditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_updateaddition);
		try {
			setState(425);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(T__10);
				setState(423);
				updateclause();
				}
				break;
			case T__0:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class WupdateclauseContext extends ParserRuleContext {
		public OptionaldateContext optionaldate() {
			return getRuleContext(OptionaldateContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public WupdateexpressionadditionContext wupdateexpressionaddition() {
			return getRuleContext(WupdateexpressionadditionContext.class,0);
		}
		public WupdateclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wupdateclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWupdateclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWupdateclause(this);
		}
	}

	public final WupdateclauseContext wupdateclause() throws RecognitionException {
		WupdateclauseContext _localctx = new WupdateclauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_wupdateclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			optionaldate();
			setState(428);
			name();
			setState(429);
			match(T__41);
			setState(430);
			name();
			setState(431);
			wupdateexpressionaddition();
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

	public static class WupdateexpressionadditionContext extends ParserRuleContext {
		public WupdateclauseContext wupdateclause() {
			return getRuleContext(WupdateclauseContext.class,0);
		}
		public WupdateexpressionadditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wupdateexpressionaddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWupdateexpressionaddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWupdateexpressionaddition(this);
		}
	}

	public final WupdateexpressionadditionContext wupdateexpressionaddition() throws RecognitionException {
		WupdateexpressionadditionContext _localctx = new WupdateexpressionadditionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_wupdateexpressionaddition);
		try {
			setState(436);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(T__10);
				setState(434);
				wupdateclause();
				}
				break;
			case T__0:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OptionaldateContext extends ParserRuleContext {
		public DateclauseContext dateclause() {
			return getRuleContext(DateclauseContext.class,0);
		}
		public OptionaldateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionaldate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterOptionaldate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitOptionaldate(this);
		}
	}

	public final OptionaldateContext optionaldate() throws RecognitionException {
		OptionaldateContext _localctx = new OptionaldateContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_optionaldate);
		try {
			setState(444);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(T__14);
				setState(439);
				dateclause();
				setState(440);
				match(T__42);
				setState(441);
				match(T__43);
				}
				break;
			case IDNAME:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class WhereclauseContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public WhereclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterWhereclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitWhereclause(this);
		}
	}

	public final WhereclauseContext whereclause() throws RecognitionException {
		WhereclauseContext _localctx = new WhereclauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_whereclause);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(T__44);
				setState(447);
				comparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InsertionContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public FieldparenthesisContext fieldparenthesis() {
			return getRuleContext(FieldparenthesisContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public InsertionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterInsertion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitInsertion(this);
		}
	}

	public final InsertionContext insertion() throws RecognitionException {
		InsertionContext _localctx = new InsertionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_insertion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__45);
			setState(452);
			match(T__46);
			setState(453);
			relation();
			setState(454);
			fieldparenthesis();
			setState(455);
			match(T__47);
			setState(456);
			match(T__8);
			setState(457);
			literal();
			setState(458);
			match(T__9);
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

	public static class FieldparenthesisContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldparenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldparenthesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterFieldparenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitFieldparenthesis(this);
		}
	}

	public final FieldparenthesisContext fieldparenthesis() throws RecognitionException {
		FieldparenthesisContext _localctx = new FieldparenthesisContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_fieldparenthesis);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(T__8);
				setState(461);
				field();
				setState(462);
				match(T__9);
				}
				break;
			case T__20:
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FieldContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public MultiplefieldschoiceContext multiplefieldschoice() {
			return getRuleContext(MultiplefieldschoiceContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			attribute();
			setState(468);
			multiplefieldschoice();
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

	public static class MultiplefieldschoiceContext extends ParserRuleContext {
		public MultiplefieldsContext multiplefields() {
			return getRuleContext(MultiplefieldsContext.class,0);
		}
		public MultiplefieldschoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplefieldschoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterMultiplefieldschoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitMultiplefieldschoice(this);
		}
	}

	public final MultiplefieldschoiceContext multiplefieldschoice() throws RecognitionException {
		MultiplefieldschoiceContext _localctx = new MultiplefieldschoiceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_multiplefieldschoice);
		try {
			setState(473);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				match(T__10);
				setState(471);
				multiplefields();
				}
				break;
			case T__0:
			case T__9:
			case T__20:
			case T__23:
			case T__25:
			case T__31:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MultiplefieldsContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public MultiplefieldschoiceContext multiplefieldschoice() {
			return getRuleContext(MultiplefieldschoiceContext.class,0);
		}
		public MultiplefieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplefields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterMultiplefields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitMultiplefields(this);
		}
	}

	public final MultiplefieldsContext multiplefields() throws RecognitionException {
		MultiplefieldsContext _localctx = new MultiplefieldsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_multiplefields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			attribute();
			setState(476);
			multiplefieldschoice();
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

	public static class LiteralContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LiteralclauseContext literalclause() {
			return getRuleContext(LiteralclauseContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			name();
			setState(479);
			literalclause();
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

	public static class LiteralclauseContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterLiteralclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitLiteralclause(this);
		}
	}

	public final LiteralclauseContext literalclause() throws RecognitionException {
		LiteralclauseContext _localctx = new LiteralclauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_literalclause);
		try {
			setState(484);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(T__10);
				setState(482);
				literal();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeletionContext extends ParserRuleContext {
		public DeleteadditionContext deleteaddition() {
			return getRuleContext(DeleteadditionContext.class,0);
		}
		public DeletionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDeletion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDeletion(this);
		}
	}

	public final DeletionContext deletion() throws RecognitionException {
		DeletionContext _localctx = new DeletionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_deletion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__48);
			setState(487);
			match(T__20);
			setState(488);
			deleteaddition();
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

	public static class DeleteadditionContext extends ParserRuleContext {
		public RestrictionContext restriction() {
			return getRuleContext(RestrictionContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public DeleteadditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteaddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterDeleteaddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitDeleteaddition(this);
		}
	}

	public final DeleteadditionContext deleteaddition() throws RecognitionException {
		DeleteadditionContext _localctx = new DeleteadditionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_deleteaddition);
		try {
			setState(492);
			switch (_input.LA(1)) {
			case T__44:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				restriction();
				}
				break;
			case IDNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				attribute();
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

	public static class RenamingContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public RenamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_renaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterRenaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitRenaming(this);
		}
	}

	public final RenamingContext renaming() throws RecognitionException {
		RenamingContext _localctx = new RenamingContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_renaming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__49);
			setState(495);
			attribute();
			setState(496);
			match(T__24);
			setState(497);
			attribute();
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

	public static class TermContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_term);
		try {
			setState(504);
			switch (_input.LA(1)) {
			case IDNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				relation();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(T__8);
				setState(501);
				expression();
				setState(502);
				match(T__9);
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

	public static class RestrictionContext extends ParserRuleContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public RestrictionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterRestriction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitRestriction(this);
		}
	}

	public final RestrictionContext restriction() throws RecognitionException {
		RestrictionContext _localctx = new RestrictionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_restriction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(T__44);
			setState(507);
			comparison();
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

	public static class ProjectionContext extends ParserRuleContext {
		public AttributecommalistContext attributecommalist() {
			return getRuleContext(AttributecommalistContext.class,0);
		}
		public ProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitProjection(this);
		}
	}

	public final ProjectionContext projection() throws RecognitionException {
		ProjectionContext _localctx = new ProjectionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_projection);
		try {
			setState(514);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(T__8);
				setState(510);
				attributecommalist();
				setState(511);
				match(T__9);
				}
				break;
			case T__0:
			case T__15:
			case T__21:
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AttributecommalistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributecommalistadditionContext attributecommalistaddition() {
			return getRuleContext(AttributecommalistadditionContext.class,0);
		}
		public AttributecommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributecommalist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterAttributecommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitAttributecommalist(this);
		}
	}

	public final AttributecommalistContext attributecommalist() throws RecognitionException {
		AttributecommalistContext _localctx = new AttributecommalistContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_attributecommalist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			attribute();
			setState(517);
			attributecommalistaddition();
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

	public static class AttributecommalistadditionContext extends ParserRuleContext {
		public AttributecommalistContext attributecommalist() {
			return getRuleContext(AttributecommalistContext.class,0);
		}
		public AttributecommalistadditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributecommalistaddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterAttributecommalistaddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitAttributecommalistaddition(this);
		}
	}

	public final AttributecommalistadditionContext attributecommalistaddition() throws RecognitionException {
		AttributecommalistadditionContext _localctx = new AttributecommalistadditionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_attributecommalistaddition);
		try {
			setState(522);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(T__10);
				setState(520);
				attributecommalist();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TworelationexpressionContext extends ParserRuleContext {
		public ProjectionContext projection() {
			return getRuleContext(ProjectionContext.class,0);
		}
		public BinaryoperationContext binaryoperation() {
			return getRuleContext(BinaryoperationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TworelationexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tworelationexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterTworelationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitTworelationexpression(this);
		}
	}

	public final TworelationexpressionContext tworelationexpression() throws RecognitionException {
		TworelationexpressionContext _localctx = new TworelationexpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_tworelationexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			projection();
			setState(525);
			binaryoperation();
			setState(526);
			expression();
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

	public static class BinaryoperationContext extends ParserRuleContext {
		public BinaryoperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryoperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterBinaryoperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitBinaryoperation(this);
		}
	}

	public final BinaryoperationContext binaryoperation() throws RecognitionException {
		BinaryoperationContext _localctx = new BinaryoperationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_binaryoperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__21) | (1L << T__50) | (1L << T__51))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ComparisonContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			attribute();
			setState(531);
			compare();
			setState(532);
			number();
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
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitCompare(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class NumberContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public NumberclauseContext numberclause() {
			return getRuleContext(NumberclauseContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			val();
			setState(537);
			numberclause();
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

	public static class NumberclauseContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterNumberclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitNumberclause(this);
		}
	}

	public final NumberclauseContext numberclause() throws RecognitionException {
		NumberclauseContext _localctx = new NumberclauseContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_numberclause);
		try {
			setState(541);
			switch (_input.LA(1)) {
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				number();
				}
				break;
			case T__0:
			case T__9:
			case T__10:
			case T__15:
			case T__25:
			case T__31:
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (T__57 - 58)) | (1L << (T__58 - 58)) | (1L << (T__59 - 58)) | (1L << (T__60 - 58)) | (1L << (T__61 - 58)) | (1L << (T__62 - 58)) | (1L << (T__63 - 58)) | (1L << (T__64 - 58)) | (1L << (T__65 - 58)) | (1L << (T__66 - 58)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AttributeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			name();
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

	public static class RelationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataModelingListener ) ((DataModelingListener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			name();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u0228\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a2"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00af\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u00b7\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\5\b\u00c5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cf\n\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00e2\n\f\3\r\3\r\3\r\5\r\u00e7\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00f4\n\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0101\n\22\3\23\3\23\3\23\5\23"+
		"\u0106\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0111\n"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0127\n\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0132\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0144\n\31\3\32"+
		"\3\32\3\32\3\32\5\32\u014a\n\32\3\33\3\33\5\33\u014e\n\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\5\35\u0158\n\35\3\36\3\36\3\36\3\36\5\36"+
		"\u015e\n\36\3\37\3\37\3\37\5\37\u0163\n\37\3 \3 \3 \3 \3 \5 \u016a\n "+
		"\3!\3!\5!\u016e\n!\3\"\3\"\5\"\u0172\n\"\3#\3#\5#\u0176\n#\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\5%\u0181\n%\3&\3&\3\'\3\'\3\'\5\'\u0188\n\'\3(\3(\5("+
		"\u018c\n(\3)\3)\3)\3*\3*\3*\5*\u0194\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u01a2\n+\3,\3,\3,\3,\3,\3-\3-\3-\5-\u01ac\n-\3.\3.\3.\3.\3."+
		"\3.\3/\3/\3/\5/\u01b7\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01bf\n\60"+
		"\3\61\3\61\3\61\5\61\u01c4\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\5\63\u01d4\n\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\5\65\u01dc\n\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\58\u01e7"+
		"\n8\39\39\39\39\3:\3:\5:\u01ef\n:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\5<\u01fb"+
		"\n<\3=\3=\3=\3>\3>\3>\3>\3>\5>\u0205\n>\3?\3?\3?\3@\3@\3@\5@\u020d\n@"+
		"\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3D\3D\3E\3E\3E\3F\3F\5F\u0220\nF\3G\3G"+
		"\3H\3H\3I\3I\3I\2\2J\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\2\7\4\2\7\7\n\n\4\2\32\32%(\5\2\22\22\30"+
		"\30\65\66\4\2,,\67;\3\2<E\u0217\2\u0092\3\2\2\2\4\u00a1\3\2\2\2\6\u00ae"+
		"\3\2\2\2\b\u00b6\3\2\2\2\n\u00b8\3\2\2\2\f\u00bc\3\2\2\2\16\u00c4\3\2"+
		"\2\2\20\u00ce\3\2\2\2\22\u00d0\3\2\2\2\24\u00d9\3\2\2\2\26\u00e1\3\2\2"+
		"\2\30\u00e6\3\2\2\2\32\u00e8\3\2\2\2\34\u00f3\3\2\2\2\36\u00f5\3\2\2\2"+
		" \u00f7\3\2\2\2\"\u0100\3\2\2\2$\u0105\3\2\2\2&\u0107\3\2\2\2(\u0110\3"+
		"\2\2\2*\u0112\3\2\2\2,\u0126\3\2\2\2.\u0131\3\2\2\2\60\u0143\3\2\2\2\62"+
		"\u0149\3\2\2\2\64\u014d\3\2\2\2\66\u014f\3\2\2\28\u0157\3\2\2\2:\u015d"+
		"\3\2\2\2<\u0162\3\2\2\2>\u0169\3\2\2\2@\u016d\3\2\2\2B\u0171\3\2\2\2D"+
		"\u0175\3\2\2\2F\u0177\3\2\2\2H\u0180\3\2\2\2J\u0182\3\2\2\2L\u0187\3\2"+
		"\2\2N\u018b\3\2\2\2P\u018d\3\2\2\2R\u0193\3\2\2\2T\u01a1\3\2\2\2V\u01a3"+
		"\3\2\2\2X\u01ab\3\2\2\2Z\u01ad\3\2\2\2\\\u01b6\3\2\2\2^\u01be\3\2\2\2"+
		"`\u01c3\3\2\2\2b\u01c5\3\2\2\2d\u01d3\3\2\2\2f\u01d5\3\2\2\2h\u01db\3"+
		"\2\2\2j\u01dd\3\2\2\2l\u01e0\3\2\2\2n\u01e6\3\2\2\2p\u01e8\3\2\2\2r\u01ee"+
		"\3\2\2\2t\u01f0\3\2\2\2v\u01fa\3\2\2\2x\u01fc\3\2\2\2z\u0204\3\2\2\2|"+
		"\u0206\3\2\2\2~\u020c\3\2\2\2\u0080\u020e\3\2\2\2\u0082\u0212\3\2\2\2"+
		"\u0084\u0214\3\2\2\2\u0086\u0218\3\2\2\2\u0088\u021a\3\2\2\2\u008a\u021f"+
		"\3\2\2\2\u008c\u0221\3\2\2\2\u008e\u0223\3\2\2\2\u0090\u0225\3\2\2\2\u0092"+
		"\u0093\5\4\3\2\u0093\u0094\7\3\2\2\u0094\3\3\2\2\2\u0095\u0096\5\"\22"+
		"\2\u0096\u0097\7\3\2\2\u0097\u00a2\3\2\2\2\u0098\u0099\5\u0080A\2\u0099"+
		"\u009a\7\3\2\2\u009a\u00a2\3\2\2\2\u009b\u009c\5\6\4\2\u009c\u009d\7\3"+
		"\2\2\u009d\u00a2\3\2\2\2\u009e\u009f\5*\26\2\u009f\u00a0\7\3\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u009b\3\2"+
		"\2\2\u00a1\u009e\3\2\2\2\u00a2\5\3\2\2\2\u00a3\u00af\7\4\2\2\u00a4\u00af"+
		"\7\5\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7\7\2\2\u00a7\u00af\5 \21\2\u00a8"+
		"\u00a9\7\b\2\2\u00a9\u00af\5\b\5\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\5\36"+
		"\20\2\u00ac\u00ad\5 \21\2\u00ad\u00af\3\2\2\2\u00ae\u00a3\3\2\2\2\u00ae"+
		"\u00a4\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00aa\3\2"+
		"\2\2\u00af\7\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1\u00b7\5 \21\2\u00b2\u00b3"+
		"\7\n\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\5\n\6\2\u00b5\u00b7\3\2\2\2\u00b6"+
		"\u00b0\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\t\3\2\2\2\u00b8\u00b9\7\13\2"+
		"\2\u00b9\u00ba\5\f\7\2\u00ba\u00bb\7\f\2\2\u00bb\13\3\2\2\2\u00bc\u00bd"+
		"\5 \21\2\u00bd\u00be\5\20\t\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\5\16\b"+
		"\2\u00c0\r\3\2\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c5\5\f\7\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\17\3\2\2\2\u00c6"+
		"\u00c7\7\16\2\2\u00c7\u00cf\5\24\13\2\u00c8\u00c9\7\17\2\2\u00c9\u00cf"+
		"\5\26\f\2\u00ca\u00cb\7\20\2\2\u00cb\u00cf\5\22\n\2\u00cc\u00cd\7\21\2"+
		"\2\u00cd\u00cf\5\32\16\2\u00ce\u00c6\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\7\13\2"+
		"\2\u00d1\u00d2\5\u0088E\2\u00d2\u00d3\7\f\2\2\u00d3\23\3\2\2\2\u00d4\u00d5"+
		"\7\13\2\2\u00d5\u00d6\5\u0088E\2\u00d6\u00d7\7\f\2\2\u00d7\u00da\3\2\2"+
		"\2\u00d8\u00da\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\25"+
		"\3\2\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\5\u0088E\2\u00dd\u00de\5\30"+
		"\r\2\u00de\u00df\7\f\2\2\u00df\u00e2\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\27\3\2\2\2\u00e3\u00e4\7\r\2"+
		"\2\u00e4\u00e7\5\u0088E\2\u00e5\u00e7\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\31\3\2\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\5\u0088"+
		"E\2\u00ea\u00eb\7\22\2\2\u00eb\u00ec\5\u0088E\2\u00ec\u00ed\7\22\2\2\u00ed"+
		"\u00ee\5\u0088E\2\u00ee\u00ef\7\f\2\2\u00ef\33\3\2\2\2\u00f0\u00f1\7\23"+
		"\2\2\u00f1\u00f4\7\24\2\2\u00f2\u00f4\7\25\2\2\u00f3\u00f0\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\35\3\2\2\2\u00f5\u00f6\t\2\2\2\u00f6\37\3\2\2\2\u00f7"+
		"\u00f8\7F\2\2\u00f8!\3\2\2\2\u00f9\u00fa\5v<\2\u00fa\u00fb\5$\23\2\u00fb"+
		"\u0101\3\2\2\2\u00fc\u0101\5p9\2\u00fd\u0101\5b\62\2\u00fe\u0101\5T+\2"+
		"\u00ff\u0101\5&\24\2\u0100\u00f9\3\2\2\2\u0100\u00fc\3\2\2\2\u0100\u00fd"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101#\3\2\2\2\u0102"+
		"\u0106\5t;\2\u0103\u0106\5x=\2\u0104\u0106\5z>\2\u0105\u0102\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106%\3\2\2\2\u0107\u0108\7\26\2\2"+
		"\u0108\u0109\5(\25\2\u0109\u010a\7\27\2\2\u010a\u010b\5 \21\2\u010b\u010c"+
		"\5`\61\2\u010c\'\3\2\2\2\u010d\u0111\5d\63\2\u010e\u0111\7\30\2\2\u010f"+
		"\u0111\7\25\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3"+
		"\2\2\2\u0111)\3\2\2\2\u0112\u0113\7\31\2\2\u0113\u0114\5,\27\2\u0114+"+
		"\3\2\2\2\u0115\u0116\5> \2\u0116\u0117\5D#\2\u0117\u0118\5.\30\2\u0118"+
		"\u0127\3\2\2\2\u0119\u011a\5f\64\2\u011a\u011b\7\32\2\2\u011b\u011c\7"+
		"\13\2\2\u011c\u011d\5\u008eH\2\u011d\u011e\7\f\2\2\u011e\u011f\7\33\2"+
		"\2\u011f\u0120\5 \21\2\u0120\u0121\7\27\2\2\u0121\u0122\5 \21\2\u0122"+
		"\u0123\7\34\2\2\u0123\u0124\7\35\2\2\u0124\u0125\5\60\31\2\u0125\u0127"+
		"\3\2\2\2\u0126\u0115\3\2\2\2\u0126\u0119\3\2\2\2\u0127-\3\2\2\2\u0128"+
		"\u0129\7\27\2\2\u0129\u012a\5\64\33\2\u012a\u012b\5`\61\2\u012b\u0132"+
		"\3\2\2\2\u012c\u012d\5F$\2\u012d\u012e\7\27\2\2\u012e\u012f\5\64\33\2"+
		"\u012f\u0130\5\62\32\2\u0130\u0132\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012c"+
		"\3\2\2\2\u0132/\3\2\2\2\u0133\u0134\7\36\2\2\u0134\u0135\7\37\2\2\u0135"+
		"\u0136\7\13\2\2\u0136\u0137\5\66\34\2\u0137\u0138\7\f\2\2\u0138\u0144"+
		"\3\2\2\2\u0139\u013a\7 \2\2\u013a\u013b\7\13\2\2\u013b\u013c\5f\64\2\u013c"+
		"\u013d\7\f\2\2\u013d\u0144\3\2\2\2\u013e\u013f\7!\2\2\u013f\u0140\7\13"+
		"\2\2\u0140\u0141\5f\64\2\u0141\u0142\7\f\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0133\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013e\3\2\2\2\u0144\61\3\2\2"+
		"\2\u0145\u014a\5`\61\2\u0146\u0147\5:\36\2\u0147\u0148\5<\37\2\u0148\u014a"+
		"\3\2\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u014a\63\3\2\2\2\u014b"+
		"\u014e\5N(\2\u014c\u014e\5*\26\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2"+
		"\2\u014e\65\3\2\2\2\u014f\u0150\7\13\2\2\u0150\u0151\5f\64\2\u0151\u0152"+
		"\7\f\2\2\u0152\u0153\58\35\2\u0153\67\3\2\2\2\u0154\u0155\7\r\2\2\u0155"+
		"\u0158\5\66\34\2\u0156\u0158\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0156\3"+
		"\2\2\2\u01589\3\2\2\2\u0159\u015a\7\34\2\2\u015a\u015b\7\35\2\2\u015b"+
		"\u015e\5f\64\2\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015c\3\2"+
		"\2\2\u015e;\3\2\2\2\u015f\u0160\7\"\2\2\u0160\u0163\5\u0084C\2\u0161\u0163"+
		"\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0161\3\2\2\2\u0163=\3\2\2\2\u0164"+
		"\u0165\7#\2\2\u0165\u016a\5@!\2\u0166\u0167\7$\2\2\u0167\u016a\5B\"\2"+
		"\u0168\u016a\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a?\3\2\2\2\u016b\u016e\7$\2\2\u016c\u016e\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016d\u016c\3\2\2\2\u016eA\3\2\2\2\u016f\u0172\7#\2\2\u0170\u0172"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172C\3\2\2\2\u0173"+
		"\u0176\5f\64\2\u0174\u0176\7\30\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3"+
		"\2\2\2\u0176E\3\2\2\2\u0177\u0178\5J&\2\u0178\u0179\7\13\2\2\u0179\u017a"+
		"\5L\'\2\u017a\u017b\7\f\2\2\u017b\u017c\5H%\2\u017cG\3\2\2\2\u017d\u017e"+
		"\7\r\2\2\u017e\u0181\5F$\2\u017f\u0181\3\2\2\2\u0180\u017d\3\2\2\2\u0180"+
		"\u017f\3\2\2\2\u0181I\3\2\2\2\u0182\u0183\t\3\2\2\u0183K\3\2\2\2\u0184"+
		"\u0188\5 \21\2\u0185\u0188\7\30\2\2\u0186\u0188\3\2\2\2\u0187\u0184\3"+
		"\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188M\3\2\2\2\u0189\u018c"+
		"\5P)\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"O\3\2\2\2\u018d\u018e\5 \21\2\u018e\u018f\5R*\2\u018fQ\3\2\2\2\u0190\u0191"+
		"\7\r\2\2\u0191\u0194\5P)\2\u0192\u0194\3\2\2\2\u0193\u0190\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194S\3\2\2\2\u0195\u0196\7)\2\2\u0196\u0197\5 \21\2\u0197"+
		"\u0198\7*\2\2\u0198\u0199\5V,\2\u0199\u019a\5`\61\2\u019a\u01a2\3\2\2"+
		"\2\u019b\u019c\7+\2\2\u019c\u019d\5 \21\2\u019d\u019e\7*\2\2\u019e\u019f"+
		"\5Z.\2\u019f\u01a0\5`\61\2\u01a0\u01a2\3\2\2\2\u01a1\u0195\3\2\2\2\u01a1"+
		"\u019b\3\2\2\2\u01a2U\3\2\2\2\u01a3\u01a4\5 \21\2\u01a4\u01a5\7,\2\2\u01a5"+
		"\u01a6\5 \21\2\u01a6\u01a7\5X-\2\u01a7W\3\2\2\2\u01a8\u01a9\7\r\2\2\u01a9"+
		"\u01ac\5V,\2\u01aa\u01ac\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01aa\3\2\2"+
		"\2\u01acY\3\2\2\2\u01ad\u01ae\5^\60\2\u01ae\u01af\5 \21\2\u01af\u01b0"+
		"\7,\2\2\u01b0\u01b1\5 \21\2\u01b1\u01b2\5\\/\2\u01b2[\3\2\2\2\u01b3\u01b4"+
		"\7\r\2\2\u01b4\u01b7\5Z.\2\u01b5\u01b7\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6"+
		"\u01b5\3\2\2\2\u01b7]\3\2\2\2\u01b8\u01b9\7\21\2\2\u01b9\u01ba\5\32\16"+
		"\2\u01ba\u01bb\7-\2\2\u01bb\u01bc\7.\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bf"+
		"\3\2\2\2\u01be\u01b8\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf_\3\2\2\2\u01c0"+
		"\u01c1\7/\2\2\u01c1\u01c4\5\u0084C\2\u01c2\u01c4\3\2\2\2\u01c3\u01c0\3"+
		"\2\2\2\u01c3\u01c2\3\2\2\2\u01c4a\3\2\2\2\u01c5\u01c6\7\60\2\2\u01c6\u01c7"+
		"\7\61\2\2\u01c7\u01c8\5\u0090I\2\u01c8\u01c9\5d\63\2\u01c9\u01ca\7\62"+
		"\2\2\u01ca\u01cb\7\13\2\2\u01cb\u01cc\5l\67\2\u01cc\u01cd\7\f\2\2\u01cd"+
		"c\3\2\2\2\u01ce\u01cf\7\13\2\2\u01cf\u01d0\5f\64\2\u01d0\u01d1\7\f\2\2"+
		"\u01d1\u01d4\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d4e\3\2\2\2\u01d5\u01d6\5\u008eH\2\u01d6\u01d7\5h\65\2\u01d7"+
		"g\3\2\2\2\u01d8\u01d9\7\r\2\2\u01d9\u01dc\5j\66\2\u01da\u01dc\3\2\2\2"+
		"\u01db\u01d8\3\2\2\2\u01db\u01da\3\2\2\2\u01dci\3\2\2\2\u01dd\u01de\5"+
		"\u008eH\2\u01de\u01df\5h\65\2\u01dfk\3\2\2\2\u01e0\u01e1\5 \21\2\u01e1"+
		"\u01e2\5n8\2\u01e2m\3\2\2\2\u01e3\u01e4\7\r\2\2\u01e4\u01e7\5l\67\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e5\3\2\2\2\u01e7o\3\2\2\2"+
		"\u01e8\u01e9\7\63\2\2\u01e9\u01ea\7\27\2\2\u01ea\u01eb\5r:\2\u01ebq\3"+
		"\2\2\2\u01ec\u01ef\5x=\2\u01ed\u01ef\5\u008eH\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ed\3\2\2\2\u01efs\3\2\2\2\u01f0\u01f1\7\64\2\2\u01f1\u01f2\5\u008e"+
		"H\2\u01f2\u01f3\7\33\2\2\u01f3\u01f4\5\u008eH\2\u01f4u\3\2\2\2\u01f5\u01fb"+
		"\5\u0090I\2\u01f6\u01f7\7\13\2\2\u01f7\u01f8\5\4\3\2\u01f8\u01f9\7\f\2"+
		"\2\u01f9\u01fb\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fa\u01f6\3\2\2\2\u01fbw"+
		"\3\2\2\2\u01fc\u01fd\7/\2\2\u01fd\u01fe\5\u0084C\2\u01fey\3\2\2\2\u01ff"+
		"\u0200\7\13\2\2\u0200\u0201\5|?\2\u0201\u0202\7\f\2\2\u0202\u0205\3\2"+
		"\2\2\u0203\u0205\3\2\2\2\u0204\u01ff\3\2\2\2\u0204\u0203\3\2\2\2\u0205"+
		"{\3\2\2\2\u0206\u0207\5\u008eH\2\u0207\u0208\5~@\2\u0208}\3\2\2\2\u0209"+
		"\u020a\7\r\2\2\u020a\u020d\5|?\2\u020b\u020d\3\2\2\2\u020c\u0209\3\2\2"+
		"\2\u020c\u020b\3\2\2\2\u020d\177\3\2\2\2\u020e\u020f\5z>\2\u020f\u0210"+
		"\5\u0082B\2\u0210\u0211\5\4\3\2\u0211\u0081\3\2\2\2\u0212\u0213\t\4\2"+
		"\2\u0213\u0083\3\2\2\2\u0214\u0215\5\u008eH\2\u0215\u0216\5\u0086D\2\u0216"+
		"\u0217\5\u0088E\2\u0217\u0085\3\2\2\2\u0218\u0219\t\5\2\2\u0219\u0087"+
		"\3\2\2\2\u021a\u021b\5\u008cG\2\u021b\u021c\5\u008aF\2\u021c\u0089\3\2"+
		"\2\2\u021d\u0220\5\u0088E\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u021e\3\2\2\2\u0220\u008b\3\2\2\2\u0221\u0222\t\6\2\2\u0222\u008d\3\2"+
		"\2\2\u0223\u0224\5 \21\2\u0224\u008f\3\2\2\2\u0225\u0226\5 \21\2\u0226"+
		"\u0091\3\2\2\2+\u00a1\u00ae\u00b6\u00c4\u00ce\u00d9\u00e1\u00e6\u00f3"+
		"\u0100\u0105\u0110\u0126\u0131\u0143\u0149\u014d\u0157\u015d\u0162\u0169"+
		"\u016d\u0171\u0175\u0180\u0187\u018b\u0193\u01a1\u01ab\u01b6\u01be\u01c3"+
		"\u01d3\u01db\u01e6\u01ee\u01fa\u0204\u020c\u021f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}