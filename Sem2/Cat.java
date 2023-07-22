package java_oop.Sem2;

import java.util.UUID;

public class Cat implements Pet, AgeInfo, Identifiable, Feline, Comparable<Cat> {
    private String name;
    private int age;
    private Owner owner; // Поле для хранения информации о владельце
    private String id; // Поле для хранения уникального идентификатора

    // Конструктор класса
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = UUID.randomUUID().toString(); // Генерируем уникальный идентификатор
    }

    // Геттеры и сеттеры для имени и возраста кота
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    // Геттер и сеттер для владельца
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Геттер для уникального идентификатора
    @Override
    public String getId() {
        return id;
    }

    // Метод приветствия с использованием default метода из интерфейса Pet
    public void greet() {
        System.out.println(makeGreeting(name, age));
    }

    // Реализация метода из интерфейса Pet
    @Override
    public void play() {
        System.out.println("Играю с котом " + name);
    }

    // Метод для издания звука, характерного для кошачьих (реализация метода из интерфейса Feline)
    @Override
    public void makeSound() {
        System.out.println(name + " издает кошачий звук: мяу-мяу!");
    }

    // Переопределение метода toString для вывода информации о коте
    @Override
    public String toString() {
        return "Кот: " + name + ", возраст: " + age + " года(лет), уникальный идентификатор: " + id;
    }

    // Переопределение метода compareTo для сравнения объектов (реализация метода из интерфейса Comparable)
    @Override
    public int compareTo(Cat o) {
        return this.name.compareTo(o.getName());
    }
}
