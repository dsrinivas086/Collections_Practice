package com.threads.example;

        class Q {
                int n;
                boolean valueSet = false;

synchronized void putBrickBrick(int n) {
                        while (valueSet)
                                try {
                                        wait();
                                } catch (InterruptedException e) {
                                        System.out.println("InterruptedException caught");
                                }
				try {
                                       
                                        Thread.sleep(1000);
                                } catch (InterruptedException e) {
                                        System.out.println("InterruptedException caught");
                                }
                        this.n = n;
                        valueSet = true;
                        System.out.println("Put: " + n);
                        notify();
                }

synchronized int getBrick() {
                        while (!valueSet)
                                try {
                                        wait();
                                } catch (InterruptedException e) {
                                        System.out.println("InterruptedException caught");
                                }
                        System.out.println(Thread.currentThread().getName()+" Got: " + n);
                        valueSet = false;
                        notify();
                                try {
                                        Thread.sleep(5000);
                                } catch (InterruptedException e) {
                                        System.out.println("InterruptedException caught");
                                }
                        return n;
                }

}

class Producer implements Runnable {
                Q q;

                Producer(Q q) {
                        this.q = q;
                        new Thread(this).start();
                }

                public void run() {
                        int i = 0;
                        while (true) {
                                q.putBrickBrick(i++);
                        }
                }
        }

        class Consumer implements Runnable {
                Q q;

                Consumer(Q q) {
                        this.q = q;
                        new Thread(this).start();
                }

                public void run() {
                        while (true) {
                                q.getBrick();
                        }
                }
        }


public class PCFixedversion2 {




        public static void main(String args[]) {
                Q q = new Q();
                new Producer(q);
                new Consumer(q);
		new Consumer(q);
		new Consumer(q);
                System.out.println("Press Control-C to stop.");
        }
}
