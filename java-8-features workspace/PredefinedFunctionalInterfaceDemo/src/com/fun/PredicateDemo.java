package com.fun;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al=new ArrayList<>();
		al.add("sidra");
		al.add("Nahid");
		al.add("Ghazu");
		
		Predicate<String> pd=(a)-> a.startsWith("N");
		
		for(String a :al) {
			if(pd.test(a)) {
			  System.out.println(a);
			}
		}
	}

}
