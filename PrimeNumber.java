package com.loops;
import java.util.*;

public class PrimeNumber { //only divide by itself and 1  //5, 13

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime or not ");
		int num = sc.nextInt();	
		int count =0;
		
		
		//for(int i = 1; i<=num; i++) //it increase time complexity 
		
		for(int i = 1; i<=num/2; i++)  // it reduce time complexity 
		{
			if(num%i == 0)
			{
				count++;
			}
		}
		if(count ==1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not primme");
		}

	}

}
