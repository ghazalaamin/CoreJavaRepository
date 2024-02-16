package mypack;

@FunctionalInterface
public interface MyService {

	void messagingService();
	//Functional interface can contain only one abstract method 
	//But it can contain any no of static and default methods
	//And defining another abstract method will give errorc
	
	static void print() {
		System.out.println("This is the static method we have");
	}
	
	default void display() {
		System.out.println("This is the default method we have");
	}
	
}
