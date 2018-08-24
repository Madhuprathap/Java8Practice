package org.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListTOArrayList {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
        num.stream().forEach(System.out::println);
        int sum = num.stream().mapToInt(n -> n).sum();
        sum = num.stream().collect(Collectors.summingInt(n -> n));
        sum = num.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
        OptionalDouble sum1 = num.stream().mapToInt(Integer::intValue).average();
        System.out.println(sum1);
        
        int[] ar = {1,2,3,4,5};
        System.out.println(Arrays.stream(ar).map(n -> n).sum());
        String[] str = {"madhu", "ravi"};
        Arrays.stream(str).map(n -> n.length()).forEach(System.out::println);;
        
	}
}
