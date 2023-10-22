package com.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Occurance {

	public static void main(String[] args)
	{
		int arr[] = {3,4,6,7,7,7,6,3,5};
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}

}
