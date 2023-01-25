package com.streamspractice.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List <String> list=new ArrayList<>();
		list.add("Aayansh");
		list.add("sayali");
		list.add("manjusha");
		list.add("jui");
		list.add("mrunal");
		
		list.stream().forEach(t->System.out.println(t));
		System.out.println("_______________________");
		
		//filter-> for conditional check internally uses predicate interface
		list.stream().filter((t)->t.startsWith("m")).forEach(t->System.out.println(t));
		System.out.println("_______________________");
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		//map.forEach((key,value)->System.out.println(key+": " +value));
		
		//forEach----> for iteration $ internally uses consumer interface
		map.entrySet().forEach(obj->System.out.println(obj));
		}

}
