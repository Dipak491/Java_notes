package com.PRACTICE;
import java.util.*;

public class MultiplicatioTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find table");
		int num = sc.nextInt();
		
		int result = 1;
		int i = 1;
		
		while(i<=10)
		{
			result  = num*i;
			System.out.println(result);
			i++;
		}
	
	}
	

}
