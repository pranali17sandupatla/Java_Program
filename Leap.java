//Leap Year user input
import java.util.Scanner;

public class Leap 
{
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the year: ");
	
    int year = scanner.nextInt();
	//System.out.println("leap year"+year);

    if((year % 4) == 0)
	{
      System.out.println("leap year");
    } 
	else 
		{
			System.out.println(" is not a leap year");
		}
  }
}
