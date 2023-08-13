package java_oop.Sem5;

public class CalculatorPresenterImpl extends CalculatorModelImpl implements CalculatorPresenter {
    private CalculatorView view;

    public CalculatorPresenterImpl(CalculatorView view) {
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
                result = this.add(num1, num2);
                break;
            case SUBTRACTION:
                result = this.subtract(num1, num2);
                break;
            case MULTIPLICATION:
                result = this.multiply(num1, num2);
                break;
            case DIVISION:
                try {
                    result = this.divide(num1, num2);
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

