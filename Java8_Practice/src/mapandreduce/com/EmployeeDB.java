package mapandreduce.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

	public static List<Employee> getEmp(){
		
		return Stream.of(
				new Employee(101,"joahana","A",80000),
				new Employee(102,"kiran","A",40000),
				new Employee(104,"anju","B",60000),
				new Employee(103,"parvin","A",70000),
				new Employee(105,"sneha","B",50000)
				).collect(Collectors.toList()) ;
		
	}
}
