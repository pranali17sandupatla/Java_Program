/*
Implement methods for addition, subtraction, multiplication, and division using method overloading to handle different types and numbers of operands
*/
/*
import java.util.Scanner;
class Calculation
{
	int num1,num2;
	void addition(int num1,int num2)
	{
		int addition=num1+num2;
		System.out.println("The Sum of A and B :"+addition);//printing output
	}
	void sub(int num1,int num2)
	{
		int sub=num1-num2;
		System.out.println("The Sum of A and B :"+sub);//printing output
	}
	void mul(double num1,double num2)
	{
		double mul=num1*num2;
		System.out.println("The Sum of A and B :"+mul);//printing output
	}
	void div(double num1,double num2)
	{
		double div=num1/num2;
		System.out.println("The Sum of A and B :"+div);//printing output
	}
	
}
class CalculationOverloading
{
	public static void main(String args[])
	{
		Calculation c=new Calculation();
		c.addition(30,50);
		c.sub(50,30);
		c.mul(6.8,8.4);
		c.div(22.9,30.8);
	}
}
*/

import java.util.Scanner;
class Calculation
{
	//int num1,num2;
	
	void add(int num1,int num2)
	{	
		this.addition=num1+num2;
		System.out.println("The Sum of A and B :"+addition);//printing output
	}
	void add(int num1,int num2)
	{
		this.sub=a-b;
		System.out.println("The Sum of A and B :"+sub);//printing output
	}
	void add(double num1,double num2)
	{
		this.mul=num1*num2;
		System.out.println("The Sum of A and B :"+mul);//printing output
	}
	void add(double num1)
	{
		this.div=addition/num1;
		System.out.println("The Sum of A and B :"+div);//printing output
	}
	
}
class CalculationOverloading
{
	public static void main(String args[])
	{
		Calculation c=new Calculation();
		c.add(10,20);
		c.add(10,10);
		c.add(10.9,20.9);
		c.add(11.9);
	}
}