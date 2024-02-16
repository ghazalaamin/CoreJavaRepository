package com.joiner;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print a,b,c
		StringJoiner st =new StringJoiner(",");
		st.add("a");
		st.add("b");
		st.add("c");
		
		System.out.println(st);
		
		// print c:d
		StringJoiner st1 =new StringJoiner(":");
		st1.add("d");
		st1.add("e");
		
		System.out.println(st1);
		
		//Join both the string to print a,b,c,d:e
		System.out.println(st.merge(st1));

	}

}
