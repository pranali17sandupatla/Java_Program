//Creating array for student info

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
class StudentArray
{
	public static void main(String args[])
	{
		//StudArray [] arr;//creating array of student
		//arr=new StudArray[5];//declaring the array of size
		StudArray []arr=new StudArray[5];//Declaring and initial of student
		arr[0]=new StudArray(1,"Pranali");//calling parameterized assigning values
		arr[1]=new StudArray(2,"Priya");
		arr[2]=new StudArray(3,"Jaya");
		arr[3]=new StudArray(4,"Nandu");
		arr[4]=new StudArray(5,"Akki");
		for(int i=0;i<arr.length;i++)//printing the array objects
		{
			System.out.println("ID :"+arr[i].sid+" Name :"+arr[i].sname);
			//System.out.println(arr[i].sid+arr[i].sname);

		}

	}
}