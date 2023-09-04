package com.exception;

public class NestedTry {

	public static void main(String[] args) 
	{
		int a[] = {2,4,5};
		
		try 
		{
			try
			{
				try
				{
					a[5] = 56;
					System.out.println(a[5]);
				}
				catch(ArithmeticException e)
				{
					System.out.println(e);
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
		}
		catch(Exception e )
		{
			System.out.println(e);
		}
	
		System.out.println("Normal flow");
	

	}

}
