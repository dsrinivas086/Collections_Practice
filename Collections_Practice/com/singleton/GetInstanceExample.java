package com.singleton;

class johnson{
	int field = 1;
	static johnson instance=null;
	
	public static johnson getInstance(){
		if(instance == null){
			instance = new johnson();
		}
		return instance;
		
	}
}

public class GetInstanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(johnson.getInstance());
		System.out.println(johnson.getInstance());
		System.out.println(johnson.getInstance());
		System.out.println(johnson.getInstance());
		System.out.println(johnson.getInstance());

	}

}
