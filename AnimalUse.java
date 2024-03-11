/*
Abstract : Abstract class if we write abstract keyword in front of the class name while creating it then that class becomes abstract. We cannot create the object of the abstract class.
But if you want to use methods or variable of that class then you need to extend the class.
abstract :Abstract is a process of hiding the implementation details and showing only functionality to the user.
 class does not create the object it can be creating another class then use

Creating abstract method and class using in java

*/
abstract class Animal
{
	Animal()//no-argu constaructor of Animal class
	{
		System.out.println("This is animal Constructor");
	}
	void eat()//No abstract method creating method eating 
	{
		System.out.println("This is animal eating");//printing
	}
	//abstract void breed();//abstract method
}
class Puppy extends Animal
{
	
}

class Dog extends Animal// Dog is not abstract and does not override abstract method breed() in Animal
{
	void walk()//walk method of DOg class
	{
		System.out.println("This is animal Dog walk");//printing
	}
}
class AnimalUse
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.walk();
	}
}