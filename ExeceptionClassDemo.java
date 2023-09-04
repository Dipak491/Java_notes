package com.exception;

import java.util.*;

public class ExeceptionClassDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int num1 =sc.nextInt();
		
		System.out.println("Enter the secound number ");
		int num2 = sc.nextInt();
		
		int sum =0;
		int c = 0;
		
		try 
		{
		 //c  = 12/d; // show exception in main 
			
			sum = num1/num2;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		//System.out.println(c);
		System.out.println("Result is "+sum);

	}

}
