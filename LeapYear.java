package com.controlstructure;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int year = 2004;
		System.out.println("Enter Year");
		int Year =  sc.nextInt();
		
		if(Year%4 == 0)
		{
			System.out.println(" This is Leap year");
		}
		else
		{
			System.out.println("This is Not leap year ");
		}

	}
}
