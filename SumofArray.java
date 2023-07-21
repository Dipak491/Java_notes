package com.array;
import java.util.*;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr1[] = {2,4,5,7};

		int arr2[] = {3,6,25,6};
		
		int iSum[] =new int[4];
		
		for(int i = 0;i<arr1.length; i++)
		{
			iSum[i] = arr1[i]+arr2[i];
			
		}
		System.out.println(Arrays.toString(iSum));
	
	}

}
