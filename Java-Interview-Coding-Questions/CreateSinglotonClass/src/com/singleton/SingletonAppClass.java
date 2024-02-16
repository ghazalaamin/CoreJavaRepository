package com.singleton;

public class SingletonAppClass {
	
	public static SingletonAppClass singletonAppClass;

	private SingletonAppClass() {
		
	}
	
	public static SingletonAppClass getIntances() {
		if(singletonAppClass==null) {
			return new SingletonAppClass();
		}else {
			return singletonAppClass;
		}
	}
	
	public void getMessage() {
		System.out.println("Yeah This worked");
	}

}
