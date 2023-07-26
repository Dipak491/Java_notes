package com.PRACTICE;
import java.util.*;

public class Password 
{
	static int checkPass(String str,int n)
	{
		if(n<4)   //at least 4 lenght 
		{
			return 0;
		}
		
		
		if((str.charAt(0)>= '0') && (str.charAt(0)<='9'))
		{
			return 0;
		}
			
		
		int num =0;
		int cap =0;
		
		for(int i =0; i<n; i++)
		{
			if((str.charAt(i) ==' ')|| (str.charAt(i)=='/'))
			{
				return 0;
			}
			
			
			if((str.charAt(i)>='A' ) && (str.charAt(i)<='Z')) //uppercase
			{
				cap++;
			}
			
			if((str.charAt(i)>='0' ) && (str.charAt(i)<='9'))
			{
					num++;	
			}
		}
		
		if(cap >0 && num>0)
		{
			return 1;
		}
		else
		{
			return 0;
		}	
	}

	public static void main(String[] args) 
	{
		int iRet =0;
		String str ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter password");
		str  = sc.next();
		int n = str.length();
		
		
		iRet = checkPass(str,n);
		System.out.println(iRet);
		
		
		
	}

}
