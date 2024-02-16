package com.fun;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(6);
		
		Function<Integer,Integer> fn= (a) -> a*a;
		
		al.forEach((a)->System.out.println(fn.apply(a)));
		
	}

}
