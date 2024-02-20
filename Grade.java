//Switch case Using Do while loop Enetr grade if Yes continue if No Exit loop

import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter your grade: ");
            char grade=scanner.next( ).charAt(0);
            
            switch(grade) {
                case 'A':
                    System.out.println("Your grade is A.");
                    break;
                case 'B':
                    System.out.println("Your grade is B.");
                    break;
                case 'C':
                    System.out.println("Your grade is C.");
                    break;
                case 'D':
                    System.out.println("Your grade is D.");
                    break;
                default:
                    System.out.println("Your grade is F.");
            }

            System.out.print("Do you want to Continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Goodbye!");
        scanner.close();
    }
}
