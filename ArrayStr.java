package com.main;
import java.util.*;

public class ArrayStr 
{

	public static void main(String[] args) 
	{
		String name = "raju";
	
			char charArray[] = name.toCharArray();
			
			int len= name.length();
			
			for(int i=0;i<name.length();i++)
			{
				
				for(int j =i+1; j<name.length();j++)
				{
					
					if(charArray[i] > charArray[j])
					{
						char temp = charArray[i];
						charArray[i] = charArray[j];
						charArray[j] = temp;	
				
					}
				}		
			
			}
			
			System.out.println(charArray);	
		}
		
		
	}
