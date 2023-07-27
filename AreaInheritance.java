package com.corejava;
import java.util.*;

class Circle1
{
	int radius;
	void getValue()
	{
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius ");
	radius = sc.nextInt();
	}
}

class Cirumference extends Circle1
{
	void getCircumference()
	{
		double Ans=0;
		Ans = 2*3.14*radius;
		System.out.println("Circumference is "+Ans);
	}
	
	void getArea()
	{
		double Ans = 0;
		Ans = 3.14*radius*radius;
		System.out.println("Area of circle  is "+Ans);
	}
}

public class AreaInheritance extends Cirumference
{

	public static void main(String[] args)
	{
		AreaInheritance obj = new AreaInheritance();
		obj.getValue();
		obj.getCircumference();
		obj.getArea();


	}

}
