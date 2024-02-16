package com.fun;

public class EmployeeEntity {


	private String empName;
	private int empId;
	
	public String getEmpName() {
		return empName;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empName=" + empName + ", empId=" + empId + "]";
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public EmployeeEntity(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
