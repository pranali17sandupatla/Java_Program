/*
Define a class Shape with attributes like type and color. Implement a no-argument constructor to initialize these attributes with default values.
*/
class Shape
{
	String type;//instance variable
	String color;
	
	Shape()
	{
		this.type="Triangle";
		this.color="Blue";
	}
	void printData()//print the data of object
	{
		System.out.println("Type :"+this.type+"\nColor :"+this.color);

	}
}
class ColorDemo
{
	public static void main(String args[])//main method
	{
		Shape s1=new Shape();//creating object of class
		s1.printData();//calling printData method
		
	}
}