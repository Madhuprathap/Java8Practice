package org.safari.training;

import java.util.stream.LongStream;

public class LongStreamExamples {
	public static void main(String[] args) {
		LongStream.range(1, 10).parallel().forEach(System.out :: println);
	}
}
