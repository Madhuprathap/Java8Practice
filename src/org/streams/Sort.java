package org.streams;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort {

	public static void main(String[] args) throws InterruptedException {
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
		
		String mergedString = names.stream().filter(string -> {
			System.out.println("madhu");
			return !string.isEmpty();}).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> squaresList = numbers.stream()./*map( i -> i*i).*/distinct().collect(Collectors.toList());
		squaresList.forEach(s -> System.out.println(s)/*System.out::println*/);
		
		List<Integer> numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		System.out.println("sum reduced "+numbers2.stream().reduce(0, (x, y) -> x+y ));
		
		
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(3, 2, 2, 3, -7, 3, 5);
		System.out.println( "Parallel Streams: "+ nums.stream().reduce(0,(x ,y ) -> x+y).intValue());
		System.out.println( "Parallel Streams: "+ nums.stream().count());

		IntSummaryStatistics stats = nums.stream().mapToInt(x -> Math.abs(x)).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
		CharSequence seq = "madhuprathap";
		System.out.println(seq);
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl","abc", "", "bc", "efg", "abcd","", "jkl","abc", "", "bc", "efg", "abcd","", "jkl","abc", "", "bc", "efg", "abcd","", "jkl","abc", "", "bc", "efg", "abcd","", "jkl","abc", "", "bc", "efg", "abcd","", "jkl","abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
	}

}
