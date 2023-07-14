package com.controlstructure;
import java.util.*;

public class IfelseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Percentage:");
		int percentage  = sc.nextInt();
		
		//int percentage  = 75;
		
		if(percentage >= 75)
		{
			System.out.println(" First Grade ");
		}
		else if(percentage >= 60)
		{
			System.out.println(" Secound Grade");
		}
		else if(percentage >=35)
		{
			System.out.println("Your Pass");
		}
		else
		{
			System.out.println("Your fail");
		}
	}

}
