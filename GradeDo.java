// Switch case Using Do while loop Enetr grade if Yes continue if No Exit loop
import java.util.Scanner;

public class GradeDo 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter the student's grade (or type 'exit' to end): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            char grade = input.toUpperCase().charAt(0);

            switch (grade) {
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'B':
                    System.out.println("Very Good");
                    break;
                case 'C':
                    System.out.println("Good");
                    break;
                case 'D':
                    System.out.println("Avg");
                    break;
                case 'F':
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        } while (true);

        System.out.println("Goodbye!");
        scanner.close();
    }
}