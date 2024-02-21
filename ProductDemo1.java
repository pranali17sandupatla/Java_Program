/*
Create a class Product with attributes such as name, price, and category. Implement a no-argument constructor and Parameter constructor
*/
class Product1
{
	String name;
	int price;
	String category;
	 
	public Product1()
	{
		this.name="ABC";
		this.price=40000;
		this.category="pqr";
	}
	public Product1(String name, int price, String category)
	{
		this.name=name;
		this.price=price;
		this.category=category;
	}
	void printData()//print the data of object
	{
		System.out.println("Name :"+this.name+"\nPrice :"+this.price+"\nCategory :"+this.category);
	}
}
class ProductDemo1
{
	public static void main(String args[])//main method
	{
		//Product1 p1=new Product1();
		Product1 p2=new Product1("AAA", 5000, "PPP");//creating object of class
		p1.printData();
		//p2.printData();//calling printData method
		
	}
}