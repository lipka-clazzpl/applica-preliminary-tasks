package pl.clazz;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class MathExpressionValidatorTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowExceptionOnMalformedInput() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Input parameter expression:String should not be null");

        MathExpressionValidator mev = new MathExpressionValidator();
        mev.validate(null);
    }
}
