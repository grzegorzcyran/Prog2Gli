package com.grcy.patterns.creational.singleton;


public class EagerSingleton {

	private static final EagerSingleton instance = new EagerSingleton();

	private EagerSingleton(){
		System.out.println("Eager singleton initialisation");
	}

	public static EagerSingleton getInstance(){
		System.out.println("Get instance");
		return instance;
	}

	public String getSth() {
		return "Something";
	}

}
