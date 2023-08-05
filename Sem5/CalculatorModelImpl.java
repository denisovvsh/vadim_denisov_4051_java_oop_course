package java_oop.Sem5;

public class CalculatorModelImpl implements CalculatorModel {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
}

