/*class Loop
{
	public static void main(String args[])
	{
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.println("This is loop number :"+i);
			}
				
		}
	}
}
*/
import java.util.Scanner;
class Loop
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number :");
		int number = sc.nextInt();
		//int number=100;
		for(int i=0;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.println("Number is Even:"+i);
			}
			else
			{
				System.out.println("Number is Odd :"+i);
			}
		}
	}
}