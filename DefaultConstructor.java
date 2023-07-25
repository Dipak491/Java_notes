package com.corejava;

public class DefaultConstructor 
{
	int num1 =10;
	int num2 = 40;
	
	DefaultConstructor()
	{
		System.out.println("Even number is ");
		for(int i =num1; i<=num2;i++)
		{
			if(i%2 == 0)
			{
				System.out.println("Even"+ i+" ");
			}
			
			else if(i%2 != 0)
			{
				System.out.println("odd"+ i+" ");
			}
		}

	}

	public static void main(String[] args) 
	{
		DefaultConstructor obj = new DefaultConstructor();
		

	}

}
