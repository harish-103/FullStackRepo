package com.exceptions;

class MyAutoCloseable implements AutoCloseable {
	public void close() throws Exception{
		System.out.println("Closed");
	}
	public static void main(String [] args) throws Exception {
		try (MyAutoCloseable input = new MyAutoCloseable())
			{
				System.out.println("Enter try block");
				int x=25/1;
				System.out.println("Exit try block");
			}
		catch(ArithmeticException e) 
		{
			e.getStackTrace();
		}
		}
	}