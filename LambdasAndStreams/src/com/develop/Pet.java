package com.develop;

import static java.lang.System.out;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pet {
	enum Sex {
		MALE, FEMALE
	}
	
	public Pet(String name, LocalDate birthday, Sex sex) {
		this.name = name; this.birthday = birthday; this.sex = sex;
	}
	
	String name;
	LocalDate birthday;
	Sex sex;
	
	public String getName() { return name; }
	public int getAge() { 
		LocalDate now = LocalDate.now();
		Period p = Period.between(birthday, now);
		return p.getYears();
	}
	public Sex getSex() { 
		return sex;
	}
	
	public void print() {
		out.println("Name: " + name + " age: " + getAge());
	}
}
