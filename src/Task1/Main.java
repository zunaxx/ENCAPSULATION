package Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(200);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Поиск книги по названию");
            System.out.println("3. Поиск книги по автору");
            System.out.println("4. Обновить информацию о книге");
            System.out.println("5. Удалить книгу");
            System.out.println("6. Вывести список всех книг");
            System.out.println("7. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название книги: ");
                    String title = scanner.nextLine();
                    System.out.print("Введите автора книги: ");
                    String author = scanner.nextLine();
                    Books book = new Books(title, author);
                    library.addBook(book);
                    System.out.println("Книга добавлена в библиотеку.");
                    break;

                case 2:
                    System.out.print("Введите название книги для поиска: ");
                    String searchTitle = scanner.nextLine();
                    Books[] foundByTitle = library.findBooksByTitle(searchTitle);
                    printBooks(foundByTitle);
                    break;

                case 3:
                    System.out.print("Введите автора книги для поиска: ");
                    String searchAuthor = scanner.nextLine();
                    Books[] foundByAuthor = library.findBooksByAuthor(searchAuthor);
                    printBooks(foundByAuthor);
                    break;

                case 4:
                    System.out.print("Введите название книги для обновления: ");
                    String oldTitle = scanner.nextLine();
                    System.out.print("Введите новое название книги: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Введите нового автора книги: ");
                    String newAuthor = scanner.nextLine();
                    boolean updated = library.updateBook(oldTitle, newTitle, newAuthor);
                    if (updated) {
                        System.out.println("Информация о книге обновлена.");
                    } else {
                        System.out.println("Книга не найдена.");
                    }
                    break;

                case 5:
                    System.out.print("Введите название книги для удаления: ");
                    String bookToDelete = scanner.nextLine();
                    boolean removed = library.removeBook(bookToDelete);
                    if (removed) {
                        System.out.println("Книга удалена из библиотеки.");
                    } else {
                        System.out.println("Книга не найдена.");
                    }
                    break;

                case 6:
                    Books[] allBooks = library.getAllBooks();
                    printBooks(allBooks);
                    break;

                case 7:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Некорректный выбор. Пожалуйста, выберите снова.");
                    break;
            }
        }
    }

    private static void printBooks(Books[] books) {
        if (books.length == 0) {
            System.out.println("Книги не найдены.");
        } else {
            for (Books book : books) {
                if (book != null) {
                    System.out.println(book);
                }
            }
        }
    }
}

