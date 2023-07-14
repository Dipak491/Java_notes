package com.controlstructure;
import java.util.*;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter age  ");
		a = sc.nextInt();
		
		if(a< 100)
		{
			if(a>50)
			{
				System.out.println("Inside nested if ");
			}
			else
			{
				System.out.println("Inside nested else ");
			}
		}
		else
		{
			System.out.println("only else ");
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		if((a>18)  && ( a<90))
//		{
//
//				System.out.println("Your are eligible for  Lincens ");
//		}
//			
//		else if((a>=16) && (a<=18))
//		{
//			System.out.println("Your are eligible for Learning Lincens");		}
//		else
//		{
//			System.out.println("Not eligible ");
//		}
//	}
//
//}
