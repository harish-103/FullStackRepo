package com.multithreading;

public class ExtendsPingPong extends Thread
{
	public ExtendsPingPong(String threadName)
	{
		super.setName(threadName);
		super.start();
	}
	public static void main(String[] args) 
	{
		new ExtendsPingPong("PING");
		new ExtendsPingPong("PONG");
	}
	
	public void run()
	{
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("PING"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("PING         ");
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
			}
		}
		else if(currentThread.getName().equals("PONG"))
		{
			for(int i=0;i<20;i++)
			{
				System.out.println("\tPONG");
				try
				{
					Thread.sleep(500);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
					
				}
			}
		}
		
	}
}
