package com.exception;

public class ThrowDemo 
{
	static void Validate(int age)
	{
		if(age<18)
		{
		
			throw new ArithmeticException ("Not eligible");
			
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) 
	{
		Validate(8);
		System.out.println("Rest");

	}

}
