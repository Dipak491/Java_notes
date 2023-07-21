package com.array;
import java.util.*;

public class MatrixMul {

				public static void main(String[] args) 
				{
					// TODO Auto-generated method stub
					Scanner sc = new Scanner(System.in);
					
					int Arr1[][] = new int[3][3];
					int Arr2[][] = new int [3][3];
					int iMul[][] = new int [3][3];
					
					
					System.out.println("Enter the elements of array 1");
					for(int i = 0;i<3; i++)
					{
						for(int j = 0; j<3; j++)
						{
							Arr1[i][j]= sc.nextInt();
						}
						//System.out.println(Arrays.deepToString(Arr1));
					}
					
					
					System.out.println("Enter the elements of array2 ");
					for(int i = 0;i<3; i++)
					{
						for(int j = 0; j<3; j++)
						{
							Arr2[i][j]= sc.nextInt();
						}
						//System.out.println(Arrays.deepToString(Arr2));
					}
					
					

					System.out.println("Multiplication  is  ");
					
					for(int i = 0;i<3; i++)
					{
						for(int j = 0; j<3; j++)
							
						{
							iMul[i][j]=0;
							for(int k=0;k<3;k++)
							{
								iMul[i][j]  = iMul[i][j]+Arr1[i][k] * Arr2[k][j];

							}
							
							System.out.println(iMul[i][j]);
						}
					}
					//System.out.println("Mul of Array is "+Arrays.deepToString(iMul));
				
				}

			}
