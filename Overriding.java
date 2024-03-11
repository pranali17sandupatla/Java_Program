/* Inheritance  Overriding method program
Overrinding in java :
Same name with the same parameter called overriding method

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
	Dog()//no argu constructor
	{
		//super();//calling parent class constructor
		System.out.println("I am Dog class constructor");
	}
	public void eat()//Overriding the eat method
	{
		System.out.println("Animal is eating in overriding method");//printing output
	}
	public void bark()
	{		
		System.out.println("Animal is barking");	
	}
}
class Overriding
{
	public static void main(String args[])
	{
		Dog d=new Dog();//calling method 
		d.eat();//calling in child class method eat() overriding
		d.bark();//child method
	}
}

