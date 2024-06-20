package accessModifierInJava;

/**
 * 
 * Default access Modifier
 *
 */

class Animals
{
	void seaAnimals()
	{
		System.out.println("Fish");
		System.out.println("Prawns");
		System.out.println("Crab");
		System.out.println("Whale");
	}
}

public class DefaultAccessModifier 
{

	public static void main(String[] args) 
	{
		Animals a=new Animals();
		a.seaAnimals();

	}

}
