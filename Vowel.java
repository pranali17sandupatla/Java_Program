//Vowel Or Consonant
import java.util.Scanner;

public class Vowel 
{

    public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr char");

        char ch=sc.next( ).charAt(0);
		
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
            System.out.println(ch + " is vowel");
		}
        else
		{
            System.out.println(ch + " is consonant");

		}	
	
	}
}
