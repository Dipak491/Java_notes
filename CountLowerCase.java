package com.PRACTICE;
import java.util.*;

public class CountLowerCase {
	
	int Lower(String name)
	{
		char str[] = name.toCharArray();
		int count = 0;
		
		
		for(int i = 0;i<str.length; i++)
		{
			if((str[i]>='a')&&(str[i]<='z'))
			{
				
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");

		String  s = sc.next();
		
		CountLowerCase obj = new CountLowerCase();
		int iret = obj.Lower(s);
		System.out.println("Lower Case letter in string is "+iret);
		
	}

}
