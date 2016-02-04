package com.collections.learn;

import java.util.*;

class StudentAA implements Comparable<StudentAA>{
	
int rollno;  
String name;  
int age;

StudentAA(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  

	public int compareTo(StudentAA stud) {
		
	    return Integer.compare(age, stud.age);
	}
	
	public String toString()
	{
		    return "rollno : " + rollno + " name : " + name + " age : "+age+"\n";
	}

	}


public class ComparableDemo {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();

		Set<StudentAA> al=new TreeSet<>();  
		al.add(new StudentAA(101,"Ijay",23));  
		al.add(new StudentAA(106,"Ajay",27));  
		al.add(new StudentAA(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		  
		System.out.println(al);  
		
		long endTime   = System.currentTimeMillis();

		System.out.println(endTime - startTime);
	}

}
