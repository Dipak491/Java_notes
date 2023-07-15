package com.loops;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		
		int temp = num;  //121
		
		int rem = 0;
		int res=0;
		
		while(temp>0)
		{
			rem =  temp%10;    //1   2 1
			res = (res*10)+rem;
			
			temp = temp/10;	   //12  1 0
		
		}
		
		if(num == res)
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not ");
		}
	}

}
