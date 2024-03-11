/*
Design a hierarchy of shapes. Start with a Shape class and then create subclasses like Circle, Rectangle, Triangle, etc. Each subclass should inherit common properties and methods from the Shape class.
*/
class Shape//parent class
{
	int a=100;//attribute
	Shape()
	{
		System.out.println("This is Shape class method constructor");
	}
	public void shap()
	{
		System.out.println("This is Shape class method");
	}
}
class Circle extends Shape
{
	Circle()
	{
		super();
		System.out.println("This is Circle class method constructor");
	}
	public void cir()
	{
		System.out.println("This is Circle class method");
	}
}
class Rectangle extends Shape
{
	Rectangle()
	{
		super();
		System.out.println("This is Rectangle class constructor");
	}
	public void rec()
	{
		System.out.println("This is Rectangle class method");
	}
}
class Triangle extends Shape//child class
{
	int a=500;//attributes
	Triangle()
	{
		//super();//calling parent class constructor
		System.out.println("This is Triangle class constructor");
	}
	public void tri()//creating method of Triangle
	{
		System.out.println("This is Triangle class method "+this.a);
	}
}
class ShapeInheritance
{
	public static void main(String args[])
	{
		Triangle t=new Triangle();//creating object of Triangle
		t.shap();		//calling method of Triangle class
	}
}