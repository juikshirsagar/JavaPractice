package com.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	//some operation perform on the object without returning any result.
	public static void main(String[] args) {
//		
//		Consumer<Integer> consumer=(t)->{
//			System.out.println("Printing : "+t);
//		};
//		consumer.accept(15);
//		
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().forEach((t)->System.out.println("Print : "+t));
	}
}
