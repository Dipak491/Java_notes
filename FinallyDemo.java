package com.exception;

public class FinallyDemo 
{
	public void fun()
	{
		int arr [] = new int[5];
		//arr[4] = 30/0;
		try 
		{
			
			arr[4] = 4/0;
			
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is finally block ");
		}
	}
	

	public static void main(String[] args) 
	{
		FinallyDemo obj = new FinallyDemo();
		
		obj.fun();

	}

}
