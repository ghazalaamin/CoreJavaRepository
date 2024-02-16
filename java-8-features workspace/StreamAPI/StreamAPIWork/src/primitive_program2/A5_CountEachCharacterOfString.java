package primitive_program2;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A5_CountEachCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MyNameIsGhazalaAmin";
		
		Map<Character, Long> collect = str.toLowerCase().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		System.out.println(collect.entrySet().stream().max(Map.Entry.comparingByValue()).get());
		System.out.println(collect.entrySet().stream().min(Map.Entry.comparingByValue()).get());
	}

}