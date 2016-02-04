package com.threads.example;

class ThreadA extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getId());
		try{
			String first1 =method001();
			String first2 =method002();
			String first3 =method003();
		}catch(Exception e){}
	}
	
	public String method001(){
		System.out.println("this is method 001");
		StringBuilder sbQuery = new StringBuilder();
		for(int i=0;i<10;i++){
			System.out.println(sbQuery.append(i));
			try{Thread.sleep(1000);}catch(Exception e){}
			}
		return sbQuery.toString();
	}
	
	public String method002(){
		System.out.println("this is method 002");
		StringBuilder sbQuery = new StringBuilder();
		for(int i=0;i<10;i++){
			System.out.println(sbQuery.append(i));
			try{Thread.sleep(1000);}catch(Exception e){}
			}
		return sbQuery.toString();
	}
	
	public String method003(){
		System.out.println("this is method 003");
		StringBuilder sbQuery = new StringBuilder();
		for(int i=0;i<10;i++){
			System.out.println(sbQuery.append(i));
			try{Thread.sleep(1000);}catch(Exception e){}
			}
		return sbQuery.toString();
	}
}
public class ThreadClarify {

	public static void main(String[] args) {
	
		//new ThreadA().start();
		Runnable r1=new ThreadA();
		Thread t1=new Thread(r1);
		t1.start();
	}

}
