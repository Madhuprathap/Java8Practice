package org.functionalInterface;

//This annotation is optional, good practice for javadoc purpose
@FunctionalInterface
public interface TestFunctionalInterface {
	public int sum(int v1, int v2);
	
//	FuntionalInterface can have only one undefined method
//	public int div(int v1, int v2);
	
	//FuntionalInterface can have N number of object class methods
	boolean equals(Object arg0);
	
	String toString();

	// Can have N number of default methods
	default void concreteMethod1() {
		System.out.println("Default concreteMethod1");
	}
	
	default void concreteMethod2() {
		System.out.println("Default concreteMethod2");
	}
	
	// Can have N number of static methods
	static void staticMethod1() {
		System.out.println("static methods1");
	}
	static void staticMethod2() {
		System.out.println("static methods2");
	}
	
}
