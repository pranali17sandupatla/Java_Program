//Class Overloading is the method is same name with the different parameter Example
class Calculation
{
	int sum;//instance variable
	void add()//method with no argu
	{
		int a=10, b=20;//initialization
		this.sum=a+b;//addition 2 numbers
		System.out.println("The Sum of A and B :"+sum);//printing output
	}
	void add(int a,int b)//method with 2 interger parameter
	{
		this.sum=a+b;
		System.out.println("The Sum of A and B :"+sum);//printing output
	}
	void add(double a,double b)//method with 2 double parameter
	{
		double sum1=a+b;
		System.out.println("The Sum of A and B :"+sum1);//printing output
	}
}
class Overloading
{
	public static void main(String args[])
	{
		Calculation c=new Calculation();//creating object of class
		c.add();//method calling
		c.add(50,50);
		c.add(50.7,50.8);
	}
}