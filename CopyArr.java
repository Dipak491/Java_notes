package com.array;

import java.util.Arrays;

public class CopyArr {

	public static void main(String args[])
	{
			// TODO Auto-generated method stub
			
			char Arr[] = {'J','A','V','A'};
			char Crr[] = {'S','R','I','P','T'};
			int size =Arr.length + Crr.length;
			char Sum[] = new char[size];
			
			
			System.arraycopy(Arr,0,Sum,0,4); //(Source,index, Destination,index, length of array)
			
			//System.arraycopy(Arr,0,Sum,0,Arr.length);
			
			System.arraycopy(Crr,0,Sum,4,5);
			
			//System.arraycopy(Crr,0,Sum,Arr.length,Crr.length);
			
			
			System.out.println(Arrays.toString(Sum));

		}

	}
