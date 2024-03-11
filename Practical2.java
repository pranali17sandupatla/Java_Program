/*
2. Create a program in java to implement multilevel inheritance and hierarchical inheritance
Take classes like: Doctor, Surgeon and Nurse I Create methods and show method overriding.
*/

class Doctor
{
	Doctor()//Creating no-argu constructor
	{
		System.out.println("This Doctor Constructor");//printing
	}
	public void show()//creating show method of doctor
	{
		String name="Grace";
		System.out.println("This is Doctor name "+name);
	}
}
class Surgeon extends Doctor
{
	String operation="Operation";
	//Overriding show method
	public void show()
	{		
		System.out.println("This is Surgeon class ");
	}
	
	void print()//creating method of Surgeon
	{
		System.out.println("This is Surgeon Name "+operation);//printing
	}
}
class Nurse extends Surgeon
{
	public void show()//creating method of Nurse
	{
		System.out.println("This is Nurse class");//printing
	}
}
class Practical2
{
	public static void main(String args[])
	{
		Nurse n=new Nurse();
		n.print();
		n.show();
		
	}
}

/*

OUTPUT
D:\Anudip Capgemini>javac Practical2.java

D:\Anudip Capgemini>java Practical2
This Doctor Constructor
This is Surgeon Name Operation
This is Nurse class

*/