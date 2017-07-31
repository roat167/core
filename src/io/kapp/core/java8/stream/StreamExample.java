package io.kapp.core.java8.stream;

import java.util.Comparator;
import java.util.List;

import io.kapp.core.java.domain.Employee;
import io.kapp.core.java.util.EmployeeUtils;
import io.kapp.core.java8.lambdas.SortList;

public class StreamExample {

	public static void stream_1(List<Employee> list) {
		System.out.println("======================Option 1=========================");
		
		//option 1
		list.stream()
		.sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getCode().compareTo(e2.getCode());
			}			
		})
		.forEach(System.out::println);
		
		System.out.println("======================Option 2=========================");
		
		//option 2
		list.stream()
			.sorted((e1, e2) -> SortList.compareCode(e1, e2))
			.forEach(e -> System.out.println(e));
		
		System.out.println("======================Option 3=========================");
		
		//option 3 (short)
		list.stream()
		.sorted(SortList::compareCode)
		.forEach(System.out::println);
	
	}
	
	public static void averageSalary(List<Employee> list) {
		
	}

	public static void main(String[] args) {
		List<Employee> list = EmployeeUtils.generateRandomEmployeeList(15);
		
		StreamExample.stream_1(list);

	}
}
