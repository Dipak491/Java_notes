package com.collection;
import java.util.*;

class Student
{
	int rollno;
	String name;
	int age;
	
	Student(int rollno, String name,int age)
	{
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
}

class AgeComparator implements Comparator
{
	public int compare(Object o1. object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		
		if(s1.age < s2.age) {return -1;}
		else if(s1.age > s2.age) {return 1;}
		else {return 0;}
	}
}

class NameComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		return s1.name.compareTo(s2.name);
	}
}



public class SortCompare {

	public static void main(String[] args) 
	{
		
		
	}

}
