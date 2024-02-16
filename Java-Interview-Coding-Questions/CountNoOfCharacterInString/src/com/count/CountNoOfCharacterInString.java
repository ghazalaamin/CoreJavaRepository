package com.count;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Ghazala";
		Map<Character ,Integer> hm= new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
			}
			else {
				hm.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(hm);
	}

}
