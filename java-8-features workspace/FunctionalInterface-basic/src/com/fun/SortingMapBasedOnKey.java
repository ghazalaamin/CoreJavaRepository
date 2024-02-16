package com.fun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortingMapBasedOnKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , Integer> m=new HashMap<String , Integer>();
		
		m.put("Saquib",4);
		m.put("Shahid",2);
		m.put("Zahid" ,3);
		m.put("Nahid",1);
		m.put("Ghazala",5);
		
		//Sorting Map based on value
		List<Entry<String ,Integer>> list = new ArrayList<>(m.entrySet());
		Collections.sort(list,(o1,o2)-> o1.getValue().compareTo(o2.getValue()));
		
		//Sorting Map based on key
		//TreeMap tm=new TreeMap<>(m);
		
		System.out.println(list);
		//Comparator com=(m)
		

	}

}
