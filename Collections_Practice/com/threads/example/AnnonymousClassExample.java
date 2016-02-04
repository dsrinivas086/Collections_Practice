package com.threads.example;

abstract class HelloWorld {
	abstract void greet();
}

public class AnnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld frenchGreeting = new HelloWorld() {

			@Override
			void greet() {
				// TODO Auto-generated method stub
				System.out.println("Hello Annonymous");

			}
		};

		frenchGreeting.greet();
		
		HelloWorld frenchGreeting1 = new HelloWorld() {
			@Override
			void greet() {
				// TODO Auto-generated method stub
				System.out.println("Hello Annonymous 1");

			}
		};

		frenchGreeting1.greet();
	};
}
