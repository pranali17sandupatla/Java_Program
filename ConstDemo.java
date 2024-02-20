//create a default Constructor 

class Const
{
	int sid;
	String sname;
	
	Const()//Creating no-argument constructor
	{
		this.sid=1;
		this.sname="Pranali";
	}
	void printData()//print the data of object
	{
		System.out.println("ID :"+this.sid+"\n Name :"+this.sname);
	}
}
class ConstDemo
{
	public static void main(String args[])
	{
		Const c1=new Const();//Creating the new object of class
		c1.printData();//calling the printData method
	}
}