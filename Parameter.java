//Parameterized Constructor 
class StudentPara
{
	int sid;
	String sname;
	int marks;
	
	public StudentPara()//No-arguments
	{
		this.sid=101;
		this.sname="Sapana";
		this.marks=80;
		System.out.println("No-arguments Constructor");
	}
	StudentPara(int id, String name, int marks)//Parameterized constructor
	{
		this.sid=id;
		this.sname=name;
		this.marks=marks;
		System.out.println("Parameterized Constructor");
	}
	void printInfo()
	{
		System.out.println("ID :"+this.sid+"\nName :"+this.sname+"\nMarks :"+this.marks);
	}
}
class Parameter
{
	public static void main(String arg[])
	{
		StudentPara s1= new StudentPara();
		s1.printInfo();
		StudentPara s2= new StudentPara(1, "Jyoo", 88);
		s2.printInfo();
	}
}
