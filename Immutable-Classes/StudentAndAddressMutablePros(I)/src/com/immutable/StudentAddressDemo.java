package com.immutable;

public class StudentAddressDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address ad=new Address("garhwa","jharkhand");
		
		Student s=new Student(1,"Amin",ad);
		
		System.out.println(s);
		Address ad1=s.getAddress();
		
		ad1.setState("Bihar");
		ad1.setCity("gaya");
		
		System.out.println(s);
		

	}

}
