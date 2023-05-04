package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo {
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Grape");

		List<String> sortedFruits = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(sortedFruits);

		// using lambda
		List<String> sortedFruits2 = fruits.stream().sorted((f1, f2) -> f1.compareTo(f2)).collect(Collectors.toList());
		System.out.println(sortedFruits2);

		List<String> sortedFruits3 = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedFruits3);

		// descending order
		List<String> reverseSortedFruits = fruits.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverseSortedFruits);

		// using lambda
		List<String> reverseSortedFruits2 = fruits.stream().sorted((f1, f2) -> f2.compareTo(f1))
				.collect(Collectors.toList());
		System.out.println(reverseSortedFruits2);

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(10, "Anirudh", 22, 24520));
		employees.add(new Employee(11, "John", 32, 64826));
		employees.add(new Employee(14, "Brad", 24, 72738));
		employees.add(new Employee(11, "Cristine", 23, 29483));
		employees.add(new Employee(24, "Olivia", 33, 98173));

		List<Employee> employeeList = employees.stream()
				.sorted((Employee o1, Employee o2) -> (o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
		System.out.println(employeeList);

		List<Employee> employeeList2 = employees.stream().sorted(Comparator.comparingLong(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(employeeList2);

		// reverse order
		List<Employee> revEmployeeList = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(revEmployeeList);

		// sort by age
		List<Employee> employeeList3 = employees.stream().sorted(Comparator.comparingLong(Employee::getAge))
				.collect(Collectors.toList());
		System.out.println(employeeList3);

		// sort by name
		List<Employee> employeeList4 = employees.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		System.out.println(employeeList4);

		List<Employee> employeeList5 = employees.stream().sorted(Comparator.comparing(Employee::getName).reversed())
				.collect(Collectors.toList());
		System.out.println(employeeList5);

	}

}

class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\n[eid: " + this.id + ", name: " + this.name + ", age: " + this.age + ", salary:" + this.salary + "]";
	}

}
