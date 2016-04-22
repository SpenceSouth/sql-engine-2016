// Generated from DataModeling.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataModelingParser}.
 */
public interface DataModelingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DataModelingParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DataModelingParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DataModelingParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DataModelingParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#databaseexpression}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseexpression(DataModelingParser.DatabaseexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#databaseexpression}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseexpression(DataModelingParser.DatabaseexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#createclause}.
	 * @param ctx the parse tree
	 */
	void enterCreateclause(DataModelingParser.CreateclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#createclause}.
	 * @param ctx the parse tree
	 */
	void exitCreateclause(DataModelingParser.CreateclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#createtableclause}.
	 * @param ctx the parse tree
	 */
	void enterCreatetableclause(DataModelingParser.CreatetableclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#createtableclause}.
	 * @param ctx the parse tree
	 */
	void exitCreatetableclause(DataModelingParser.CreatetableclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#createtablecolumns}.
	 * @param ctx the parse tree
	 */
	void enterCreatetablecolumns(DataModelingParser.CreatetablecolumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#createtablecolumns}.
	 * @param ctx the parse tree
	 */
	void exitCreatetablecolumns(DataModelingParser.CreatetablecolumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#createtableaddition}.
	 * @param ctx the parse tree
	 */
	void enterCreatetableaddition(DataModelingParser.CreatetableadditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#createtableaddition}.
	 * @param ctx the parse tree
	 */
	void exitCreatetableaddition(DataModelingParser.CreatetableadditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#fieldtype}.
	 * @param ctx the parse tree
	 */
	void enterFieldtype(DataModelingParser.FieldtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#fieldtype}.
	 * @param ctx the parse tree
	 */
	void exitFieldtype(DataModelingParser.FieldtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(DataModelingParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(DataModelingParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#widthinteger}.
	 * @param ctx the parse tree
	 */
	void enterWidthinteger(DataModelingParser.WidthintegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#widthinteger}.
	 * @param ctx the parse tree
	 */
	void exitWidthinteger(DataModelingParser.WidthintegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#widthdecimal}.
	 * @param ctx the parse tree
	 */
	void enterWidthdecimal(DataModelingParser.WidthdecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#widthdecimal}.
	 * @param ctx the parse tree
	 */
	void exitWidthdecimal(DataModelingParser.WidthdecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#decimaloption}.
	 * @param ctx the parse tree
	 */
	void enterDecimaloption(DataModelingParser.DecimaloptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#decimaloption}.
	 * @param ctx the parse tree
	 */
	void exitDecimaloption(DataModelingParser.DecimaloptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#dateclause}.
	 * @param ctx the parse tree
	 */
	void enterDateclause(DataModelingParser.DateclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#dateclause}.
	 * @param ctx the parse tree
	 */
	void exitDateclause(DataModelingParser.DateclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#nullclause}.
	 * @param ctx the parse tree
	 */
	void enterNullclause(DataModelingParser.NullclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#nullclause}.
	 * @param ctx the parse tree
	 */
	void exitNullclause(DataModelingParser.NullclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#databaseortable}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseortable(DataModelingParser.DatabaseortableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#databaseortable}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseortable(DataModelingParser.DatabaseortableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DataModelingParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DataModelingParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#onerelationexpression}.
	 * @param ctx the parse tree
	 */
	void enterOnerelationexpression(DataModelingParser.OnerelationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#onerelationexpression}.
	 * @param ctx the parse tree
	 */
	void exitOnerelationexpression(DataModelingParser.OnerelationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#oldnonterminals}.
	 * @param ctx the parse tree
	 */
	void enterOldnonterminals(DataModelingParser.OldnonterminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#oldnonterminals}.
	 * @param ctx the parse tree
	 */
	void exitOldnonterminals(DataModelingParser.OldnonterminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#wselecting}.
	 * @param ctx the parse tree
	 */
	void enterWselecting(DataModelingParser.WselectingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#wselecting}.
	 * @param ctx the parse tree
	 */
	void exitWselecting(DataModelingParser.WselectingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#wselectoptional}.
	 * @param ctx the parse tree
	 */
	void enterWselectoptional(DataModelingParser.WselectoptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#wselectoptional}.
	 * @param ctx the parse tree
	 */
	void exitWselectoptional(DataModelingParser.WselectoptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#selectexpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectexpression(DataModelingParser.SelectexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#selectexpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectexpression(DataModelingParser.SelectexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#selectclause}.
	 * @param ctx the parse tree
	 */
	void enterSelectclause(DataModelingParser.SelectclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#selectclause}.
	 * @param ctx the parse tree
	 */
	void exitSelectclause(DataModelingParser.SelectclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#joinaggregategrouping}.
	 * @param ctx the parse tree
	 */
	void enterJoinaggregategrouping(DataModelingParser.JoinaggregategroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#joinaggregategrouping}.
	 * @param ctx the parse tree
	 */
	void exitJoinaggregategrouping(DataModelingParser.JoinaggregategroupingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#setsrollupcube}.
	 * @param ctx the parse tree
	 */
	void enterSetsrollupcube(DataModelingParser.SetsrollupcubeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#setsrollupcube}.
	 * @param ctx the parse tree
	 */
	void exitSetsrollupcube(DataModelingParser.SetsrollupcubeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#aggregategrouping}.
	 * @param ctx the parse tree
	 */
	void enterAggregategrouping(DataModelingParser.AggregategroupingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#aggregategrouping}.
	 * @param ctx the parse tree
	 */
	void exitAggregategrouping(DataModelingParser.AggregategroupingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#derivedtable}.
	 * @param ctx the parse tree
	 */
	void enterDerivedtable(DataModelingParser.DerivedtableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#derivedtable}.
	 * @param ctx the parse tree
	 */
	void exitDerivedtable(DataModelingParser.DerivedtableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#parenthesisfieldgroup}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisfieldgroup(DataModelingParser.ParenthesisfieldgroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#parenthesisfieldgroup}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisfieldgroup(DataModelingParser.ParenthesisfieldgroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#parenthesisfieldmultiple}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisfieldmultiple(DataModelingParser.ParenthesisfieldmultipleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#parenthesisfieldmultiple}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisfieldmultiple(DataModelingParser.ParenthesisfieldmultipleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#groupbyclause}.
	 * @param ctx the parse tree
	 */
	void enterGroupbyclause(DataModelingParser.GroupbyclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#groupbyclause}.
	 * @param ctx the parse tree
	 */
	void exitGroupbyclause(DataModelingParser.GroupbyclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#havingclause}.
	 * @param ctx the parse tree
	 */
	void enterHavingclause(DataModelingParser.HavingclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#havingclause}.
	 * @param ctx the parse tree
	 */
	void exitHavingclause(DataModelingParser.HavingclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#selectionone}.
	 * @param ctx the parse tree
	 */
	void enterSelectionone(DataModelingParser.SelectiononeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#selectionone}.
	 * @param ctx the parse tree
	 */
	void exitSelectionone(DataModelingParser.SelectiononeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#allclause}.
	 * @param ctx the parse tree
	 */
	void enterAllclause(DataModelingParser.AllclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#allclause}.
	 * @param ctx the parse tree
	 */
	void exitAllclause(DataModelingParser.AllclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#distinctclause}.
	 * @param ctx the parse tree
	 */
	void enterDistinctclause(DataModelingParser.DistinctclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#distinctclause}.
	 * @param ctx the parse tree
	 */
	void exitDistinctclause(DataModelingParser.DistinctclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#selectiontwo}.
	 * @param ctx the parse tree
	 */
	void enterSelectiontwo(DataModelingParser.SelectiontwoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#selectiontwo}.
	 * @param ctx the parse tree
	 */
	void exitSelectiontwo(DataModelingParser.SelectiontwoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#selectionthree}.
	 * @param ctx the parse tree
	 */
	void enterSelectionthree(DataModelingParser.SelectionthreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#selectionthree}.
	 * @param ctx the parse tree
	 */
	void exitSelectionthree(DataModelingParser.SelectionthreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#selectionthreeclause}.
	 * @param ctx the parse tree
	 */
	void enterSelectionthreeclause(DataModelingParser.SelectionthreeclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#selectionthreeclause}.
	 * @param ctx the parse tree
	 */
	void exitSelectionthreeclause(DataModelingParser.SelectionthreeclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(DataModelingParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(DataModelingParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#aggregatefield}.
	 * @param ctx the parse tree
	 */
	void enterAggregatefield(DataModelingParser.AggregatefieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#aggregatefield}.
	 * @param ctx the parse tree
	 */
	void exitAggregatefield(DataModelingParser.AggregatefieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(DataModelingParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(DataModelingParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#tableclause}.
	 * @param ctx the parse tree
	 */
	void enterTableclause(DataModelingParser.TableclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#tableclause}.
	 * @param ctx the parse tree
	 */
	void exitTableclause(DataModelingParser.TableclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#tableaddition}.
	 * @param ctx the parse tree
	 */
	void enterTableaddition(DataModelingParser.TableadditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#tableaddition}.
	 * @param ctx the parse tree
	 */
	void exitTableaddition(DataModelingParser.TableadditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#updating}.
	 * @param ctx the parse tree
	 */
	void enterUpdating(DataModelingParser.UpdatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#updating}.
	 * @param ctx the parse tree
	 */
	void exitUpdating(DataModelingParser.UpdatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#updateclause}.
	 * @param ctx the parse tree
	 */
	void enterUpdateclause(DataModelingParser.UpdateclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#updateclause}.
	 * @param ctx the parse tree
	 */
	void exitUpdateclause(DataModelingParser.UpdateclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#updateaddition}.
	 * @param ctx the parse tree
	 */
	void enterUpdateaddition(DataModelingParser.UpdateadditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#updateaddition}.
	 * @param ctx the parse tree
	 */
	void exitUpdateaddition(DataModelingParser.UpdateadditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#wupdateclause}.
	 * @param ctx the parse tree
	 */
	void enterWupdateclause(DataModelingParser.WupdateclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#wupdateclause}.
	 * @param ctx the parse tree
	 */
	void exitWupdateclause(DataModelingParser.WupdateclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#wupdateexpressionaddition}.
	 * @param ctx the parse tree
	 */
	void enterWupdateexpressionaddition(DataModelingParser.WupdateexpressionadditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#wupdateexpressionaddition}.
	 * @param ctx the parse tree
	 */
	void exitWupdateexpressionaddition(DataModelingParser.WupdateexpressionadditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#optionaldate}.
	 * @param ctx the parse tree
	 */
	void enterOptionaldate(DataModelingParser.OptionaldateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#optionaldate}.
	 * @param ctx the parse tree
	 */
	void exitOptionaldate(DataModelingParser.OptionaldateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#whereclause}.
	 * @param ctx the parse tree
	 */
	void enterWhereclause(DataModelingParser.WhereclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#whereclause}.
	 * @param ctx the parse tree
	 */
	void exitWhereclause(DataModelingParser.WhereclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#insertion}.
	 * @param ctx the parse tree
	 */
	void enterInsertion(DataModelingParser.InsertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#insertion}.
	 * @param ctx the parse tree
	 */
	void exitInsertion(DataModelingParser.InsertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#fieldparenthesis}.
	 * @param ctx the parse tree
	 */
	void enterFieldparenthesis(DataModelingParser.FieldparenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#fieldparenthesis}.
	 * @param ctx the parse tree
	 */
	void exitFieldparenthesis(DataModelingParser.FieldparenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(DataModelingParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(DataModelingParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#multiplefieldschoice}.
	 * @param ctx the parse tree
	 */
	void enterMultiplefieldschoice(DataModelingParser.MultiplefieldschoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#multiplefieldschoice}.
	 * @param ctx the parse tree
	 */
	void exitMultiplefieldschoice(DataModelingParser.MultiplefieldschoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#multiplefields}.
	 * @param ctx the parse tree
	 */
	void enterMultiplefields(DataModelingParser.MultiplefieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#multiplefields}.
	 * @param ctx the parse tree
	 */
	void exitMultiplefields(DataModelingParser.MultiplefieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DataModelingParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DataModelingParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#literalclause}.
	 * @param ctx the parse tree
	 */
	void enterLiteralclause(DataModelingParser.LiteralclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#literalclause}.
	 * @param ctx the parse tree
	 */
	void exitLiteralclause(DataModelingParser.LiteralclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#deletion}.
	 * @param ctx the parse tree
	 */
	void enterDeletion(DataModelingParser.DeletionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#deletion}.
	 * @param ctx the parse tree
	 */
	void exitDeletion(DataModelingParser.DeletionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#deleteaddition}.
	 * @param ctx the parse tree
	 */
	void enterDeleteaddition(DataModelingParser.DeleteadditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#deleteaddition}.
	 * @param ctx the parse tree
	 */
	void exitDeleteaddition(DataModelingParser.DeleteadditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#renaming}.
	 * @param ctx the parse tree
	 */
	void enterRenaming(DataModelingParser.RenamingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#renaming}.
	 * @param ctx the parse tree
	 */
	void exitRenaming(DataModelingParser.RenamingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(DataModelingParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(DataModelingParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#restriction}.
	 * @param ctx the parse tree
	 */
	void enterRestriction(DataModelingParser.RestrictionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#restriction}.
	 * @param ctx the parse tree
	 */
	void exitRestriction(DataModelingParser.RestrictionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(DataModelingParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(DataModelingParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#attributecommalist}.
	 * @param ctx the parse tree
	 */
	void enterAttributecommalist(DataModelingParser.AttributecommalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#attributecommalist}.
	 * @param ctx the parse tree
	 */
	void exitAttributecommalist(DataModelingParser.AttributecommalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#attributecommalistaddition}.
	 * @param ctx the parse tree
	 */
	void enterAttributecommalistaddition(DataModelingParser.AttributecommalistadditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#attributecommalistaddition}.
	 * @param ctx the parse tree
	 */
	void exitAttributecommalistaddition(DataModelingParser.AttributecommalistadditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#tworelationexpression}.
	 * @param ctx the parse tree
	 */
	void enterTworelationexpression(DataModelingParser.TworelationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#tworelationexpression}.
	 * @param ctx the parse tree
	 */
	void exitTworelationexpression(DataModelingParser.TworelationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#binaryoperation}.
	 * @param ctx the parse tree
	 */
	void enterBinaryoperation(DataModelingParser.BinaryoperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#binaryoperation}.
	 * @param ctx the parse tree
	 */
	void exitBinaryoperation(DataModelingParser.BinaryoperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DataModelingParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DataModelingParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(DataModelingParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(DataModelingParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DataModelingParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DataModelingParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#numberclause}.
	 * @param ctx the parse tree
	 */
	void enterNumberclause(DataModelingParser.NumberclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#numberclause}.
	 * @param ctx the parse tree
	 */
	void exitNumberclause(DataModelingParser.NumberclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(DataModelingParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(DataModelingParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DataModelingParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DataModelingParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataModelingParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(DataModelingParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataModelingParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(DataModelingParser.RelationContext ctx);
}