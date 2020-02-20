package com.filehandling;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Sequence {

	public static void main(String[] args) throws Exception {
		FileInputStream fin1=new FileInputStream("E:\\Harish\\Full Stack\\CORE JAVA\\Files\\Seq1.txt");
		FileInputStream fin2=new FileInputStream("E:\\Harish\\Full Stack\\CORE JAVA\\Files\\Seq2.txt");
		FileInputStream fin3=new FileInputStream("E:\\Harish\\Full Stack\\CORE JAVA\\Files\\Seq3.txt");
		Vector v =new Vector();
		v.add(fin1);
		v.add(fin2);
		v.add(fin3);
		
		Enumeration e=v.elements();
		
		SequenceInputStream sis=new SequenceInputStream(e);
		int i;
		while((i=sis.read())!=-1)
		{
			System.out.print((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();
		fin3.close();
	}

}