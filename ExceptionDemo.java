package com.exception;

public class ExceptionDemo {

	public static void main(String[] args)
	{
		int data = 100;
		int div =0;
		
		try {
			
			div = data/0;
			}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println(div);


	}

}
