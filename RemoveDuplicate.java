package com.arrays;

import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		int arr[] = {1,5,7,4,5,5};
		
		HashSet<Integer> set  = new HashSet<Integer>();
		
		for(int i = 0; i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		
		
		
	
		
		System.out.println(set);
		
	}

}
