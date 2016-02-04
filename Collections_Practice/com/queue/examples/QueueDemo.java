package com.queue.examples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo{
public static void main(String args[]){

	PriorityQueue<String> qe=new PriorityQueue<String>();

qe.offer("Anu");
qe.offer("Kamal");
qe.offer("Mala");

Iterator<String> itr=qe.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
		}
	}
}

