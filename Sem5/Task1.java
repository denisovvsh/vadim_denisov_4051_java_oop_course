package java_oop.Sem5;

public class Task1 {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModelImpl();
        CalculatorView view = new CalculatorViewImpl();
        CalculatorPresenter presenter = new CalculatorPresenterImpl(model, view);

        presenter.performOperation();
    }
}
