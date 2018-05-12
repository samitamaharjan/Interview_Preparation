package com.interview.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student samita = new Student("Samita", 30);
		Student james = new Student("James", 32);
		Student shreeja = new Student("Shreeja", 30);
		Student meera = new Student("Meera", 29);
		
		List<Student> list = Arrays.asList(samita, james, shreeja, meera);
		Collections.sort(list, new Comparator<Student>() {

			/**
			 * Sorted by age (ascending) first then by name (descending)
			 */
			@Override
			public int compare(Student o1, Student o2) {
				int k = o1.getAge() - o2.getAge();
				if (k == 0) {
					k = -(o1.getName().compareTo(o2.getName()));
				}
				return k;
			}
		});
		
		list.stream().forEach(System.out::println);
	}

}
