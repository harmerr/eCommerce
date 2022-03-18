/**
 * Quiz 4.5
 * @author RaymondHarmer
 * 03.11.2022
 * This is one of the three subclasses extending from the Product class. Unique
 * private attributes pertaining to book products are created here, with relevant
 * constructors also made for the Shop class to call to. The originally abstract
 * getDetails() method is also made functional here.
 */

public class Book extends Product {
	
	//Unique attributes to Book products
	private String author;
	private String genre;
	private String isbn;
	
	//Constructors for above and inherited (super) attributes
	Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}
	
	Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}
	
	//Unique book description method based on the abstract method in the Product class
	@Override
	public void getDetails() {
		System.out.println("We sell books on Software Development");
	}

	//toString() method to convert all defined attributes to String data type
	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + ", isbn=" + isbn + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	//
	
}
