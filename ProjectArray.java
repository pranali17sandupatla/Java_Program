//Creating array for project info using another method

class Project
{
	int pid;//instance variable
	String pname;
	String project_time;
	
	Project(int id, String name, String project_time)//parameterized contructor
	{
		this.pid=id;
		this.pname=name;
		this.project_time=project_time;
	}
}
class ProjectArray
{
	public static void main(String args[])
	{
		Project arr1[]=new Project[]{new Project(101,"Online jewellery shopping","4 Month"),new Project(102,"Outfit Recommendation","5 Month"),new Project(103,"Library management","5 Month"),new Project(104,"Online quize","6 Month")};
		
		for(Project p:arr1)
		{
			System.out.println("ID :"+p.pid+" Name :"+p.pname+" project Time :"+p.project_time); 
		}
	}
}