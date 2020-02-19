package com.filehandling;

import java.io.File;

public class FileArray 
{
	public static void main(String args[])
	{
		File folder = new File("E:\\Harish\\Full Stack\\CORE JAVA\\Files");
		File file[]=folder.listFiles();
		for (File files : file)
		{
		    if (files.isFile()) {
		        System.out.println(files.getName());
		        System.out.println(files.canExecute());
		        System.out.println(files.getPath());
		        System.out.println(files.canRead());
		        System.out.println(files.canWrite());
		        System.out.println(files.length());
		        System.out.println(files.lastModified());
		        
		        
		    }
		}
	}
}
