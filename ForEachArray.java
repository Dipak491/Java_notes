package com.array;
import java.util.*;

public class ForEachArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		
		System.out.println("Enter elements of array ");
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Display all elements using For Each loop");
		for(int b :arr)
		{
			System.out.print(b+" ");
		}
	}

}
