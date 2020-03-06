package oop4;

public class Book {
	// Default Instance variable
	 private String bookName;
	 private String author;
	 private double price;
	 private static double discount;
	
	Book(String bookName, String author, double price){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public static void setDiscount(double discount){
		Book.discount = discount;
	}
	public void showBook(){
		System.out.println("Book Name: "+bookName);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+price);
		System.out.println("Book Discount: "+discount);
		System.out.println("...................... ");
	}
	
}
