package com.arrays;

import java.util.Arrays;

public class SeoundLargest {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 6, 2, 4 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				
				if (arr[i] < arr[j]) 
				{
				
					max  = arr[j];

					arr[j] = arr[i];

					arr[i] = max;
				}
			}
		}
		// System.out.println(max);
		System.out.println("Secound Largetst element in array is"+arr[1]);
		//System.out.println(Arrays.toString(arr));

	}

}
