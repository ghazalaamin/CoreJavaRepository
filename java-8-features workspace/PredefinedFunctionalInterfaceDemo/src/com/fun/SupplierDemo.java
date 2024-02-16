package com.fun;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(6);
		
		Supplier sp = ()-> Math.random();
		
		System.out.println(sp.get());
		
		
	}

}
