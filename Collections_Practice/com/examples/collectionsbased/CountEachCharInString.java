package com.examples.collectionsbased;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "hello world";
		Map<Character, Integer> countTxt = new HashMap<Character, Integer>();
		for(int i=0;i < test.length();i++){
		/*	if(countTxt.containsKey(test.charAt(i))){
				
				countTxt.put(test.charAt(i), (countTxt.get(test.charAt(i)))+1);
			
			}else{
			
				countTxt.put((test.charAt(i)==' '?'_':test.charAt(i)), 1);	
			}	*/
			
			countTxt.put(test.charAt(i), countTxt.containsKey(test.charAt(i))?countTxt.get(test.charAt(i))+1:1 );
		}
		System.out.println(countTxt);
	}

}
