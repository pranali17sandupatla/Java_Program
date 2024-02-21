/*Create a class named Triangle with attributes side1, side2, and side3 using parametrized constructor */

class Triangle2
{
	double Perimeter;
	double side1;//instance variable
	double side2;
	double side3;
	
	Triangle2(int a, int b, int c)
	{
		this.side1=a;
		this.side1=b;	
		this.side1=c;	
	}
	void putData()
	{
		Perimeter = side1 + side2 + side3;
		System.out.println("\n The Perimeter of the Triangle = "+Perimeter);
	}
}

class TrianglePara 
{
	public static void main(String[] args) 
	{
		Triangle2 t1=new Triangle2(50,40,40);//creating the object of Triangle
		t1.putData();
	}
}

