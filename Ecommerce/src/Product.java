/**
 * Quiz 4.5
 * @author RaymondHarmer
 * 03.11.2022
 * This class sets the the general attributes, constructor, and getters & setters for a
 * product in the e-Commerce store. From this, it acts as a super/parent class for
 * three subclasses connected to book, apparel, and bath products. Also, the buy() method
 * is created here to allow a user to purchase the desired product if in stock, while
 * updating the new stock in the backend. Finally, an abstract method called getDetails()
 * is defined here for the subclasses to describe each respective product type.
 */

public abstract class Product {
	
	//Attributes for e-Commerce products
	protected String name;
	protected double price;
	protected int quantity;
	
	//Below is a constructor for the above three (super class/to be inherited) attributes
	Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Public getters and setters for above inherited attributes
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//This method checks if a product is in stock and allows the user to purchase it if so
	public boolean buy() {
		if(this.quantity > 0) {
			this.quantity--;
			return true;
		}
		else {
			return false;
		}
	}
	
	//This abstract method is overwritten by each of the subclasses to describe pertaining product type
	public abstract void getDetails();
	
}
