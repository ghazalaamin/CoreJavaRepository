package primitive_program2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class A1_CollectEvenAndOddElementsOfArrayTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> array = List.of(1,2,3,4,5,6,7,8,9);
		
		Map<Boolean, List<Integer>> collect = array.stream().collect(Collectors.partitioningBy(e->e%2==0));
       System.out.println(collect);
	}

}