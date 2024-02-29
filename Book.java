/* Create a class named Book with attributes title, author, ISBN, and price. Include methods to get and set the attributes
*/
import java.util.Scanner;
class Book
{
	String title;//instance variable
	String author;
	int ISBN;
	int price;
	
	void get()//Create a get method
	{
		System.out.pritnln("Enter the Details of Book ");
		Scanner sc=new Scanner(System.in);//taking user input
		System.out.pritnln("Enter Title of book :");//pritn stmt
		String this.title=sc.next();
		
		System.out.pritnln("ENter the Author name :");
		String this.author=sc.next();
		
		System.out.pritnln("Enter the ISBN number of Book :");
		int this.ISBN=sc.nextInt();
		
		System.out.pritnln("Enter the price of the book :");
		int this.price=sc.nextInt();
	}
	void setData()//Creating setData method
	{
		System.out.pritnln("Title :"+this.title+"\nAuthor name :"+this.author+"\nISBN :"+this.ISBN+"\nPrice :"+this.price);
	}
}
class BoodDemo
{
	public static void main(String args[])
	{
		
	}
}