package com.exception;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutofboundDemo {

	public static void main(String[] args) {

		int arr[] = new int[4];
		Scanner sc = new Scanner(System.in);
		
		try 
		{
			System.out.println("Enter elements of array ");
			for(int i = 0; i<5;i++)
			{
				arr[i] = sc.nextInt();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
