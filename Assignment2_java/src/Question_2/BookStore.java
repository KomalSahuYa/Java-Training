package Question_2;

import java.util.Scanner;

public class BookStore {
    private Book[] books = new Book[10];
    private int count = 0;

    public void sell(String title, int qty) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookTitle().equalsIgnoreCase(title)) {
                if (books[i].decreaseCopies(qty)) {
                    System.out.println("Book sold");
                } else {
                    System.out.println("Not enough stock");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void order(String isbn, int qty) {
        for (int i = 0; i < count; i++) {
            if (books[i].getISBN().equals(isbn)) {
                books[i].increaseCopies(qty);
                System.out.println("Stock updated");
                return;
            }
        }

        if (count < books.length) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            books[count++] = new Book(title, author, isbn, qty);
            System.out.println("New book added");
        } else {
            System.out.println("Bookstore full");
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}
