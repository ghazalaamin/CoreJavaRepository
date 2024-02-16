
public class EnumDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDay s=MyDay.MON;
		
		if(MyDay.SUN==s) {
			System.out.print("Todays is my day off");
		}else {
			System.out.println("Its my working day");
		}
		
	}

}
