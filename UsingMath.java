package com.loops;
import java.math.*;

public class UsingMath 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int num = 370;
		
		int temp = num;
		
		double result = 0;
		int rem =0;
		int i =0;
		
		
		while(i<temp)
		{
			rem = temp%10;
			temp = temp/10;
			
			
			//System.out.println(Math.pow(rem,3));
			result = result +(Math.pow(rem, 3));
			
		}
		System.out.println(result);

	
	
	if(num == result)
	{
		System.out.println("Armstrong ");
	}
	else
	{
		System.out.println("Not armstrong ");
	}
}
}


