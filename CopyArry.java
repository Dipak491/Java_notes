package com.array;

import java.util.Arrays;

public class CopyArry {
	
	

	public static void main(String[] args) {
		
		char Arr[] = {'A','B','C'};
		
		char Brr[] = {'D','E','F'};
		
		int size =  Arr.length + Brr.length;
		
		char result[] = new char[size];
		  
		int pos = 0;
//		

		
		for(char ch:Arr)
		{
			result[pos] =ch;
			pos++;
		}
		
		
		for(char ch: Brr)
		{
			result[pos]=ch;
			pos++;
		}
		System.out.println(Arrays.toString(result));
	}
	

}
