package com.array;
import java.util.*;

public class TwoDArr {





		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int Arr1[][] = new int[3][3];
			int Arr2[][] = new int [3][3];
			int Sum[][] = new int [3][3];
			
			
			System.out.println("Enter the elements of array 1");
			for(int i = 0;i<2; i++)
			{
				for(int j = 0; j<2; j++)
				{
					Arr1[i][j]= sc.nextInt();
				}
				System.out.println(Arrays.deepToString(Arr1));
			}
			
			
			System.out.println("Enter the elements of array2 ");
			for(int i = 0;i<2; i++)
			{
				for(int j = 0; j<2; j++)
				{
					Arr2[i][j]= sc.nextInt();
				}
				System.out.println(Arrays.deepToString(Arr2));
			}
			
			

			System.out.println("Addition is  ");
			
			for(int i = 0;i<2; i++)
			{
				for(int j = 0; j<2; j++)
				{
					Sum[i][j] = Arr1[i][j] + Arr2[i][j];
					System.out.println(Arrays.deepToString(Sum));
				}
			}
			System.out.println("Sum of Array is "+Arrays.deepToString(Sum));
		
		}

	}
