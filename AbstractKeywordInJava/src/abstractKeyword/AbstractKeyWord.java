package abstractKeyword;

abstract class Education
{
	public void school()
	{
		System.out.println("The name of my shool is: KV");
	}
	
	public abstract void college();
	
}

class Student extends Education
{
	public void college()
	{
		System.out.println();
	}
}

public class AbstractKeyWord 
{

	public static void main(String[] args) 
	{
		Student s= new Student();
		s.school();

	}

}
