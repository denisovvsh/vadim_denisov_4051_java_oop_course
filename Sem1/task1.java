package java_oop.Sem1;

public class task1 {
    public static void main(String[] args) {
        // Создаем объекты котов и владельца
        Cat cat1 = new Cat("Мурзик", 3);
        Cat cat2 = new Cat("Барсик", 5);
        Owner owner1 = new Owner("Иван");
        Owner owner2 = new Owner("Мария");

        // Устанавливаем владельцев котам
        cat1.setOwner(owner1);
        cat2.setOwner(owner2);

        // Вызываем метод приветствия для каждого кота
        cat1.greet(); // Выводит: Мяу! Меня зовут Мурзик. Мне 3 года(лет). Мой владелец - Иван.
        cat2.greet(); // Выводит: Мяу! Меня зовут Барсик. Мне 5 года(лет). Мой владелец - Мария.
    }
}
