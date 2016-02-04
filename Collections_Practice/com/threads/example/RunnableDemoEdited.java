package com.threads.example;

import java.util.*;
class ThreadA1 implements Runnable{
LinkedList list;

	ThreadA1(LinkedList list){
	this.list=list;
}

public void run(){
System.out.println(Thread.currentThread().getName()+" entered ");
while(true){

synchronized(this){
System.out.println(Thread.currentThread().getName()+" got >>"+list.poll());
}

try{Thread.sleep(5000);}catch(Exception e){}

System.out.println(Thread.currentThread().getName()+"finished processing it in"+
(System.currentTimeMillis()-RunnableDemoEdited.startTime)/1000+" ms");
if(list.poll()==null)break;
}//while

}//runn

}//class

public class RunnableDemoEdited{
static long startTime;

public static void main(String args[]){

startTime = System.currentTimeMillis();
LinkedList list=new LinkedList();

for(int i=1;i<=20;i++) { list.add(i); }

for(int j=1;j<=5;j++){
new Thread(new ThreadA1(list)).start();
}


	}//main meth
}//class
