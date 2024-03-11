//Creating package to calling default package same name as two class package name
package packdemo1;//creating package

public class PackEx2
{
	public static void main(String args[])
	{
		PackEx1 p1=new PackEx1();
		p1.printData(10,20);
		System.out.println("This is running");
	}
}