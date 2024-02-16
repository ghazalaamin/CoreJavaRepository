package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z7_DisplayAccountDepartmrntEmployeeInSortedOrderTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();

		//7.Display on account department enployee in sorted order
		
		 List<EmployeeEnity> collect =
		 data.stream().filter(e1->e1.getDeptId().equals("account")).sorted((e1,e2)->e1
		 .empId.compareTo(e2.empId)).collect(Collectors.toList()) ;
		 System.out.println(collect);
		
		
		}

}
