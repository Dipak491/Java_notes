package com.array;

public class ArrayDisplay {

	public static void main(String[] args) {
		
		char cArr[] = {'a','b','c','d'};
		int iArr[] = {12,34,56,67,87};
		double fArr[] = {10.2,2.4,5.7};
		
		
		System.out.print("Array of int is ");
		for(int i = 0; i<iArr.length;i++)
		{
			System.out.print(iArr[i]+" ");
		}
		System.out.println();
		
		
		System.out.print("Array of char is ");
		for(int j = 0; j<cArr.length; j++)
		{
			System.out.print(cArr[j]+" ");
		}
		System.out.println();
		
		
		System.out.print("Array of char is ");
		for(int k =0; k<fArr.length; k++)
		{
			System.out.print(fArr[k]+" ");
		}
		System.out.println();
		

	}

}
