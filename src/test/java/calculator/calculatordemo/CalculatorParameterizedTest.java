package calculator.calculatordemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParameterizedTest {

    public static final String NULL_NAME = "Один из параметров не задан";

    private final CounterService out = new CounterService();

    @ParameterizedTest
    @MethodSource("provideParamsForSumMethod")
    public void shouldReturnResultSumCorrect(Double num1, Double num2, String c) {
        assertEquals(c, out.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusMethod")
    public void shouldReturnResultMinusCorrect(Double num1, Double num2, String c) {
        assertEquals(c, out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyMethod")
    public void shouldReturnResultMultiplyCorrect(Double num1, Double num2, String c) {
        assertEquals(c, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideMethod")
    public void shouldReturnResultDivideCorrect(Double num1, Double num2, String c) {
        assertEquals(c, out.divide(num1, num2));
    }

    public static Stream<Arguments> provideParamsForSumMethod() {
        return Stream.of(
                Arguments.of(3.0, 2.0, "3.0 + 2.0 = 5.0"),
        Arguments.of(null, 2.0, NULL_NAME),
        Arguments.of(3.0, null, NULL_NAME)
        );
    }

    public static Stream<Arguments> provideParamsForMinusMethod() {
        return Stream.of(
                Arguments.of(3.0, 2.0, "3.0 - 2.0 = 1.0"),
                Arguments.of(null, 2.0, NULL_NAME),
                Arguments.of(3.0, null, NULL_NAME)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyMethod() {
        return Stream.of(
                Arguments.of(3.0, 2.0, "3.0 * 2.0 = 6.0"),
                Arguments.of(null, 2.0, NULL_NAME),
                Arguments.of(3.0, null, NULL_NAME)
        );
    }

    public static Stream<Arguments> provideParamsForDivideMethod() {
        return Stream.of(
                Arguments.of(3.0, 2.0, "3.0 / 2.0 = 1.5"),
                Arguments.of(null, 2.0, NULL_NAME),
                Arguments.of(3.0, null, NULL_NAME)
        );
    }

}