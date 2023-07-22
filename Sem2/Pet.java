package java_oop.Sem2;

interface Pet {
    void play(); // Метод для игры с домашним животным

    // Default метод для приветствия животного
    default String makeGreeting(String name, int age) {
        return "Привет! Я " + name + ". Мне " + age + " года(лет).";
    }
}