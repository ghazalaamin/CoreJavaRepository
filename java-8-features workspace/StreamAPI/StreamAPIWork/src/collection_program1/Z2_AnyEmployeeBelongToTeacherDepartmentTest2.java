package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z2_AnyEmployeeBelongToTeacherDepartmentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();

		//2.Chech wheather amy Employee belongs to given department or not in the list
		
		  boolean anyMatch = data.stream().anyMatch(EmployeeEnity
		  ->EmployeeEnity.deptId.equals("Teacher")); System.out.println(anyMatch);
	
		}

}
