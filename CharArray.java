package com.array;

import java.util.Arrays;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char Arr[] = new char[7];
		char Crr[] = {'a','b','c','d','e'};
		
		System.arraycopy(Crr,0,Arr,2,4);
		
		
		
		System.out.println(Arrays.toString(Crr));

	}

}
