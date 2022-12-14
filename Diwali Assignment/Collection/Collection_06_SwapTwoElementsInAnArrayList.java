
import java.util.*;

public class Collection_06_SwapTwoElementsInAnArrayList
{
   public static void main (String[] args)
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
	  
      System.out.println("\nOriginal list : " + list);
      Collections.swap(list, 3, 1);							// swapping element at index 3 i.e. 40 and index 1 i.e. 20
      System.out.println("List after swapping : " + list);
   }
}



/*
// Java program to swap two elements in an ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class GFG {

	public static void main(String a[])
	{

		// Create the Array List
		ArrayList<String> ArrList = new ArrayList<String>();

		// add the values in Array List
		ArrList.add("Item 1");
		ArrList.add("Item 2");
		ArrList.add("Item 3");
		ArrList.add("Item 4");
		ArrList.add("Item 5");

		// display Array List before swap
		System.out.println("Before Swap the ArrayList ");
		System.out.println(ArrList);

		// Swapping the elements at 1 and 2 indices
		Collections.swap(ArrList, 1, 2);

		// display Array List after swap
		System.out.println("After Swap the ArrayList");
		System.out.println(ArrList);
	}
}

*/