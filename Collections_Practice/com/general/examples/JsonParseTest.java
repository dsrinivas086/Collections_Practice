package com.general.examples;
import net.sf.json.JSONObject;



public class JsonParseTest {

	//private static final String filePath = "//home//prakash//jsonTestFile.json";
	
	public static void main(String[] args) {

		JSONObject obj=new JSONObject();
		obj.put("id", 12);
		obj.put("name", "prakash");
		obj.put("sal", 10000);
		System.out.println(obj);


	}

}
