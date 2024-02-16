package collection_program1;

public class EmployeeEnity 
//implements Comparable
{
	String empId;
	String empName;
	String deptId;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "EmployeeEnity [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + "]";
	}
	public EmployeeEnity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEnity(String empId, String empName, String deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
	}
	/*
	 * @Override public int compareTo(Object emp) { return ((EmployeeEnity)
	 * emp).getEmpId().compareTo(empId); }
	 */
	
}
