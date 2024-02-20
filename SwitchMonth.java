/*Write a program that prompts the user to enter a number representing a month (1 for January, 2 for February, and so on) and then displays the number of days in that month. Assume February has 28 days for simplicity. If the user enters an invalid number (less than 1 or greater than 12), the program should display an error message.
*/


import java.util.Scanner;

class SwitchMonth 
{
 public static void main(String argu[]) 
{
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Month: ");
	
    int month = sc.nextInt();
 
  switch (month)  
  {
		case 1:
			System.out.println("January has 31 Days");
			break;
		case 2:
			System.out.println("February has 28 Days");
			break;
		case 3:
			System.out.println("March has 31 Days");
			break;
		case 4:
			System.out.println("April has 30 Days");
			break;
		case 5:
			System.out.println("May has 31 Days");
			break;
		case 6:
			System.out.println("June has 30 Days");
			break;
		case 7:
			System.out.println("July has 31 Days");
			break;
		case 8:
			System.out.println("August has 31 Days");
			break;
		case 9:
			System.out.println("September has 30 Days");
			break;
		case 10:
			System.out.println("October has 31 Days");
			break;
		case 11:
			System.out.println("November has 30 Days ");
			break;
		case 12:
			System.out.println("December has 31 Days");
			break;
		default:
			System.out.println("Invalid month number.");
			break;
		}
	}
}	


			 
			 
		 
			