package com.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Account {

	public static void main(String[] args) throws Exception
	{
		File f=new File("E:\\Harish\\Full Stack\\CORE JAVA\\Files\\Account.txt");
		FileOutputStream fo = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fo); 
		dos.writeInt(21);
		dos.writeUTF("Harish"); 
		dos.writeDouble(200000.00);
		dos.flush();
		fo.flush(); 
		
		FileInputStream fos = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fos); 
		int acc_id=dis.readInt();
		String name=dis.readUTF(); 
		double balance=dis.readDouble();
		 
		
		dos.close();
		fo.close();
		dis.close();
		fos.close();

		
		System.out.println(acc_id+" "+name+" "+balance);
	}

}
