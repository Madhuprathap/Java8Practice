package org.flatmap;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) throws InterruptedException {
		int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
		Stream.of(test).map(Arrays::toString).forEach(System.out::println);
		Arrays.stream(test).map(Arrays::toString).forEach(System.out::println);
		
//		Key difference is the function used by map operation returns a Stream of values or list of values rather than single value, that's why we need flattening. When you flat a Stream of Stream, it gets converted into Stream of values.
        List<List> listOfListOfNumber = new ArrayList<>();
        listOfListOfNumber.add(Arrays.asList(2, 4));
        listOfListOfNumber.add(Arrays.asList(3, 9));
        listOfListOfNumber.add(Arrays.asList(4, 16));
        
        System.out.println("list of list : " + listOfListOfNumber);
        
        // let's use flatMap() to flatten this list into
        // list of integers i.e. 2,4,3,9,4,16
        
        List listOfIntegers = listOfListOfNumber.stream()
                .flatMap( list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(listOfIntegers);
        String s1 =  new String("abc").intern();
        String s2 =  new String("abc").intern();
        System.out.println( s1 == s2); // true
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4); //true
        String s6 =  new String("abc");
        s6.intern();
        String s5 =  new String("abc");
        s5.intern();
        System.out.println( s6 == s5); //false
        
        String s7 =  new String("abc");
        s7 = s7.intern();
        String s8 =  "abc";
        System.out.println( s7 == s8); //false
        
        
        
        Timestamp sql = new Timestamp(new java.util.Date().getTime());
        System.out.println(sql);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Thread.sleep(10000);
        calendar.setTimeInMillis(sql.getTime());;
        System.out.println(calendar);
        
	}

}
