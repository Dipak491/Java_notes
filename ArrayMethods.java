package com.collection;

import java.util.*;

public class ArrayMethods {

	public static void main(String[] args) 
	{
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(23);
		list.add(4);
		list.add(45);
		list.add(67);
		
		System.out.println(list);
		
		list.add(2,89);
		System.out.println(list);
		//System.out.println(((Object) list).capacity());

		list.ensureCapacity(16);
		System.out.println(list);
		
		System.out.println(list.isEmpty());
		System.out.println(list.remove(4));
		
		System.out.println(list.clone());
		
		System.out.println(list.size());
		
		
		list.clear();
		System.out.println(list);
		
		
		
		
		
		

	}

}
