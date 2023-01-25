package mapandflatteringmap.com;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Customer> customers = CustomerDb.getAll();
		// List<Customer> convert List<Sring> -> Data Transformation
		// map:customer -> customer.getEmail()---> one to one
		List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		List<List<String>> phoneNo = customers.stream().map(customer -> customer.getPhno())
				.collect(Collectors.toList());
		System.out.println(phoneNo);
		System.out.println("----------------------------------------------------------------------------------------");
		// faltmap:customer -> customer.getPhno()---> one to many
		List<String> ph = customers.stream().flatMap(customer -> customer.getPhno().stream())
				.collect(Collectors.toList());
		System.out.println(ph);
	}
}
