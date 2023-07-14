package com.corejava;
import java.util.*;

public class InputAll {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("Enter number");
		a = s.nextInt();
		
		
		char b;
		System.out.println("Enter character ");
		b = s.next().charAt(0);

		
		String c;
		System.out.println("Enter string ");
		c = s.next();
		
		float d;
		System.out.println("Enter Float number ");
		d= s.nextFloat();
		
		long mob;
		System.out.println("Enter mobile number ");
		mob = s.nextLong();
		
		System.out.println("NUMBER IS : "+ a);
		System.out.println("Character is :"+ b);
		System.out.println("String is : "+ c);
		System.out.println("Float is :" + d);
		System.out.println("Mobile number is :"+ mob);	
		
	}

}
