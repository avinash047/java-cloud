package oop5;

public class Book {
	// Default Instance variable
	 private String bookName;
	 private String author;
	 private double price;
	 private static double discount;
	 double actualPrice;
	static{
		Book.discount = 10;
	}
	Book(String bookName, String author, double price){
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	/*
	 * //... if we use static block then we can not create static method for initialize static variable..//
	 public static void setDiscount(double discount){
		Book.discount = discount;
	}*/
	public void showBook(){	
		System.out.println("Book Name: "+bookName);
		System.out.println("Book author: "+author);
		System.out.println("Book price: "+price);
		System.out.println("Book Discount: "+discount);
		System.out.println("Actual price after Discount: "+(price-(price*discount/100)));
		System.out.println("...................... ");
	}
	
}
