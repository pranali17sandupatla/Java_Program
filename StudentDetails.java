//Create a program to print student details using method and take input from user

import java.util.Scanner;

class Student1
{
	int stud_id;
	String stud_name;
	String email;
	
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student id :");
        this.stud_id=sc.nextInt();
		
		System.out.println("Enter Name :");
        this.stud_name=sc.next();
		
		System.out.println("Enter Email :");
        this.email=sc.next();
	}
	void putData()
	{
		System.out.println("Id :"+this.stud_id+"Name :"+this.stud_name+"Email :"+this.email);
	}

}
class StudentDetails
{
	public static void main(String args[])
	{
		Student1 s1=new Student1();
		s1.getData();
		s1.putData();
		Student1 s2=new Student1();
		s2.getData();
		s2.putData();
	}
	
}