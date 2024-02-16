package com.palindrome;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="momaPaga";
		System.out.println(palindrome(s));

	}
	
	public static String palindrome(String s) {
		// boolean flag=true;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				 return "String is non palindrome";
			 }
		 }
		 
		 return "String is palindrome";
	}

}
