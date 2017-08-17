package core.java8.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import core.java.domain.Employee;
import core.java.util.EmployeeUtils;

public class SortList {
	
	public static void useAnonymousClass(List<Employee> employees) {
		Collections.sort(employees, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getCode().compareTo(e2.getCode());				
			}
		});
	}
	
	public static int compareCode(Employee emp1, Employee emp2) {
		return emp1.getCode().compareTo(emp2.getCode());
	}

	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtils.generateRandomEmployeeList(50);
		/**
		 * Using a Comparator implementation (static nested class)
		 */
		Collections.sort(employees, new EmployeeCompartor());

		/**
		 * Using a Comparator implementation (anonymous inner class)
		 */
		SortList.useAnonymousClass(employees);
		
		/**
		 * Using lambda expression
		 */
		Collections.sort(employees, (emp1, emp2) -> emp1.getCode().compareTo(emp2.getCode()));
		
		/**
		 * Using lambda expression with external method
		 */
		Collections.sort(employees, (emp1, emp2) -> SortList.compareCode(emp1, emp2));
		
		/**
		 * Using lambda expression with Method Reference
		 */
		Collections.sort(employees, SortList::compareCode);

		EmployeeUtils.printEmployees(employees);
	}

	private static class EmployeeCompartor implements Comparator<Employee> {

		@Override
		public int compare(Employee e1, Employee e2) {
			// using natural order ASC
			// return Double.compare(e1.getSalary(), e2.getSalary());
			return e1.getCode().compareTo(e2.getCode());
		}
	}
}
