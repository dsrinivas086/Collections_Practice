package com.io.examples;

import java.io.*;
public class FileInputStreamAndFileOutputStream{
	public static void main(String args[]) throws Exception{
FileInputStream fin=new FileInputStream("Queue.png");
FileOutputStream fout=new FileOutputStream("Copyofque.png");
FileOutputStream fout1=new FileOutputStream("Copyofque1.png");

int i=0;
while((i=fin.read())!=-1){
fout.write((byte)i);
fout1.write((byte)i);
}
fin.close();
fout.close();
	}
}
