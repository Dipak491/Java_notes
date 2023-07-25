package com.corejava;

public class ParaConstructor 
{
	ParaConstructor()
	{
		System.out.println("default constrcuctor");
	}
	
	ParaConstructor(int a, char c)
	{
		//this();
		System.out.println("Parameterized constrcuctor");
	}

	
	ParaConstructor(int b, char l,double f)
	{
		this();
		System.out.println("Parameterized  socound constrcuctor");
	}

	public static void main(String[] args) 
	{
		ParaConstructor obj1 = new ParaConstructor(5,'h');
		ParaConstructor obj = new ParaConstructor(10,'a',4.2);
		
		
		
		
	}

}
