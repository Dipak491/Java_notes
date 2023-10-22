package com.arrays;

import java.util.Arrays;

//
//Array = {10, 20, 30, 40, 50};
//Element to be inserted = 99;
//Position = 3;
//Final result = {10, 20, 30, 99, 40, 50};


public class InsertElement {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};

		int temp[] = new int[arr.length+1];
		int pos = 3;
		
		int num = 99;
		
		for(int i= 0, j=0; i<arr.length+1 ;i++)
		{
			if(i == pos)
				temp[i] = num;
			else
				temp[i] = arr[j++];
				
		}

		System.out.println(Arrays.toString(temp));
	}

}
