package com.singleton;

class Singletonclass {
	private static Singletonclass singletonObject;

	private Singletonclass() {

	}

	public static Singletonclass getInstance() {
		if (singletonObject == null) {
			singletonObject = new Singletonclass();
		}
		return singletonObject;
	}

	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}
}

public class SingletonObj {
	public static void main(String[] args) {
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());

	}
}