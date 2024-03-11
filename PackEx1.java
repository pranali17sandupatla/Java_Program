//default can't be access the out of the package but access the within the package
//multiplication of a and b 
package packdemo1;

public class PackEx1
{
	//int a=10, b=20;
	void printData(int a,int b)
	{
		System.out.println(a*b);
	}
}





/*

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


*/