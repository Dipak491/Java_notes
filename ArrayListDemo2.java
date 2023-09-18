package com.collection;


import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args)
	{
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");

		System.out.println(list);
		
		
		for(String fruit : list)
		{
			System.out.println(fruit);
		}
		
		
			
	}

}

