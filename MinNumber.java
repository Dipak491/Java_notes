package com.array;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,45,11,5,6};
		
		int iMin = arr[0];
		
		for(int i =0; i<5; i++)
		{	
			if(iMin > arr[i])  
			{
				
			 iMin=arr[i];
			}
			
		}
		System.out.println(iMin);

	}

}
