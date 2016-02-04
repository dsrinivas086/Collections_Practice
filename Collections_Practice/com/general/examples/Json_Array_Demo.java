package com.general.examples;

import java.util.Iterator;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Json_Array_Demo {

	public static void main(String[] args) {
		JSONArray jaCounters = new JSONArray();
		JSONObject joCounter = null;
		
		joCounter = new JSONObject();
		
		joCounter.put("slaid", 1);
		joCounter.put("userid", 2);
		joCounter.put("counterid", 3);
		joCounter.put("countertempid", 4);
		joCounter.put("isabovethreshold",5);
		joCounter.put("thresholdvalue", 6);
		
		/*Iterator itr =joCounter.keys();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		jaCounters.add(joCounter);
		
		System.out.println(jaCounters);

		
		JSONArray jarray = new JSONArray();
		
		jarray.add("helo01");
		jarray.add("helo02");
		jarray.add("helo03");
		jarray.add("helo04");
		
		System.out.println(jarray);
	}

}
