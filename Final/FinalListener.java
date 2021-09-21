// Generated from Final.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FinalParser}.
 */
public interface FinalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FinalParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FinalParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FinalParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(FinalParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(FinalParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FinalParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FinalParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FinalParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FinalParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(FinalParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(FinalParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(FinalParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(FinalParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FinalParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FinalParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(FinalParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(FinalParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(FinalParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(FinalParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FinalParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FinalParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#operate}.
	 * @param ctx the parse tree
	 */
	void enterOperate(FinalParser.OperateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#operate}.
	 * @param ctx the parse tree
	 */
	void exitOperate(FinalParser.OperateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(FinalParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(FinalParser.ResultContext ctx);
}