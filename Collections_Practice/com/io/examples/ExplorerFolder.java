package com.io.examples;

import java.io.*;
public class ExplorerFolder{
	public static void main(String args[]) throws Exception{
		int i=0;
		File f=new File("//home//prakash//JavaExamples//Io_Java");

		String filename[]=f.list();

		for(String s:filename){
			File f1=new File(f,s);

			//if(f1.isFile()){
			if(f1.isDirectory()){
				System.out.println(s);
				i++;
			}
		}
		System.out.println(" "+"The total number of files/folder found is: "+i);
		}
	}
