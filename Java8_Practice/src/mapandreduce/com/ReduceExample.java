package mapandreduce.com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		List <Integer> numbers=Arrays.asList(3,5,7,8,9);
		int sum=numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		int mul=numbers.stream().reduce(1,(a,b)->a*b);
		System.out.println(mul);
		
		int max=numbers.stream().reduce(0,(a,b)->a>b ? a:b );
		System.out.println(max);
		
		
		List<String> words = Arrays.asList("java", "spring", "C++", "python");
		String length = words.stream().reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();
		System.out.println(length);
	}
}
