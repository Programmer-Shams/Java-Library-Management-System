package VersionTwo;

import java.util.ArrayList;

public class LibaryClass {
    private ArrayList<BookClass> books;

    public LibaryClass() {
        books = new ArrayList<>();
    }


    // Method to Add book to the library
    public void addBook(BookClass book){
        books.add(book);
        System.out.println("Book added to library " + book);
    }

    // Method to Remove book from the library
    public void removeBook(String id){
        for(BookClass book: books) {
            if(book.getId().equals(id)){
                books.remove(book);
                System.out.println("Book removed from library" + book);
                return;
            }
        }
        System.out.println("Book with id " + id + " is not found");
    }

    // Method to Search book by title
    public void searchBookByTitle(String title){
        for(BookClass book: books) {
            if(book.getTitle().equalsIgnoreCase(title)){
                System.out.println("Book found in library" + book);
                return;
            }
        }
        System.out.println("Book with title " + title + " is not found");
    }

    // Method to Search book by author
    public void  searchBookByAuthor(String author){
        for(BookClass book: books) {
            if(book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("Book found in library" + book);
            }
        }
        System.out.println("No book found by author: " + author);
    }

    // Method to Display All Books
    public void displayBooks(){
        for(BookClass book: books) {
            System.out.println(book);
        }
    }

    // Method to Edit Book Title
    public void EditBookTitle(String id, String newTitle) {
        for(BookClass book: books) {
            if(book.getId().equals(id)){
                book.setTitle(newTitle);
                System.out.println("Title of Book Updated to " + newTitle);
                return;
            }
        }
        System.out.println("Book with id " + id + " is not found");
    }

    // Method to EditBookAuthor
    public void EditBookAuthor(String id, String newAuthor) {
        for(BookClass book: books) {
            if(book.getId().equals(id)){
                book.setAuthor(newAuthor);
                System.out.println("Author of Book Updated to " + newAuthor);
                return;
            }
        }
        System.out.println("Book with id " + id + " is not found");
    }
}
