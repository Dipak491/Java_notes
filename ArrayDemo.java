package com.exception;

import java.util.*;
public class ArrayDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] =  new int[2];
		
		int i = 0;
		try
		{
			arr[3] = 30;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.err.println("Index out of bound");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
			System.out.println(arr[3]);
			
			
		
	}

}
