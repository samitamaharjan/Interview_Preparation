package com.interview.comparable;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("%-20s %5d", name, age);
	}

	@Override
	public int compareTo(Student o) {
		int k = this.age - o.age;
		if (k == 0) {
			k = -(this.name.compareTo(o.name));
		}
		return k;
	}
}
