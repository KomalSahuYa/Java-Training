package Question_2;

public class BookStoreApp {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        store.order("ISBN101", 5);
        store.order("ISBN102", 3);

        store.display();

        store.sell("Java Basics", 2);
        store.sell("Java Basics", 10);

        store.order("ISBN101", 4);

        store.display();
    }
}