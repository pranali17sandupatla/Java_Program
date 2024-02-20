//Create a program for Employees Id, name, age by taking input from user

import java.util.Scanner;
class Employee1{
	int emp_id;
	String emp_name;
	int age;
	void input()
	{ // for taking employee deatils from user
	
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id");
        emp_id=sc.nextInt();
		
		System.out.println("Enter Employee name");
        emp_name=sc.next();
		
		System.out.println("Enter Employee age");
        age=sc.nextInt();
    }
    void output()
	
	{// for taken inputs showing to user
        System.out.println(" Employee id"+emp_id);
        System.out.println(" Employee name"+emp_name);
        System.out.println(" Employee age"+age);
        
	}
}
class InputEmployee
{
	public static void main(String args[])
	{
		Employee1 e1=new Employee1();
        e1.input(); // calling the methods of class Employee1
        e1.output();
		
		Employee1 e2=new Employee1();
        e2.input();
        e2.output();
	}

}