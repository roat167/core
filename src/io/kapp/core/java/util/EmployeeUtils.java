package io.kapp.core.java.util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import io.kapp.core.java.domain.Employee;
import io.kapp.core.java.domain.Gender;

public class EmployeeUtils {
	private static final Double BASE_SALARY = 50000.0;
	private static final int DEFAULT_COLLECTION_SIZE = 1000000;
	private static Random random = new Random();

	public static List<Employee> generateRandomEmployeeList(int size) {
		if (size < 0) {
			return null;
		}

		System.out.printf("Generate random employee object of size %,d ...", size);

		MyTimer.start();

		Map<String, Employee> employeeMap = new HashMap<String, Employee>(size);
		for(int i = 0; i < size; ++i) {
			Employee employee = createRandomEmployee(i);
			if(employeeMap.containsKey(employee.getCode())) {
				// Duplicate SSN, discard
				--i;
			}
			else {
				employeeMap.put(employee.getCode(), employee);
			}
			if(i%10000 == 0) {
				System.out.print(".");
			}
		}
		System.out.println("\nFinished creating a random roster.\n");

		MyTimer.stop();

		List<Employee> EmployeeList = new ArrayList<Employee>(size);
		EmployeeList.addAll(employeeMap.values());

		return EmployeeList;
	}

	public static void printEmployees(Collection<Employee> collection) {
		collection.forEach(System.out::println);
	}

	public static Employee createRandomEmployee(int index) {
		return new Employee(randomCode(), randomName(index), randomGender(), randomBirthday(), randomSalary());
	}

	public static Collection<Employee> generateEmployeeCollection() {
		return generateRandomEmployeeList(DEFAULT_COLLECTION_SIZE);
	}

	public static String randomCode() {
		return String.format("Code-%03d", random.nextInt(1000));
	}
	
	public static Double randomSalary() {
		return random.nextDouble() * BASE_SALARY + BASE_SALARY;
	}

	public static String randomName(int index) {
		return String.format("Emp%08d", index);
	}

	public static Gender randomGender() {
		if (random.nextInt(100) > 50) {
			return Gender.MALE;
		} else {
			return Gender.FEMALE;
		}
	}

	public static LocalDate randomBirthday() {
		// set max age to 85
		return LocalDate.now().minusDays(random.nextInt(365 * 85));
	}
	
	public static int getAge(LocalDate dob) {
		return LocalDate.now().getYear() - dob.getYear();
	}
}
