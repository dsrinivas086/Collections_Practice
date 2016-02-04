package com.threads.example;

class ThreadA2 extends Thread{
int a;
ThreadA2(int a){
this.start();
this.a=a;
}

public void run(){
synchronized(this){
for(int i=1;i<=10;i++) {System.out.println(i*a);}
}//sync
try{Thread.sleep(5000);
System.out.print(Thread.currentThread().getName()+" took ");
System.out.println(System.currentTimeMillis()-ExtendingThreadDemo.startTime+" ms");
}catch(Exception e){}

}//run
}//class

public class ExtendingThreadDemo{
static long startTime;
public static void main(String args[]){
startTime=System.currentTimeMillis();
new ThreadA2(2);
new ThreadA2(3);
}
}
