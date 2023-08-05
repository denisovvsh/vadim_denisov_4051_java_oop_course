package java_oop.Sem5;

import java.util.Scanner;

public class CalculatorViewImpl implements CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showResult(double result) {
        System.out.println("Result: " + result);
    }

    @Override
    public void showErrorMessage(String errorMessage) {
        System.out.println("Error: " + errorMessage);
    }

    @Override
    public double getFirstNumber() {
        System.out.print("Enter the first number: ");
        return scanner.nextDouble();
    }

    @Override
    public double getSecondNumber() {
        System.out.print("Enter the second number: ");
        return scanner.nextDouble();
    }

    @Override
    public Operator getOperator() {
        System.out.print("Enter the operator (+, -, *, /): ");
        String operator = scanner.next();
        return Operator.fromString(operator);
    }
}

