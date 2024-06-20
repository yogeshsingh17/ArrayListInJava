package initializeArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;



class ArrayListInitialization
{
	public void arrayListInitialization()
	{
		//int n=5;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of the array:");
		int n=scan.nextInt();
		System.out.println("The size of the array is: " + n);
		
		ArrayList<Integer> arr1= new ArrayList<Integer>(n);
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		for(int i=0;i<=n;i++)
			{ 
				arr1.add(i);
				arr2.add(i); 
			}
		 
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		ArrayList arr3=new ArrayList();
		arr3.addAll(arr1);
		
		System.out.println(arr3);
		arr3.add(1,9);
		
		System.out.println("arr3: " + arr3);
		
		
		ArrayList arr4=new ArrayList();
		arr4.add("Yogesh");
		arr4.add(24);
		arr4.add(arr1);
		arr4.set(1, 26);
		arr4.set(1,7);

		
		System.out.println("arr4: " +arr4);
		arr4.remove(2);
		System.out.println(arr4);
		
		System.out.println("arr4: " + arr4.size());
		
		ArrayList<Character> arr5=new ArrayList<Character>();
		arr5.add('a');
		arr5.add('b');
		arr5.add('c');
		arr5.add('d');
		
		System.out.println();
		
		//Iterating over the ArrayList
		
		System.out.println("Using for loop");
		System.out.println("arr5: ");
		for(int i=0;i<arr5.size();i++)
		{
			System.out.print(arr5.get(i) + " ");
		}
		
		System.out.println();
		
		System.out.println("Using for each loop: ");
		for(Character str: arr5)
		{
			System.out.print(str + " ");
		}
		
		//Get element
		System.out.println();
		Character c=arr5.get(2);
		System.out.println("Char at index 2 is: " +  c);
		
		//Sorting in ArrayList
		
		ArrayList arr6=new ArrayList();
		arr6.add(3);
		arr6.add(5);
		arr6.add(4);
		arr6.add(1);
		arr6.add(2);
		
		Collections.sort(arr6);
		
		System.out.println(arr6);
		
		System.out.println("Accessing data of array list");
		
		//Using normal for loop
		
		for(int i=0;i<arr6.size();i++)
		{
			System.out.println(arr6.get(i));
		}
		
		System.out.println("Accessing data of array list using for each loop");
		//Using for each loop
		
		for(Object obj:arr6)
		{
			System.out.println(obj);
		}
		
		System.out.println("Accessimg data of array list using iterator:");
		
		Iterator itr=arr6.iterator();
		
		//Using while loop
		
		while(itr.hasNext()==true) 
		{ 
			System.out.println(itr.next());  
		}
		
		System.out.println("This is reverse order traversal:");
		Iterator itr1=arr6.iterator();
		for(int i=arr6.size()-1;i>=0;i--)
		{
			System.out.println(arr6.get(i));
		}
		
		ListIterator itr2=arr6.listIterator(arr6.size());
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		
		
	}
}

public class InitializeArrayListInJava 
{

	public static void main(String[] args) 
	{
		ArrayListInitialization a= new ArrayListInitialization();
		a.arrayListInitialization();

	}

}

