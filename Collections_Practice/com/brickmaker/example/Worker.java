package com.brickmaker.example;

class ConsumeBrick extends Thread {

	ProduceBrick producer;
	String tname;

	ConsumeBrick(ProduceBrick p,String tname) {
		producer = p;
		this.tname=tname;
	}

	public void run() {
		try {
			while (true) {
				Integer Brick = producer.getBrick();
				System.out.println(tname+" Got Brick: " + Brick);
				sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
