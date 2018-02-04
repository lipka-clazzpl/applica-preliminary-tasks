package pl.clazz.grammar;// Generated from ABCParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ABCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ABCParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ABCParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ABCParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ABCParser#lvl0_chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvl0_chardata(ABCParser.Lvl0_chardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ABCParser#lvl0_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvl0_elem(ABCParser.Lvl0_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ABCParser#lvl0_elem_chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvl0_elem_chardata(ABCParser.Lvl0_elem_chardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ABCParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ABCParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ABCParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(ABCParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ABCParser#chardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardata(ABCParser.ChardataContext ctx);
}