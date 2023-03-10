package com.employee.demo;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	public static List<Employee> TaxUser() {
		return EmployeeDataBase.getEmployee().stream().filter(emp -> emp.getSalary() > 500000)
				.collect(Collectors.toList());

	}
	public static void main(String[] args) {
		System.out.println(TaxUser());
	}
}
