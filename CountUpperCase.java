package com.PRACTICE;
import java.util.*;

public class CountUpperCase {
	
	int UpperCase(String s)
	{
		char str[] = s.toCharArray();
		int count =0;
		for(int i = 0;i<str.length; i++)
		{
			if((str[i]>='A')&&(str[i]<='Z'))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		
		String name = sc.next();
		
		CountUpperCase obj = new CountUpperCase();
		int iret = obj.UpperCase(name);
		System.out.println("Upper case letter in string is "+iret);
		
	}

}
