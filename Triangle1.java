/*Create a class named Triangle with attributes side1, side2, and side3. Include methods to calculate the perimeter and area of the triangle. Homework
*/
import java.util.Scanner;
class Triangle
{
	double Perimeter, s, Area;//instance variable
	
	void calculateData()//creating method
	{
		//Taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the Three sides of triangle: ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();

		Perimeter = side1 + side2 + side3;
		s = Perimeter/2; 
		Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));	
	}
	void putData()
	{
		System.out.println("\n The Perimeter of the Triangle = "+Perimeter);
		System.out.println("\n The Semi Perimeter of Triangle = "+s);
		System.out.println("\n The Area of the triangle = "+Area);
	}
}

class Triangle1 
{
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();//creating the object of Triangle
		t1.calculateData();
		t1.putData();
		
	}
}

