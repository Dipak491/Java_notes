package com.collection;

import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) 
	{
		HashSet<String>set = new HashSet<String>();
		String str="Abhay";
		String s1="chetan";
		System.out.println(str.hashCode());
		System.out.println(s1.hashCode());
		
	
		
		HashSet<String>set2 = new HashSet<String>();
		System.out.println("Enter the values");
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<5; i++)
		{
			String input = sc.nextLine();
			set2.add(input);
			System.out.println(input);
			System.out.println(set2.hashCode());
			
		}
		
		System.out.println(set2);
		
		
		
		
		
		set.add("Abhay");
		set.add("Chetan");
		set.add("Suraj");
		
		set.add("Suraj");  //dosent contain duplicatie value cause hashcode 
		//hasdcode contain unique value 
		
		System.out.println(set);
		
		System.out.println();
		
		Iterator<String>obj = set.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
			System.out.println(obj.hashCode());
		}
		
		System.out.println();
		
		for(String s : set)
		{
			System.out.println(s);
		}
	
		
		System.out.println( "Size is "+set.size());
		System.out.println( "spliterator is "+set.spliterator());
		System.out.println( "toArray is "+set.toArray());
		
		System.out.println("HASHCODE   "+set.hashCode());
		
		
		
		set.clear();
		
		System.out.println( "Remove all is  "+set.removeAll(set));

		
	

	}

}
