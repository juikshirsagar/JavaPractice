package com.pre.functional.demo;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
	Supplier<String> supplier =()-> {
		return "Hi there";
	};
	System.out.println(supplier.get());
	}

}
