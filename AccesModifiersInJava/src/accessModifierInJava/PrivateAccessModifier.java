package accessModifierInJava;

class Bikes
{
	private void royalEnfield()
	{
		String modelName="Classic";
		System.out.println(modelName);
	}
}

public class PrivateAccessModifier 
{

	public static void main(String[] args) 
	{
		Bikes b=new Bikes();
		//b.royalEnfield();
		
		//Since the access modifier of method royalEnfield is private it cannot be accessed outside the class directly.
		

	}

}
