package com.array;
import java.util.*;

public class SumElement {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int a[] = new int[4];
		
		System.out.println("Enter array ");
		for(int i= 0; i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
	 
		int sum =0;
		for(int i =0; i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);

	}

}
