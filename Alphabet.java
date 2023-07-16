package com.PRACTICE;

import java.util.*;

public class Alphabet {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter single character to find Alphabet or Not");
		
		char ch = sc.next().charAt(0);
		
		if((ch>=97 && ch<=122) || (ch>=65 && ch<=90))
		{
			System.out.println("Alphabet ");
		}
		else
		{
			System.out.println("NOt aplhabet ");
		}
	}

}
