package Project_6;

import java.util.InputMismatchException;
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
		int maxSize=-1;
		
		//prompt the user until they enter a number >= zero
		do {
			try{
				//display prompt to user		
				System.out.println("Enter the number of products you would like to add.");
				System.out.print("Enter 0 (zero) if you do not wish to add products: ");
				//assume that the user enters a valid 
				maxSize = in.nextInt();	
				if(maxSize<0)
					System.out.println("Incorrect Value entered");
				//endif
			}
			catch(InputMismatchException e) {
				System.out.println("Incorrect data type entered!");
				in.nextLine();
			}
			catch(Exception e){
				System.out.println(e);
				in.nextLine();
			}
		}while(maxSize<0);

		if(maxSize ==0) {
			//Display a no products message if zero is entered
			System.out.println("No products required!");
		}else {
			Product[] products = new Product[maxSize];
	        for(int i = 0; i<maxSize; i++) {
	        	in.nextLine();
	        	//ask the user to enter the product information
	    		System.out.print("\n\nPlease enter the product name: ");
	    		tempName = in.nextLine();
	    		System.out.print("Please enter the quantity of stock for this product: ");
	    		tempQty = in.nextInt();
	    		System.out.print("Please enter the price for this product: ");
	    		tempPrice = in.nextDouble();
	    		System.out.print("Please enter the item number: ");
	    		tempNumber = in.nextInt();
	    		//create a product object and store it in the products array
	    		products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
	        }//endfor
	
	        //display the contents of the products array
	        for(Product product: products)
	        	System.out.println(product);
	        //endor
	        
		}//endif
		
	}//end method main

}//end class ProductTaster
