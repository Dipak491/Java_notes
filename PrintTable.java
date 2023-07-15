package com.loops;
import java.util.*;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		
		int No1 = 0;
		int No2 = 1;
		int n =0;
		
		while(n<=10)  
		{
			int add = No1 + No2;  //0+1
			
			 System.out.println(add);
			 
			No1 = No2;
			No2 = add;	
			
			n++;
		}

	}

}
