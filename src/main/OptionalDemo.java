package main;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

//		String name = "Anirudh";
//		name = null;

		// of, empty, ofNullable
//		Optional<Object> emplyOptional = Optional.empty();
//		System.out.println(emplyOptional);
//
//		Optional<String> nameOptional = Optional.of(name);
//		System.out.println(nameOptional);
//
//		Optional<String> stringOptional = Optional.ofNullable(name);
//		System.out.println(stringOptional.get());
//
//		String defaultOptional = stringOptional.orElse("no value present");
//		System.out.println(defaultOptional);
//		
//		String defaultOptional2 = stringOptional.orElseGet(()->"edw");
//		System.out.println(defaultOptional2);
//		
//		String optionalObject = stringOptional.orElseThrow(()->new IllegalArgumentException("name does not exist"));
//		System.out.println(optionalObject);
		
		Optional<String> gender = Optional.of("male");
		Optional<String> emptyOptional = Optional.empty();
		gender.ifPresent((s)->System.out.println("value is present"));
		emptyOptional.ifPresent((s)->System.out.println("no value is present"));
		
		String result = " abc ";
		if(result!=null && result.contains("abc")) {
			System.out.println(result);
		}
		
		Optional<String> optionalStr = Optional.of(result);
		optionalStr.filter(res -> res.contains("abc"))
		.map(String::trim)
		.ifPresent((res)->System.out.println(res));
		
	}

}
