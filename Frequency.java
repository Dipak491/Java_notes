package com.PRACTICE;

public class Frequency {

	public static void main(String[] args)
	{
		
		String str = "HHELLOOO";
		
		int count =0;
		
		//char[]s = new char[50];
		//s= str.toCharArray();
		
		//System.out.println(s[0]);
		
		for(int i = 0; i<str.length();i++)
		{
			for(int j =0;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
					count++;
				//System.out.println(str.charAt(i));
			}
			System.out.println("Frequency is"+str.charAt(i) +count);
		}
	
	

	}

}
