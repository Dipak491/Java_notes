package com.controlstructure;
import java.util.*;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch;
		System.out.println("Enter a char to find vowels or not");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
		case 'a':
			System.out.println("Its vowel");
			break;
			
		case 'e':
			System.out.println("Its vowel");
			break;
			
		case 'i':
			System.out.println("Its vowel");
			break;
			
		case 'o':
			System.out.println("Its vowel");
			break;
			
		case 'u':
			System.out.println("Its vowel");
			break;
			
		case 'A':
			System.out.println("Its vowel");
			break;
			
		case 'E':
			System.out.println("Its vowel");
			break;
			
		case 'I':
			System.out.println("Its vowel");
			break;
			
		case 'O':
			System.out.println("Its vowel");
			break;
			
		case 'U':
			System.out.println("Its vowel");
			break;
			
			default:
				System.out.println("Consonants");
		}
		
	}

}
