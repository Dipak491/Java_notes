package com.corejava;

public class ParameterFun {
	
	int add(int a, int b)
	{
		return a+b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterFun obj = new ParameterFun();
		
		int res =obj.add(10, 20);
		
		System.out.println(res);
		

	}

}
