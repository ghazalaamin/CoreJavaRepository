package com.fun;

import java.util.Comparator;

public class MyComparator implements Comparator<EmployeeEntity>{

	@Override
	public int compare(EmployeeEntity arg1, EmployeeEntity arg2) {
		return arg1.getEmpName().compareTo(arg2.getEmpName());
		 
	}

}
