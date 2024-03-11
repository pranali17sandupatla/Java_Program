/* 
Interface : Whenever we create the interface it is follows 100% abstraction. We use the keyword interface
we cannot create the object of interface
To use an interface you have implementation it in a class give body to the methods of that interface

//example of interface 
*/

interface Calculation//interface class
{
	public void sides();//abstract method
	public void area();
}
class Recangle implements Calculation
{
	public void sides()
	{
		int side=5;
		double rectangle=side*side;
		System.out.println("Rectangle :"+rectangle);
	}
	public void area()
	{
		int l=10, b=5;
		double area1=l*b;
		System.out.println("Area :"+area1);
	}
}
class DemoInterface
{
	public static void main(String args[])
	{
		Recangle t=new Recangle();
		t.sides();
		t.area();
	}
}