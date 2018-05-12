package com.interview.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student samita = new Student("Samita", 30);
		Student james = new Student("James", 32);
		Student shreeja = new Student("Shreeja", 30);
		Student meera = new Student("Meera", 29);
		
		List<Student> list = Arrays.asList(samita, james, shreeja, meera);
		Collections.sort(list);
		
		list.stream().forEach(s -> System.out.println(String.format("%-20s %5d", s.getName(), s.getAge())));
	}

}
