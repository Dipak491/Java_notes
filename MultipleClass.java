package com.corejava;

import java.util.Scanner;

class Test
{
	String s;
	int a;
	void getValue()
	{
		s = "Abhay";
		System.out.println(a);
	}
}

public class MultipleClass 
{
	static int d;

	public static void main(String[] args) 
	{
		d =10;
		
		Test tobj = new Test();
		System.out.println("Please enter the number ");
		Scanner sc = new Scanner(System.in);
		tobj.a = sc.nextInt();
		
		tobj.getValue();
		
	}

}
