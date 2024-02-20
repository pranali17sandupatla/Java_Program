class EmpEx
{
	int emp_id;
	String emp_name;
	int age;
	
	void insert(int emp_id, String emp_name, int age)
	{
		System.out.println(emp_id + " " + emp_name +" " +age);
	}
}
class EmpMethod
{
	public static void main(String args[])
	{
		EmpEx e1=new EmpEx();
		EmpEx e2=new EmpEx();
		
		e1.insert(1, "Pranali",21);
		e2.insert(2, "Jaya",20);
		
	}
}
