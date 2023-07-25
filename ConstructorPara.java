package com.corejava;
import java.util.*;

public class ConstructorPara 
	{
		ConstructorPara()
		{
			System.out.println("default constrcuctor");
		}
		
		ConstructorPara(int one)
		{
		
			System.out.println("Single parameter constrcuctor");
		}
		
		ConstructorPara(int two, float c)
		{
		
			System.out.println("two Parameterized  constrcuctor");
		}

		
		ConstructorPara(int b, char l)
		{
			System.out.println("Parameterized  socound constrcuctor");
		}
		
		ConstructorPara(int z, char m, double k)
		{
			System.out.println("three Parameterized  constrcuctor");
		}
		

		public static void main(String[] args) 
			{
				ConstructorPara obj1 = new ConstructorPara();
				ConstructorPara obj4 = new ConstructorPara(5);
				
				ConstructorPara obj2 = new ConstructorPara(5,'h');
				ConstructorPara obj = new ConstructorPara(10,'a',4.2);
			}
	}
