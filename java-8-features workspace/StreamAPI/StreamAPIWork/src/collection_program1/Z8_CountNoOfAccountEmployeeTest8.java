package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z8_CountNoOfAccountEmployeeTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee();

		
		//8.Count how many times account is appeared in employee
		
		 long count =
		 data.stream().filter(e1->e1.getDeptId().equals("account")).count() ;
		 System.out.println(count);
		
	}

}