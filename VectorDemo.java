package com.collection;


//vector is synchornized vector used other methods than collection 
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector <String> vec = new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		
		
		vec.addElement("Peacock");
		vec.addElement("Pikachu");
		
		
		System.out.println(vec);

	}

}
