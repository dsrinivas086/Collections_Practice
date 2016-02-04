package com.io.examples;

import java.io.*;
public class FileWriterDemo{
	public static void main(String args[]) throws Exception{

		File f=new File("xyz.txt");

		FileWriter fw=new FileWriter(f,true);
		fw.write(" Hello world part four\n");
		fw.write(100);
		fw.write('z');
		char a[]={'A','P','P','E','D','O'};
		fw.write(a);
		fw.flush();
		fw.close();
	}
}
