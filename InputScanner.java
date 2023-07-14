package com.corejava;
import java.util.Scanner;


public class InputScanner {

	public static void main(String[] args) {
		
		Scanner sobj = new Scanner (System.in);
		int a;
		int b;
		
		System.out.println("Enter first number ");
		a = sobj.nextInt();
		
		System.out.println("Enter secound number");
		b = sobj.nextInt();
		
		System.out.println("Value of a is : "+ a);
		System.out.println("Value of b is : "+ b);

	}

}
