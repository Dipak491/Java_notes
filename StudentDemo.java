package com.exception;


class AttendenceException extends RuntimeException
{
	private String msg;
	
	public AttendenceException(String msg)
	{
		super(msg);
	}
}


class Student
{
	private int attendance = 80;
	
	public int AttPer()
	{
		return attendance;
		
	}
	
	public void isallowed(int a )
	{
		if(a<attendance)
		{
			throw new AttendenceException("Your not eligible for exam");
		}
		
		System.out.println("YOur eligible for exam");
		
	}
}
public class StudentDemo {

	public static void main(String[] args)
	{
		Student std = new Student();
		System.out.println("Compulsory attedance : "+std.AttPer());
		std.isallowed(76);
		System.out.println();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
