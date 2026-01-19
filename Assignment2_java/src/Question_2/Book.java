package Question_2;

public class Book {
    private String bookTitle;
    private String author;
    private String ISBN;
    private int numOfCopies;

    public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.numOfCopies = Math.max(0, numOfCopies);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void increaseCopies(int count) {
        if (count > 0)
            numOfCopies += count;
    }

    public boolean decreaseCopies(int count) {
        if (count <= numOfCopies) {
            numOfCopies -= count;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println(bookTitle + " - " + author + " - " + ISBN + " - " + numOfCopies);
    }
}