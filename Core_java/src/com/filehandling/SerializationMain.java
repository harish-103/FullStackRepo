package com.filehandling;
import java.io.*;
public class SerializationMain
{
    public static void writeObject(Account1 a)throws IOException
    {
    	File f=new File("E:\\Harish\\Full Stack\\CORE JAVA\\Files\\Seq1.txt");
		FileOutputStream fis=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fis);
		oos.writeObject(a);
		oos.flush();
		oos.close();
    }
    public static Account1 readObject()throws IOException, ClassNotFoundException
    {
    	File f=new File("E:\\Harish\\Full Stack\\CORE JAVA\\Files\\Seq1.txt");
		FileInputStream fis=new FileInputStream(f);
		Object o=new Object();
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account1 ac=(Account1)(ois.readObject());
		ois.close();
		return ac;
    }
	public static void main(String[] args) throws IOException,ClassNotFoundException  {
		
		Account1 a=new Account1("Haris",10,100.0,new Date(25));
		writeObject(a);
		System.out.println(readObject());

	}
}
	class Date implements Serializable
	{
		int day;
		public Date(int day) 
		{
			super();
			this.day = day;
		}
		@Override
		public String toString() {
			return this.day+" ";
		}
	}
	class Account1 implements Serializable
	{   
		private static final long serialVersionUID=2L;
		private  String name;
		private int accNo;
		private double balance; 
		private Date day;
		public Account1(String name,int accNo,double balance,Date day) {
			this.name=name;
			this.accNo=accNo;
			this.balance=balance;
			this.day=day;
		}
		public String getName() {
			// TODO Auto-generated method stub
			return this.name;
		}
		public int getAccountNumber() {
			// TODO Auto-generated method stub
			return this.accNo;
		}
		public double getBalance() {
			// TODO Auto-generated method stub
			return this.balance;
		}
		@Override
		public String toString() 
		{
			return this.name+" "+this.accNo+" "+this.balance+" "+this.day;
		}
	}
			
		

