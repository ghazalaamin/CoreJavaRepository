package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z9_0_DisplayAllEmployeeNameInSortedOrderTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();
  
	     //10.How to store dublictaes in another set
	      List<Integer> list2= List.of(1,2,3,4,4,5,5,6,6);
	      Set<Integer> sets= new HashSet<>();
	      //list2.stream().filter(i ->!sets.add(i)).collect(Collectors.toSet());
	      System.out.println(list2.stream().filter(i ->!sets.add(i)).collect(Collectors.toSet()));
	}

}