package initializeArrayList;

import java.util.*;

class ReverseArrayList
{
	public void reverseArrayList()
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Tata");
		ar.add("Mahindra");
		ar.add("Kia");
		ar.add("BMW");
		ar.add("Tesla");
		
		System.out.println(ar);
		System.out.println();
		
		System.out.println("The list of cars is as follows:");
		
		Iterator<String> t=ar.iterator();
		
		while(t.hasNext())
		{
			String s=(String)t.next();
			System.out.println(s);
		}
		
		ListIterator<String> t1= ar.listIterator(ar.size());
		
		System.out.println("The list of cars in reverse is as follows:");
		while(t1.hasPrevious())
		{
			String ss=(String)t1.previous();
			System.out.println(ss);
		}
		
	}
}

public class ReverseArrayListInJava 
{

	public static void main(String[] args) 
	{
		ReverseArrayList ral= new ReverseArrayList();
		ral.reverseArrayList();

	}

}
