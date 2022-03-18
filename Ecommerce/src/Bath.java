/**
 * Quiz 4.5
 * @author RaymondHarmer
 * 03.11.2022
 * This is one of the three subclasses extending from the Product class. Unique
 * private attributes pertaining to bath products are created here, with relevant
 * constructors also made for the Shop class to call to. The originally abstract
 * getDetails() method is also made functional here.
 */

public class Bath extends Product {
	
	//Constructor for inherited (super) attributes, this class does not have unique attributes
	Bath(String name, double price, int quantity) {
		super(name, price, quantity);
	}
	
	//Unique bath product description method based on the abstract method in the Product class
	@Override
	public void getDetails() {
		System.out.println("We sell organic bath products!");
	}

	//toString() method to convert all defined attributes to String data type
	@Override
	public String toString() {
		return "Bath [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
