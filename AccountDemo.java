package com.exception;
import java.util.*;


class InsBalance extends RuntimeException
{
	private String message;
	
	public InsBalance(String message)
	{
		super(message);
	}
}

class Account 
{
	private int balance =3000;
	
	public int Balance()
	{
		return balance;
	}
	
	void Withdraw(int amount)
	{
		if(amount>balance)
		{
			throw new InsBalance("Insufficient balance");
		}
		balance = balance - amount;
	}
}




public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac = new Account();
		
		System.out.println("Your balance "+ac.Balance());
		
		ac.Withdraw(200);
		System.out.println("Balanc is"+ac.Balance());


	}

}
