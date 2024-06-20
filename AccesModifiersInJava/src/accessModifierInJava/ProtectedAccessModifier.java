package accessModifierInJava;

class Trucks
{
	protected void tataTruck()
	{
		System.out.println("This is tata truck");
	}
	protected void mahindraTruck()
	{
		System.out.println("This is mahindra truck");
	}
	public void eicherTruck()
	{
		System.out.println("This is eicher truck");
	}
	
}

public class ProtectedAccessModifier 
{

	public static void main(String[] args) 
	{
		Trucks t=new Trucks();
		t.tataTruck();
		t.eicherTruck();
		t.mahindraTruck();

	}

}
