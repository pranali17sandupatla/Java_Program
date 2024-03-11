/* Inheritance program
The child class is inheriting the methods and properties of parent class
*this() keyword only access the that class of value or attributes
super() keyword use to access the values or attributes properties of parent class 
*/

class Animal//parent class
{
	int a=20;//attribute
	Animal()//no argu constructor
	{
		System.out.println("I am Animal class constructor");
	}
	public void eat()
	{
		System.out.println("Animal is eating");//printing output
	}
}
class Dog extends Animal//child class inheriting the methods of parent class
{
	int a=500;//attribute
	Dog()//no argu constructor
	{
		super();//calling parent class constructor
		System.out.println("I am Dog class constructor");
	}
	public void bark()
	{		
		System.out.println("Animal is barking "+super.a);	
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		//Animal a=new Animal();//creating object
		//a.eat();
		Dog d=new Dog();//calling method 
		//d.eat();//parent method
		d.bark();//child method
	}
}