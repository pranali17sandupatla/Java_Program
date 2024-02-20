//create a default Constructor for Employee

class Const
{
	int emp_id;
	String emp_name;
	int salary;
	
	Const()//Creating no-argument constructor
	{
		this.emp_id=1;
		this.emp_name="Pranali";
		this.salary=50000;
		
		this.emp_id=2;
		this.emp_name="Priyanka";
		this.salary=60000;
	}
	void printData()//print the data of object
	{
		System.out.println("ID :"+this.emp_id+"\nName :"+this.emp_name+"\nSalary :"+this.salary);
		
	}
}
class ConstEmp
{
	public static void main(String args[])
	{
		Const c1=new Const();//Creating the new object of class
		c1.printData();//calling the printData method
	}
}