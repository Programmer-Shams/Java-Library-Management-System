package VersionTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibaryClass libary = new LibaryClass();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(!exit) {
            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book By Title");
            System.out.println("4. Search Book By Author");
            System.out.println("5. Edit Book Title");
            System.out.println("6. Edit Book Author");
            System.out.println("7. Display All Books");
            System.out.println("8. Exit");
            System.out.println("Please enter your choice");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter Book Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter Book ID");
                    String id = scanner.nextLine();
                    BookClass book =  new BookClass(title, author, id);
                    libary.addBook(book);
                    break;

                case 2:
                    System.out.println("Enter the ID of the book to remove: ");
                    String removeID = scanner.nextLine();
                    libary.removeBook(removeID);
                    break;

                case 3:
                    System.out.println("Enter the Title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    libary.searchBookByTitle(searchTitle);
                    break;

                case 4:
                    System.out.println("Enter the the Author of the book to search: ");
                    String searchAuthor = scanner.nextLine();
                    libary.searchBookByAuthor(searchAuthor);
                    break;

                case 5:
                    System.out.println("Enter the ID of the book to edit: ");
                    String editID = scanner.nextLine();
                    System.out.println("Enter the New Title");
                    String newTitle = scanner.nextLine();
                    libary.EditBookTitle(editID, newTitle);
                    break;

                case 6:
                    System.out.println("Enter the ID of the book to edit: ");
                    String editAuthorId = scanner.nextLine();
                    System.out.println("Enter the New Author");
                    String newAuthor = scanner.nextLine();
                    libary.EditBookAuthor(editAuthorId, newAuthor);
                    break;

                case 7:
                    System.out.println("Below are the books in the Library");
                    libary.displayBooks();
                    break;

                case 8:
                    exit = true;
                    break;

                default:
                    System.out.println("Please enter a valid option, try again");
            }
        }

        scanner.close();
        System.out.println("Thank you for using my Library Management System");
    }
}
