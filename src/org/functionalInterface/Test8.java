package org.functionalInterface;


public class Test8 {
	public static void main(String[] args) {
		final String salutation = "Hello! ";
		
		TestFunctionalInterface testInterface = (a, b) -> {
			return a+b;
		};
		
				
		System.out.println(testInterface.sum(5,8));
		testInterface.concreteMethod1();
		testInterface.concreteMethod2();
		
		TestFunctionalInterface.staticMethod1();
		TestFunctionalInterface.staticMethod2();
		GreetingService greetService1 = message -> 
	    System.out.println(salutation + message);
	    greetService1.sayMessage("Mahesh");
	    
	    TestInterface test = () -> {
	    	System.out.println("Test");
	    };
	    test.test1();
	    test.test2(1, 3);
	    
	}
	
	
}

interface GreetingService {
    void sayMessage(String message);
 }