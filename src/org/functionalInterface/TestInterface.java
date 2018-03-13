package org.functionalInterface;

@FunctionalInterface
public interface TestInterface {
	public int sum(int v1, int v2);
	
//	FuntionalInterface can have only one undefined method
//	public int div(int v1, int v2);
	
	//FuntionalInterface can have object class methods
	boolean equals(Object arg0);
	
	default void concreteMethod1() {
		System.out.println("Default concreteMethod1");
	}
	
	default void concreteMethod2() {
		System.out.println("Default concreteMethod2");
	}
	
	static void staticMethod1() {
		System.out.println("static methods1");
	}
	static void staticMethod2() {
		System.out.println("static methods2");
	}
	
}
