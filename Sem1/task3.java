package java_oop.Sem1;

public class task3 {
    public static void main(String[] args) {
        // Создаем книги
        Book book1 = new Book("Java: The Complete Reference", "Herbert Schildt");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Head First Java", "Kathy Sierra, Bert Bates");

        // Создаем библиотеку и добавляем книги
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Показываем доступные книги
        library.displayAvailableBooks();

        // Изменяем доступность книги
        book2.setAvailable(false);

        // Показываем доступные книги после изменения доступности
        library.displayAvailableBooks();

        // Ищем книги по автору
        library.searchByAuthor("Herbert Schildt");
    }
}
