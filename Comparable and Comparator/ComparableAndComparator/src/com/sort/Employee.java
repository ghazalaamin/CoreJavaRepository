package com.sort;

public class Employee implements Comparable<Employee> {

	private String stuName;
	private int stuId;
	
	public String getStuName() {
		return stuName;
	}
	public int getStuId() {
		return stuId;
	}
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	
	
	public Employee(String stuName, int stuId) {
		super();
		this.stuName = stuName;
		this.stuId = stuId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [stuName=" + stuName + ", stuId=" + stuId + "]";
	}
	
	//Sorting based on StuName
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(this.stuName.compareTo(emp.getStuName())==0) {
			return 0;
		}
		else if(this.stuName.compareTo(emp.getStuName())>0) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	//Sorting based on student Id
	/*
	 * @Override public int compareTo(Employee emp) 
	 * { if(this.stuId==emp.getStuId()){
	 *    return 0; 
	 *    }
	 * else if(this.stuId>emp.getStuId()) {
	 *    return 1; 
	 *    }
	 *  else {
	 *     return -1; 
	 *     }
	 */
	
	
	
}
