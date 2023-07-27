package com.corejava;

class Bank
{
	int ROI = 5;
}

class BOI extends Bank
{
	void getDetail1()
	{
		System.out.println("Bank of India ");
	
		double bRoi = ROI*4;
		System.out.println("Rate of intrest for BOI bank is"+bRoi);
		
		
	}
}

class MBI extends BOI
{
	void getDetail2()
	{
		System.out.println("Maharastra bank of india");
		double mRoi = ROI*5;
		System.out.println("Rate of intrest for MBI bank is"+mRoi);
		
	}
}

class CBI extends MBI
{
	void getDetail3()
	{
		System.out.println("Canera bank of india x ");
		double cRoi = ROI*6;
		System.out.println("Rate of intrest for CBI bank is"+cRoi);
	
	}
}

public class MultilevelInheritance extends CBI
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MultilevelInheritance obj = new MultilevelInheritance();
		obj.getDetail1();
		obj.getDetail2();
		obj.getDetail3();
		

	}

}