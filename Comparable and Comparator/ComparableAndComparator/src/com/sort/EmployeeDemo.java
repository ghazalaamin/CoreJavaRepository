package com.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> al=Arrays.asList(
				new Employee("Ghazala",5),
				new Employee("Shahid",2),
				new Employee("Zahid",3),
				new Employee("Saquib",4)
				);
		
		Collections.addAll(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.sort(al, new MyComparator());
		
		System.out.println(al);
		
	}

}