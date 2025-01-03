package calculator.calculatordemo;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class CounterService {
    public String hello() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    public String sum(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не задан";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не задан";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не задан";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "Один из параметров не задан";
        }
        if (num2 == 0.0) {
            throw new ArithmeticException("Деление на 0 невозможно");
        }
        return num1 + " / " + num2 + " = " + num1 / num2;


    }
}
