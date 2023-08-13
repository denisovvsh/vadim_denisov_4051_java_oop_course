/* 
Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), 
с возможностью выполнения базовых математических операций, 
таких как сложение, вычитание, умножение и деление, работающий с дробными числами.
*/

//Комментарии по задаче 2 семинара 6

/* 
Принцип наследования отражен в классе CalculatorPresenterImpl - т.к. выбор операции производится в нем, то можно наследовать клсс CalculatorModelImpl

Класс CalculatorModelImpl и CalculatorViewImpl отражют принцип единственной ответственности (Single Responsibility Principle, SRP)
т.к. каждый отвечает за свои метода, не содержат методов, которые выходят за смысл названия класса

Класс Operator отражает принцип открытости/закрытости (Open/Closed Principle, OCP), 
т.к. содержит приватные атрибуты и публичные метода для взаимодействия с ними

Принцип разделения интерфейса (Interface Segregation Principle, ISP) - все классы не зависят от интерфейсов, которые они не используют.

Принцип инверсии зависимостей (Dependency Inversion Principle, DIP) - высокоуровневые модули не зависят от низкоуровневых модулей.
*/

package java_oop.Sem5;

public class Task1 {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorViewImpl();
        CalculatorPresenter presenter = new CalculatorPresenterImpl(view);

        presenter.performOperation();
    }
}
