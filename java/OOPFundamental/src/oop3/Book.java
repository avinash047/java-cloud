package oop3;

public class Book {
	// Default Instance variable
	 private String bookName;
	 private String author;
	 private double price;
	
	Book(String bookName, String author, double price){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public void showBook(){
		System.out.println("Book Name: "+bookName);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+price);
		System.out.println("...................... ");
	}
	
}
