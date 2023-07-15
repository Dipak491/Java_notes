
package com.loops;
import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n  = sc.nextInt();
		
		int Mul = 1;
		
		int i =1;
		while(i<=n)
		{
			Mul = Mul * i;
			i++;
		}
		System.out.println(Mul);
		
		
		
		
//		for(int i = 1; i<=5; i++)
//		{
//			Mul = Mul *i;
//		}
//		System.out.println(Mul);

	}

}