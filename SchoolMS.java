/*
Implement a school management system with a base class Person. Create subclasses such as Student, Teacher, Staff, etc., inheriting from the Person class. Implement methods to manage student enrollment, teacher assignments, etc.
*/

//import java.util.ArrayList;
import java.util.List;

// parent class Person
class Person 
{
    String name;//Attribute
    int age;

    public Person(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }

    public void displayDetails() 
	{
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student
class Student extends Person 
{
    int studentId;//Attribute

    Student(String name, int age, int studentId) 
	{
        super(name, age);
        this.studentId = studentId;
    }

    public void displayDetails() 
	{
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
    }
}

// Subclass Teacher
class Teacher extends Person 
{
    String subject;//Attribute

    public Teacher(String name, int age, String subject) 
	{
        super(name, age);
        this.subject = subject;
    }

    public void displayDetails() 
	{
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass Staff
class Staff extends Person 
{
    String role;//Attribute

    Staff(String name, int age, String role) 
	{
        super(name, age);
        this.role = role;
    }

    public void displayDetails() 
	{
        super.displayDetails();
        System.out.println("Role: " + role);
    }
}


public class SchoolMS 
{
    public static void main(String[] args) 
	{
        Staff s=new Staff();
		s.displayDetails(1,"abcd",123);
    }
}


/*

class Person
{
	int id;
	String name;
	int age;
	public Person(int id, String name,int age) //constructor
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	void printData() //mehdo in person to print data
	{
		System.out.println("ID: "+this.id+"Name: "+this.name+"Age: "+this.age);
	}
}
class Student extends Person
{
    int std;
	String bloodGrup;
	public Student(int id, String name,int age,int std,String bloodGrup)
	{
	    super(id,  name,age); //parent class constructor
	    this.std=std;
		this.bloodGrup=bloodGrup;
	
	}
	public void printStudent()
	{
		System.out.println(super.id+super.name+super.age+this.std+this.BloodGrup);
	}
}


class Teacher extends Person
{
	String sub;
    Teacher(int id, String name, int age, String sub)	
    {
        super(id,name,age); //calling parent const
        this.sub=sub;
    }
}
*/

