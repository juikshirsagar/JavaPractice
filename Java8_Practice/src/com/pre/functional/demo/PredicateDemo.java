package com.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
	//when we need to use conditional check
	public static void main(String[] args) {
//	Predicate<Integer> predicate=(t)->{
//		if(t %2==0)
//			return true;
//			else
//				return false;
//	};
		Predicate<Integer> predicate = (t) -> t % 2 == 0;
		System.out.println(predicate.test(9));
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().filter(predicate).forEach((t)->System.out.println("Print Even : "+t));
	}

}
