package com.threads.example;

class ThreadbyRunnable implements Runnable{
	public String msg = null;
	Thread t;
	
	public ThreadbyRunnable (String msg){
		this.msg = msg;
		t = new Thread(this);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello thread : "+ msg);
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stubad.
		new ThreadbyRunnable("message 1");
		new ThreadbyRunnable("message 2"); 
		new ThreadbyRunnable("message 3");
	}

}
