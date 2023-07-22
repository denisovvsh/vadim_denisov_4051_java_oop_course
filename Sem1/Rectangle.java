package java_oop.Sem1;

public class Rectangle {
    private double width;
    private double height;

    // Конструктор без параметров
    public Rectangle() {
        // Значения ширины и высоты по умолчанию
        this.width = 1.0;
        this.height = 1.0;
    }

    // Конструктор с параметрами
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Геттеры и сеттеры для ширины и высоты
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Метод вычисления площади
    public double calculateArea() {
        return width * height;
    }

    // Метод вычисления периметра
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
