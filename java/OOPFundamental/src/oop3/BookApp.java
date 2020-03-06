package oop3;

public class BookApp {

	public static void main(String[] args) {
		
			Book b1 = new Book("Java Fundamental-3", "Cay Horstman", 750.50);  //create object
			Book b2 = new Book("Let us C", "RS Kanetkar", 180.50);
			b1.showBook(); 
			b2.showBook(); 
	}

}
