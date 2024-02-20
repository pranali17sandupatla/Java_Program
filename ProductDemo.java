/*
Create a class Product with attributes such as name, price, and category. Implement a no-argument constructor to initialize these attributes with default values.
*/
class Product
{
	String name;
	int price;
	String category;
	 
	Product()
	{
		this.name="ABC";
		this.price=40000;
		this.category="pqr";
	}
	void printData()//print the data of object
	{
		System.out.println("Name :"+this.name+"\nPrice :"+this.price+"\nCategory :"+this.category);
	}
}
class ProductDemo
{
	public static void main(String args[])//main method
	{
		Product p1=new Product();//creating object of class
		p1.printData();//calling printData method
		
	}
}