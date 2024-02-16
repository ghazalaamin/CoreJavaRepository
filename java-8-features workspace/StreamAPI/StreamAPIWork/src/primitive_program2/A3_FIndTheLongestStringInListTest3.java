package primitive_program2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class A3_FIndTheLongestStringInListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=List.of("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
		
		//Integer integer = list.stream().map(String::length).min(Integer::compare).get();
		
		//String string = list.stream().max(Comparator.comparing(String::length)).get();
		
		String collect = list.stream().collect(Collectors.maxBy(Comparator.comparing(String::length))).get();
		
		
		System.out.println(collect);

	}

}
