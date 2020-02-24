package com.multithreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OvalGame extends Frame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int y1 = 400, y2 = 400, y3 = 400;
	Thread t1,t2,t3;
	public OvalGame() {
		super("Oval game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		t1=new Thread(this);
		t2=new Thread(this);
		t3=new Thread(this);
		t1.setName("RED");
		t2.setName("GREEN");
		t3.setName("BLUE");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
	}

	public static void main(String[] args) throws Exception {
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
	}

	@Override
	public void run() {
		Thread currentThread=Thread.currentThread();
		if(currentThread.getName().equals("RED"))
		{ while (true)
			{
			if(y1>=100)
			
			for(int i=y1;y1>60;i--)
				{
					y1=y1-3;
					repaint();
					try {
						Thread.sleep(30);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				}
				
			}
			if(y1<100)
			{
				for(int i=y1;y1<=400;i++)
				{
					y1=y1+3;
					repaint();
					try {
						Thread.sleep(30);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				
				}
			}
		}
				
		
		}
	
		else if(currentThread.getName().equals("GREEN"))
		{
			 while (true)
				{
				if(y2>=100)
				
				{	for(int i=y2;y2>60;i--)
					{
						y2=y2-3;
						repaint();
						try {
							Thread.sleep(40);
						} 
						catch (InterruptedException e) {
							e.printStackTrace();
						}
					
					}
					
				}
				if(y2<100)
				{
					for(int i=y2;y2<=400;i++)
					{
						y2=y2+3;
						repaint();
						try {
							Thread.sleep(40);
						} 
						catch (InterruptedException e) {
							e.printStackTrace();
						}
					
					}
				}
			}
			
		}
		else if(currentThread.getName().equals("BLUE"))
		{
			 while (true)
				{
				if(y3>=100)
				
				{	for(int i=y3;y3>60;i--)
					{
						y3=y3-3;
						repaint();
						try {
							Thread.sleep(20);
						} 
						catch (InterruptedException e) {
							e.printStackTrace();
						}
					
					}
					
				}
				if(y3<100)
				{
					for(int i=y3;y3<=400;i++)
					{
						y3=y3+3;
						repaint();
						try {
							Thread.sleep(20);
						} 
						catch (InterruptedException e) {
							e.printStackTrace();
						}
					
					}
				}
			}
			
		}
	}
}