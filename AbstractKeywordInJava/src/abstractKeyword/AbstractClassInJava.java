package abstractKeyword;

abstract class School
{
	//Data member
	String name;
	
	//Constructor
	School()
	{
		System.out.println("I have completed my education from kendriya Vidyalaya from pune.");
	}
	
	public abstract void schoolClass();
	
	public void playGround()
	{
		name="Yogesh";
		System.out.println("The school has the following play grounds:");
		System.out.println("Football ground, childrens playground, basketball ground and others.");
	}	
}

class SchoolStudent extends School
{	
	public void schoolClass()
	{
		System.out.println("The school has 4 sections for every class.");
	}
}

public class AbstractClassInJava 
{

	public static void main(String[] args) 
	{	
		SchoolStudent ss=new SchoolStudent();
		ss.schoolClass();
		ss.playGround();

	}

}
