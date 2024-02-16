package collection_program1;

import java.util.List;

public class EmployeeHandlingOperation {

	public List<EmployeeEnity> getEmployee(){
		 List<EmployeeEnity> list = List.of(
				 new EmployeeEnity("3","name1","hr"),
				 new EmployeeEnity("6","name2","admin"),
				 new EmployeeEnity("1","name3","hr"),
				 new EmployeeEnity("4","name4","admin"),
				 new EmployeeEnity("5","name5","account"),
				 new EmployeeEnity("2","name6","account")
				 );
		 
		 return list;
		 
	}
}
