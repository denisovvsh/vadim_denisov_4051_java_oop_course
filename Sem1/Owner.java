package java_oop.Sem1;

public class Owner {
    private String name;

    // Конструктор класса
    public Owner(String name) {
        this.name = name;
    }

    // Геттер и сеттер для имени владельца
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
