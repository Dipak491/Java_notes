package com.corejava;
import java.util.*;
public class Calculator {
	
	Scanner sobj = new Scanner(System.in);

	//int a = 20;
	//int b = 12;
	void add(int a, int b )
	{
		System.out.println("Addition is "+(a+b));
	}
	
	void sub(int a, int b )
	{
		System.out.println("Substraction is "+(a-b));
	}
	
	int mul(int a, int b)
	{
		return a*b;
	}
	
	void div(int a, int b )
	{
		System.out.println("Division is "+(a/b));
	}
	
	void mod(int a, int b )
	{
		System.out.println("reminder is "+(a%b));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = sobj.nextInt();
		
		System.out.println("Enter secound number ");
		int b = sobj.nextInt();
		
		Calculator cobj = new Calculator();
		cobj.add(a,b);
		cobj.sub(a,b);
		cobj.mul(a,b);
		cobj.div(a,b);
		cobj.mod(a,b);

	}

}
