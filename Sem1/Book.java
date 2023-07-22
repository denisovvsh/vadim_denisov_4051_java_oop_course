package java_oop.Sem1;

public class Book {
    private String title;
    private String author;
    private boolean available;

    // Конструктор класса
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; // Новая книга доступна по умолчанию
    }

    // Геттеры и сеттеры для названия и автора книги
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Геттер и сеттер для доступности книги
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        String availability = available ? "доступна" : "недоступна";
        System.out.println("Книга: " + title + ", автор: " + author + ", статус: " + availability);
    }
}
