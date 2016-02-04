package com.nio.examples;

import java.io.*;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
public class CopyFilesExample {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		File source = new File("Source1.txt");
		File dest = new File("destinationfile1.txt");

		// copy file using FileStreams
	long start = System.currentTimeMillis();
		long end;
		copyFileUsingFileStreams(source, dest);
		System.out.println("Time taken by FileStreams Copy = "
				+ (System.currentTimeMillis() - start));

		// copy files using java.nio.FileChannel
		source = new File("Source2.txt");
		dest = new File("destinationfile2.txt");
		start = System.currentTimeMillis();
		copyFileUsingFileChannels(source, dest);
		end = System.currentTimeMillis();
		System.out.println("Time taken by FileChannels Copy = " + (end - start));

		// copy file using Java 7 Files class
		source = new File("Source3.txt");
		dest = new File("destinationfile3.txt");
		start = System.currentTimeMillis();
		copyFileUsingJava7Files(source, dest);
		end = System.currentTimeMillis();
		System.out.println("Time taken by Java7 Files Copy = " + (end - start));


	}

	private static void copyFileUsingFileStreams(File source, File dest)
			throws IOException {
		InputStream input = null;
		OutputStream output = null;
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(dest);
			byte[] buf = new byte[1024*64];
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
		} finally {
			input.close();
			output.close();
		}
	}

	private static void copyFileUsingFileChannels(File source, File dest)
			throws IOException {
		FileChannel inputChannel = null;
		FileChannel outputChannel = null;
		try {
			inputChannel = new FileInputStream(source).getChannel();
			outputChannel = new FileOutputStream(dest).getChannel();
			outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		} finally {
			inputChannel.close();
			outputChannel.close();
		}
	}

	private static void copyFileUsingJava7Files(File source, File dest)
			throws IOException {
		Files.copy(source.toPath(), dest.toPath());
	}


}
