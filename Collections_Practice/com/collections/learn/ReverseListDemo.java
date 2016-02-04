package com.collections.learn;

import java.util.*;


public class ReverseListDemo {
	
static List listReverse(List ls1){
	
	ListIterator lstitr=ls1.listIterator();
	while(lstitr.hasPrevious()){
		System.out.println(lstitr.previous());
	}
	return ls1;
}	
	
public static void main(String[] args) {
		List ls=new ArrayList();
		
		for(int i=1;i<=10;i++){
			ls.add(i);
		}
		System.out.println(ls);
		//listReverse(ls);
		ListIterator lstitr=ls.listIterator();
		while(lstitr.hasNext())
			System.out.println(lstitr.previous());
			
		}

	}

