import Classes.BookClass;
import Classes.LibraryClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryClass library = new LibraryClass();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");
            System.out.println("Please enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter title");
                    String title = scanner.nextLine();
                    System.out.println("Enter author");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    BookClass book = new BookClass(title, author, isbn);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.println("Enter the ISBN of the book you want to remove");
                    String removeISBN = scanner.nextLine();
                    library.removeBook(removeISBN);
                    break;

                case 3:
                    System.out.println("Enter the title of the book you want to search");
                    String searchTitle = scanner.nextLine();
                    library.searchBookByTitle(searchTitle);
                    break;

                case 4:
                    System.out.println("Enter the author of the book you want to search");
                    String searchAuthor = scanner.nextLine();
                    library.searchBookByAuthor(searchAuthor);
                    break;

                case 5:
                    library.displayAllBooks();
                    break;

                case 6:
                    exit = true;

                default:
                    System.out.println("Invalid choice please try again");
            }
        }

        scanner.close();
        System.out.println("Thank you for using my Library Management System");
    }
}
