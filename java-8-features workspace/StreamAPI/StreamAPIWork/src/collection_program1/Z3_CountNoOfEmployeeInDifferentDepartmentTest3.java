package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z3_CountNoOfEmployeeInDifferentDepartmentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();

		 Map<String, Long> collect =
		           data.stream().collect(Collectors.groupingBy(EmployeeEnity ::
				    getDeptId,Collectors.counting())) ; System.out.println(collect);
		}

}
