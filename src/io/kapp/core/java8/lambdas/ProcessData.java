package io.kapp.core.java8.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import io.kapp.core.java.domain.Employee;
import io.kapp.core.java.domain.Gender;
import io.kapp.core.java.util.EmployeeUtils;

public class ProcessData {

	public static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper,
			Consumer<Y> block) {
		for (X p : source) {
			if (tester.test(p)) {
				Y data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtils.generateRandomEmployeeList(100);
		System.out.println("Get Emails from all male employee who age between 18 - 30");
		processElements(employees,
				emp -> emp.getGender() == Gender.MALE 
						&& EmployeeUtils.getAge(emp.getDob()) >= 18
						&& EmployeeUtils.getAge(emp.getDob()) <= 30,
				p -> p.getEmailAddress(),
				email -> System.out.println(email));
		System.out.println("==========================================================");
		System.out.println("Get Emails from all male employee who age between 18 - 30, using stream");
		employees
         .stream()
         .filter(
             emp -> emp.getGender() == Gender.MALE
            		 && EmployeeUtils.getAge(emp.getDob()) >= 18
						&& EmployeeUtils.getAge(emp.getDob()) <= 30)
         .map(emp -> emp.getEmailAddress())
         .forEach(email -> System.out.println(email));  
	}
}
