package mapandreduce.com;

public class Main {
	public static void main(String[] args) {

		// get emp whose grade A
		// get salary
	double avgsalary=	EmployeeDB.getEmp().stream().filter(emp -> emp.getGrade().equalsIgnoreCase("A")).map(emp -> emp.getSalary())
				.mapToDouble(i -> i).average().getAsDouble();
		System.out.println(avgsalary);
		
		
		double sumSalary=	EmployeeDB.getEmp().stream().
				filter(emp -> emp.getGrade().equalsIgnoreCase("A")).
				map(emp -> emp.getSalary())
				.mapToDouble(i -> i).sum();
		System.out.println(sumSalary);
	}
}
