package pl.clazz;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class MathExpressionValidatorTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void shouldThrowExceptionOnMalformedInput() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("First input parameter expression of type String should not be null");

        MathExpressionValidator mev = new MathExpressionValidator();
        mev.validate(null);
    }

    @Parameter(0)
    public String expression;

    @Parameter(1)
    public Boolean result;

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { "(2 + 4) * 4" , Boolean.TRUE },
                { "(4 * 4 - (log20 / 5)", Boolean.FALSE },
                { "3 - (5 * 2))", Boolean.FALSE },
                { "3 + 2x * 5", Boolean.TRUE }
        };

        return Arrays.asList(data);
    }

    @Test
    public void shouldProvideResults() {
        MathExpressionValidator mev = new MathExpressionValidator();

        assertEquals("Result", result, mev.validate(expression));
    }
}
