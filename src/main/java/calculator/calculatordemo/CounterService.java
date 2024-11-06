package calculator.calculatordemo;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
    public String hello() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    public String sum(double num1, double num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String minus(double num1, double num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiply(double num1, double num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String divide(double num1, double num2) {
        if (num2 == 0) {
            return "Делить на 0 нельзя";
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
