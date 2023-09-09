package filehandling;

import java.util.*;
import java.io.*;

public class Task {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter file name that you want to create");
		String filename = sc.nextLine();
		
		try
		{
			File fobj = new File(filename);
			
			
		
			if(fobj.createNewFile())
				
				System.out.println("File Created sucessfully");
			else
				System.out.println("File already exist");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			FileWriter wobj = new FileWriter(filename);
			System.out.println("Enter the data that you want to enter ");
			String s1  = sc.nextLine();
			System.out.println("Write data sucessfully ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			
			FileReader robj= new FileReader(filename);
			
			String line = 
			while((line = robj.read()) != 0)
			{
				
			}
			robj.read();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
			
			
		}
		
	}

