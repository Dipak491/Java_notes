package com.array;

import java.util.*;
public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		float arr2[] = new float[10];
		
		System.out.println("Enter the value of array ");
		for(int i =0; i<=5;i++)
		{
			//System.out.println("Enter the value of array");
			arr2[i] = sc.nextFloat();
		}
		
		
		
		//to display 
		for(int i = 0; i<=5; i++)
		{
			System.out.print(arr2[i]+" ");
			
		}
		
		
		
		

	}

}
