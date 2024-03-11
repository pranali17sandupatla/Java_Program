//package program Example

package packdemo;
import pack1.Package1;//importing the pacakge using*


class PackageDemo
{
	public static void main(String args[])
	{
		Package1 p=new Package1();//creating object by importing class
		p.area();//calling the method of importing class
		System.out.println("This is running");
	}
}


/*


Importing package program 

package pack1;

public class Package1
{
	public void printDemo()//creating method in package
	{
		System.out.println("This is Package method");
	}
}
Running output

D:\Anudip Capgemini>java packdemo.PackageDemo
A+B :=15.0
This is running

D:\Anudip Capgemini>javac -d . Package1.java

D:\Anudip Capgemini>javac -d . PackageDemo.java

D:\Anudip Capgemini>java packdemo.PackageDemo
A+B :=15
This is running

*/