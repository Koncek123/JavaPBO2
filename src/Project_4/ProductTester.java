package Project_4;

public class ProductTester {

	public static void main(String[] args) {
		//create two objects using the default constructor
        Product p1 = new Product();
        Product p2 = new Product();

        //create four objects using values for the arguments
        //this will use the overloaded constructor
        Product p3 = new Product(3, "Hot Shots", 75, 8.99);
        Product p4 = new Product(4, "Brothers In Arms", 200, 7.75);
        Product p5 = new Product(5, "Fantastic", 500, 9.50);
        Product p6 = new Product(6, "The Party Album", 150, 4.00);

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
