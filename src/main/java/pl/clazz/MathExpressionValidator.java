package pl.clazz;

import java.util.Stack;

public class MathExpressionValidator {

    private static final int OPEN_PAREN_CODE_POINT = 40;

    private static final int CLOSE_PAREN_CODE_POINT = 41;

    /**
     * Method to validate if parentheses in mathematical expression are properly balanced.
     * String without parentheses present should yield true as a result.
     * Assumes input string unicode code point might be outside U+0000 : U+FFFF range - typical for
     * math expressions ie. U+1D70B https://unicode-table.com/en/1D70B/
     * Implementation won't perform full parsing of the input.
     *
     * @param expression String to be checked
     * @return Boolean.TRUE if properly balanced, Boolean.FALSE otherwise
     * @throws IllegalArgumentException For null input string
     */
    boolean validate(final String expression) throws IllegalArgumentException {
        if(expression == null) {
            throw new IllegalArgumentException("First input parameter expression of type String should not be null");
        }

        if(expression.length() == 0) {
            return Boolean.TRUE;
        }

        Stack backingStack = new Stack();

        int offset = 0;
        int strLength = expression.length();
        // Traverse all code point, not merely 2 bytes sequences
        while (offset < strLength) {
            int codePoint = expression.codePointAt(offset);
            offset += Character.charCount(codePoint);

            if( OPEN_PAREN_CODE_POINT == codePoint ) {
                backingStack.push(OPEN_PAREN_CODE_POINT);
            }

            if( CLOSE_PAREN_CODE_POINT == codePoint ) {
                if(backingStack.empty()) {
                    return Boolean.FALSE;
                }
                else {
                    backingStack.pop();
                }
            }
        }

        // At this point should return false only if opening paren not balanced
        return backingStack.empty();
    }
}
