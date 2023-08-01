
package com.PRACTICE;
import java.util.*;


public class SecoundLargest 
{

	public static void main(String[] args)
	{
		

		int Arr[] = {10,4,2,8,5,56};
		
		int firstMax = Arr[0];
		int secoundMax = Arr[0];
		
		
		for(int i=1;i<Arr.length; i++)
		{
	
				if(firstMax < Arr[i])
				{	
					secoundMax = firstMax;
					firstMax = Arr[i];				
					
				}	
				else if(secoundMax < Arr[i])
				{
					secoundMax = Arr[i];
				}
			}
		System.out.println(secoundMax);
		
		System.out.println(Arrays.toString(Arr));
	}
			
}


