package com.fun;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList<>();
		al.add("sidra");
		al.add("Nahid");
		al.add("Ghazu");
		
		Consumer con=(a)-> System.out.println(a);
		
		con.accept(al);
		
		

	}

}
