/*Develop a Java program that calculates the grade of a student based on his/her percentage. The grading system is as follows:

90% and above: Grade A
80% - 89%: Grade B
70% - 79%: Grade C
60% - 69%: Grade D
Below 60%: Grade F
*/

import java.util.Scanner;
/*
class GradePer
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks :");
		int per = sc.nextInt();
		String Res = "";

		int t = per / 10;
		switch (t)
		{
			case 7:
				Res = "A+, Excellent";
				break;
			case 6:
				Res = "A, Very good";
				break;
			case 5:
				Res = "B+, Very good";
				break;
			case 4:
				Res = "C+, Good";
				break;
			case 3:
				Res = "C, Good";
				break;
			case 2:
				Res = "D, Average";
				break;
			default:
				Res = "Fail";
				break;
		}

		System.out.println("Per = " + per);
		System.out.println("Result = " + Res);
	}
}

*/

public class GradePer {
 
   public static void main(String[] args) {
      
      String grade = null;
      System.out.print("Enter a Percentage: ");  
      Scanner sc = new Scanner(System.in); 
      int score = sc.nextInt(); // Taking value from user at run time 
 
      switch(score/10) 
      {
        case 10:
        case 9:
           grade = "A+";
           break;
       
        case 8:
           grade = "A";
           break;
       
        case 7:
           grade = "B+";
           break;
       
        case 6:
           grade = "B";
           break;
        
        case 5:
           grade = "C";
           break;
       
	   default:
           grade = "F";
           break;
      }
      
      System.out.println("Your Grade is  = " + grade);
   }
 
}
