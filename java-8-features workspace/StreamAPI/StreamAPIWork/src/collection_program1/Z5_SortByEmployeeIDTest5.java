package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z5_SortByEmployeeIDTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();

		//5.sort by empID
		
		 List<EmployeeEnity> collect =
		 data.stream().sorted().collect(Collectors.toList()) ;
		  System.out.println(collect);
		 
		
		}

}
