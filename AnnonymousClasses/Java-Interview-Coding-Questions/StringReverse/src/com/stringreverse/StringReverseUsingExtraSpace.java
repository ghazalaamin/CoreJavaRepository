package com.stringreverse;

public class StringReverseUsingExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="EhanMatloob";
		String s2="";
		
		for(int i=0;i<s.length();i++) {
			s2=s2+s.charAt(s.length()-1-i);
		}
		
		System.out.println(s2);

	}

}
