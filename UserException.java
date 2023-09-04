package com.exception;

public class UserException {

	public static void main(String[] args) 
	{
		int num1 = 12;
	int num2 = 0;
	
		int ans = 0;
		
		
		
		try 
		{
			ans = num1/num2;
		}
		
		catch(Exception e)
		{
			System.out.println("Plese check number not divide by 0 ");
		}
		
		System.out.println(ans);
		
		
		
	}

}
