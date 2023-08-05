package java_oop.Sem5;

public interface CalculatorView {
    void showResult(double result);
    void showErrorMessage(String errorMessage);
    double getFirstNumber();
    double getSecondNumber();
    Operator getOperator();
}

