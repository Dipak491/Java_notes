package com.collection;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String>lset = new LinkedHashSet<String>();
		lset.add("Ravi");
		lset.add("Abhay");
		lset.add("Raju");
		lset.add("Ajay");
		
		
		Iterator<String> obj = lset.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
		
		LinkedHashSet<Integer>iobj = new LinkedHashSet<Integer>();
		
		iobj.add(90);
		iobj.add(8);
		iobj.add(76);
		
		System.out.println(iobj);
		
		System.out.println();
		
	}

}
