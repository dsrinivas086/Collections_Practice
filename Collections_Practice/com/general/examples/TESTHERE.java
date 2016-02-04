package com.general.examples;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import net.sf.json.JSONArray;

public class TESTHERE {
	
	public static void main(String[] args) {
		int i=0;
		int a=1;
		int b=2;
		int c=4;
		String str="India--Chennai";
		System.out.println(str.split("--")[0]);
		System.out.println(str);
	
		System.out.println(File.separator);
	
		JSONArray jaCounters = new JSONArray();
		jaCounters.add("value1");
		jaCounters.add("value2");
		System.out.println(jaCounters.size());
		System.out.println("jaCounters.toString() : "+jaCounters.toString());
		
	}
	
}


/*HashSet<String> set = new HashSet<>();
//ArrayList<Integer> set = new ArrayList<>();
for(int i=0;i<100000;i++){
	set.add("mxnmxznzcznzz"+i+"xmncxkcnx");
	
}
long startTime = System.currentTimeMillis();
System.out.println(set.contains("mxnmxznzcznzz846xmncxkcnx"));
System.out.println((System.currentTimeMillis()-startTime)+"ms");
*/