class Overloading1
{
	void print()
	{
		System.out.println("This is no argument method called");
	}
	void print(int a)
	{
		System.out.println("This is 1 argument method called");
	}
	void print(int a,int b)
	{
		System.out.println("This is 2 integer argument method called");
	}
	void print(double a,double b)
	{
		System.out.println("This is 2 double argument method called");
	}
}
class OverloadingMethod
{
	public static void main(String args[])
	{
		Overloading1 o=new Overloading1();
		o.print(10,30);
		o.print();
	}
}