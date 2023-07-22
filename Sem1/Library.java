package java_oop.Sem1;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    // Конструктор класса
    public Library() {
        catalog = new ArrayList<>();
    }

    // Метод для добавления книги в каталог
    public void addBook(Book book) {
        catalog.add(book);
    }

    // Метод для удаления книги из каталога
    public void removeBook(Book book) {
        catalog.remove(book);
    }

    // Метод для вывода информации о доступных книгах
    public void displayAvailableBooks() {
        System.out.println("Доступные книги в библиотеке:");
        for (Book book : catalog) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    // Метод для поиска книг по автору
    public void searchByAuthor(String author) {
        System.out.println("Книги автора " + author + ":");
        for (Book book : catalog) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayInfo();
            }
        }
    }
}
