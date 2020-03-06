package oop1;

public class Book {
	// Private Instance variable
	private String bookName;
	private String author;
	private double price;
	
	
	public void showBook(){
		System.out.println("Book Name: "+bookName);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+price);
		System.out.println("...................... ");

	}
	public static void main(String args[]){
		Book b1 = new Book();  //create object
		b1.bookName = "Java Fundamental";
		b1.author = "Cay Horstman";
		b1.price = 550.50;
		b1.showBook();       
	}
}
