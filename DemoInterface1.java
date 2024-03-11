//two interface called in one class 

interface Calculation//interface class
{
	public void sides();//abstract method
	public void area();
}
interface Recangle 
{
	public void rec();
	//public void color();
	
}

class Triangle implements Calculation, Recangle
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
	public void rec()
	{
		System.out.println("This is Recangle ");	
	}
}
class DemoInterface1
{
	public static void main(String args[])
	{
		Triangle t=new Triangle();
		t.sides();
		t.area();
		t.rec();
	}
}