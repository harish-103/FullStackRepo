package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWrite 
{
	public static void main(String[] args) throws Exception
	{
		File file1 = new File("E:\\Harish\\Full Stack\\CORE JAVA\\read.txt");
		File file2 = new File("E:\\Harish\\Full Stack\\CORE JAVA\\write.txt");
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream foo = new FileOutputStream(file2);
		
		StringBuilder sb = new StringBuilder();
		int i = 0;
		do {
		i = fis.read();
		//System.out.println(i);
		if(i != -1)
		sb.append((char)i);
		}
		while(i != -1); 
		System.out.println("File contents: "+sb);
		String str=sb.toString();
		foo.write(str.getBytes());
		
		foo.flush();
		foo.close();
		fis.close();
		
	}

}
