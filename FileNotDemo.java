package com.exception;

import java.io.FileNotFoundException;
import java.io.*;

public class FileNotDemo 
{
	  public static void  method() throws FileNotFoundException
	 {
		 FileReader file = new FileReader("C:\\Users\\dipak\\OneDrive\\Desktop\\New.txt");
		 BufferedReader FileInput = new BufferedReader(file);
		 
		 throw new FileNotFoundException();
	 }
	public static void main(String[] args) 
	{
		try 
		{
			method();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("rest of the code");
		
		
	}

}
