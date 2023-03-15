package Project_5;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		//create a Scanner object for keyboard input
		Scanner in = new Scanner(System.in);	
		//create local variables
		int tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		
		
		//ask the user to enter the product information
		System.out.print("\n\nPlease enter the product name: ");
		tempName = in.nextLine();
		System.out.print("Please enter the quantity of stock for this product: ");
		tempQty = in.nextInt();
		System.out.print("Please enter the price for this product: ");
		tempPrice = in.nextDouble();
		System.out.print("Please enter the item number: ");
		tempNumber = in.nextInt();
		
		//create the first product using information input by the user
		Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);

		//ask the user to enter the product information
		in.nextLine();
		System.out.print("\n\nPlease enter the product name: ");
		tempName = in.nextLine();
		System.out.print("Please enter the quantity of stock for this product: ");
		tempQty = in.nextInt();
		System.out.print("Please enter the price for this product: ");
		tempPrice = in.nextDouble();
		System.out.print("Please enter the item number: ");
		tempNumber = in.nextInt();
		
        //create two objects using the default constructor
        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);

        //close the Scanner object
        in.close();
        
        //create four objects using values for the arguments
        //this will use the overloaded constructor
        Product p3 = new Product(3, "Hot Shots", 75, 8.99);
        Product p4 = new Product(4, "Brothers In Arms", 200, 7.75);
        Product p5 = new Product(5, "Fantastic", 500, 9.50);
        Product p6 = new Product(6, "The Party Album", 150, 4.00);

        
        //set the active field to false
        p6.setActive(false);
        
        //display the description of each object as outlined in the 
        //toString() method
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

	}//end method main

}//end class ProductTaster
