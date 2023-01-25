package sortingwithlambda.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.employee.demo.Employee;
import com.employee.demo.EmployeeDataBase;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(18);
		list.add(7);
		list.add(15);
		list.add(30);
		list.add(24);
		list.add(4);

		// traditional method
		Collections.sort(list); // in ascending order
		System.out.println(list);

		Collections.reverse(list); // in descending order
		System.out.println(list);

		// using stream API
		list.stream().sorted().forEach(s -> System.out.println(s)); // ascending
		System.out.println("______________________________");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s)); // descending
		System.out.println("________________________________________________________");

		// for non primitive data base
		// traditional method
		List<Employee> emp = EmployeeDataBase.getEmployee();
		Collections.sort(emp, (o1, o2) -> (int) (o1.getSalary() - (o2.getSalary()))); // ascending order
		System.out.println(emp);
		System.out.println("________________________________________________________");
		Collections.sort(emp, (o1, o2) -> (int) (o2.getSalary() - (o1.getSalary()))); // descending order
		System.out.println(emp);
		System.out.println("________________________________________________________");
		
		
		//using stream
		emp.stream().sorted((o1, o2) -> (int) (o1.getSalary() - (o2.getSalary()))).forEach(System.out::println);// method reference used to call a method by referring to it with the help of its class directly
		System.out.println("________________________________________________________");
		emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
	}
}
