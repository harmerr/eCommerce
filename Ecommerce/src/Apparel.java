/**
 * Quiz 4.5
 * @author RaymondHarmer
 * 03.11.2022
 * This is one of the three subclasses extending from the Product class. Unique
 * private attributes pertaining to apparel products are created here, with relevant
 * constructors also made for the Shop class to call to. The originally abstract
 * getDetails() method is also made functional here.
 */

public class Apparel extends Product {
	
	//Unique attributes to apparel products
	private char size;
	private String color;
	
	//Constructor for above and inherited (super) attributes
	Apparel(String name, double price, int quantity, char size, String color) {
		super(name, price, quantity);
		this.size = size;
		this.color = color;
	}
	
	//Unique apparel product description method based on the abstract method in the Product class
	@Override
	public void getDetails() {
		System.out.println("We sell different kinds of business clothes for both men and women");
	}

	//toString() method to convert all defined attributes to String data type
	@Override
	public String toString() {
		return "Apparel [size=" + size + ", color=" + color + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}

}
