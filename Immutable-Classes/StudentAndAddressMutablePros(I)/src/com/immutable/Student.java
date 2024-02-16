package com.immutable;

final public class Student {
	final private int stutId;
	final private String stuName;
	final private Address address;
	
	
	public Student(int stutId, String stuName, Address address) {
		super();
		this.stutId = stutId;
		this.stuName = stuName;
		this.address = address;
	}

	public Address getAddress() {
		return new Address(address.getCity(),address.getState());
	}

	public int getStutId() {
		return stutId;
	}
	
	public String getStuName() {
		return stuName;
	}
	
	
	@Override
	public String toString() {
		return "Student [stutId=" + stutId + ", stuName=" + stuName + ", address=" + address + "]";
	}
	
}
