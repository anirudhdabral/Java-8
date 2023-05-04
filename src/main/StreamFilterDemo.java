package main;

import java.util.ArrayList;
import java.util.List;

class Student {
	private String name;
	private int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Marks: " + this.marks;
	}

}

public class StreamFilterDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		for(Student student: getStudents()) {
			if(student.getMarks()>60) {
				list.add(student);
			}
		}
		for(Student student: list) {
			System.out.println(student);
		}
		
		System.out.println();
		
		getStudents().stream().filter((product) -> product.getMarks()>50)
		.forEach(System.out::println);;

	}
	public static List<Student> getStudents() {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Anirudh", 86));
		list.add(new Student("Jack", 94));
		list.add(new Student("Steve", 51));
		list.add(new Student("Mark", 76));
		list.add(new Student("Bryce", 38));
		return list;
		
		
	}

}
