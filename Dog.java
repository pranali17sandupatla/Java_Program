//Create a program to print Dog details using method and take input from user


import java.util.Scanner;

class DogDetails
{
	String name;//instance variables or data members
	String breed;
	int age;

	void getData()
	{
		Scanner sc=new Scanner(System.in);// Take input from user
		System.out.println("Enter Name :");
        this.name=sc.next();
		
		System.out.println("Enter breed :");
        this.breed=sc.next();
		
		System.out.println("Enter age:");
        this.age=sc.nextInt();
	}
	void putData()
	{
		System.out.println("Name :" +this.name +"\nbreed :"+this.breed +"\nage :"+this.age);
	}
	void bark()
	{
		System.out.println("The dog is barking!");
	}

}
class Dog
{
	public static void main(String args[])//Main method
	{
		DogDetails d1=new DogDetails();//creating the object of DogDetails
		d1.getData();//
		d1.putData();
		d1.bark();
		
	}
	
}
