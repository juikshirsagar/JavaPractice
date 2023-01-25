package com.employee.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataBase {

	public static List<Employee> getEmployee(){
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(101,"Martin","IT",600000));
	list.add(new Employee(102,"Roshan","Civil",400000));
	list.add(new Employee(103,"Saorav","Core",700000));
	list.add(new Employee(104,"Praksh","Defence",1200000));
	list.add(new Employee(105,"Bimal","Social",500000));
	return list;
	}
}
