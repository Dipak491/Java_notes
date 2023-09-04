package com.exception;

public class NumberFormatDemo {

	public static void main(String[] args) 
	{
		try
		{
			String str ="abc";
			
			int i = Integer.parseInt(str);
			System.out.println(i);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println(  "error"+e);
		}
		

	}

}
