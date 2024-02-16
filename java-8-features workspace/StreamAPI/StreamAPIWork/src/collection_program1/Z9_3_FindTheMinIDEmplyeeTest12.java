package collection_program1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z9_3_FindTheMinIDEmplyeeTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeHandlingOperation emp = new EmployeeHandlingOperation();
		List<EmployeeEnity> data = emp.getEmployee(); 
	       
	     //12.FIND THE EMPLYEE HAVING SMALLEST ID 
	
	    
		Optional<EmployeeEnity> collect = data.stream().collect(Collectors.maxBy(Comparator.comparing(EmployeeEnity::getEmpId)));
	      System.out.println(collect);
	}

}
