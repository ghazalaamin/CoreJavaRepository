package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z1_AllEmployeeDepartmentAccountTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();

		//1.check all the Employee department is account or not.
	
		  boolean allMatch = data.stream().allMatch(EmployeeEnity ->
		  EmployeeEnity.deptId.equals("account")); System.out.println(allMatch);
		
	
	}

}