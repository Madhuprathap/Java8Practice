package org.compartorUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(5, "ravi", "Dev", 5000L));
		list.add(new Employee(3, "ramesh", "Dev", 3000L));
		list.add(new Employee(1, "madhu", "Dev", 1000L));
		list.add(new Employee(2, "sai", "Dev", 2000L));
		list.add(new Employee(4, "naresh", "Dev", 4000L));
		// Java 7
		System.out.println("Sorting by salary:");
		Collections.sort(list, Employee.COMPARETO_SALARY);

		System.out.println("Sorting by ENumber:");
		list.sort(Employee.COMPARETO_ENAME);
		System.out.println(list);

		// java 8
		System.out.println("Sorting by ENumber:");
		Collections.sort(list, (E1, E2) -> E1.getENumber().compareTo(E2.getENumber()));
		System.out.println(list);

		System.out.println("Sorting by salary:");
		Collections.sort(list, (E1, E2) -> {
			return E1.getSalary().compareTo(E2.getSalary());
		});
		System.out.println(list);
		
		System.out.println("Sorting by salary by method reference way:");

		//intern use-cases
		String s1 = new String("Madhu");
		String s2 = new String("Madhu");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		String s3 = "Madhu";
		String s4 = "Madhu";
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		String s5 = new String("Madhu").intern();
		String s6 = new String("Madhu").intern();
		System.out.println(s5.equals(s6));
		System.out.println(s5 == s6);
		
		String s7 = new String("Madhu").intern();
		String s8 = new String("Madhu");
		System.out.println(s7.equals(s8));
		System.out.println(s7 == s8);
		
	}

}
