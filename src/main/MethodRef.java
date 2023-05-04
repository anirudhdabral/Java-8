package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
interface Printable {
	void print(String msg);
}

public class MethodRef {

	public void display(String msg) {
		msg = msg.toUpperCase();
		System.out.println(msg);
	}

	public static int add(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		Function<Integer, Double> func = (num) -> Math.sqrt(num);
		System.out.println(func.apply(9));

		// doing with method reference
		Function<Integer, Double> funcMethodRef = Math::sqrt;
		System.out.println(funcMethodRef.apply(16));

		// static method ref
		{
			// lambda expression
			BiFunction<Integer, Integer, Integer> biFuncLambda = (a, b) -> MethodRef.add(a, b);
			System.out.println(biFuncLambda.apply(10, 29));

			// using method reference
			BiFunction<Integer, Integer, Integer> biFuncMethodRef = MethodRef::add;
			System.out.println(biFuncMethodRef.apply(454, 32));
		}

		// method reference to an instance method of an object
		{
			MethodRef methodRef = new MethodRef();

			// lambda expression
			Printable printableLambda = (msg) -> methodRef.display(msg);
			printableLambda.print("anirudh");

			// with method ref
			Printable printableMethodRef = methodRef::display;
			printableMethodRef.print("anirudhdabral");

		}

		// arbitrary object method ref
		{
			Function<String, String> stringFunction = (str) -> str.toLowerCase();
			System.out.println(stringFunction.apply("HeLlO"));

			// using method ref
			Function<String, String> stringFunctionMethodRef = String::toLowerCase;
			System.out.println(stringFunctionMethodRef.apply("BoNjOur"));

			// example 2
			String[] arr = { "A", "B", "c", "D", "a", "b", "C", "f" };

			// using lambda
			Arrays.sort(arr, (s1, s2) -> s1.compareToIgnoreCase(s2));

			// using methodref
			Arrays.sort(arr, String::compareToIgnoreCase);

			System.out.println(Arrays.toString(arr));
		}

		// ref to a constructor
		{
			List<String> fruits = new ArrayList<>();
			fruits.add("banana");
			fruits.add("apple");
			fruits.add("grape");
			fruits.add("mango");
			fruits.add("grape");

			System.out.println(fruits);

			Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);

			System.out.println(setFunction.apply(fruits));
			
			Function<List<String>, Set<String>> setFunctionMethodRef = HashSet::new;
			
			System.out.println(setFunctionMethodRef.apply(fruits));

		}

	}

}
