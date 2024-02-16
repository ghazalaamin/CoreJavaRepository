import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> las= List.of(1,2,3,4,5,6,7,8);
//
//		Predicate<Integer> even =(n)->{
//			return n%2==0;
//		};
//		List<Integer> al=new ArrayList();
//		for(Integer n:las) {
//			if(even.test(n)) {
//				al.add(n);
//			}
//		}
//		
//		System.out.println(al);
		List<Integer> al=las.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(al);
		
		
		
	}

}
