package com.exception;

import java.util.Arrays;

public class TryDemo {

	public static void main(String[] args)
	{
		int a [] = {2,3,4};
		int arr[] =  new int[5];
		
		try
		{
			try 
			{
				String s = null;
				System.out.println(s.length());
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				a[5] = 34;
				System.out.println(Arrays.toString(a));
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		//System.out.println(Arrays.toString(a));

	}

}
