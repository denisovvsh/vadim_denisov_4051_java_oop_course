package java_oop.Task1;

public class Cat {
    private String name;
    private int age;
    private Owner owner; // Добавляем поле для хранения информации о владельце

    // Конструктор класса
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры для имени и возраста кота
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Геттеры и сеттеры для владельца
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // Метод приветствия
    public void greet() {
        String ownerInfo = (owner != null) ? "Мой владелец - " + owner.getName() + "." : "У меня нет владельца.";
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). " + ownerInfo);
    }
}
