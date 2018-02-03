package pl.clazz;

public class MathExpressionValidator {

    boolean validate(String expression) throws IllegalArgumentException {
        if(expression == null) {
            throw new IllegalArgumentException("First input parameter expression of type String should not be null");
        }
        return false;
    }
}
