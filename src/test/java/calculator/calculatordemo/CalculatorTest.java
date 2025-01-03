package calculator.calculatordemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public static final String NULL_NAME = "Один из параметров не задан";

    private final CounterService out = new CounterService();

    @Test
    public void shouldReturnResultOfSumWhenNotArguments() {
        String result = out.sum(4.0, null);
        assertEquals(NULL_NAME, result);
    }

    @Test
    public void shouldReturnResultOfSumCorrect() {
        String result = out.sum(1.0, 2.0);
        assertEquals("1.0 + 2.0 = 3.0", result);
    }

    @Test
    public void shouldReturnResultOfMinusWhenNotArguments() {
        String result = out.minus(4.0, null);
        assertEquals(NULL_NAME, result);
    }

    @Test
    public void shouldReturnResultOfMinusCorrect() {
        String result = out.minus(2.0, 1.0);
        assertEquals("2.0 - 1.0 = 1.0", result);
    }

    @Test
    public void shouldReturnResultOfMultiplyWhenNotArguments() {
        String result = out.multiply(4.0, null);
        assertEquals(NULL_NAME, result);
    }

    @Test
    public void shouldReturnResultOfMultiplyCorrect() {
        String result = out.multiply(2.0, 3.0);
        assertEquals("2.0 * 3.0 = 6.0", result);
    }

    @Test
    public void shouldReturnResultOfDivideWhenNotArguments() {
        String result = out.divide(4.0, null);
        assertEquals(NULL_NAME, result);
    }

    @Test
    public void shouldReturnExceptionDivideByZero() {
        assertThrows(ArithmeticException.class, () -> out.divide(6.0, 0.0));
    }

    @Test
    public void shouldReturnResultOfDivideCorrect() {
        String result = out.divide(6.0, 3.0);
        assertEquals("6.0 / 3.0 = 2.0", result);
    }

}