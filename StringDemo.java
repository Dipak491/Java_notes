package com.PRACTICE;
import java.util.*;

public class StringDemo {
	
	
	void PrintLetter(String s)
	{
		char str[] = s.toCharArray();
		
		for(int i =0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		
		String ans = s.toLowerCase();
		System.out.println("Lowercase string is "+ans);
		
		System.out.println("Your entered string is "+s);
		System.out.println("Length os string is "+s.length());
		
		StringDemo obj = new StringDemo();
		
		obj.PrintLetter(s);
	}

}
