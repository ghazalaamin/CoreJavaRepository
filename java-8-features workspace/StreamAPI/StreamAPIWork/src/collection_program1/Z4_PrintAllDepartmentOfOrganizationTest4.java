package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z4_PrintAllDepartmentOfOrganizationTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();

		
		 //4.Print name of all the department of organizatuon
			
			 Set<String> collect =
			 data.stream().map(e->e.getDeptId()).collect(Collectors.toSet()) ;
			 System.out.println(collect);
			 
		}

}
