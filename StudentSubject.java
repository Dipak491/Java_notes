package com.controlstructure;
import java.util.*;

public class StudentSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Year;
		//String stream:
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter year");
			Year = sc.nextInt();
			
			System.out.println("Enter stream");
			String stream = sc.next();
		
			
			switch(Year)
			{
			case 1: 
			
				switch(stream)
				{
				case  "Cs":  
					System.out.println("Your subject are ");
					System.out.println("Computer fundamental");
					System.out.println("C programming lang");
					System.out.println("C++ Programming lang ");
					System.out.println("HTML");
					
					break; //for case cs 
					
				case "Me":
				System.out.println("Your subject are :");
				System.out.println("Drawing");
				System.out.println("Subject 2");
				System.out.println("Subject 3");
				
				break; //for case Me
				
				default: //for switch stream
					System.out.println("Invalid stream Enter steram like Cs, Me");
				}
			break;   //for case 1 of year 
			
			
			
			case 2:
			
				switch(stream)
				{
				case  "Cs":
					System.out.println("Your subject are :");
					System.out.println("Cs subject 1 for 2");
					System.out.println("Cs subject 2 for 2");
					System.out.println("Cs subject 3 for 2");
					System.out.println("Cs subject 4 for 2");
					
					break;
					
				case "Me":
				System.out.println("Your subject are :");
				System.out.println(" Me subject1 for 2");
				System.out.println("Me subject 2 for 2");
				System.out.println("Me subject 3 for 2");
				
				break;
				
				default:
					System.out.println("Invalid stream Enter steram like Cs, Me");
				}
			
			break; //for case 2 of year
			
			default:   // for switch year 
			System.out.println("Enter valid Year Like 1,2,3");		
		}
				
	}

}
