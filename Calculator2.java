package com.corejava;
import java.util.*;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("Enter First number ");
		a= sc.nextInt();
		
		System.out.println("Enter secound number ");
		b= sc.nextInt();
		
		System.out.println("Addition is "+(a + b));
		
		
		System.out.println("Substraction  is "+(a - b));
		
		System.out.println("Multiplication is "+(a * b));
		System.out.println("Divison is "+(a / b));
		System.out.println("Modulus  is "+(a % b));
		
	}

}
