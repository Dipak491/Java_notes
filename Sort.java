package com.arrays;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) 
	{
		
		int arr[] = {877,23,4,67,32,56,34345};
		int max = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			for(int j=0; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					max = arr[j];
					arr[j] = arr[i];
					arr[i] = max;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		//-----------------------------------------------------------//
		
	Arrays.sort(arr);
	System.out.print("Using inbuilt method"+Arrays.toString(arr));

	}

}
