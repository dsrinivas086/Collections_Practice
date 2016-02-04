package com.brickmaker.example;

public class BrickMaker{
	public static void main(String args[]) {
		ProduceBrick producer = new ProduceBrick();
		producer.start();

		int numThreadsToCreate=10;
		ConsumeBrick workerThread[]=new ConsumeBrick[numThreadsToCreate];

		for(int i=0;i<numThreadsToCreate;i++){
			workerThread[i]=new ConsumeBrick(producer,"Collector_"+i);
			workerThread[i].start();
		}
	}
}
