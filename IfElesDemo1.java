package com.controlstructure;
import java.util.*;

public class IfElesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int age = 18;
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age = sc.nextInt();
		if(age >=18)
		{
			System.out.println("Your Eligible for vote");
		}
		else
		{
			System.out.println("Your Not eligible for Vote ");
		}

	}

}
