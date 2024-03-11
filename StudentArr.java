//Creating array for student info using another method

class StudArray
{
	int sid;//instance variable
	String sname;
	
	StudArray(int id, String name)//parameterized contructor
	{
		this.sid=id;
		this.sname=name;
	}
}
class StudentArr
{
	public static void main(String args[])
	{
		StudArray arr[]=new StudArray[]{new StudArray(101,"Grace"),new StudArray(102,"Golden"),new StudArray(103,"Gloria"),new StudArray(104,"Glorice")};
		
		for(StudArray s:arr)
		{
			System.out.println("ID :"+s.sid+" Name :"+s.sname); 
		}
	}
}