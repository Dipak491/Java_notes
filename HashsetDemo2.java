package com.collection;
import java.util.*;

class Book
{
	int id;
	String name, A_name;
	
	Book(int id,String Bookname, String Authorname)
	{
		this.id = id;
		this.name= Bookname;
		this.A_name = Authorname;
		
		
	}
	
}

public class HashsetDemo2 {

	public static void main(String[] args) 
	{
		Book b1 = new Book(1,"Jungle Book","Abhay U ");
		Book b2 = new Book(2,"Atomic habbit","James Clear");
		Book b3 = new Book(3,"Mrutunjay","Shivaji Sawant");
		
		HashSet<Book>obj = new HashSet<Book>();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		
		for(Book bookobj : obj)
		{
			System.out.println(bookobj.id + " "+ bookobj.name+" "+bookobj.A_name);
		}
		
	}

}
