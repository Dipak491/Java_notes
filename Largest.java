package com.arrays;

public class Largest {

	public static void main(String[] args) 
	{
		int arr[] = {2,4,6,98,44};
		
		int max = 0;
		
		for(int i =0; i<arr.length;i++)
		{
			for(int j =1; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					max = arr[j];
				}
			}
		}
		
		System.out.println("Largest Element in array is "+max);

	}

}
