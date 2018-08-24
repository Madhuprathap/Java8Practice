package org.safari.training;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreadExample {
	public static void main(String[] args) {
		new Thread(() -> {
				IntStream.range(1, 30).forEach(System.out :: println);
			}).start();
		Stream.of("hi","1ow").forEach(System.out::println);
	}
}
