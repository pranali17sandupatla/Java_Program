//example of Private method
package packdemo3;//creating package

class PrivateModifier
{
	private void printprivate()//private method
	{
	System.out.println("This is Private class");
	}
	public void display()//public method
	{
	System.out.println("This is Public class");
	}
}
class UsePrivate
{
	public static void main(String args[])
	{
		PrivateModifier p=new PrivateModifier();//creating method of PrivateModifier of class
		//p.printprivate();//calling private method
		p.display();//calling public method
	}
}
