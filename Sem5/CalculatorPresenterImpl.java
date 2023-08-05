package java_oop.Sem5;

public class CalculatorPresenterImpl implements CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenterImpl(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void performOperation() {
        double num1 = view.getFirstNumber();
        double num2 = view.getSecondNumber();
        Operator operator = view.getOperator();

        double result;
        switch (operator) {
            case ADDITION:
                result = model.add(num1, num2);
                break;
            case SUBTRACTION:
                result = model.subtract(num1, num2);
                break;
            case MULTIPLICATION:
                result = model.multiply(num1, num2);
                break;
            case DIVISION:
                try {
                    result = model.divide(num1, num2);
                } catch (ArithmeticException e) {
                    view.showErrorMessage(e.getMessage());
                    return;
                }
                break;
            default:
                view.showErrorMessage("Invalid operator!");
                return;
        }

        view.showResult(result);
    }
}

