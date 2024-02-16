package com.stringreverse;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="SidraSaquib";
		char[] ch=s.toCharArray();
		
		for(int i=0;i<s.length()/2;i++) {
			char temp=ch[i];
			ch[i]=ch[s.length()-1-i];
			ch[s.length()-1-i]=temp;
		}
		String s1=new String(ch);
		System.out.println(s1);
		
	}

}

