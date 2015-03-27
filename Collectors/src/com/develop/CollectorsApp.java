package com.develop;

import java.util.*;
import java.util.stream.*;

import static java.lang.System.out;

public class CollectorsApp {
	
	public static void main(String[] args) {
		Stream<String> strings = Stream.of("hello", "hola", "Good day", "Good Morning");
		
		List<String> unmod = strings
		.filter(s -> s.charAt(0) == 'G')
		//.collect(Collectors.toList());
		.collect(new UnmodifiableListCollector<String>());

		out.println(unmod);
	}

}
