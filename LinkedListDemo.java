package com.collection;
import java.util.LinkedList;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		
		LinkedList<String>ll  = new LinkedList<String>();
		
		ll.add("Mango");
		ll.add("Apple");
		ll.add("Banana");
		ll.add("pinapple");
		
		Iterator<String> i  = ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
