
//Develop a Java program that takes a month (as an integer) as input and prints the number of days in that month. Consider leap years for February.


import java.util.Scanner;

public class Month 
{
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the Month: ");
	
	
    int month = scanner.nextInt();
	System.out.print("Enter the Year: ");
	
	int year = scanner.nextInt();
	
    if((month==2) && ((year%4==0)))
	{
      System.out.println("This Leap year Month Days 29");
    } 
	else if((month==1) || (month==3) || (month==4) || (month==5) || (month==6) || (month==7) || (month==8) || (month==9) || (month==10) ||(month==11) || (month==12))
		{
			System.out.println("This is not leap year days is 30 & 31");
		}
  }
}

