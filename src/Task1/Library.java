package Task1;


class Library {
    private Books[] books;
    private int capacity;
    private int size;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Books[capacity];
        this.size = 0;
    }

    public void addBook(Books book) {
        if (size < capacity) {
            books[size] = book;
            size++;
        } else {
            System.out.println("Библиотека заполнена. Невозможно добавить книгу.");
        }
    }

    public Books[] findBooksByTitle(String title) {
        Books[] foundBooks = new Books[capacity];
        int foundCount = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                foundBooks[foundCount] = books[i];
                foundCount++;
            }
        }
        return foundBooks;
    }

    public Books[] findBooksByAuthor(String author) {
        Books[] foundBooks = new Books[capacity];
        int foundCount = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)) {
                foundBooks[foundCount] = books[i];
                foundCount++;
            }
        }
        return foundBooks;
    }

    public boolean updateBook(String oldTitle, String newTitle, String newAuthor) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(oldTitle)) {
                books[i].setTitle(newTitle);
                books[i].setAuthor(newAuthor);
                return true;
            }
        }
        return false;
    }

    public boolean removeBook(String title) {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            for (int i = indexToRemove; i < size - 1; i++) {
                books[i] = books[i + 1];
            }
            books[size - 1] = null;
            size--;
            return true;
        }

        return false;
    }

    public Books[] getAllBooks() {
        Books[] allBooks = new Books[size];
        System.arraycopy(books, 0, allBooks, 0, size);
        return allBooks;
    }
}

