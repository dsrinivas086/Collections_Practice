package com.general.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonArray {

	public static void main(String[] args) {

		/*JSONObject json=new JSONObject();
		JSONArray items=new JSONArray();		
		  items.add("x");
		  items.add(234);
		  items.add(false);
		  json.put("items",items);
		  System.out.println(items);
		  System.out.println(json);*/
		
		Map<String,String> map = new HashMap<String,String>();
		  map.put("name", "Mohammed");
		  map.put("empid", "E-1097");
		  map.put("phone", "123456789");

		  JSONObject json = new JSONObject();
		 /* json.accumulateAll(map);
		  
		  System.out.println(json);*/
		  
		  List<String> list = new ArrayList<String>();
		  list.add("JAVA");
		  list.add("JSON");
		  list.add("JSF");
		  list.add("HIBERNATE");

		  json.accumulate("technology", list);
		  System.out.println(json.toString());
		  
	}

}
