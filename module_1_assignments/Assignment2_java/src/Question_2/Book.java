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
        if(numOfCopies<0) {
        	System.out.println("The Quantity can not be negative");
        	this.numOfCopies=0;
        }
        else {
        	this.numOfCopies=numOfCopies;
        }
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


    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void display() {
        System.out.println(bookTitle + " - " + author + " - " + ISBN + " - " + numOfCopies);
    }
}