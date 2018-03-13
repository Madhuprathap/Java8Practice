package org.functionalInterface;


public class Test8 {
	public static void main(String[] args) {
		final String salutation = "Hello! ";
		
		TestInterface testInterface = (a, b) -> {
			return a+b;
		};
		
				
		System.out.println(testInterface.sum(5,8));
		testInterface.concreteMethod1();
		testInterface.concreteMethod2();
		
		TestInterface.staticMethod1();
		TestInterface.staticMethod2();
		GreetingService greetService1 = message -> 
	    System.out.println(salutation + message);
	    greetService1.sayMessage("Mahesh");
	    
	}
	
	
}

interface GreetingService {
    void sayMessage(String message);
 }