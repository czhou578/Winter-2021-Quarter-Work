// Generated from WKSHT6.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WKSHT6Parser}.
 */
public interface WKSHT6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WKSHT6Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(WKSHT6Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link WKSHT6Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(WKSHT6Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link WKSHT6Parser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(WKSHT6Parser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link WKSHT6Parser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(WKSHT6Parser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link WKSHT6Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(WKSHT6Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WKSHT6Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(WKSHT6Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WKSHT6Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(WKSHT6Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link WKSHT6Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(WKSHT6Parser.ArrayContext ctx);
}