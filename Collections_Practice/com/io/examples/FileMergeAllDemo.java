package com.io.examples;

import java.io.*;
public class FileMergeAllDemo{
	public static void main(String args[]) throws IOException{


		PrintWriter pw=new PrintWriter("directory//merger.txt");
File file=new File("//home//prakash//JavaExamples//Io_Java//Merging");

String sources[]=file.list();

for(String source:sources){

	BufferedReader br=new BufferedReader(new FileReader(new File(file,source)));
String line = br.readLine();
while(line!=null){
pw.println(line);
line = br.readLine();
}
}

		pw.flush();
		pw.close();
	}
}
