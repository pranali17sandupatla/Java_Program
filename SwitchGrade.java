/* Switch case using Grade Program */

import java.util.Scanner;

public class SwitchGrade 
{
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Grade: ");
	char grade=sc.next( ).charAt(0);
	switch(grade)
	{
		case 'A':
			System.out.println("Excellent");
			break;
	
		case 'B':
			System.out.println("Very Good");
			break;
		
		case 'C':
			System.out.println("Good");
			break;
		
		case 'D':
			System.out.println("Avergae");
			break;
			
		default:
			System.out.println("Fail");
	}
  }
}

/*Write a program that prompts the user to enter a number representing a month (1 for January, 2 for February, and so on) and then displays the number of days in that month. Assume February has 28 days for simplicity. If the user enters an invalid number (less than 1 or greater than 12), the program should display an error message.
			
			
			
			Develop a Java program that calculates the grade of a student based on his/her percentage. The grading system is as follows:

90% and above: Grade A
80% - 89%: Grade B
70% - 79%: Grade C
60% - 69%: Grade D
Below 60%: Grade F
Create a Java program that prompts the user to enter a character and determines whether the character is a vowel or a consonant.
			
			
	*/
		
	
		