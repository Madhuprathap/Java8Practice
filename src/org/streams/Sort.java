package org.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Sort {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Madhu","","Abhi","Ramesh","Ravi");
				/*new ArrayList<String>();
		names.add("madhu");
		names.add("Abhi");
		names.add("ramesh");
		names.add("ravi");*/
		System.out.println(names.stream().filter(name -> name.isEmpty()).count());
		
		
		Collections.sort(names, (n1, n2) -> n1.compareTo(n2));
		System.out.println(names);
		
		Collections.sort(names = names.stream().limit(3).collect(Collectors.toList())   /*filter(name -> !name.startsWith("Ra")).collect(Collectors.toList())*/,
				(n1, n2) -> n1.compareTo(n2));
		System.out.println(names);
		
		String mergedString = names.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squaresList = numbers.stream()./*map( i -> i*i).*/distinct().collect(Collectors.toList());
		squaresList.forEach(System.out::println);
		
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(3, 2, 2, 3, -7, 3, 5);

		IntSummaryStatistics stats = nums.stream().mapToInt(x -> Math.abs(x)).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
	}

}
