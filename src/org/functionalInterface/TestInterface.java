package org.functionalInterface;

public interface TestInterface {
	public void test1();
	default void test2(int a, int b) {
		System.out.println(a+b);
	}
}
