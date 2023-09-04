package com.exception;

public class NullPointerDemo {

	public static void main(String[] args)
	{
		String str = null;
		try {
			
		
			String s;
		
			//String str = null;
		
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println(str.length());
	
		

	}

}
