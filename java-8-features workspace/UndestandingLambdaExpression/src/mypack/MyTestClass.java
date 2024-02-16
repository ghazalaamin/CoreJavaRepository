package mypack;

public class MyTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//First way to get interface object is to create MyService implementation class 
		//and make object of it
		//Second way is to use anonymous class to use the MyService method
		
		MyService sb=new MyService() {

			@Override
			public void messagingService() {
				System.out.print("We are accessing MyService method using anonymous class");
				
			}
			
		};
		
		//sb.messagingService();
		
		//Since anonymous class is not presizes and more readable in naature we go for 
		//the lambda expression concept basically it is an enhanced version of anonymous class
		//It provide clear and concise way of coding
		
		MyService sblambda= ()->{
			System.out.println("We are providing implementation using lambda expression it can be used only with functional interface");
		};
		
		sblambda.messagingService();
		
		
	}

}
