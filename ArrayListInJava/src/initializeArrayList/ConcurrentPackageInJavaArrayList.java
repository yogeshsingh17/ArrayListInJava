package initializeArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Yogesh
{
	public void yogesh()
	{
		ArrayList al=new ArrayList();
		al.add(1000);
		al.add(2000);
		al.add(3000);
		al.add(4000);
		al.add(5000);
		
		System.out.println("The collections method:");
		
		int index=Collections.binarySearch(al, 3000);
		System.out.println(index);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		
		//Iterator itrr=al.iterator();
		
		/*
		 * while(itrr.hasNext()) 
		 * { 
		 * 		Integer i=(Integer)itrr.next();
		 * 		System.out.println(i); 
		 *      System.out.println(al.add(6000));                        //This line will
		 * 																 //throw concurrent modification exception.
		 * 
		 * 																 //This is a fail fast method 
		 * }
		 */
		
		//Fail Safe method
		
		CopyOnWriteArrayList cwal=new CopyOnWriteArrayList();
		cwal.add(111);
		cwal.add(222);
		cwal.add(333);
		cwal.add(444);
		cwal.add(555);
	
		
		Iterator ito=cwal.iterator();
		
		while(ito.hasNext())
		{
			Integer ii=(Integer)ito.next();
			System.out.println(ii);
			cwal.add(1234);
		}
		
		
	}
}

public class ConcurrentPackageInJavaArrayList 
{

	public static void main(String[] args) 
	{
		Yogesh y=new Yogesh();
		y.yogesh();

	}

}