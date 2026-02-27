// Aggregation (Weak HAS-A)

class Book {
    String title;
}

class Library {
    Book book;  // aggregation

    Library(Book book) {
        this.book = book;
    }
}

public class Test3 {
    public static void main(String[] args) {
        Book b = new Book();     // Book created outside
        Library lib = new Library(b);
    }
}