package com.queue.examples;

import java.util.concurrent.*;
public class SimpleQueueDemo{

    public static void main(String[] args) throws Exception {

      BlockingQueue queue = new DelayQueue();

        queue.offer(6);
	queue.offer(2);
	queue.offer(4);
	queue.offer(1);

System.out.println(queue);
    }
}
