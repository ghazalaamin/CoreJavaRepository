package com.annonymous;

public class AnnonymousClassDefination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnonymousInterface ai= new AnnonymousInterface(){

			@Override
			public void getName() {
				System.out.println("My name is Ghazala Amin");
				
			}

			@Override
			public void getAge() {
				System.out.println("My age is 24");
				
			}
			
		};
		
		ai.getAge();
		ai.getName();

	}

}
