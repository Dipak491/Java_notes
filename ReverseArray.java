package com.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int arr[] = {8,3,6,7,2,9};
		
		System.out.println("Original array "+Arrays.toString(arr));
		
		System.out.println("Reverse array is ");
		for(int i =arr.length-1 ; i>0;i--)
		{
			System.out.print(arr[i]+",");
		}
		


	}

}
