package Question_2;

import java.util.Scanner;

public class BookStore {
	Book books[];
	int capacity;
	int counter;
	public BookStore() {
		books = new Book[10];
		capacity=10;
		counter=0;
	}
	public void sell(String title,int count) {
		for(int i=0;i<counter;i++) {
			if(title.equalsIgnoreCase(books[i].getBookTitle())){
				if(count>books[i].getNumOfCopies()) {
					System.out.println("Not Enough stock");
				}
				else {
					books[i].setNumOfCopies(books[i].getNumOfCopies()-count);
					
					
				}
				return;
			}
		}
		System.out.println("Book not Found");
	}
	public void order(String isbn,int count) {
		for(int i=0;i<counter;i++) {
			if(isbn.equalsIgnoreCase(books[i].getISBN())) {
				books[i].setNumOfCopies(books[i].getNumOfCopies()+1);
			}
			else {
				if(counter<capacity) {
					Scanner sc=new Scanner(System.in);
					String title;
					System.out.println("Enter the name of Title"); 
					title=sc.nextLine();
					books[counter].setBookTitle(title);
					String author;
					System.out.println("Enter the name of the author");
					author=sc.nextLine();
					books[counter].setAuthor(author);
					sc.close();
					counter++;
					
				}
				
			}
		}
	}
		public void display() {
			for(int i=0;i<counter;i++) {
				books[i].display();
				
			}
		}
	}
	

