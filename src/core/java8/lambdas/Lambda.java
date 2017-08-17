package io.kapp.core.java8.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import io.kapp.core.java.domain.Employee;
import io.kapp.core.java.util.EmployeeUtils;

/**
 * Lambda expressions are means to create anonymous classes of functional
 * interfaces easily, also we can get benefit from the Stream API sequential and
 * parallel operations support.
 */

public class Lambda {

	// using anonymous (inner ) class implementing Runnable interface
	Runnable run = new Runnable() {
		@Override
		public void run() {
			System.out.println("anonymous class My Runnable");
		}
	};

	// using lambda expression, curly braces optional for single statement
	Runnable run1 = () -> {
		System.out.println("Lambda My Runnable");
	};

	public static void main(String[] args) {
		/*
		 * (int x, int y) -> x+y // Multiple declared-type parameters 
		 * int x , y;
		 * (x,y) -> x+y 		// Multiple inferred-type parameters 
		 * (x, final y) -> x+y  // Illegal: can't modify inferred-type parameters
		 * (x, int y) -> x+y 	// Illegal: can't mix inferred and declared types
		 */

		List<Employee> employees = EmployeeUtils.generateRandomEmployeeList(50);
		System.out.println("Get total number of employee whose age > 25");
		
		// Using Predicate
		int c;
		c = printCount(employees, (Employee e) -> EmployeeUtils.getAge(e.getDob()) > 25);
		

		System.out.println("====================================================");
		System.out.println("Lambda with Predicate and Consumer:::");
		// Using Predicate and Consumer
		c = printCount_1(employees, 
				(Employee e) -> EmployeeUtils.getAge(e.getDob()) > 25,
				e -> e.display());

		System.out.println("====================================================");
		System.out.println("Lambda with Predicate Function and Consumer:::");
		// Using Predicate Function and Consumer
		c = printCount_2(employees, 
				(Employee e) -> EmployeeUtils.getAge(e.getDob()) > 25,
				e -> e.getEmailAddress(),
				e -> System.out.println(e));
		
		System.out.println("Total number: " + c);
	}

	public static int printCount(List<Employee> employees, Predicate<Employee> test) {
		int count = 0;
		for (Employee emp : employees) {
			if (test.test(emp)) {
				count++;
				System.out.println(emp.toString());
			}
		}
		return count;
	}
	
	//Predicate and Consumer
	public static int printCount_1(List<Employee> employees, Predicate<Employee> test, 
			Consumer<Employee> block) {
		int count = 0;
		for (Employee emp : employees) {
			if (test.test(emp)) {
				count++;
				block.accept(emp);
			}
		}
		return count;
	}
	
	// Predicate Function and Consumer
	public static int printCount_2(List<Employee> employees, Predicate<Employee> test,
			Function<Employee, String> mapper, Consumer<String> block) {
		int count = 0;
		for (Employee emp : employees) {
			if (test.test(emp)) {
				count++;
				String result = mapper.apply(emp);
				block.accept(result);
			}
		}
		return count;
	}
	
	// Generic method for printCount_2
	public static <X, Y> int printCount_3(Iterable<X> list, Predicate<X> test,
			Function<X, Y> mapper, Consumer<Y> block) {
		int count = 0;
		for (X emp : list) {
			if (test.test(emp)) { //Filters objects that match the Predicate object tester
				count++;
				Y result = mapper.apply(emp); //Maps each filtered object to a value as specified by the Function object mapper
				block.accept(result); // Performs an action on each mapped object as specified by the Consumer object block (eg: print)
			}
		}
		return count;
	}
}
