package com.array;
import java.util.*;


public class TwoDArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Arr[][]= new int[3][3];
		
		System.out.println("Enter number of elements ");
		
		for(int i =0; i<3;i++)
		{
			for(int j = 0; j<3; j++)
			{
				Arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Elements of array is "+Arrays.deepToString(Arr));
		

	}

}
