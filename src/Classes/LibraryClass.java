package Classes;

import java.util.ArrayList;

public class LibraryClass {
    private ArrayList<BookClass> books;

    public LibraryClass() {
        books = new ArrayList<>();
    }


    // Method to Add Book
    public void addBook(BookClass book) {
        books.add(book);
        System.out.println("Added Book: " + book);
    }



    // Method to removeBook

    public void removeBook(String isbn) {
        for (BookClass book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Removed Book: " + book);
                return;
            }
        }
    }


    // Method to search Book By Title

    public void searchBookByTitle(String title) {
        for (BookClass book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("No book found with title: " + title);
    }


    // Method to search Book By Author

    public void searchBookByAuthor(String author) {
        for (BookClass book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Book found: " + book);
                return;
            }
        }
        System.out.println("No book found by author: " + author);
    }


    // Method to display All Books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (BookClass book : books) {
                System.out.println(book);
            }
        }
    }
}
