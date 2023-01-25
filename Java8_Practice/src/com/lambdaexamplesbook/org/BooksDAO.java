package com.lambdaexamplesbook.org;

import java.util.ArrayList;
import java.util.List;

public class BooksDAO {

	public List<Book> getBooks(){
		List <Book> book=new ArrayList<>();
		book.add(new Book(1,"Atomic Habit", 234));
		book.add(new Book(2,"Wise & Otherwise", 250));
		book.add(new Book(3,"Agnipankh", 300));
		book.add(new Book(4,"Ti Phulrani", 234));
		return book;
		
	}
}
