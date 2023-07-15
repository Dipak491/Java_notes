package com.loops;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int No1 = 0;
		int No2 = 1;
		
		int i = 0;
		while(i<10)
		{
			int add = No1 + No2;
			System.out.println(add);
			
			No1 = No2;
			No2 = add;
			 
			i++;
		}

	}

}
