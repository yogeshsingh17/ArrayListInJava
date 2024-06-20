package accessModifierInJava;

/**
 * 
 * Public Access Modifier
 *
 */

class Cars
{
	public void tata()
	{
		System.out.println("Tata safari");
	}
}

public class PublicAccessModifier 
{

	public static void main(String[] args) 
	{
		Cars c= new Cars();
		c.tata();

	}

}
