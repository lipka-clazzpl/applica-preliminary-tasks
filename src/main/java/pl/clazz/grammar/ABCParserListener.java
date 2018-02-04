package pl.clazz.grammar;// Generated from ABCParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ABCParser}.
 */
public interface ABCParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ABCParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ABCParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ABCParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ABCParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ABCParser#lvl0_chardata}.
	 * @param ctx the parse tree
	 */
	void enterLvl0_chardata(ABCParser.Lvl0_chardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ABCParser#lvl0_chardata}.
	 * @param ctx the parse tree
	 */
	void exitLvl0_chardata(ABCParser.Lvl0_chardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ABCParser#lvl0_elem}.
	 * @param ctx the parse tree
	 */
	void enterLvl0_elem(ABCParser.Lvl0_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ABCParser#lvl0_elem}.
	 * @param ctx the parse tree
	 */
	void exitLvl0_elem(ABCParser.Lvl0_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ABCParser#lvl0_elem_chardata}.
	 * @param ctx the parse tree
	 */
	void enterLvl0_elem_chardata(ABCParser.Lvl0_elem_chardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ABCParser#lvl0_elem_chardata}.
	 * @param ctx the parse tree
	 */
	void exitLvl0_elem_chardata(ABCParser.Lvl0_elem_chardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ABCParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ABCParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ABCParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ABCParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ABCParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ABCParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ABCParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ABCParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ABCParser#chardata}.
	 * @param ctx the parse tree
	 */
	void enterChardata(ABCParser.ChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ABCParser#chardata}.
	 * @param ctx the parse tree
	 */
	void exitChardata(ABCParser.ChardataContext ctx);
}