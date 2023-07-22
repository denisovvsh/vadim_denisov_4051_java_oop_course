package java_oop.Sem2;

public class Task1 {
    public static void main(String[] args) {
        // Создаем владельца
        Owner owner1 = new Owner("Джон");

        // Создаем котов
        Cat cat1 = new Cat("Том", 3);
        Cat cat2 = new Cat("Вискас", 5);

        // Устанавливаем владельцев для котов
        cat1.setOwner(owner1);
        cat2.setOwner(owner1);

        // Выводим информацию о котах и их владельцах
        System.out.println(cat1);
        System.out.println("Владелец " + cat1.getName() + ": " + cat1.getOwner().getName());

        System.out.println(cat2);
        System.out.println("Владелец " + cat2.getName() + ": " + cat2.getOwner().getName());

        // Играем с котами
        cat1.play();
        cat2.play();

        // Издаем звуки
        cat1.makeSound();
        cat2.makeSound();

        // Тестируем приветствие
        cat1.greet();
        cat2.greet();

        // Сравниваем котов по имени
        int compareResult = cat1.compareTo(cat2);
        if (compareResult < 0) {
            System.out.println(cat1.getName() + " идет перед " + cat2.getName() + " в алфавитном порядке.");
        } else if (compareResult > 0) {
            System.out.println(cat1.getName() + " идет после " + cat2.getName() + " в алфавитном порядке.");
        } else {
            System.out.println(cat1.getName() + " и " + cat2.getName() + " имеют одинаковые имена.");
        }
    }    
}
