package Project_4;

public class Product {
	//Instance field declarations
	private int itemNumber;		//unique value for identification
    private String name;		//name of the product
    private int qtyInStock;		//quantity in stock
    private double price;		//price of the product
    
    //default constructor which initializes instance variables
    //numeric values are 0 (zero) and String values are "" (null)
    public Product()
    {
    }//end constructor
    
    //constructor that allows the setting of the initial values for Products
    public Product(int number, String name, int qty, double price)
    { 
      this.itemNumber = number;
      this.name = name;
      this.qtyInStock = qty;
      this.price = price;
    }//end constructor

    //returns the current value of itemNumber
	public int getItemNumber() {
		return itemNumber;
	}//end method getItemNumber

	//updates the value of itemNumber
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}//end method setItemNumber

	//returns the current value of name
	public String getName() {
		return name;
	}//end method getName

	//updates the value of name
	public void setName(String name) {
		this.name = name;
	}//end method setName

	//returns the current value of qtyInStock
	public int getQtyInStock() {
		return qtyInStock;
	}//end method getQtyInStock

	//updates the value of qtyInStock
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}//end method setQtyInStock

	//returns the current value of price
	public double getPrice() {
		return price;
	}//end method getPrice

	//updates the value of price
	public void setPrice(double price) {
		this.price = price;
	}//end method setPrice
    	
	//override toString() Method from the Object class
	//to allow display of each object to the console
	public String toString()
	{
	     return "\n\nItem Number      : " + this.itemNumber 
	   			+ "\nName             : " + this.name 
	   			+ "\nQuantity in stock: " + this.qtyInStock 
	   			+ "\nPrice            : " + this.price;
	}//end method toString

}//end class Product
