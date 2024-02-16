package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z9_2_SeparateOddAndEvenEmployeeBasedOnIDTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee(); 
	       
	     //11.Separate odd and even employee based on ID 
	
	      List<EmployeeEnity> collect = data.stream().filter(e->Integer.parseInt(e.empId)%2==0).collect(Collectors.toList());
	      System.out.println(collect);
	}

}