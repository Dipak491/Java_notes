package com.PRACTICE;

public class FibbonacciSeries {
//0 1 1 2 3 5 8 13 21 34 55 //addition of two number is third number 
	public static void main(String[] args) {
		int No1 =0;
		int No2 =1;
		
		int result;
		
		
		int n =1;
		while(n<10)
		{
			result = No1+No2;
			System.out.println(result);
			
			No1  = No2;
			No2 = result;
			
			n++;
			
		}

	}

}
