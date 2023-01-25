package sortingwithlambda.com;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.employee.demo.Employee;

public class SortMapDemo {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("eight", 8);
		map.put("twenty three", 23);
		map.put("five", 5);
		map.put("thirty", 30);
		map.put("one", 1);

		// convert it into the list
		List<Entry<String, Integer>> entries = new ArrayList(map.entrySet());

		// traditional method
		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("----------------------------------");

		// using stream
		System.out.println("In ascending order");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("----------------------------------");
		System.out.println("In descending order");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("----------------------------------");

		Map<Employee, Integer> empMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		empMap.put(new Employee(101, "Martin", "IT", 600000), 60);
		empMap.put(new Employee(102, "Roshan", "Civil", 400000), 90);
		empMap.put(new Employee(103, "Saorav", "Core", 700000), 50);
		empMap.put(new Employee(104, "Praksh", "Defence", 1200000), 40);
		empMap.put(new Employee(105, "Bimal", "Social", 500000), 120);
		System.out.println(empMap);

		System.out.println("----------------------------------");
		// sorting with key
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);

	}
}
