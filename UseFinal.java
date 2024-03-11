/*
WAP with final keyword
Stop value change
stop method overriding
stop inheritance

1.variable
2.method
3.class

Final : If we declare a variable as final then the value of that variable can't be changed
i.e : pi=3.14
*/

final class FinalExample
{
	final double pi=3.14;//final veriable
	int radius;//non-final variable --normal variable
	void areaOfCircle(int radius)
	{
		double area=pi*radius*radius;
		System.out.println("The area of circle is:"+area);
	}
}
class UseFinal
{
	public static void main(String args[])
	{
		FinalExample f= new FinalExample();
		f.areaOfCircle(11);
	}
}