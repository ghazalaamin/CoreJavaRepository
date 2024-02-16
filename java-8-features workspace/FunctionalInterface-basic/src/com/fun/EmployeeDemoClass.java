package com.fun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList<>();
		 al.add(new EmployeeEntity("Saquib",4));
		 al.add(new EmployeeEntity("Shahid",2));
		 al.add(new EmployeeEntity("Zahid" ,3));
		 al.add(new EmployeeEntity("Nahid",1));
		 al.add(new EmployeeEntity("Ghazala",5));
	//	 al.add(new EmployeeEntity("Ghazala",5));
//		 
//		al.add(5);
//		al.add(4);
//		 System.out.println(al);
//		 
//		 Collections.sort(al);
		 
		 System.out.println(al);
		 
		 //Using lambda Expression,It is the enhanced version of anonymous implementation.
//		 Collections.sort(al, (EmployeeEntity e1, EmployeeEntity e2)->
//			 e1.getEmpName().compareTo(e2.getEmpName())
//		 );
//		 
//		 
		 Collections.sort(al, new MyComparator());
		 System.out.println(al);
		 
		 //using method reference ,It is the enhanced version of lambda Expression.
//		 Collections.sort(al,Comparator.comparing(EmployeeEntity::getEmpName));
//		 System.out.println(al);
		 
		 
		
		
	}

}
