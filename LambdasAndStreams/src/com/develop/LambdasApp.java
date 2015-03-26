package com.develop;

import static java.lang.System.out;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

interface ExcptTest
{
	void test() throws FileNotFoundException;
}

public class LambdasApp {
	
	public static void main(String[] args) {
		//test1();
		test2();
		process( () -> new FileInputStream("text.txt") );
	}	
	
	public static void process(ExcptTest t) {
		try {
			t.test();
		} catch (FileNotFoundException e) {
			
		}
	}
	
	public static void test2() {
		List<Pet> pets = new ArrayList<Pet>();
		
		pets.add(new Dog("Sparky", LocalDate.of(2008, 2, 12), Pet.Sex.MALE));
		pets.add(new Dog("Alley", LocalDate.of(2004, 8, 15), Pet.Sex.FEMALE));
		pets.add(new Cat("Twilight", LocalDate.of(2011, 5, 2), Pet.Sex.FEMALE));
		
		processPets(pets, 
				p -> p.getSex() == Pet.Sex.FEMALE, // filter
				//p -> p.print()
				Pet::print // action
				);
		out.println();
		
		pets.stream()
		.filter(p -> p.getSex() == Pet.Sex.FEMALE && p.getAge() <  9)
		.map(p -> "The pet's name is " + p.getName())
		.forEach(s -> out.println(s + "!!"));
		
		Optional<Pet> o  = pets.stream()
		.filter(p -> p.getName().equals("Rex"))
		.findFirst();
		
		out.println(o);
	}
	
	public static void processPets(List<Pet> pets, Predicate<Pet> filter, Consumer<Pet> action)
	{
		for (Pet p : pets) {
			if (filter.test(p)) {
				try {
					action.accept(p);
				} catch (Throwable t) {
					
				}
			}
		}
	}

//	private static class IsEven implements Test
//	{
//
//		@Override
//		public boolean test(int x) {
//			return x % 2 == 0;
//		}
//		
//	}
	
	public static void process(int x, Predicate<Integer> t) {

		
		if (t.test(x)) {
			out.println("success");
		} else {
			out.println("fail");
		}
	}
	

	
	public static void test1() {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		process(5, isEven);
		process(5, x -> { out.println(x); return false; });
		process(42, x -> x % 3 == 0);
		
//		process(5, new Test() {
//			public boolean test(int x) {
//				return x % 2 == 0;
//			}
//		});
		//process(4, new );
		
	}

}

//@FunctionalInterface
//interface Test
//{
//	public abstract boolean test(int x);
//	default public void test2(int x) {  out.println("default"); }
//}

//static class IsEven implements Test
//{
//
//	@Override
//	public boolean test(int x) {
//		return x % 2 == 0;
//	}
//	
//}
