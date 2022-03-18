/**
 * Quiz 4.5
 * @author RaymondHarmer
 * 03.22.2022
 * This class creates objects in an array based on the Product class and the subclasses that
 * inherit from it. Last quiz, we explicitly constructed these objects from the Product
 * class. Here, we are creating the objects from the relevant product subclasses, as the
 * parent Product class is abstract and cannot directly be referred. 
 * @ @ @
 * The same while loop is utilized to display a numbered menu of the created objects, allowing 
 * the user to call the buy() method if in stock. A try-catch block has replaced an if-else 
 * statement used in the last version to handle an exception when the user does not choose a
 * valid number entry or wants to exit.
 */

import java.util.Scanner;

public class Shop {
	
	//Counter for the total cart balance
	static double totalAmount = 0;
	
	//Five unique e-Commerce objects based on the Product class' constructors
	static Product[] inventory = {
			new Apparel("Business Ritual Women's Long Sleeve Top", 65.39, 4, 'L', "Blue"),
			new Book("The Art of Computer Programming", 190.54,  9, "Donald E. Knuth"),
			new Apparel("Men's Business Casual Shirt", 57.10, 2, 'M', "Teal"),
			new Bath("Organic Turmeric Soap", 11.25, 1),
			new Apparel("Head First Design Pattern", 65.39, 4, 'L', "Blue")
			};
	
	//This method shows a menu with instructions to select each of the available products
	static void displayMenu() {
		System.out.println("\nEnter the product number you wish to purchase. To exit the shopping cart,"
				+ "\nenter any number not seen below.\n");
		
		for(int i = 0; i < inventory.length; i++) {
			System.out.println(i + " : " + inventory[i].getName());
		}
	}
	
	//Main method - first takes user's menu selection, then (if valid) calls the buy() method to purchase 
	public static void main(String[] args) {
		int userInput = 0;
		Scanner sc = new Scanner(System.in);
		
		/* While loop which displays the shopping menu for the e-Commerce store.
		 * Uses a try-catch block to check if user input integer is within the
		 * index range of the referenced array. If not, the ArrayIndexOutOfBounds
		 * exception will be caught and handled by breaking the while loop.
		 */
		
		while(userInput >= 0 && userInput <= 4) {
			displayMenu();
			userInput = sc.nextInt();
			
			//Try-catch block to handle an index out-of-bounds entry by the user, breaking the menu loop
			try {
				if(inventory[userInput].buy() == true) {
					System.out.println("Your purchase was successful.");
					totalAmount += inventory[userInput].getPrice();
				}
				else {
					System.out.println("Sorry! This product is out of stock.");
				}
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				
				break;
			}
		}
																					   //For fun :), only thing I looked up
		System.out.println("\nThank you for shopping with us! The total amount is $" + Math.round(totalAmount * 100.00) / 100.00 + ".");
		
		sc.close();
	}
}
