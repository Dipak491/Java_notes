package com.corejava;
import java.util.*;

class shape
{
	int height;
	int width;
	void Accept(int b, int h)
	{
		this.height = b;
		this.width = h;
		System.out.println("Base is "+b);
		System.out.println("Height is "+h);
		
	}
}


class Rectangle extends shape
{
	void Area(int a, int b)
	{
		int ans = a * b;
		System.out.println("Area of rectangl is "+ans);
	}
}


class Traingle extends shape 
{
	void Area(int a, int b)
	{
		double ans = 0.5* a * b;
		System.out.println("Area of rectangl is "+ans);
	}
}



public class AreaRectTrang 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter base");
		int	b = sc.nextInt();
		
		System.out.println("Enter height ");
		int h =sc.nextInt();
		
		
		Rectangle robj = new Rectangle();
		robj.Accept(b, h);
		robj.Area(b, h);
		
		Traingle tobj = new Traingle();
		robj.Accept(b, h);
		tobj.Area(b, h);

	}

}
