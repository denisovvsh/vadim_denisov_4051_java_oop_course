package java_oop.Sem1;

public class task2 {
    public static void main(String[] args) {
        // Создаем объекты прямоугольников
        Rectangle rectangle1 = new Rectangle(); // Прямоугольник с шириной и высотой по умолчанию
        Rectangle rectangle2 = new Rectangle(5.0, 3.0); // Прямоугольник с заданными значениями

        // Выводим информацию о прямоугольниках
        System.out.println("Прямоугольник 1: ширина = " + rectangle1.getWidth() + ", высота = " + rectangle1.getHeight());
        System.out.println("Площадь прямоугольника 1: " + rectangle1.calculateArea());
        System.out.println("Периметр прямоугольника 1: " + rectangle1.calculatePerimeter());

        System.out.println("Прямоугольник 2: ширина = " + rectangle2.getWidth() + ", высота = " + rectangle2.getHeight());
        System.out.println("Площадь прямоугольника 2: " + rectangle2.calculateArea());
        System.out.println("Периметр прямоугольника 2: " + rectangle2.calculatePerimeter());
    }
}
