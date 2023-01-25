package mapandflatteringmap.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDb {

	public static List<Customer> getAll() {
		return Stream
				.of(new Customer(101, "john", "john@gmail.com", Arrays.asList("123345", "1223455")),
						new Customer(102, "smith", "smith@gmail.com", Arrays.asList("234567", "83627118")),
						new Customer(103, "peter", "peter@gmail.com", Arrays.asList("87266171", "93517181")),
						new Customer(104, "kely", "kely@gmail.com", Arrays.asList("1125645", "82615365")))
				.collect(Collectors.toList());

	}
}
