// Generated from Assig.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AssigParser}.
 */
public interface AssigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AssigParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AssigParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AssigParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(AssigParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(AssigParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AssigParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AssigParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(AssigParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(AssigParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(AssigParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(AssigParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(AssigParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(AssigParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(AssigParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(AssigParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(AssigParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(AssigParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(AssigParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(AssigParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AssigParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AssigParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#operate}.
	 * @param ctx the parse tree
	 */
	void enterOperate(AssigParser.OperateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#operate}.
	 * @param ctx the parse tree
	 */
	void exitOperate(AssigParser.OperateContext ctx);
	/**
	 * Enter a parse tree produced by {@link AssigParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(AssigParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AssigParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(AssigParser.ResultContext ctx);
}