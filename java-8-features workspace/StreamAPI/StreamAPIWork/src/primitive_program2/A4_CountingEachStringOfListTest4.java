package primitive_program2;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A4_CountingEachStringOfListTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=List.of("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println(collect);
	}

}
