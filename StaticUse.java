//WAP using Sttaic variable in java

class StudentStatic
{
	int id;
	String name;
	static String collegeName="SSWCOE";//we are defining the static string
	void setValue(int id,String name)
	{
		this.id=id;
		this.name=name;
		//this.collegeName=collegeName;
	}
	void getValue()//printing the values using the class name
	{
		System.out.println("ID :"+this.id+" Name :"+this.name+" College Name :"+collegeName);		
	}
}
class StaticUse
{
	public static void main(String arg[])
	{
		StudentStatic s1=new StudentStatic();
		s1.setValue(101,"Pranali");
		s1.getValue();
		
		StudentStatic s2=new StudentStatic();
		s2.setValue(102,"Grace");
		s2.getValue();
		
		System.out.println("College name :"+StudentStatic.collegeName);
		
	}
}

/*
OUTPUT

D:\Anudip Capgemini>java StaticUse
ID :101 Name :Pranali College Name :SSWCOE
ID :102 Name :Grace College Name :SSWCOE
College name :SSWCOE

*/