package main;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,4,2,23,2,32);
		stream.forEach(System.out::println);
		
		Collection<String> collection = Arrays.asList("Java","Spring","Hibernate");
		Stream<String> stream2 =collection.stream();
		stream2.forEach(System.out::println);
		
		
		List<String> list = Arrays.asList("Java","Spring","Hibernate");
		Stream<String> stream3 =list.stream();
		stream3.forEach(System.out::println);
		
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
		
		String[] stringArr = {"red","blue","green"};
		Stream<String> stream5 = Arrays.stream(stringArr);
		stream5.forEach(System.out::println);
		
		List<Integer> numberList = Arrays.asList(12,34,54,21,34,674,32,23,4235);
		System.out.println(numberList.stream().count());
		System.out.println(numberList.stream().min(Comparator.comparing(Integer::valueOf)).get());
		System.out.println(numberList.stream().max(Comparator.comparing(Integer::valueOf)).get());
		
		numberList.stream().forEach((num) -> System.out.println(num+" is "+ (num%2==0?"even":"odd")));
	
	}

}
