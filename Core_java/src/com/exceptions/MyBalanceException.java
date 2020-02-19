
package com.exceptions;
class InsufficientBalanceException extends Exception
{
	private String message;
	public InsufficientBalanceException()
	{
		this.message= "";
	}
	public InsufficientBalanceException(String message)
	{
		this.message= message;
	}
	public String toString()
	{
		return "Withdraw amount exceeds limit." + this.message;
	}
}

class Account
{
	private static int bal=22200;
	public static void withdraw(int withdraw_amount) throws Exception
	{
		if(bal<withdraw_amount)
		{
			throw new InsufficientBalanceException();
		}
		else
		{
			System.out.println("Withdraw Successful");
		}
	}
}

public class MyBalanceException
{
	public static void main(String[] args)  
	{
		try
		{
			Account.withdraw(3000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
