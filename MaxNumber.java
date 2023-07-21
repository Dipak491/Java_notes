package com.array;

public class MaxNumber {

	public static void main(String[] args)
	{
		int arr1[] = {23,45,6,76};
		
		int iMax=0;
		
		for(int i =0; i<4; i++)
		{
			//System.out.println("Elements of array is "+arr1[i]);
			
			if(arr1[i]>iMax)
			{
				iMax = arr1[i];
			}
		
		}
		System.out.println("Maximum number is"+ iMax);
		
		
	

	}

}
